/*
* generated by Xtext
*/
package eu.mondo.sam.domain;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class BenchmarkStandaloneSetup extends BenchmarkStandaloneSetupGenerated{

	public static void doSetup() {
		new BenchmarkStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

