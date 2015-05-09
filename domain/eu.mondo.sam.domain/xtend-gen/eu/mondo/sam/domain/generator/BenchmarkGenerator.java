/**
 * generated by Xtext
 */
package eu.mondo.sam.domain.generator;

import eu.mondo.sam.domain.benchmark.Benchmark;
import eu.mondo.sam.domain.benchmark.Element;
import eu.mondo.sam.domain.benchmark.Scenario;
import java.util.Arrays;
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
    EList<Element> _elements = benchmark.getElements();
    for (final Element element : _elements) {
      this.generate(element, fsa, benchmark);
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
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("    ");
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
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    fsa.generateFile(_builder.toString(), IFileSystemAccess.DEFAULT_OUTPUT, _builder_1);
    return null;
  }
  
  protected Object _generate(final Element element, final IFileSystemAccess fsa, final Benchmark bench) {
    return null;
  }
  
  public Object generate(final Element scenario, final IFileSystemAccess fsa, final Benchmark bench) {
    if (scenario instanceof Scenario) {
      return _generate((Scenario)scenario, fsa, bench);
    } else if (scenario != null) {
      return _generate(scenario, fsa, bench);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scenario, fsa, bench).toString());
    }
  }
}
