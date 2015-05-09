/*
* generated by Xtext
*/
package eu.mondo.sam.domain.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import eu.mondo.sam.domain.services.BenchmarkGrammarAccess;

public class BenchmarkParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private BenchmarkGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected eu.mondo.sam.domain.parser.antlr.internal.InternalBenchmarkParser createParser(XtextTokenStream stream) {
		return new eu.mondo.sam.domain.parser.antlr.internal.InternalBenchmarkParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Benchmark";
	}
	
	public BenchmarkGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(BenchmarkGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
