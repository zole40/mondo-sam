/*
 * generated by Xtext
 */
package eu.mondo.sam.domain.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractBenchmarkValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(eu.mondo.sam.domain.benchmark.BenchmarkPackage.eINSTANCE);
		return result;
	}
}
