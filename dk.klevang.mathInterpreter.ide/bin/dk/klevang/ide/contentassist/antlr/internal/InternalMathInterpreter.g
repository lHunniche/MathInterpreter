/*
 * generated by Xtext 2.20.0
 */
grammar InternalMathInterpreter;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.klevang.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package dk.klevang.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.klevang.services.MathInterpreterGrammarAccess;

}
@parser::members {
	private MathInterpreterGrammarAccess grammarAccess;

	public void setGrammarAccess(MathInterpreterGrammarAccess grammarAccess) {
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

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getGroup()); }
		(rule__MathExp__Group__0)
		{ after(grammarAccess.getMathExpAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExp
entryRuleExp
:
{ before(grammarAccess.getExpRule()); }
	 ruleExp
{ after(grammarAccess.getExpRule()); } 
	 EOF 
;

// Rule Exp
ruleExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall()); }
		rulePlusOrMinus
		{ after(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus
:
{ before(grammarAccess.getPlusOrMinusRule()); }
	 rulePlusOrMinus
{ after(grammarAccess.getPlusOrMinusRule()); } 
	 EOF 
;

// Rule PlusOrMinus
rulePlusOrMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup()); }
		(rule__PlusOrMinus__Group__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv
:
{ before(grammarAccess.getMulOrDivRule()); }
	 ruleMulOrDiv
{ after(grammarAccess.getMulOrDivRule()); } 
	 EOF 
;

// Rule MulOrDiv
ruleMulOrDiv 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMulOrDivAccess().getGroup()); }
		(rule__MulOrDiv__Group__0)
		{ after(grammarAccess.getMulOrDivAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getExpVarAssignment()); }
		(rule__Variable__ExpVarAssignment)
		{ after(grammarAccess.getVariableAccess().getExpVarAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParenthesis
entryRuleParenthesis
:
{ before(grammarAccess.getParenthesisRule()); }
	 ruleParenthesis
{ after(grammarAccess.getParenthesisRule()); } 
	 EOF 
;

// Rule Parenthesis
ruleParenthesis 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParenthesisAccess().getAlternatives()); }
		(rule__Parenthesis__Alternatives)
		{ after(grammarAccess.getParenthesisAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNumber
entryRuleNumber
:
{ before(grammarAccess.getNumberRule()); }
	 ruleNumber
{ after(grammarAccess.getNumberRule()); } 
	 EOF 
;

// Rule Number
ruleNumber 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNumberAccess().getValueAssignment()); }
		(rule__Number__ValueAssignment)
		{ after(grammarAccess.getNumberAccess().getValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
		(rule__PlusOrMinus__Group_1_0_0__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
		(rule__PlusOrMinus__Group_1_0_1__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); }
		(rule__MulOrDiv__Group_1_0_0__0)
		{ after(grammarAccess.getMulOrDivAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); }
		(rule__MulOrDiv__Group_1_0_1__0)
		{ after(grammarAccess.getMulOrDivAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
		ruleNumber
		{ after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
		ruleParenthesis
		{ after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getVariableParserRuleCall_2()); }
		ruleVariable
		{ after(grammarAccess.getPrimaryAccess().getVariableParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup_0()); }
		(rule__Parenthesis__Group_0__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getParenthesisAccess().getGroup_1()); }
		(rule__Parenthesis__Group_1__0)
		{ after(grammarAccess.getParenthesisAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__0__Impl
	rule__MathExp__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getLetKeyword_0()); }
	'let'
	{ after(grammarAccess.getMathExpAccess().getLetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__1__Impl
	rule__MathExp__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getMathVarAssignment_1()); }
	(rule__MathExp__MathVarAssignment_1)
	{ after(grammarAccess.getMathExpAccess().getMathVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__2__Impl
	rule__MathExp__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__3__Impl
	rule__MathExp__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
	(rule__MathExp__ExpAssignment_3)
	{ after(grammarAccess.getMathExpAccess().getExpAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getGroup_4()); }
	(rule__MathExp__Group_4__0)*
	{ after(grammarAccess.getMathExpAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group_4__0__Impl
	rule__MathExp__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getMathExpLeftAction_4_0()); }
	()
	{ after(grammarAccess.getMathExpAccess().getMathExpLeftAction_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group_4__1__Impl
	rule__MathExp__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getInKeyword_4_1()); }
	'in'
	{ after(grammarAccess.getMathExpAccess().getInKeyword_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group_4__2__Impl
	rule__MathExp__Group_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getRightAssignment_4_2()); }
	(rule__MathExp__RightAssignment_4_2)
	{ after(grammarAccess.getMathExpAccess().getRightAssignment_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MathExp__Group_4__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__Group_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMathExpAccess().getEndKeyword_4_3()); }
	'end'
	{ after(grammarAccess.getMathExpAccess().getEndKeyword_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__0__Impl
	rule__PlusOrMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
	ruleMulOrDiv
	{ after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
	(rule__PlusOrMinus__Group_1__0)*
	{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__0__Impl
	rule__PlusOrMinus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
	(rule__PlusOrMinus__Alternatives_1_0)
	{ after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
	(rule__PlusOrMinus__RightAssignment_1_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__0__Impl
	rule__PlusOrMinus__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); }
	'+'
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__0__Impl
	rule__PlusOrMinus__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); }
	'-'
	{ after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__0__Impl
	rule__MulOrDiv__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getGroup_1()); }
	(rule__MulOrDiv__Group_1__0)*
	{ after(grammarAccess.getMulOrDivAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__0__Impl
	rule__MulOrDiv__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); }
	(rule__MulOrDiv__Alternatives_1_0)
	{ after(grammarAccess.getMulOrDivAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); }
	(rule__MulOrDiv__RightAssignment_1_1)
	{ after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0_0__0__Impl
	rule__MulOrDiv__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); }
	'*'
	{ after(grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0_1__0__Impl
	rule__MulOrDiv__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); }
	'/'
	{ after(grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parenthesis__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_0__0__Impl
	rule__Parenthesis__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_0__1__Impl
	rule__Parenthesis__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getExpAssignment_0_1()); }
	(rule__Parenthesis__ExpAssignment_0_1)
	{ after(grammarAccess.getParenthesisAccess().getExpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_0_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parenthesis__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_1__0__Impl
	rule__Parenthesis__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_1__1__Impl
	rule__Parenthesis__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getMathExpAssignment_1_1()); }
	(rule__Parenthesis__MathExpAssignment_1_1)
	{ after(grammarAccess.getParenthesisAccess().getMathExpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parenthesis__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_1_2()); }
	')'
	{ after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__MathVarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getMathVarVariableParserRuleCall_1_0()); }
		ruleVariable
		{ after(grammarAccess.getMathExpAccess().getMathVarVariableParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__ExpAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MathExp__RightAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getRightExpParserRuleCall_4_2_0()); }
		ruleExp
		{ after(grammarAccess.getMathExpAccess().getRightExpParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
		ruleMulOrDiv
		{ after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); }
		rulePrimary
		{ after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__ExpVarAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getExpVarIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getExpVarIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__ExpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_0_1_0()); }
		ruleExp
		{ after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parenthesis__MathExpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParenthesisAccess().getMathExpMathExpParserRuleCall_1_1_0()); }
		ruleMathExp
		{ after(grammarAccess.getParenthesisAccess().getMathExpMathExpParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Number__ValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); }
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
