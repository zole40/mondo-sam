/**
 * generated by Xtext
 */
package eu.mondo.sam.domain.validation;

import com.google.common.base.Objects;
import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import eu.mondo.sam.domain.benchmark.IterationPhase;
import eu.mondo.sam.domain.benchmark.NewMetric;
import eu.mondo.sam.domain.benchmark.Scenario;
import eu.mondo.sam.domain.validation.AbstractBenchmarkValidator;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class BenchmarkValidator extends AbstractBenchmarkValidator {
  @Check
  public void checkAtomicPhaseStartsWithCapital(final AtomicPhase atomic) {
    String _atomicname = atomic.getAtomicname();
    boolean _equals = Objects.equal(_atomicname, null);
    if (_equals) {
      return;
    }
    String _atomicname_1 = atomic.getAtomicname();
    int _length = _atomicname_1.length();
    boolean _equals_1 = (_length == 0);
    if (_equals_1) {
      return;
    }
    String _atomicname_2 = atomic.getAtomicname();
    char _charAt = _atomicname_2.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("The name of the phase should start with capital since it represents a class name.", 
        BenchmarkPackage.Literals.ATOMIC_PHASE__ATOMICNAME, "invalid_atomicphase");
    }
  }
  
  @Check
  public void checkMetricStartsWithCapital(final NewMetric metric) {
    String _metricname = metric.getMetricname();
    char _charAt = _metricname.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("The name of the metric should start with capital since it represents a new class name.", 
        BenchmarkPackage.Literals.NEW_METRIC__METRICNAME, "invalid_metric");
    }
  }
  
  @Check
  public void checkScenarioStartsWithCapital(final Scenario scenario) {
    String _scenarioname = scenario.getScenarioname();
    char _charAt = _scenarioname.charAt(0);
    boolean _isUpperCase = Character.isUpperCase(_charAt);
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("The name of the scenario should start with capital since it represents a new class name.", 
        BenchmarkPackage.Literals.SCENARIO__SCENARIONAME, "invalid_scenario");
    }
  }
  
  @Check
  public void checkIterationPhaseCounter(final IterationPhase iteration) {
    int _iteration = iteration.getIteration();
    boolean _lessThan = (_iteration < 1);
    if (_lessThan) {
      this.error("The iteration must be higher than 0", 
        BenchmarkPackage.Literals.ITERATION_PHASE__ITERATION, "invalid_iteration");
    }
  }
}