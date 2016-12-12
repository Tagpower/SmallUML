package org.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Attribute'", "'{'", "'type'", "'}'", "'Role'", "'lowerBound'", "'upperBound'", "'isAbstract'", "'Operation'", "'returnType'", "'parameters'", "','", "'Parameter'", "'Class'", "'super'", "'attribute'", "'operation'", "'Integer'", "'String'", "'Date'", "'-'"
    };
    public static final int RULE_STRING=4;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSmallUMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallUMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallUMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSmallUML.g"; }



     	private SmallUMLGrammarAccess grammarAccess;

        public InternalSmallUMLParser(TokenStream input, SmallUMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SuperType";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSuperType"
    // InternalSmallUML.g:64:1: entryRuleSuperType returns [EObject current=null] : iv_ruleSuperType= ruleSuperType EOF ;
    public final EObject entryRuleSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperType = null;


        try {
            // InternalSmallUML.g:64:50: (iv_ruleSuperType= ruleSuperType EOF )
            // InternalSmallUML.g:65:2: iv_ruleSuperType= ruleSuperType EOF
            {
             newCompositeNode(grammarAccess.getSuperTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperType=ruleSuperType();

            state._fsp--;

             current =iv_ruleSuperType; 
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
    // $ANTLR end "entryRuleSuperType"


    // $ANTLR start "ruleSuperType"
    // InternalSmallUML.g:71:1: ruleSuperType returns [EObject current=null] : (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate ) ;
    public final EObject ruleSuperType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Integer_1 = null;

        EObject this_String0_2 = null;

        EObject this_Date_3 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate ) )
            // InternalSmallUML.g:78:2: (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate )
            {
            // InternalSmallUML.g:78:2: (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 28:
                {
                alt1=2;
                }
                break;
            case 29:
                {
                alt1=3;
                }
                break;
            case 30:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:79:3: this_Class_0= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getClassParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_0=ruleClass();

                    state._fsp--;


                    			current = this_Class_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:88:3: this_Integer_1= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getIntegerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_1=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:97:3: this_String0_2= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getString0ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_2=ruleString0();

                    state._fsp--;


                    			current = this_String0_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:106:3: this_Date_3= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getDateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_3=ruleDate();

                    state._fsp--;


                    			current = this_Date_3;
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
    // $ANTLR end "ruleSuperType"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:118:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:118:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:119:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:125:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:131:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:132:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:133:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:141:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:152:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:152:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:153:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:159:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:165:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:166:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:166:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSmallUML.g:167:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUML.g:171:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:172:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:172:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:173:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalSmallUML.g:198:3: ( ( ruleEString ) )
            // InternalSmallUML.g:199:4: ( ruleEString )
            {
            // InternalSmallUML.g:199:4: ( ruleEString )
            // InternalSmallUML.g:200:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:222:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:222:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:223:2: iv_ruleRole= ruleRole EOF
            {
             newCompositeNode(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRole=ruleRole();

            state._fsp--;

             current =iv_ruleRole; 
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
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:229:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:235:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= '}' ) )
            // InternalSmallUML.g:236:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= '}' )
            {
            // InternalSmallUML.g:236:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= '}' )
            // InternalSmallUML.g:237:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSmallUML.g:241:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:242:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:242:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:243:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLowerBoundKeyword_3());
            		
            // InternalSmallUML.g:268:3: ( (lv_lowerBound_4_0= ruleEInt ) )
            // InternalSmallUML.g:269:4: (lv_lowerBound_4_0= ruleEInt )
            {
            // InternalSmallUML.g:269:4: (lv_lowerBound_4_0= ruleEInt )
            // InternalSmallUML.g:270:5: lv_lowerBound_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_lowerBound_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_4_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getUpperBoundKeyword_5());
            		
            // InternalSmallUML.g:291:3: ( (lv_upperBound_6_0= ruleEInt ) )
            // InternalSmallUML.g:292:4: (lv_upperBound_6_0= ruleEInt )
            {
            // InternalSmallUML.g:292:4: (lv_upperBound_6_0= ruleEInt )
            // InternalSmallUML.g:293:5: lv_upperBound_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
            lv_upperBound_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_6_0,
            						"org.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:318:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:318:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:319:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSmallUML.g:325:1: ruleOperation returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:331:2: ( ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSmallUML.g:332:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:332:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSmallUML.g:333:3: ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalSmallUML.g:333:3: ( (lv_isAbstract_0_0= 'isAbstract' ) )
            // InternalSmallUML.g:334:4: (lv_isAbstract_0_0= 'isAbstract' )
            {
            // InternalSmallUML.g:334:4: (lv_isAbstract_0_0= 'isAbstract' )
            // InternalSmallUML.g:335:5: lv_isAbstract_0_0= 'isAbstract'
            {
            lv_isAbstract_0_0=(Token)match(input,18,FOLLOW_10); 

            					newLeafNode(lv_isAbstract_0_0, grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(current, "isAbstract", true, "isAbstract");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
            		
            // InternalSmallUML.g:351:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:352:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:352:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:353:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:374:3: (otherlv_4= 'returnType' ( ( ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:375:4: otherlv_4= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalSmallUML.g:379:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:380:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:380:5: ( ruleEString )
                    // InternalSmallUML.g:381:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:396:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:397:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:405:4: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalSmallUML.g:406:5: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalSmallUML.g:406:5: (lv_parameters_8_0= ruleParameter )
                    // InternalSmallUML.g:407:6: lv_parameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_8_0,
                    							"org.smalluml.SmallUML.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:424:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==22) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSmallUML.g:425:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:429:5: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalSmallUML.g:430:6: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalSmallUML.g:430:6: (lv_parameters_10_0= ruleParameter )
                    	    // InternalSmallUML.g:431:7: lv_parameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_10_0,
                    	    								"org.smalluml.SmallUML.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUML.g:462:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:462:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:463:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSmallUML.g:469:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:475:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:476:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:476:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSmallUML.g:477:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalSmallUML.g:481:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:482:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:482:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:483:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalSmallUML.g:508:3: ( ( ruleEString ) )
            // InternalSmallUML.g:509:4: ( ruleEString )
            {
            // InternalSmallUML.g:509:4: ( ruleEString )
            // InternalSmallUML.g:510:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:532:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:532:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:533:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
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
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:539:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_attribute_8_0 = null;

        EObject lv_attribute_10_0 = null;

        EObject lv_operation_14_0 = null;

        EObject lv_operation_16_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:545:2: ( ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSmallUML.g:546:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSmallUML.g:546:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSmallUML.g:547:3: ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalSmallUML.g:547:3: ( (lv_isAbstract_0_0= 'isAbstract' ) )
            // InternalSmallUML.g:548:4: (lv_isAbstract_0_0= 'isAbstract' )
            {
            // InternalSmallUML.g:548:4: (lv_isAbstract_0_0= 'isAbstract' )
            // InternalSmallUML.g:549:5: lv_isAbstract_0_0= 'isAbstract'
            {
            lv_isAbstract_0_0=(Token)match(input,18,FOLLOW_15); 

            					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(current, "isAbstract", true, "isAbstract");
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:565:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:566:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:566:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:567:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:588:3: (otherlv_4= 'super' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:589:4: otherlv_4= 'super' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getSuperKeyword_4_0());
                    			
                    // InternalSmallUML.g:593:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:594:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:594:5: ( ruleEString )
                    // InternalSmallUML.g:595:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperInheritanceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:610:3: (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:611:4: otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAttributeKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:619:4: ( (lv_attribute_8_0= ruleAttribute ) )
                    // InternalSmallUML.g:620:5: (lv_attribute_8_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:620:5: (lv_attribute_8_0= ruleAttribute )
                    // InternalSmallUML.g:621:6: lv_attribute_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_attribute_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_8_0,
                    							"org.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:638:4: (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalSmallUML.g:639:5: otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,22,FOLLOW_18); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:643:5: ( (lv_attribute_10_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:644:6: (lv_attribute_10_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:644:6: (lv_attribute_10_0= ruleAttribute )
                    	    // InternalSmallUML.g:645:7: lv_attribute_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_attribute_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_10_0,
                    	    								"org.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:668:3: (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:669:4: otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getOperationKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUML.g:677:4: ( (lv_operation_14_0= ruleOperation ) )
                    // InternalSmallUML.g:678:5: (lv_operation_14_0= ruleOperation )
                    {
                    // InternalSmallUML.g:678:5: (lv_operation_14_0= ruleOperation )
                    // InternalSmallUML.g:679:6: lv_operation_14_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_operation_14_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_14_0,
                    							"org.smalluml.SmallUML.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:696:4: (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==22) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmallUML.g:697:5: otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,22,FOLLOW_20); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:701:5: ( (lv_operation_16_0= ruleOperation ) )
                    	    // InternalSmallUML.g:702:6: (lv_operation_16_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:702:6: (lv_operation_16_0= ruleOperation )
                    	    // InternalSmallUML.g:703:7: lv_operation_16_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_operation_16_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_16_0,
                    	    								"org.smalluml.SmallUML.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:734:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUML.g:734:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUML.g:735:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger; 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:741:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:747:2: ( ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:748:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:748:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:749:3: () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:749:3: ()
            // InternalSmallUML.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		
            // InternalSmallUML.g:760:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:761:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:761:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:762:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:783:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:783:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:784:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0; 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:790:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:796:2: ( ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:797:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:797:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:798:3: () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:798:3: ()
            // InternalSmallUML.g:799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		
            // InternalSmallUML.g:809:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:810:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:810:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:811:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getString0Rule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleDate"
    // InternalSmallUML.g:832:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSmallUML.g:832:45: (iv_ruleDate= ruleDate EOF )
            // InternalSmallUML.g:833:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSmallUML.g:839:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:845:2: ( ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:846:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:846:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:847:3: () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:847:3: ()
            // InternalSmallUML.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateAccess().getDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
            		
            // InternalSmallUML.g:858:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:859:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:859:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:860:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:881:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:881:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:882:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:888:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:894:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:895:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:895:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:896:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:896:3: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:897:4: kw= '-'
                    {
                    kw=(Token)match(input,31,FOLLOW_21); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C004000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});

}