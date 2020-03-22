/*
 * generated by Xtext 2.20.0
 */
grammar InternalMathInterpreter;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package dk.klevang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.klevang.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.klevang.services.MathInterpreterGrammarAccess;

}

@parser::members {

 	private MathInterpreterGrammarAccess grammarAccess;

    public InternalMathInterpreterParser(TokenStream input, MathInterpreterGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "MathExp";
   	}

   	@Override
   	protected MathInterpreterGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleMathExp
entryRuleMathExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMathExpRule()); }
	iv_ruleMathExp=ruleMathExp
	{ $current=$iv_ruleMathExp.current; }
	EOF;

// Rule MathExp
ruleMathExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='let'
		{
			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getLetKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMathExpAccess().getVarVariableParserRuleCall_1_0());
				}
				lv_var_1_0=ruleVariable
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMathExpRule());
					}
					set(
						$current,
						"var",
						lv_var_1_0,
						"dk.klevang.MathInterpreter.Variable");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
				}
				lv_exp_3_0=ruleExp
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMathExpRule());
					}
					set(
						$current,
						"exp",
						lv_exp_3_0,
						"dk.klevang.MathInterpreter.Exp");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMathExpAccess().getMathExpLeftAction_4_0(),
						$current);
				}
			)
			otherlv_5='in'
			{
				newLeafNode(otherlv_5, grammarAccess.getMathExpAccess().getInKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMathExpAccess().getRightExpParserRuleCall_4_2_0());
					}
					lv_right_6_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMathExpRule());
						}
						set(
							$current,
							"right",
							lv_right_6_0,
							"dk.klevang.MathInterpreter.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_7='end'
			{
				newLeafNode(otherlv_7, grammarAccess.getMathExpAccess().getEndKeyword_4_3());
			}
		)*
	)
;

// Entry rule entryRuleExp
entryRuleExp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpRule()); }
	iv_ruleExp=ruleExp
	{ $current=$iv_ruleExp.current; }
	EOF;

// Rule Exp
ruleExp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall());
	}
	this_PlusOrMinus_0=rulePlusOrMinus
	{
		$current = $this_PlusOrMinus_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusOrMinusRule()); }
	iv_rulePlusOrMinus=rulePlusOrMinus
	{ $current=$iv_rulePlusOrMinus.current; }
	EOF;

// Rule PlusOrMinus
rulePlusOrMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
		}
		this_MulOrDiv_0=ruleMulOrDiv
		{
			$current = $this_MulOrDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='+'
					{
						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='-'
					{
						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
					}
					lv_right_5_0=ruleMulOrDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"dk.klevang.MathInterpreter.MulOrDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMulOrDivRule()); }
	iv_ruleMulOrDiv=ruleMulOrDiv
	{ $current=$iv_ruleMulOrDiv.current; }
	EOF;

// Rule MulOrDiv
ruleMulOrDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_0(),
								$current);
						}
					)
					otherlv_2='*'
					{
						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
					}
				)
				    |
				(
					(
						{
							$current = forceCreateModelElementAndSet(
								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(),
								$current);
						}
					)
					otherlv_4='/'
					{
						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
					}
					lv_right_5_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMulOrDivRule());
						}
						set(
							$current,
							"right",
							lv_right_5_0,
							"dk.klevang.MathInterpreter.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
		}
		this_Number_0=ruleNumber
		{
			$current = $this_Number_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
		}
		this_Parenthesis_1=ruleParenthesis
		{
			$current = $this_Parenthesis_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableParserRuleCall_2());
		}
		this_Variable_2=ruleVariable
		{
			$current = $this_Variable_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_var_0_0=RULE_ID
			{
				newLeafNode(lv_var_0_0, grammarAccess.getVariableAccess().getVarIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableRule());
				}
				setWithLastConsumed(
					$current,
					"var",
					lv_var_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleParenthesis
entryRuleParenthesis returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesisRule()); }
	iv_ruleParenthesis=ruleParenthesis
	{ $current=$iv_ruleParenthesis.current; }
	EOF;

// Rule Parenthesis
ruleParenthesis returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_0_1_0());
					}
					lv_exp_1_0=ruleExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParenthesisRule());
						}
						set(
							$current,
							"exp",
							lv_exp_1_0,
							"dk.klevang.MathInterpreter.Exp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		(
			otherlv_3='('
			{
				newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getParenthesisAccess().getMathExpMathExpParserRuleCall_1_1_0());
					}
					lv_mathExp_4_0=ruleMathExp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getParenthesisRule());
						}
						set(
							$current,
							"mathExp",
							lv_mathExp_4_0,
							"dk.klevang.MathInterpreter.MathExp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_5=')'
			{
				newLeafNode(otherlv_5, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleNumber
entryRuleNumber returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumberRule()); }
	iv_ruleNumber=ruleNumber
	{ $current=$iv_ruleNumber.current; }
	EOF;

// Rule Number
ruleNumber returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_INT
			{
				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getNumberRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
