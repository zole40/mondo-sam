/*
 * generated by Xtext
 */
package eu.mondo.sam.domain.validation

import org.eclipse.xtext.validation.Check
import eu.mondo.sam.domain.benchmark.AtomicPhase
import eu.mondo.sam.domain.benchmark.BenchmarkPackage
import eu.mondo.sam.domain.benchmark.IterationPhase
import eu.mondo.sam.domain.benchmark.SequencePhase
import eu.mondo.sam.domain.benchmark.OptionalPhase
import eu.mondo.sam.domain.benchmark.NewMetric
import eu.mondo.sam.domain.benchmark.Scenario
import eu.mondo.sam.domain.benchmark.Phase
import eu.mondo.sam.domain.benchmark.PhaseReference
import eu.mondo.sam.domain.benchmark.NewPhase

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class BenchmarkValidator extends AbstractBenchmarkValidator {

	@Check
	def checkAtomicPhaseStartsWithCapital(AtomicPhase atomic) {
		if (atomic.atomicname == null){
			return
		}
		if (atomic.atomicname.length == 0){
			return
		}
		if (!Character.isUpperCase(atomic.atomicname.charAt(0))) {
			warning('The name of the phase should start with capital since it represents a class name.', 
				BenchmarkPackage.Literals.ATOMIC_PHASE__ATOMICNAME, "invalid_atomicphase")
		}
	}
	
	@Check
	def checkMetricStartsWithCapital(NewMetric metric) {
		if (!Character.isUpperCase(metric.metricname.charAt(0))) {
			warning('The name of the metric should start with capital since it represents a new class name.', 
				BenchmarkPackage.Literals.NEW_METRIC__METRICNAME, "invalid_metric"
			)
		}
	}
	
	@Check
	def checkScenarioStartsWithCapital(Scenario scenario) {
		if (!Character.isUpperCase(scenario.scenarioname.charAt(0))) {
			warning('The name of the scenario should start with capital since it represents a new class name.', 
				BenchmarkPackage.Literals.SCENARIO__SCENARIONAME, "invalid_scenario" 
			)
		}
	}
	
	@Check
	def checkIterationPhaseCounter(IterationPhase iteration){
		if (iteration.iteration < 1){
			error('The iteration must be higher than 0',
				BenchmarkPackage.Literals.ITERATION_PHASE__ITERATION, "invalid_iteration"
			)
		}
	}
	
//	@Check
//	def searchCycle(Scenario scenario){
//		if (scenario.rootPhase == null){
//			return
//		}
//		val Phase root = scenario.rootPhase
//		if (!root.containAtomicPhase){
//			error('The scenario must contain Atomic phases',
//				BenchmarkPackage.Literals.SCENARIO__ROOT_PHASE
//			)
//		}
//	}

	
}
