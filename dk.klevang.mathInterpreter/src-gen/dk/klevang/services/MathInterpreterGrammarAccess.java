/*
 * generated by Xtext 2.20.0
 */
package dk.klevang.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathInterpreterGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMathVarAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMathVarVariableParserRuleCall_1_0 = (RuleCall)cMathVarAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Action cMathExpLeftAction_4_0 = (Action)cGroup_4.eContents().get(0);
		private final Keyword cInKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cRightAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cRightExpParserRuleCall_4_2_0 = (RuleCall)cRightAssignment_4_2.eContents().get(0);
		private final Keyword cEndKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		
		//MathExp:
		//	'let' mathVar=Variable '=' exp=Exp ({MathExp.left=current} 'in' right=Exp 'end')*;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' mathVar=Variable '=' exp=Exp ({MathExp.left=current} 'in' right=Exp 'end')*
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//mathVar=Variable
		public Assignment getMathVarAssignment_1() { return cMathVarAssignment_1; }
		
		//Variable
		public RuleCall getMathVarVariableParserRuleCall_1_0() { return cMathVarVariableParserRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
		
		//({MathExp.left=current} 'in' right=Exp 'end')*
		public Group getGroup_4() { return cGroup_4; }
		
		//{MathExp.left=current}
		public Action getMathExpLeftAction_4_0() { return cMathExpLeftAction_4_0; }
		
		//'in'
		public Keyword getInKeyword_4_1() { return cInKeyword_4_1; }
		
		//right=Exp
		public Assignment getRightAssignment_4_2() { return cRightAssignment_4_2; }
		
		//Exp
		public RuleCall getRightExpParserRuleCall_4_2_0() { return cRightExpParserRuleCall_4_2_0; }
		
		//'end'
		public Keyword getEndKeyword_4_3() { return cEndKeyword_4_3; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.Exp");
		private final RuleCall cPlusOrMinusParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Exp:
		//	PlusOrMinus;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusOrMinus
		public RuleCall getPlusOrMinusParserRuleCall() { return cPlusOrMinusParserRuleCall; }
	}
	public class PlusOrMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.PlusOrMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMulOrDivParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMulOrDivParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//PlusOrMinus Exp:
		//	MulOrDiv (({Plus.left=current} '+' | {Minus.left=current} '-') right=MulOrDiv)*;
		@Override public ParserRule getRule() { return rule; }
		
		//MulOrDiv (({Plus.left=current} '+' | {Minus.left=current} '-') right=MulOrDiv)*
		public Group getGroup() { return cGroup; }
		
		//MulOrDiv
		public RuleCall getMulOrDivParserRuleCall_0() { return cMulOrDivParserRuleCall_0; }
		
		//(({Plus.left=current} '+' | {Minus.left=current} '-') right=MulOrDiv)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current} '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=MulOrDiv
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//MulOrDiv
		public RuleCall getRightMulOrDivParserRuleCall_1_1_0() { return cRightMulOrDivParserRuleCall_1_1_0; }
	}
	public class MulOrDivElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.MulOrDiv");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cMultLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cDivLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//MulOrDiv Exp:
		//	Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//(({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Mult.left=current} '*' | {Div.left=current} '/')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Mult.left=current} '*'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Mult.left=current}
		public Action getMultLeftAction_1_0_0_0() { return cMultLeftAction_1_0_0_0; }
		
		//'*'
		public Keyword getAsteriskKeyword_1_0_0_1() { return cAsteriskKeyword_1_0_0_1; }
		
		//{Div.left=current} '/'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Div.left=current}
		public Action getDivLeftAction_1_0_1_0() { return cDivLeftAction_1_0_1_0; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0_1_1() { return cSolidusKeyword_1_0_1_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cParenthesisParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Primary Exp:
		//	Number | Parenthesis | Variable;
		@Override public ParserRule getRule() { return rule; }
		
		//Number | Parenthesis | Variable
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//Parenthesis
		public RuleCall getParenthesisParserRuleCall_1() { return cParenthesisParserRuleCall_1; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_2() { return cVariableParserRuleCall_2; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.Variable");
		private final Assignment cExpVarAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cExpVarIDTerminalRuleCall_0 = (RuleCall)cExpVarAssignment.eContents().get(0);
		
		//Variable Exp:
		//	expVar=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//expVar=ID
		public Assignment getExpVarAssignment() { return cExpVarAssignment; }
		
		//ID
		public RuleCall getExpVarIDTerminalRuleCall_0() { return cExpVarIDTerminalRuleCall_0; }
	}
	public class ParenthesisElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.Parenthesis");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cExpAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_0_1_0 = (RuleCall)cExpAssignment_0_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMathExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cMathExpMathExpParserRuleCall_1_1_0 = (RuleCall)cMathExpAssignment_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Parenthesis Exp:
		//	'(' exp=Exp ')' | '(' mathExp=MathExp ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' exp=Exp ')' | '(' mathExp=MathExp ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' exp=Exp ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_0_1() { return cExpAssignment_0_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_0_1_0() { return cExpExpParserRuleCall_0_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//'(' mathExp=MathExp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//mathExp=MathExp
		public Assignment getMathExpAssignment_1_1() { return cMathExpAssignment_1_1; }
		
		//MathExp
		public RuleCall getMathExpMathExpParserRuleCall_1_1_0() { return cMathExpMathExpParserRuleCall_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.klevang.MathInterpreter.Number");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Number Exp:
		//	value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	
	
	private final MathExpElements pMathExp;
	private final ExpElements pExp;
	private final PlusOrMinusElements pPlusOrMinus;
	private final MulOrDivElements pMulOrDiv;
	private final PrimaryElements pPrimary;
	private final VariableElements pVariable;
	private final ParenthesisElements pParenthesis;
	private final NumberElements pNumber;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathInterpreterGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pExp = new ExpElements();
		this.pPlusOrMinus = new PlusOrMinusElements();
		this.pMulOrDiv = new MulOrDivElements();
		this.pPrimary = new PrimaryElements();
		this.pVariable = new VariableElements();
		this.pParenthesis = new ParenthesisElements();
		this.pNumber = new NumberElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.klevang.MathInterpreter".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MathExp:
	//	'let' mathVar=Variable '=' exp=Exp ({MathExp.left=current} 'in' right=Exp 'end')*;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Exp:
	//	PlusOrMinus;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//PlusOrMinus Exp:
	//	MulOrDiv (({Plus.left=current} '+' | {Minus.left=current} '-') right=MulOrDiv)*;
	public PlusOrMinusElements getPlusOrMinusAccess() {
		return pPlusOrMinus;
	}
	
	public ParserRule getPlusOrMinusRule() {
		return getPlusOrMinusAccess().getRule();
	}
	
	//MulOrDiv Exp:
	//	Primary (({Mult.left=current} '*' | {Div.left=current} '/') right=Primary)*;
	public MulOrDivElements getMulOrDivAccess() {
		return pMulOrDiv;
	}
	
	public ParserRule getMulOrDivRule() {
		return getMulOrDivAccess().getRule();
	}
	
	//Primary Exp:
	//	Number | Parenthesis | Variable;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Variable Exp:
	//	expVar=ID;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//Parenthesis Exp:
	//	'(' exp=Exp ')' | '(' mathExp=MathExp ')';
	public ParenthesisElements getParenthesisAccess() {
		return pParenthesis;
	}
	
	public ParserRule getParenthesisRule() {
		return getParenthesisAccess().getRule();
	}
	
	//Number Exp:
	//	value=INT;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
