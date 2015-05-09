/*
* generated by Xtext
*/
grammar InternalBenchmark;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package eu.mondo.sam.domain.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package eu.mondo.sam.domain.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.mondo.sam.domain.services.BenchmarkGrammarAccess;

}

@parser::members {
 
 	private BenchmarkGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(BenchmarkGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleBenchmark
entryRuleBenchmark 
:
{ before(grammarAccess.getBenchmarkRule()); }
	 ruleBenchmark
{ after(grammarAccess.getBenchmarkRule()); } 
	 EOF 
;

// Rule Benchmark
ruleBenchmark
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBenchmarkAccess().getGroup()); }
(rule__Benchmark__Group__0)
{ after(grammarAccess.getBenchmarkAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleElement
entryRuleElement 
:
{ before(grammarAccess.getElementRule()); }
	 ruleElement
{ after(grammarAccess.getElementRule()); } 
	 EOF 
;

// Rule Element
ruleElement
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getElementAccess().getAlternatives()); }
(rule__Element__Alternatives)
{ after(grammarAccess.getElementAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleScenario
entryRuleScenario 
:
{ before(grammarAccess.getScenarioRule()); }
	 ruleScenario
{ after(grammarAccess.getScenarioRule()); } 
	 EOF 
;

// Rule Scenario
ruleScenario
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getScenarioAccess().getGroup()); }
(rule__Scenario__Group__0)
{ after(grammarAccess.getScenarioAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePhase
entryRulePhase 
:
{ before(grammarAccess.getPhaseRule()); }
	 rulePhase
{ after(grammarAccess.getPhaseRule()); } 
	 EOF 
;

// Rule Phase
rulePhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPhaseAccess().getAlternatives()); }
(rule__Phase__Alternatives)
{ after(grammarAccess.getPhaseAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleSequencePhase
entryRuleSequencePhase 
:
{ before(grammarAccess.getSequencePhaseRule()); }
	 ruleSequencePhase
{ after(grammarAccess.getSequencePhaseRule()); } 
	 EOF 
;

// Rule SequencePhase
ruleSequencePhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getSequencePhaseAccess().getGroup()); }
(rule__SequencePhase__Group__0)
{ after(grammarAccess.getSequencePhaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIterationPhase
entryRuleIterationPhase 
:
{ before(grammarAccess.getIterationPhaseRule()); }
	 ruleIterationPhase
{ after(grammarAccess.getIterationPhaseRule()); } 
	 EOF 
;

// Rule IterationPhase
ruleIterationPhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIterationPhaseAccess().getGroup()); }
(rule__IterationPhase__Group__0)
{ after(grammarAccess.getIterationPhaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleOptionalPhase
entryRuleOptionalPhase 
:
{ before(grammarAccess.getOptionalPhaseRule()); }
	 ruleOptionalPhase
{ after(grammarAccess.getOptionalPhaseRule()); } 
	 EOF 
;

// Rule OptionalPhase
ruleOptionalPhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getOptionalPhaseAccess().getGroup()); }
(rule__OptionalPhase__Group__0)
{ after(grammarAccess.getOptionalPhaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttachedPhase
entryRuleAttachedPhase 
:
{ before(grammarAccess.getAttachedPhaseRule()); }
	 ruleAttachedPhase
{ after(grammarAccess.getAttachedPhaseRule()); } 
	 EOF 
;

// Rule AttachedPhase
ruleAttachedPhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttachedPhaseAccess().getAlternatives()); }
(rule__AttachedPhase__Alternatives)
{ after(grammarAccess.getAttachedPhaseAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRulePhaseReference
entryRulePhaseReference 
:
{ before(grammarAccess.getPhaseReferenceRule()); }
	 rulePhaseReference
{ after(grammarAccess.getPhaseReferenceRule()); } 
	 EOF 
;

// Rule PhaseReference
rulePhaseReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getPhaseReferenceAccess().getPhaseAssignment()); }
(rule__PhaseReference__PhaseAssignment)
{ after(grammarAccess.getPhaseReferenceAccess().getPhaseAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNewPhase
entryRuleNewPhase 
:
{ before(grammarAccess.getNewPhaseRule()); }
	 ruleNewPhase
{ after(grammarAccess.getNewPhaseRule()); } 
	 EOF 
;

// Rule NewPhase
ruleNewPhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNewPhaseAccess().getPhaseAssignment()); }
(rule__NewPhase__PhaseAssignment)
{ after(grammarAccess.getNewPhaseAccess().getPhaseAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAtomicPhase
entryRuleAtomicPhase 
:
{ before(grammarAccess.getAtomicPhaseRule()); }
	 ruleAtomicPhase
{ after(grammarAccess.getAtomicPhaseRule()); } 
	 EOF 
;

// Rule AtomicPhase
ruleAtomicPhase
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAtomicPhaseAccess().getGroup()); }
(rule__AtomicPhase__Group__0)
{ after(grammarAccess.getAtomicPhaseAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleAttachedMetric
entryRuleAttachedMetric 
:
{ before(grammarAccess.getAttachedMetricRule()); }
	 ruleAttachedMetric
{ after(grammarAccess.getAttachedMetricRule()); } 
	 EOF 
;

// Rule AttachedMetric
ruleAttachedMetric
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAttachedMetricAccess().getAlternatives()); }
(rule__AttachedMetric__Alternatives)
{ after(grammarAccess.getAttachedMetricAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleMetricTypeReference
entryRuleMetricTypeReference 
:
{ before(grammarAccess.getMetricTypeReferenceRule()); }
	 ruleMetricTypeReference
{ after(grammarAccess.getMetricTypeReferenceRule()); } 
	 EOF 
;

// Rule MetricTypeReference
ruleMetricTypeReference
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment()); }
(rule__MetricTypeReference__MetricAssignment)
{ after(grammarAccess.getMetricTypeReferenceAccess().getMetricAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleNewMetric
entryRuleNewMetric 
:
{ before(grammarAccess.getNewMetricRule()); }
	 ruleNewMetric
{ after(grammarAccess.getNewMetricRule()); } 
	 EOF 
;

// Rule NewMetric
ruleNewMetric
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNewMetricAccess().getGroup()); }
(rule__NewMetric__Group__0)
{ after(grammarAccess.getNewMetricAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedName
entryRuleQualifiedName 
:
{ before(grammarAccess.getQualifiedNameRule()); }
	 ruleQualifiedName
{ after(grammarAccess.getQualifiedNameRule()); } 
	 EOF 
;

// Rule QualifiedName
ruleQualifiedName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup()); }
(rule__QualifiedName__Group__0)
{ after(grammarAccess.getQualifiedNameAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule MetricType
ruleMetricType
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetricTypeAccess().getAlternatives()); }
(rule__MetricType__Alternatives)
{ after(grammarAccess.getMetricTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Element__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); }
	ruleScenario
{ after(grammarAccess.getElementAccess().getScenarioParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); }
	rulePhase
{ after(grammarAccess.getElementAccess().getPhaseParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Phase__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); }
	ruleSequencePhase
{ after(grammarAccess.getPhaseAccess().getSequencePhaseParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); }
	ruleIterationPhase
{ after(grammarAccess.getPhaseAccess().getIterationPhaseParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); }
	ruleOptionalPhase
{ after(grammarAccess.getPhaseAccess().getOptionalPhaseParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); }
	ruleAtomicPhase
{ after(grammarAccess.getPhaseAccess().getAtomicPhaseParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AttachedPhase__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); }
	rulePhaseReference
{ after(grammarAccess.getAttachedPhaseAccess().getPhaseReferenceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); }
	ruleNewPhase
{ after(grammarAccess.getAttachedPhaseAccess().getNewPhaseParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AttachedMetric__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); }
	ruleMetricTypeReference
{ after(grammarAccess.getAttachedMetricAccess().getMetricTypeReferenceParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); }
	ruleNewMetric
{ after(grammarAccess.getAttachedMetricAccess().getNewMetricParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MetricType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); }
(	'Time' 
)
{ after(grammarAccess.getMetricTypeAccess().getTimeEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); }
(	'Memory' 
)
{ after(grammarAccess.getMetricTypeAccess().getMemoryEnumLiteralDeclaration_1()); }
)

    |(
{ before(grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); }
(	'Scalar' 
)
{ after(grammarAccess.getMetricTypeAccess().getScalarEnumLiteralDeclaration_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Benchmark__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Benchmark__Group__0__Impl
	rule__Benchmark__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Benchmark__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBenchmarkAccess().getPackageKeyword_0()); }

	'package' 

{ after(grammarAccess.getBenchmarkAccess().getPackageKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Benchmark__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Benchmark__Group__1__Impl
	rule__Benchmark__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Benchmark__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBenchmarkAccess().getPackageNameAssignment_1()); }
(rule__Benchmark__PackageNameAssignment_1)
{ after(grammarAccess.getBenchmarkAccess().getPackageNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Benchmark__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Benchmark__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Benchmark__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBenchmarkAccess().getElementsAssignment_2()); }
(rule__Benchmark__ElementsAssignment_2)*
{ after(grammarAccess.getBenchmarkAccess().getElementsAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Scenario__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__0__Impl
	rule__Scenario__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); }

	'Scenario' 

{ after(grammarAccess.getScenarioAccess().getScenarioKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__1__Impl
	rule__Scenario__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getClassnameAssignment_1()); }
(rule__Scenario__ClassnameAssignment_1)
{ after(grammarAccess.getScenarioAccess().getClassnameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__2__Impl
	rule__Scenario__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getScenarioAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__3__Impl
	rule__Scenario__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); }
(rule__Scenario__RootPhaseAssignment_3)
{ after(grammarAccess.getScenarioAccess().getRootPhaseAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Scenario__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Scenario__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getScenarioAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__SequencePhase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SequencePhase__Group__0__Impl
	rule__SequencePhase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); }

	'Sequence' 

{ after(grammarAccess.getSequencePhaseAccess().getSequenceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SequencePhase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SequencePhase__Group__1__Impl
	rule__SequencePhase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); }
(rule__SequencePhase__NameAssignment_1)?
{ after(grammarAccess.getSequencePhaseAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SequencePhase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SequencePhase__Group__2__Impl
	rule__SequencePhase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getSequencePhaseAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SequencePhase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SequencePhase__Group__3__Impl
	rule__SequencePhase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
(
{ before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); }
(rule__SequencePhase__PhasesAssignment_3)
{ after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); }
)
(
{ before(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); }
(rule__SequencePhase__PhasesAssignment_3)*
{ after(grammarAccess.getSequencePhaseAccess().getPhasesAssignment_3()); }
)
)

;
finally {
	restoreStackSize(stackSize);
}


rule__SequencePhase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__SequencePhase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getSequencePhaseAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__IterationPhase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__0__Impl
	rule__IterationPhase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); }

	'Iteration' 

{ after(grammarAccess.getIterationPhaseAccess().getIterationKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__1__Impl
	rule__IterationPhase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); }
(rule__IterationPhase__NameAssignment_1)?
{ after(grammarAccess.getIterationPhaseAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__2__Impl
	rule__IterationPhase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getIterationPhaseAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__3__Impl
	rule__IterationPhase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); }
(rule__IterationPhase__IterationAssignment_3)
{ after(grammarAccess.getIterationPhaseAccess().getIterationAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__4__Impl
	rule__IterationPhase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); }

	'*' 

{ after(grammarAccess.getIterationPhaseAccess().getAsteriskKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__5__Impl
	rule__IterationPhase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); }
(rule__IterationPhase__PhaseAssignment_5)
{ after(grammarAccess.getIterationPhaseAccess().getPhaseAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__IterationPhase__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__IterationPhase__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6()); }

	')' 

{ after(grammarAccess.getIterationPhaseAccess().getRightParenthesisKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__OptionalPhase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionalPhase__Group__0__Impl
	rule__OptionalPhase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); }

	'Optional' 

{ after(grammarAccess.getOptionalPhaseAccess().getOptionalKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalPhase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionalPhase__Group__1__Impl
	rule__OptionalPhase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); }
(rule__OptionalPhase__NameAssignment_1)?
{ after(grammarAccess.getOptionalPhaseAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalPhase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionalPhase__Group__2__Impl
	rule__OptionalPhase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2()); }

	'(' 

{ after(grammarAccess.getOptionalPhaseAccess().getLeftParenthesisKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalPhase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionalPhase__Group__3__Impl
	rule__OptionalPhase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_3()); }
(rule__OptionalPhase__PhaseAssignment_3)
{ after(grammarAccess.getOptionalPhaseAccess().getPhaseAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__OptionalPhase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__OptionalPhase__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4()); }

	')' 

{ after(grammarAccess.getOptionalPhaseAccess().getRightParenthesisKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__AtomicPhase__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__0__Impl
	rule__AtomicPhase__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); }

	'Atomic' 

{ after(grammarAccess.getAtomicPhaseAccess().getAtomicKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__1__Impl
	rule__AtomicPhase__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); }
(rule__AtomicPhase__NameAssignment_1)?
{ after(grammarAccess.getAtomicPhaseAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__2__Impl
	rule__AtomicPhase__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); }

	'ClassName' 

{ after(grammarAccess.getAtomicPhaseAccess().getClassNameKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__3__Impl
	rule__AtomicPhase__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); }
(rule__AtomicPhase__ClassnameAssignment_3)
{ after(grammarAccess.getAtomicPhaseAccess().getClassnameAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__4__Impl
	rule__AtomicPhase__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); }

	'Metrics(' 

{ after(grammarAccess.getAtomicPhaseAccess().getMetricsKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__5__Impl
	rule__AtomicPhase__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); }
(rule__AtomicPhase__MetricsAssignment_5)*
{ after(grammarAccess.getAtomicPhaseAccess().getMetricsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__AtomicPhase__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__AtomicPhase__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); }

	')' 

{ after(grammarAccess.getAtomicPhaseAccess().getRightParenthesisKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}
















rule__NewMetric__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewMetric__Group__0__Impl
	rule__NewMetric__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getNewMetricKeyword_0()); }

	'new Metric' 

{ after(grammarAccess.getNewMetricAccess().getNewMetricKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NewMetric__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewMetric__Group__1__Impl
	rule__NewMetric__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getGroup_1()); }
(rule__NewMetric__Group_1__0)?
{ after(grammarAccess.getNewMetricAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NewMetric__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewMetric__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getMetricnameAssignment_2()); }
(rule__NewMetric__MetricnameAssignment_2)
{ after(grammarAccess.getNewMetricAccess().getMetricnameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__NewMetric__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewMetric__Group_1__0__Impl
	rule__NewMetric__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getIDKeyword_1_0()); }

	'ID' 

{ after(grammarAccess.getNewMetricAccess().getIDKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__NewMetric__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__NewMetric__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getNameAssignment_1_1()); }
(rule__NewMetric__NameAssignment_1_1)
{ after(grammarAccess.getNewMetricAccess().getNameAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__0__Impl
	rule__QualifiedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
(rule__QualifiedName__Group_1__0)*
{ after(grammarAccess.getQualifiedNameAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedName__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__0__Impl
	rule__QualifiedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedName__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedName__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
{ after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Benchmark__PackageNameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); }
	ruleQualifiedName{ after(grammarAccess.getBenchmarkAccess().getPackageNameQualifiedNameParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Benchmark__ElementsAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); }
	ruleElement{ after(grammarAccess.getBenchmarkAccess().getElementsElementParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__ClassnameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getClassnameSTRINGTerminalRuleCall_1_0()); }
	RULE_STRING{ after(grammarAccess.getScenarioAccess().getClassnameSTRINGTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Scenario__RootPhaseAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); }
	rulePhase{ after(grammarAccess.getScenarioAccess().getRootPhasePhaseParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getSequencePhaseAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__SequencePhase__PhasesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); }
	ruleAttachedPhase{ after(grammarAccess.getSequencePhaseAccess().getPhasesAttachedPhaseParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getIterationPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__IterationAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); }
	RULE_INT{ after(grammarAccess.getIterationPhaseAccess().getIterationINTTerminalRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__IterationPhase__PhaseAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); }
	ruleAttachedPhase{ after(grammarAccess.getIterationPhaseAccess().getPhaseAttachedPhaseParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getOptionalPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__OptionalPhase__PhaseAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); }
	ruleAttachedPhase{ after(grammarAccess.getOptionalPhaseAccess().getPhaseAttachedPhaseParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__PhaseReference__PhaseAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); }
(
{ before(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); }
	RULE_ID{ after(grammarAccess.getPhaseReferenceAccess().getPhasePhaseIDTerminalRuleCall_0_1()); }
)
{ after(grammarAccess.getPhaseReferenceAccess().getPhasePhaseCrossReference_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NewPhase__PhaseAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); }
	rulePhase{ after(grammarAccess.getNewPhaseAccess().getPhasePhaseParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getAtomicPhaseAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__ClassnameAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getClassnameQualifiedNameParserRuleCall_3_0()); }
	ruleQualifiedName{ after(grammarAccess.getAtomicPhaseAccess().getClassnameQualifiedNameParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicPhase__MetricsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); }
	ruleAttachedMetric{ after(grammarAccess.getAtomicPhaseAccess().getMetricsAttachedMetricParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__MetricTypeReference__MetricAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); }
	ruleMetricType{ after(grammarAccess.getMetricTypeReferenceAccess().getMetricMetricTypeEnumRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__NameAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); }
	RULE_ID{ after(grammarAccess.getNewMetricAccess().getNameIDTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__NewMetric__MetricnameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); }
	ruleQualifiedName{ after(grammarAccess.getNewMetricAccess().getMetricnameQualifiedNameParserRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


