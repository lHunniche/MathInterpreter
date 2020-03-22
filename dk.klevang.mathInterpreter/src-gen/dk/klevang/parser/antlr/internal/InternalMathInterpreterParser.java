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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathInterpreterParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'let'", "'='", "'in'", "'end'", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalMathInterpreterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathInterpreterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathInterpreterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMathInterpreter.g"; }



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




    // $ANTLR start "entryRuleMathExp"
    // InternalMathInterpreter.g:64:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMathInterpreter.g:64:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMathInterpreter.g:65:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMathInterpreter.g:71:1: ruleMathExp returns [EObject current=null] : (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_var_1_0 = null;

        EObject lv_exp_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:77:2: ( (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )* ) )
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )* )
            {
            // InternalMathInterpreter.g:78:2: (otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )* )
            // InternalMathInterpreter.g:79:3: otherlv_0= 'let' ( (lv_var_1_0= ruleVariable ) ) otherlv_2= '=' ( (lv_exp_3_0= ruleExp ) ) ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMathExpAccess().getLetKeyword_0());
            		
            // InternalMathInterpreter.g:83:3: ( (lv_var_1_0= ruleVariable ) )
            // InternalMathInterpreter.g:84:4: (lv_var_1_0= ruleVariable )
            {
            // InternalMathInterpreter.g:84:4: (lv_var_1_0= ruleVariable )
            // InternalMathInterpreter.g:85:5: lv_var_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getVarVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_var_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"var",
            						lv_var_1_0,
            						"dk.klevang.MathInterpreter.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMathExpAccess().getEqualsSignKeyword_2());
            		
            // InternalMathInterpreter.g:106:3: ( (lv_exp_3_0= ruleExp ) )
            // InternalMathInterpreter.g:107:4: (lv_exp_3_0= ruleExp )
            {
            // InternalMathInterpreter.g:107:4: (lv_exp_3_0= ruleExp )
            // InternalMathInterpreter.g:108:5: lv_exp_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_exp_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMathExpRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_3_0,
            						"dk.klevang.MathInterpreter.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMathInterpreter.g:125:3: ( () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMathInterpreter.g:126:4: () otherlv_5= 'in' ( (lv_right_6_0= ruleExp ) ) otherlv_7= 'end'
            	    {
            	    // InternalMathInterpreter.g:126:4: ()
            	    // InternalMathInterpreter.g:127:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMathExpAccess().getMathExpLeftAction_4_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_5=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMathExpAccess().getInKeyword_4_1());
            	    			
            	    // InternalMathInterpreter.g:137:4: ( (lv_right_6_0= ruleExp ) )
            	    // InternalMathInterpreter.g:138:5: (lv_right_6_0= ruleExp )
            	    {
            	    // InternalMathInterpreter.g:138:5: (lv_right_6_0= ruleExp )
            	    // InternalMathInterpreter.g:139:6: lv_right_6_0= ruleExp
            	    {

            	    						newCompositeNode(grammarAccess.getMathExpAccess().getRightExpParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_6_0=ruleExp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_6_0,
            	    							"dk.klevang.MathInterpreter.Exp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMathExpAccess().getEndKeyword_4_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMathInterpreter.g:165:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMathInterpreter.g:165:44: (iv_ruleExp= ruleExp EOF )
            // InternalMathInterpreter.g:166:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMathInterpreter.g:172:1: ruleExp returns [EObject current=null] : this_PlusOrMinus_0= rulePlusOrMinus ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOrMinus_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:178:2: (this_PlusOrMinus_0= rulePlusOrMinus )
            // InternalMathInterpreter.g:179:2: this_PlusOrMinus_0= rulePlusOrMinus
            {

            		newCompositeNode(grammarAccess.getExpAccess().getPlusOrMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            		current = this_PlusOrMinus_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMathInterpreter.g:190:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMathInterpreter.g:190:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMathInterpreter.g:191:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMathInterpreter.g:197:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:203:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMathInterpreter.g:204:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMathInterpreter.g:204:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMathInterpreter.g:205:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;


            			current = this_MulOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:213:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMathInterpreter.g:214:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMathInterpreter.g:214:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==15) ) {
            	        alt2=1;
            	    }
            	    else if ( (LA2_0==16) ) {
            	        alt2=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 2, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // InternalMathInterpreter.g:215:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMathInterpreter.g:215:5: ( () otherlv_2= '+' )
            	            // InternalMathInterpreter.g:216:6: () otherlv_2= '+'
            	            {
            	            // InternalMathInterpreter.g:216:6: ()
            	            // InternalMathInterpreter.g:217:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpreter.g:229:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMathInterpreter.g:229:5: ( () otherlv_4= '-' )
            	            // InternalMathInterpreter.g:230:6: () otherlv_4= '-'
            	            {
            	            // InternalMathInterpreter.g:230:6: ()
            	            // InternalMathInterpreter.g:231:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,16,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpreter.g:243:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMathInterpreter.g:244:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMathInterpreter.g:244:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMathInterpreter.g:245:6: lv_right_5_0= ruleMulOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.klevang.MathInterpreter.MulOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMathInterpreter.g:267:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMathInterpreter.g:267:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMathInterpreter.g:268:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;

             current =iv_ruleMulOrDiv; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMathInterpreter.g:274:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:280:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMathInterpreter.g:281:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMathInterpreter.g:281:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMathInterpreter.g:282:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMathInterpreter.g:290:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=18)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMathInterpreter.g:291:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMathInterpreter.g:291:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==17) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==18) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMathInterpreter.g:292:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMathInterpreter.g:292:5: ( () otherlv_2= '*' )
            	            // InternalMathInterpreter.g:293:6: () otherlv_2= '*'
            	            {
            	            // InternalMathInterpreter.g:293:6: ()
            	            // InternalMathInterpreter.g:294:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            	            						newLeafNode(otherlv_2, grammarAccess.getMulOrDivAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMathInterpreter.g:306:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMathInterpreter.g:306:5: ( () otherlv_4= '/' )
            	            // InternalMathInterpreter.g:307:6: () otherlv_4= '/'
            	            {
            	            // InternalMathInterpreter.g:307:6: ()
            	            // InternalMathInterpreter.g:308:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            	            						newLeafNode(otherlv_4, grammarAccess.getMulOrDivAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMathInterpreter.g:320:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMathInterpreter.g:321:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMathInterpreter.g:321:5: (lv_right_5_0= rulePrimary )
            	    // InternalMathInterpreter.g:322:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.klevang.MathInterpreter.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMathInterpreter.g:344:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMathInterpreter.g:344:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMathInterpreter.g:345:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMathInterpreter.g:351:1: rulePrimary returns [EObject current=null] : (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        EObject this_Number_0 = null;

        EObject this_Parenthesis_1 = null;

        EObject this_Variable_2 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:357:2: ( (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable ) )
            // InternalMathInterpreter.g:358:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable )
            {
            // InternalMathInterpreter.g:358:2: (this_Number_0= ruleNumber | this_Parenthesis_1= ruleParenthesis | this_Variable_2= ruleVariable )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMathInterpreter.g:359:3: this_Number_0= ruleNumber
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Number_0=ruleNumber();

                    state._fsp--;


                    			current = this_Number_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:368:3: this_Parenthesis_1= ruleParenthesis
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parenthesis_1=ruleParenthesis();

                    state._fsp--;


                    			current = this_Parenthesis_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMathInterpreter.g:377:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleVariable"
    // InternalMathInterpreter.g:389:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMathInterpreter.g:389:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMathInterpreter.g:390:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMathInterpreter.g:396:1: ruleVariable returns [EObject current=null] : ( (lv_var_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:402:2: ( ( (lv_var_0_0= RULE_ID ) ) )
            // InternalMathInterpreter.g:403:2: ( (lv_var_0_0= RULE_ID ) )
            {
            // InternalMathInterpreter.g:403:2: ( (lv_var_0_0= RULE_ID ) )
            // InternalMathInterpreter.g:404:3: (lv_var_0_0= RULE_ID )
            {
            // InternalMathInterpreter.g:404:3: (lv_var_0_0= RULE_ID )
            // InternalMathInterpreter.g:405:4: lv_var_0_0= RULE_ID
            {
            lv_var_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_var_0_0, grammarAccess.getVariableAccess().getVarIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"var",
            					lv_var_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMathInterpreter.g:424:1: entryRuleParenthesis returns [EObject current=null] : iv_ruleParenthesis= ruleParenthesis EOF ;
    public final EObject entryRuleParenthesis() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesis = null;


        try {
            // InternalMathInterpreter.g:424:52: (iv_ruleParenthesis= ruleParenthesis EOF )
            // InternalMathInterpreter.g:425:2: iv_ruleParenthesis= ruleParenthesis EOF
            {
             newCompositeNode(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParenthesis=ruleParenthesis();

            state._fsp--;

             current =iv_ruleParenthesis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMathInterpreter.g:431:1: ruleParenthesis returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleParenthesis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exp_1_0 = null;

        EObject lv_mathExp_4_0 = null;



        	enterRule();

        try {
            // InternalMathInterpreter.g:437:2: ( ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' ) ) )
            // InternalMathInterpreter.g:438:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' ) )
            {
            // InternalMathInterpreter.g:438:2: ( (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' ) | (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=RULE_ID && LA7_1<=RULE_INT)||LA7_1==19) ) {
                    alt7=1;
                }
                else if ( (LA7_1==11) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMathInterpreter.g:439:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
                    {
                    // InternalMathInterpreter.g:439:3: (otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')' )
                    // InternalMathInterpreter.g:440:4: otherlv_0= '(' ( (lv_exp_1_0= ruleExp ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalMathInterpreter.g:444:4: ( (lv_exp_1_0= ruleExp ) )
                    // InternalMathInterpreter.g:445:5: (lv_exp_1_0= ruleExp )
                    {
                    // InternalMathInterpreter.g:445:5: (lv_exp_1_0= ruleExp )
                    // InternalMathInterpreter.g:446:6: lv_exp_1_0= ruleExp
                    {

                    						newCompositeNode(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_exp_1_0=ruleExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParenthesisRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"dk.klevang.MathInterpreter.Exp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMathInterpreter.g:469:3: (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' )
                    {
                    // InternalMathInterpreter.g:469:3: (otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')' )
                    // InternalMathInterpreter.g:470:4: otherlv_3= '(' ( (lv_mathExp_4_0= ruleMathExp ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMathInterpreter.g:474:4: ( (lv_mathExp_4_0= ruleMathExp ) )
                    // InternalMathInterpreter.g:475:5: (lv_mathExp_4_0= ruleMathExp )
                    {
                    // InternalMathInterpreter.g:475:5: (lv_mathExp_4_0= ruleMathExp )
                    // InternalMathInterpreter.g:476:6: lv_mathExp_4_0= ruleMathExp
                    {

                    						newCompositeNode(grammarAccess.getParenthesisAccess().getMathExpMathExpParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_mathExp_4_0=ruleMathExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParenthesisRule());
                    						}
                    						set(
                    							current,
                    							"mathExp",
                    							lv_mathExp_4_0,
                    							"dk.klevang.MathInterpreter.MathExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMathInterpreter.g:502:1: entryRuleNumber returns [EObject current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final EObject entryRuleNumber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumber = null;


        try {
            // InternalMathInterpreter.g:502:47: (iv_ruleNumber= ruleNumber EOF )
            // InternalMathInterpreter.g:503:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMathInterpreter.g:509:1: ruleNumber returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumber() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMathInterpreter.g:515:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMathInterpreter.g:516:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMathInterpreter.g:516:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMathInterpreter.g:517:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMathInterpreter.g:517:3: (lv_value_0_0= RULE_INT )
            // InternalMathInterpreter.g:518:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});

}