/*
* generated by Xtext
*/
package org.somox.metrics.dsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MetricDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/somox/metrics/dsl/parser/antlr/internal/InternalMetricDSL.tokens");
	}
}
