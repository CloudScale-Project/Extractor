package org.somox.metrics.structure;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmt.modisco.java.Type;
import org.jgrapht.DirectedGraph;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.kdmhelper.KDMHelper;
import org.somox.kdmhelper.metamodeladdition.Root;
import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.IMetric;
import org.somox.metrics.MetricID;
import org.somox.metrics.abstractmetrics.AbstractMetric;
import org.somox.metrics.helper.ClassAccessGraphEdge;
import org.somox.metrics.helper.ComponentToImplementingClassesHelper;

//import de.fzi.gast.core.Package;
//import de.fzi.gast.core.Root;
//import de.fzi.gast.types.GASTClass;

/**
 * SubsystemComponent metric
 * 
 * @author Grischa Liebel
 *
 */
public class SubsystemComponent extends AbstractMetric{
    public static final MetricID METRIC_ID = new MetricID("org.somox.metrics.SubsystemComponent");

    private IMetric sliceArchitectureMetric = null;


    /* (non-Javadoc)
     * @see org.somox.metrics.Metric#initialize(de.fzi.gast.core.Root, org.somox.configuration.SoMoXConfiguration, java.util.Map, org.jgrapht.DirectedGraph)
     */
    @Override
    public void initialize(final Root gastModel,
            final SoMoXConfiguration somoxConfiguration,
            final Map<MetricID, IMetric> allMetrics,
            final DirectedGraph<Type, ClassAccessGraphEdge> accessGraph,
            final ComponentToImplementingClassesHelper componentToImplementingClassesHelper) {
        super.initialize(gastModel, somoxConfiguration, allMetrics, accessGraph,componentToImplementingClassesHelper);

        this.sliceArchitectureMetric = getMetric(allMetrics,SliceLayerArchitectureQuality.METRIC_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void internalComputeDirected (
            final ClusteringRelation relationToCompute) {

        //removelater
        //		java.util.List<Type> type1 = relationToCompute.getComponentA().getImplementingClasses();
        //		java.util.List<Type> type2 = relationToCompute.getComponentB().getImplementingClasses();
        //		if(type1!= null & type2!=null & type1.size()>0 & type2.size()>0){
        //			if(type1.get(0).getName().equals("StoreQueryImplTest") &
        //					type2.get(0).getName().equals("TransactionContextImpl")){
        //				String fileName = "interfacecount.txt";;
        ////				org.somox.changetest.Helper.writeToFile(fileName, "---" +type1.get(0).getName() + " " + type2.get(0).getName());
        //			}
        //		}

        //TODO: Refactor me!!!!
        final Set<Type> classes1 = this.getComponentToClassHelper().deriveImplementingClasses(relationToCompute.getSourceComponent());
        final Set<Type> classes2 = this.getComponentToClassHelper().deriveImplementingClasses(relationToCompute.getTargetComponent());

        //compute overall prefix
        final org.eclipse.gmt.modisco.java.Package prefixPackage = computePrefix(classes1, classes2);

        if (prefixPackage == null) {
            relationToCompute.setResultMetric(getMID(), 0.0);
            return;
        }

        final EList<org.eclipse.gmt.modisco.java.Package> slices = prefixPackage.getOwnedPackages();
        EList<org.eclipse.gmt.modisco.java.Package> layers = null;

        String subLayer = null;

        //compute the maximum number of layers in a slice
        int max = 0;
        for (final org.eclipse.gmt.modisco.java.Package current : slices) {
            if (current.getOwnedPackages().size()>=max) {
                layers = current.getOwnedPackages();
                max = layers.size();
            }
        }

        //0 expected Subsystems, return 0.0
        if (max == 0 || layers.size() == 0 || layers == null) {
            relationToCompute.setResultMetric(getMID(), 0.0);
            return;
        }
        org.eclipse.gmt.modisco.java.Package currentPackage = null;
        for (final Type currentElement : classes1) {
            currentPackage = KDMHelper.getSurroundingPackage(currentElement);

            if (currentPackage != null) {
                if (subLayer == null) {
                    for (final org.eclipse.gmt.modisco.java.Package slicePackage : slices) {
                        if (KDMHelper.computeFullQualifiedName(currentPackage).startsWith(KDMHelper.computeFullQualifiedName(slicePackage))) {
                            for (final org.eclipse.gmt.modisco.java.Package layerPackage : layers) {
                                if (KDMHelper.computeFullQualifiedName(currentPackage).startsWith(KDMHelper.computeFullQualifiedName(slicePackage) + "." + layerPackage.getName())) {
                                    subLayer = KDMHelper.computeFullQualifiedName(slicePackage) + "." + layerPackage.getName();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    if (! KDMHelper.computeFullQualifiedName(currentPackage).startsWith(subLayer)) {
                        relationToCompute.setResultMetric(getMID(), 0.0);
                        return;
                    }
                }
            }
        }

        for (final Type currentElement : classes2) {
            currentPackage = KDMHelper.getSurroundingPackage(currentElement);
            if (currentPackage != null) {
                if (subLayer == null) {
                    for (final org.eclipse.gmt.modisco.java.Package slicePackage : slices) {
                        if (KDMHelper.computeFullQualifiedName(currentPackage).startsWith(KDMHelper.computeFullQualifiedName(slicePackage))) {
                            for (final org.eclipse.gmt.modisco.java.Package layerPackage : layers) {
                                if (KDMHelper.computeFullQualifiedName(currentPackage).startsWith(KDMHelper.computeFullQualifiedName(slicePackage) + "." + layerPackage.getName())) {
                                    subLayer = KDMHelper.computeFullQualifiedName(slicePackage) + "." + layerPackage.getName();
                                    break;
                                }
                            }
                            break;
                        }
                    }
                } else {
                    if (! KDMHelper.computeFullQualifiedName(currentPackage).startsWith(subLayer)) {
                        relationToCompute.setResultMetric(getMID(), 0.0);
                        return;
                    }
                }
            }

        }
        sliceArchitectureMetric.computeDirected(relationToCompute);
        assert relationToCompute.getResult().containsKey(sliceArchitectureMetric.getMID());
        final double slaq = relationToCompute.getResult().get(sliceArchitectureMetric.getMID());
        relationToCompute.setResultMetric(getMID(), slaq);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isCommutative () {
        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MetricID getMID () {
        return METRIC_ID;
    }

    /**
     * Computes the longest prefix for the given packages excluding the blacklisted packages and classes
     * 
     * @param packages a given package-hierarchy
     * @return the last package in the package-hierarchy in which all non-blacklisted elements are included
     */
    private org.eclipse.gmt.modisco.java.Package computePrefix (final Set<Type> elements1, final Set<Type> elements2) {

        org.eclipse.gmt.modisco.java.Package prefix = null;

        final LinkedList<Type> elementsLeft = new LinkedList<Type>();

        elementsLeft.addAll(elements1);
        elementsLeft.addAll(elements2);

        java.util.ListIterator<Type> iterator = elementsLeft.listIterator();

        while (iterator.hasNext()) {
            final Type current = iterator.next();
            if (prefix == null && KDMHelper.getSurroundingPackage(current) != null) {
                prefix = KDMHelper.getSurroundingPackage(current);
            }

            if (prefix != null && KDMHelper.getSurroundingPackage(current) != null && !KDMHelper.computeFullQualifiedName(current).startsWith(KDMHelper.computeFullQualifiedName(prefix))) {
                prefix = prefix.getPackage();
                if (prefix == null) {
                    return null;
                } else {
                    iterator = elementsLeft.listIterator();
                }
            }
        }

        return prefix;
    }

    @Override
    public boolean isNormalised() {
        return true;
    }
}
