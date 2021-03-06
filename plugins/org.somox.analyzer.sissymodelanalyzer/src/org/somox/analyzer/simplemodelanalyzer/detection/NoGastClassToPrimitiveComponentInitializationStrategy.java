package org.somox.analyzer.simplemodelanalyzer.detection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gmt.modisco.java.Type;
import org.eclipse.gmt.modisco.java.emf.JavaPackage;
import org.somox.analyzer.simplemodelanalyzer.builder.ComponentBuilder;
import org.somox.configuration.SoMoXConfiguration;
import org.somox.filter.ComposedFilter;
import org.somox.filter.EClassBasedFilter;
import org.somox.kdmhelper.metamodeladdition.Root;

//import de.fzi.gast.core.Root;
//import de.fzi.gast.types.GASTClass;
//import de.fzi.gast.types.typesPackage;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;

/**
 * Initialization class which only lists a filtered set of classes which potentially can become a component. 
 * Does NOT create a SAMM primitive components only the component link of the source code decorator. 
 * @author Klaus Krogmann
 *
 */
public class NoGastClassToPrimitiveComponentInitializationStrategy extends AbstractInitializationStrategy {	
	
	/**
	 * Only creates a component link for GAST classes and the set of all inner, i.e., nested, classes
	 * Real structs, unions and enumerations are omitted. Does not create a SAMM primitive component
	 */
	@SuppressWarnings("unchecked")
	public List<ComponentImplementingClassesLink> createInitialComponentCandidates(Root root, SoMoXConfiguration config, ComponentBuilder builder) {
		List<ComponentImplementingClassesLink> result = new ArrayList<ComponentImplementingClassesLink>();
		List<Type> classList = root.getNormalClasses();
		
		ComposedFilter<Type> gastClassFilter = new ComposedFilter<Type>(
				config.getBlacklistFilter(),
				new EClassBasedFilter<Type>(
						JavaPackage.eINSTANCE.getEnumDeclaration()),//SOMOXTODOCHANGE
						//typesPackage.eINSTANCE.getGASTUnion()),//SOMOXTODOCHANGE
				primitiveClassesFilter,
				improperStructFilter,
				dataObjectFilter,
				unknownClassTypeFilter);

		for (Type clazz : gastClassFilter.filter(classList)){
			// Attention: does only create the component links but not the SAMM primitive component:
			ComponentImplementingClassesLink newPrimitiveComponent = builder.createComponentLinkFromGASTClass(clazz);
			result.add(newPrimitiveComponent);
		}
		
		return result;
	}
}
