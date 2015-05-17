/**
 * generated by Xtext
 */
package eu.mondo.sam.domain.generator;

import eu.mondo.sam.domain.benchmark.AtomicPhase;
import eu.mondo.sam.domain.benchmark.AttachedPhase;
import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.Element;
import eu.mondo.sam.domain.benchmark.OptionalPhase;
import eu.mondo.sam.domain.benchmark.Phase;
import eu.mondo.sam.domain.benchmark.Scenario;
import eu.mondo.sam.domain.generator.PhaseContainmentResolver;
import eu.mondo.sam.domain.generator.PhaseImportResolver;
import eu.mondo.sam.domain.generator.PhaseStructureResolver;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class BenchmarkGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Benchmark benchmark = ((Benchmark) _head);
    final Set<Element> generatedElements = new HashSet<Element>();
    EList<Element> _elements = benchmark.getElements();
    for (final Element element : _elements) {
      {
        generatedElements.add(element);
        if ((element instanceof Scenario)) {
          final Scenario scen = ((Scenario) element);
          AttachedPhase _rootPhase = scen.getRootPhase();
          Set<Element> _resolvePhases = PhaseContainmentResolver.resolvePhases(_rootPhase, generatedElements);
          generatedElements.addAll(_resolvePhases);
        }
        for (final Element genElement : generatedElements) {
          this.generate(genElement, fsa, benchmark);
        }
      }
    }
  }
  
  protected Object _generate(final Scenario scenario, final IFileSystemAccess fsa, final Benchmark bench) {
    StringConcatenation _builder = new StringConcatenation();
    String _packageName = bench.getPackageName();
    String _replace = _packageName.replace(".", "/");
    _builder.append(_replace, "");
    _builder.append("/scenarios/");
    String _classname = scenario.getClassname();
    _builder.append(_classname, "");
    _builder.append(".java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _packageName_1 = bench.getPackageName();
    _builder_1.append(_packageName_1, "");
    _builder_1.append(".scenarios;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.scenarios.BenchmarkScenario;");
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.results.CaseDescriptor;");
    _builder_1.newLine();
    {
      AttachedPhase _rootPhase = scenario.getRootPhase();
      String _packageName_2 = bench.getPackageName();
      Set<String> _resolvePhases = PhaseImportResolver.resolvePhases(_rootPhase, _packageName_2);
      for(final String imp : _resolvePhases) {
        _builder_1.append("import ");
        _builder_1.append(imp, "");
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class ");
    String _classname_1 = scenario.getClassname();
    _builder_1.append(_classname_1, "");
    _builder_1.append(" extends BenchmarkScenario {");
    _builder_1.newLineIfNotEmpty();
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
    AttachedPhase _rootPhase_1 = scenario.getRootPhase();
    String _resolvePhases_1 = PhaseStructureResolver.resolvePhases(_rootPhase_1);
    _builder_1.append(_resolvePhases_1, "\t\t");
    _builder_1.newLineIfNotEmpty();
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
    fsa.generateFile(_builder.toString(), IFileSystemAccess.DEFAULT_OUTPUT, _builder_1);
    return null;
  }
  
  protected Object _generate(final AtomicPhase atomic, final IFileSystemAccess fsa, final Benchmark bench) {
    StringConcatenation _builder = new StringConcatenation();
    String _packageName = bench.getPackageName();
    String _replace = _packageName.replace(".", "/");
    _builder.append(_replace, "");
    _builder.append("/phases/");
    String _classname = atomic.getClassname();
    _builder.append(_classname, "");
    _builder.append(".java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _packageName_1 = bench.getPackageName();
    _builder_1.append(_packageName_1, "");
    _builder_1.append(".phases;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.phases.AtomicPhase;");
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.DataToken;");
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.results.PhaseResult;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class ");
    String _classname_1 = atomic.getClassname();
    _builder_1.append(_classname_1, "");
    _builder_1.append(" extends AtomicPhase {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public ");
    String _classname_2 = atomic.getClassname();
    _builder_1.append(_classname_2, "\t");
    _builder_1.append("(String phaseName) {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t");
    _builder_1.append("super(phaseName);");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("/**");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* Executes the operations which belongs to the AtomicPhase. Communicates");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* with other AtomicPhase operations via the DataToken object. Every");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* significant Metric result should be attached to the PhaseResult parameter");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* as BenchmarkMetric instance. The results of measurements will be");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* published only when the PhaseResult object contains the certain Metrics.");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* @see PhaseResult");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* @see BenchmarkMetric");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* ");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* @param token");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("*            Represents a communication unit between this and other phases.");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("* @param result");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("*            PhaseResult object. In the case of publishing metrics attach");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("*            BenchmarkMetric objects to it.");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public void execute(DataToken token, PhaseResult phaseResult) {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    fsa.generateFile(_builder.toString(), IFileSystemAccess.DEFAULT_OUTPUT, _builder_1);
    return null;
  }
  
  protected Object _generate(final OptionalPhase optional, final IFileSystemAccess fsa, final Benchmark bench) {
    StringConcatenation _builder = new StringConcatenation();
    String _packageName = bench.getPackageName();
    String _replace = _packageName.replace(".", "/");
    _builder.append(_replace, "");
    _builder.append("/phases/");
    String _classname = optional.getClassname();
    _builder.append(_classname, "");
    _builder.append(".java");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package ");
    String _packageName_1 = bench.getPackageName();
    _builder_1.append(_packageName_1, "");
    _builder_1.append(".phases;");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.phases.OptionalPhase;");
    _builder_1.newLine();
    _builder_1.append("import eu.mondo.sam.core.phases.BenchmarkPhase;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class ");
    String _classname_1 = optional.getClassname();
    _builder_1.append(_classname_1, "");
    _builder_1.append(" extends OptionalPhase {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public ");
    String _classname_2 = optional.getClassname();
    _builder_1.append(_classname_2, "\t");
    _builder_1.append("(BenchmarkPhase phase) {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t");
    _builder_1.append("this.phase = phase;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public boolean condition() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("// TODO define condition");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return false;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    fsa.generateFile(_builder.toString(), IFileSystemAccess.DEFAULT_OUTPUT, _builder_1);
    return null;
  }
  
  protected Object _generate(final Phase phase, final IFileSystemAccess fsa, final Benchmark bench) {
    return null;
  }
  
  public Object generate(final Element atomic, final IFileSystemAccess fsa, final Benchmark bench) {
    if (atomic instanceof AtomicPhase) {
      return _generate((AtomicPhase)atomic, fsa, bench);
    } else if (atomic instanceof OptionalPhase) {
      return _generate((OptionalPhase)atomic, fsa, bench);
    } else if (atomic instanceof Phase) {
      return _generate((Phase)atomic, fsa, bench);
    } else if (atomic instanceof Scenario) {
      return _generate((Scenario)atomic, fsa, bench);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(atomic, fsa, bench).toString());
    }
  }
}
