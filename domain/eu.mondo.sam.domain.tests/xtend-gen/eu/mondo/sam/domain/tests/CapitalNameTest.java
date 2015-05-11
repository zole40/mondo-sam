package eu.mondo.sam.domain.tests;

import eu.mondo.sam.domain.BenchmarkInjectorProvider;
import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.BenchmarkPackage;
import javax.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Test;
import org.junit.runner.RunWith;

@InjectWith(BenchmarkInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class CapitalNameTest {
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testValidScenarioDeclaration() {
    try {
      final Benchmark model = this.parseHelper.parse("package test.pack Scenario \"name\" {Atomic ClassName AtomicName Metrics()}");
      this.helper.assertWarning(model, BenchmarkPackage.Literals.SCENARIO, "invalid_scenario");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidAtomicPhaseDeclaration() {
    try {
      final Benchmark model = this.parseHelper.parse("package test.pack Scenario \"Name\" {Atomic ClassName atomicName Metrics()}");
      this.helper.assertNoErrors(model);
      this.helper.assertWarning(model, BenchmarkPackage.Literals.ATOMIC_PHASE, "invalid_atomicphase");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testValidMetricDeclaration() {
    try {
      final Benchmark model = this.parseHelper.parse("package test.pack Scenario \"name\" {\n\t\t\t\tAtomic ClassName AtomicName Metrics(\n\t\tnew Metric metricname\n\t\t)\n\t}");
      this.helper.assertNoErrors(model);
      this.helper.assertWarning(model, BenchmarkPackage.Literals.NEW_METRIC, "invalid_metric");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
