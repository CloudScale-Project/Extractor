package org.somox.analyzer.simplemodelanalyzer.detection.util;

import java.util.List;

import org.somox.filter.BaseFilter;
import org.somox.metrics.ClusteringRelation;
import org.somox.metrics.MetricID;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * Filters based on edge threshold and vertex type: only initial
 * (primitive) components and at most one composite component pass.
 * @author Klaus Krogmann
 *
 */
public class VertexTypeAndEdgeThresholdFilter extends BaseFilter<ClusteringRelation> {

    private final MetricID metric;
    private final double threshold;

    public VertexTypeAndEdgeThresholdFilter(final MetricID metric, final double threshold) {
        super();
        this.metric = metric;
        this.threshold = threshold;
    }

    @Override
    public boolean passes(final ClusteringRelation clusteringRelation) {
        assert clusteringRelation.getResult().containsKey(metric);
        final double relationValue = clusteringRelation.getResult().get(metric);

        return (relationValue > threshold) &&
                onlyPrimitiveComponents(clusteringRelation.getComponents());
    }

    private boolean onlyPrimitiveComponents(final List<ComponentImplementingClassesLink> componentLinks) {

        for(final ComponentImplementingClassesLink compLink : componentLinks) {
            if(!compLink.isInitialComponent()) {
                return false;
            }
        }
        return true;
    }
};
