/*
 * generated by Xtext
 */
package org.somox.metrics.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.somox.metrics.dsl.ui.internal.MetricDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MetricDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MetricDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MetricDSLActivator.getInstance().getInjector(MetricDSLActivator.ORG_SOMOX_METRICS_DSL_METRICDSL);
	}
	
}
