package eu.mondo.sam.domain.tests;

import com.google.inject.Inject;
import eu.mondo.sam.domain.BenchmarkInjectorProvider;
import eu.mondo.sam.domain.benchmark.Benchmark;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(BenchmarkInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTest {
  @Inject
  private IGenerator underTest;
  
  @Inject
  private ParseHelper<Benchmark> parseHelper;
  
  @Inject
  private ValidationTestHelper helper;
  
  @Test
  public void testAtomicPhaseGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScenarioGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario {a1}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testPackageGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package fully.qualified.pack.name");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario {a1}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "fully/qualified/pack/name/scenarios/TestScenario.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "fully/qualified/pack/name/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMoreScenarioGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario1 {a1 }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario2 {a1}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario testscenario {a1}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario1.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"));
      Assert.assertTrue(_containsKey_1);
      Map<String, CharSequence> _files_2 = fsa.getFiles();
      boolean _containsKey_2 = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/testscenario.java"));
      Assert.assertTrue(_containsKey_2);
      Map<String, CharSequence> _files_3 = fsa.getFiles();
      boolean _containsKey_3 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic.java"));
      Assert.assertTrue(_containsKey_3);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMoreAtomicPhaseGenerator() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario1 {a1 }");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario2 {a2}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario testscenario {Iteration (3 * a3)}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic1 Metrics()");
      _builder.newLine();
      _builder.append("Atomic a2 ClassName TestAtomic2 Metrics()");
      _builder.newLine();
      _builder.append("Atomic a3 ClassName TestAtomic3 Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      Map<String, CharSequence> _files = fsa.getFiles();
      boolean _containsKey = _files.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario1.java"));
      Assert.assertTrue(_containsKey);
      Map<String, CharSequence> _files_1 = fsa.getFiles();
      boolean _containsKey_1 = _files_1.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario2.java"));
      Assert.assertTrue(_containsKey_1);
      Map<String, CharSequence> _files_2 = fsa.getFiles();
      boolean _containsKey_2 = _files_2.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/testscenario.java"));
      Assert.assertTrue(_containsKey_2);
      Map<String, CharSequence> _files_3 = fsa.getFiles();
      boolean _containsKey_3 = _files_3.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic1.java"));
      Assert.assertTrue(_containsKey_3);
      Map<String, CharSequence> _files_4 = fsa.getFiles();
      boolean _containsKey_4 = _files_4.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic2.java"));
      Assert.assertTrue(_containsKey_4);
      Map<String, CharSequence> _files_5 = fsa.getFiles();
      boolean _containsKey_5 = _files_5.containsKey((IFileSystemAccess.DEFAULT_OUTPUT + "test/phases/TestAtomic3.java"));
      Assert.assertTrue(_containsKey_5);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAtomicInIteration() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario {Iteration(1 * a1)}");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package test.scenarios;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.scenarios.BenchmarkScenario;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.results.CaseDescriptor;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.phases.IterationPhase;");
      _builder_1.newLine();
      _builder_1.append("import test.phases.TestAtomic;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class TestScenario extends BenchmarkScenario {");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* Builds an arbitrary phase hierarchy where the leafs represent the");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* AtomicPhase objects.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void build() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("rootPhase = new IterationPhase(1, ");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("new TestAtomic(\"TestAtomic\"));");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* Instantiates a CaseDescriptor object.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @see CaseDescriptor");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @return CaseDescriptor with every one of its field being initialized.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public CaseDescriptor getCaseDescriptor() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("// TODO Instantiates a CaseDescriptor object");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return null;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      String _string = _builder_1.toString();
      Map<String, CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAtomicInSequence() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package test");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Scenario TestScenario {Sequence(a1)}");
      _builder.newLine();
      _builder.append("Atomic a1 ClassName TestAtomic Metrics()");
      _builder.newLine();
      final Benchmark model = this.parseHelper.parse(_builder);
      final InMemoryFileSystemAccess fsa = new InMemoryFileSystemAccess();
      this.helper.assertNoErrors(model);
      Resource _eResource = model.eResource();
      this.underTest.doGenerate(_eResource, fsa);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package test.scenarios;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.scenarios.BenchmarkScenario;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.results.CaseDescriptor;");
      _builder_1.newLine();
      _builder_1.append("import eu.mondo.sam.core.phases.SequencePhase;");
      _builder_1.newLine();
      _builder_1.append("import test.phases.TestAtomic;");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("public class TestScenario extends BenchmarkScenario {");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* Builds an arbitrary phase hierarchy where the leafs represent the");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* AtomicPhase objects.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public void build() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("rootPhase = new SequencePhase(");
      _builder_1.newLine();
      _builder_1.append("\t\t\t\t");
      _builder_1.append("new TestAtomic(\"TestAtomic\")");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append(");");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("/**");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* Instantiates a CaseDescriptor object.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @see CaseDescriptor");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* ");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("* @return CaseDescriptor with every one of its field being initialized.");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("*/");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("@Override");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("public CaseDescriptor getCaseDescriptor() {");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("// TODO Instantiates a CaseDescriptor object");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("return null;");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("}");
      String _string = _builder_1.toString();
      Map<String, CharSequence> _files = fsa.getFiles();
      CharSequence _get = _files.get((IFileSystemAccess.DEFAULT_OUTPUT + "test/scenarios/TestScenario.java"));
      String _string_1 = _get.toString();
      Assert.assertEquals(_string, _string_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
