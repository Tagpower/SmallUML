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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Package'", "'{'", "'elements'", "','", "'}'", "'Attribute'", "'type'", "'Role'", "'lowerBound'", "'upperBound'", "'class'", "'Association'", "'role'", "'isAbstract'", "'Operation'", "'returnType'", "'parameters'", "'Parameter'", "'Class'", "'super'", "'attribute'", "'operation'", "'Integer'", "'String'", "'Date'", "'Enumeration'", "'supertype'", "'-'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
        	return "Package";
       	}

       	@Override
       	protected SmallUMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalSmallUML.g:64:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalSmallUML.g:64:48: (iv_rulePackage= rulePackage EOF )
            // InternalSmallUML.g:65:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUML.g:71:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'Package' otherlv_2= '{' (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSmallUML.g:79:3: ()
            // InternalSmallUML.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSmallUML.g:94:3: (otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:95:4: otherlv_3= 'elements' otherlv_4= '{' ( (lv_elements_5_0= ruleNamedElement ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getElementsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSmallUML.g:103:4: ( (lv_elements_5_0= ruleNamedElement ) )
                    // InternalSmallUML.g:104:5: (lv_elements_5_0= ruleNamedElement )
                    {
                    // InternalSmallUML.g:104:5: (lv_elements_5_0= ruleNamedElement )
                    // InternalSmallUML.g:105:6: lv_elements_5_0= ruleNamedElement
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getElementsNamedElementParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_elements_5_0=ruleNamedElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_5_0,
                    							"org.smalluml.SmallUML.NamedElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:122:4: (otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:123:5: otherlv_6= ',' ( (lv_elements_7_0= ruleNamedElement ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSmallUML.g:127:5: ( (lv_elements_7_0= ruleNamedElement ) )
                    	    // InternalSmallUML.g:128:6: (lv_elements_7_0= ruleNamedElement )
                    	    {
                    	    // InternalSmallUML.g:128:6: (lv_elements_7_0= ruleNamedElement )
                    	    // InternalSmallUML.g:129:7: lv_elements_7_0= ruleNamedElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getElementsNamedElementParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_7_0=ruleNamedElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_7_0,
                    	    								"org.smalluml.SmallUML.NamedElement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleNamedElement"
    // InternalSmallUML.g:160:1: entryRuleNamedElement returns [EObject current=null] : iv_ruleNamedElement= ruleNamedElement EOF ;
    public final EObject entryRuleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedElement = null;


        try {
            // InternalSmallUML.g:160:53: (iv_ruleNamedElement= ruleNamedElement EOF )
            // InternalSmallUML.g:161:2: iv_ruleNamedElement= ruleNamedElement EOF
            {
             newCompositeNode(grammarAccess.getNamedElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedElement=ruleNamedElement();

            state._fsp--;

             current =iv_ruleNamedElement; 
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
    // $ANTLR end "entryRuleNamedElement"


    // $ANTLR start "ruleNamedElement"
    // InternalSmallUML.g:167:1: ruleNamedElement returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Role_1= ruleRole | this_Association_2= ruleAssociation | this_Operation_3= ruleOperation | this_Parameter_4= ruleParameter | this_Class_5= ruleClass | this_Integer_6= ruleInteger | this_String0_7= ruleString0 | this_Date_8= ruleDate | this_Enumeration_9= ruleEnumeration ) ;
    public final EObject ruleNamedElement() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Role_1 = null;

        EObject this_Association_2 = null;

        EObject this_Operation_3 = null;

        EObject this_Parameter_4 = null;

        EObject this_Class_5 = null;

        EObject this_Integer_6 = null;

        EObject this_String0_7 = null;

        EObject this_Date_8 = null;

        EObject this_Enumeration_9 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:173:2: ( (this_Attribute_0= ruleAttribute | this_Role_1= ruleRole | this_Association_2= ruleAssociation | this_Operation_3= ruleOperation | this_Parameter_4= ruleParameter | this_Class_5= ruleClass | this_Integer_6= ruleInteger | this_String0_7= ruleString0 | this_Date_8= ruleDate | this_Enumeration_9= ruleEnumeration ) )
            // InternalSmallUML.g:174:2: (this_Attribute_0= ruleAttribute | this_Role_1= ruleRole | this_Association_2= ruleAssociation | this_Operation_3= ruleOperation | this_Parameter_4= ruleParameter | this_Class_5= ruleClass | this_Integer_6= ruleInteger | this_String0_7= ruleString0 | this_Date_8= ruleDate | this_Enumeration_9= ruleEnumeration )
            {
            // InternalSmallUML.g:174:2: (this_Attribute_0= ruleAttribute | this_Role_1= ruleRole | this_Association_2= ruleAssociation | this_Operation_3= ruleOperation | this_Parameter_4= ruleParameter | this_Class_5= ruleClass | this_Integer_6= ruleInteger | this_String0_7= ruleString0 | this_Date_8= ruleDate | this_Enumeration_9= ruleEnumeration )
            int alt3=10;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:175:3: this_Attribute_0= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:184:3: this_Role_1= ruleRole
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getRoleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Role_1=ruleRole();

                    state._fsp--;


                    			current = this_Role_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:193:3: this_Association_2= ruleAssociation
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getAssociationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Association_2=ruleAssociation();

                    state._fsp--;


                    			current = this_Association_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:202:3: this_Operation_3= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_3=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSmallUML.g:211:3: this_Parameter_4= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getParameterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_4=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSmallUML.g:220:3: this_Class_5= ruleClass
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getClassParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Class_5=ruleClass();

                    state._fsp--;


                    			current = this_Class_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSmallUML.g:229:3: this_Integer_6= ruleInteger
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getIntegerParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Integer_6=ruleInteger();

                    state._fsp--;


                    			current = this_Integer_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSmallUML.g:238:3: this_String0_7= ruleString0
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getString0ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_String0_7=ruleString0();

                    state._fsp--;


                    			current = this_String0_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalSmallUML.g:247:3: this_Date_8= ruleDate
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getDateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Date_8=ruleDate();

                    state._fsp--;


                    			current = this_Date_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalSmallUML.g:256:3: this_Enumeration_9= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getNamedElementAccess().getEnumerationParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_9=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_9;
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
    // $ANTLR end "ruleNamedElement"


    // $ANTLR start "entryRuleSuperType"
    // InternalSmallUML.g:268:1: entryRuleSuperType returns [EObject current=null] : iv_ruleSuperType= ruleSuperType EOF ;
    public final EObject entryRuleSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperType = null;


        try {
            // InternalSmallUML.g:268:50: (iv_ruleSuperType= ruleSuperType EOF )
            // InternalSmallUML.g:269:2: iv_ruleSuperType= ruleSuperType EOF
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
    // InternalSmallUML.g:275:1: ruleSuperType returns [EObject current=null] : (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate ) ;
    public final EObject ruleSuperType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Integer_1 = null;

        EObject this_String0_2 = null;

        EObject this_Date_3 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:281:2: ( (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate ) )
            // InternalSmallUML.g:282:2: (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate )
            {
            // InternalSmallUML.g:282:2: (this_Class_0= ruleClass | this_Integer_1= ruleInteger | this_String0_2= ruleString0 | this_Date_3= ruleDate )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 33:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            case 35:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:283:3: this_Class_0= ruleClass
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
                    // InternalSmallUML.g:292:3: this_Integer_1= ruleInteger
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
                    // InternalSmallUML.g:301:3: this_String0_2= ruleString0
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
                    // InternalSmallUML.g:310:3: this_Date_3= ruleDate
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
    // InternalSmallUML.g:322:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:322:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:323:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:329:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:335:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:336:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:336:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:337:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:345:3: this_ID_1= RULE_ID
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
    // InternalSmallUML.g:356:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:356:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:357:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUML.g:363:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:369:2: ( (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:370:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:370:2: (otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSmallUML.g:371:3: otherlv_0= 'Attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUML.g:375:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:376:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:376:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:377:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalSmallUML.g:402:3: ( ( ruleEString ) )
            // InternalSmallUML.g:403:4: ( ruleEString )
            {
            // InternalSmallUML.g:403:4: ( ruleEString )
            // InternalSmallUML.g:404:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmallUML.g:426:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:426:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:427:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUML.g:433:1: ruleRole returns [EObject current=null] : (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= 'class' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_4_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:439:2: ( (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= 'class' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalSmallUML.g:440:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= 'class' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalSmallUML.g:440:2: (otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= 'class' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalSmallUML.g:441:3: otherlv_0= 'Role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lowerBound_4_0= ruleEInt ) ) otherlv_5= 'upperBound' ( (lv_upperBound_6_0= ruleEInt ) ) otherlv_7= 'class' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSmallUML.g:445:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:446:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:446:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:447:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLowerBoundKeyword_3());
            		
            // InternalSmallUML.g:472:3: ( (lv_lowerBound_4_0= ruleEInt ) )
            // InternalSmallUML.g:473:4: (lv_lowerBound_4_0= ruleEInt )
            {
            // InternalSmallUML.g:473:4: (lv_lowerBound_4_0= ruleEInt )
            // InternalSmallUML.g:474:5: lv_lowerBound_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_5=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getUpperBoundKeyword_5());
            		
            // InternalSmallUML.g:495:3: ( (lv_upperBound_6_0= ruleEInt ) )
            // InternalSmallUML.g:496:4: (lv_upperBound_6_0= ruleEInt )
            {
            // InternalSmallUML.g:496:4: (lv_upperBound_6_0= ruleEInt )
            // InternalSmallUML.g:497:5: lv_upperBound_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_13);
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

            otherlv_7=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getClassKeyword_7());
            		
            // InternalSmallUML.g:518:3: ( ( ruleEString ) )
            // InternalSmallUML.g:519:4: ( ruleEString )
            {
            // InternalSmallUML.g:519:4: ( ruleEString )
            // InternalSmallUML.g:520:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_8_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_9());
            		

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


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:542:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:542:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:543:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:549:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_role_5_0 = null;

        EObject lv_role_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:555:2: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:556:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:556:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:557:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'role' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalSmallUML.g:561:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:562:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:562:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:563:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getRoleKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:592:3: ( (lv_role_5_0= ruleRole ) )
            // InternalSmallUML.g:593:4: (lv_role_5_0= ruleRole )
            {
            // InternalSmallUML.g:593:4: (lv_role_5_0= ruleRole )
            // InternalSmallUML.g:594:5: lv_role_5_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_role_5_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					add(
            						current,
            						"role",
            						lv_role_5_0,
            						"org.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:611:3: (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:612:4: otherlv_6= ',' ( (lv_role_7_0= ruleRole ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:616:4: ( (lv_role_7_0= ruleRole ) )
            	    // InternalSmallUML.g:617:5: (lv_role_7_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:617:5: (lv_role_7_0= ruleRole )
            	    // InternalSmallUML.g:618:6: lv_role_7_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_role_7_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"role",
            	    							lv_role_7_0,
            	    							"org.smalluml.SmallUML.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:648:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:648:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:649:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalSmallUML.g:655:1: ruleOperation returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
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
            // InternalSmallUML.g:661:2: ( ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalSmallUML.g:662:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalSmallUML.g:662:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalSmallUML.g:663:3: ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Operation' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'returnType' ( ( ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalSmallUML.g:663:3: ( (lv_isAbstract_0_0= 'isAbstract' ) )
            // InternalSmallUML.g:664:4: (lv_isAbstract_0_0= 'isAbstract' )
            {
            // InternalSmallUML.g:664:4: (lv_isAbstract_0_0= 'isAbstract' )
            // InternalSmallUML.g:665:5: lv_isAbstract_0_0= 'isAbstract'
            {
            lv_isAbstract_0_0=(Token)match(input,24,FOLLOW_16); 

            					newLeafNode(lv_isAbstract_0_0, grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(current, "isAbstract", true, "isAbstract");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
            		
            // InternalSmallUML.g:681:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:682:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:682:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:683:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:704:3: (otherlv_4= 'returnType' ( ( ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:705:4: otherlv_4= 'returnType' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getReturnTypeKeyword_4_0());
                    			
                    // InternalSmallUML.g:709:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:710:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:710:5: ( ruleEString )
                    // InternalSmallUML.g:711:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:726:3: (otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:727:4: otherlv_6= 'parameters' otherlv_7= '{' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getParametersKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:735:4: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalSmallUML.g:736:5: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalSmallUML.g:736:5: (lv_parameters_8_0= ruleParameter )
                    // InternalSmallUML.g:737:6: lv_parameters_8_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalSmallUML.g:754:4: (otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSmallUML.g:755:5: otherlv_9= ',' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:759:5: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalSmallUML.g:760:6: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalSmallUML.g:760:6: (lv_parameters_10_0= ruleParameter )
                    	    // InternalSmallUML.g:761:7: lv_parameters_10_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmallUML.g:792:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:792:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:793:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSmallUML.g:799:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:805:2: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalSmallUML.g:806:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalSmallUML.g:806:2: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalSmallUML.g:807:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            // InternalSmallUML.g:811:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:812:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:812:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:813:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
            		
            // InternalSmallUML.g:838:3: ( ( ruleEString ) )
            // InternalSmallUML.g:839:4: ( ruleEString )
            {
            // InternalSmallUML.g:839:4: ( ruleEString )
            // InternalSmallUML.g:840:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_4_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmallUML.g:862:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:862:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:863:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUML.g:869:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
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
            // InternalSmallUML.g:875:2: ( ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSmallUML.g:876:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSmallUML.g:876:2: ( ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSmallUML.g:877:3: ( (lv_isAbstract_0_0= 'isAbstract' ) ) otherlv_1= 'Class' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'super' ( ( ruleEString ) ) )? (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalSmallUML.g:877:3: ( (lv_isAbstract_0_0= 'isAbstract' ) )
            // InternalSmallUML.g:878:4: (lv_isAbstract_0_0= 'isAbstract' )
            {
            // InternalSmallUML.g:878:4: (lv_isAbstract_0_0= 'isAbstract' )
            // InternalSmallUML.g:879:5: lv_isAbstract_0_0= 'isAbstract'
            {
            lv_isAbstract_0_0=(Token)match(input,24,FOLLOW_20); 

            					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(current, "isAbstract", true, "isAbstract");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:895:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:896:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:896:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:897:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:918:3: (otherlv_4= 'super' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:919:4: otherlv_4= 'super' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getSuperKeyword_4_0());
                    			
                    // InternalSmallUML.g:923:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:924:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:924:5: ( ruleEString )
                    // InternalSmallUML.g:925:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperInheritanceCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:940:3: (otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:941:4: otherlv_6= 'attribute' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAttributeKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_23); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:949:4: ( (lv_attribute_8_0= ruleAttribute ) )
                    // InternalSmallUML.g:950:5: (lv_attribute_8_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:950:5: (lv_attribute_8_0= ruleAttribute )
                    // InternalSmallUML.g:951:6: lv_attribute_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalSmallUML.g:968:4: (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmallUML.g:969:5: otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_23); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:973:5: ( (lv_attribute_10_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:974:6: (lv_attribute_10_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:974:6: (lv_attribute_10_0= ruleAttribute )
                    	    // InternalSmallUML.g:975:7: lv_attribute_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_24); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:998:3: (otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:999:4: otherlv_12= 'operation' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getOperationKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_25); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUML.g:1007:4: ( (lv_operation_14_0= ruleOperation ) )
                    // InternalSmallUML.g:1008:5: (lv_operation_14_0= ruleOperation )
                    {
                    // InternalSmallUML.g:1008:5: (lv_operation_14_0= ruleOperation )
                    // InternalSmallUML.g:1009:6: lv_operation_14_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalSmallUML.g:1026:4: (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmallUML.g:1027:5: otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,14,FOLLOW_25); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:1031:5: ( (lv_operation_16_0= ruleOperation ) )
                    	    // InternalSmallUML.g:1032:6: (lv_operation_16_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:1032:6: (lv_operation_16_0= ruleOperation )
                    	    // InternalSmallUML.g:1033:7: lv_operation_16_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,15,FOLLOW_2); 

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
    // InternalSmallUML.g:1064:1: entryRuleInteger returns [EObject current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final EObject entryRuleInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteger = null;


        try {
            // InternalSmallUML.g:1064:48: (iv_ruleInteger= ruleInteger EOF )
            // InternalSmallUML.g:1065:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalSmallUML.g:1071:1: ruleInteger returns [EObject current=null] : ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1077:2: ( ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1078:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1078:2: ( () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1079:3: () otherlv_1= 'Integer' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1079:3: ()
            // InternalSmallUML.g:1080:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerAccess().getIntegerAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
            		
            // InternalSmallUML.g:1090:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1091:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1091:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1092:5: lv_name_2_0= ruleEString
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
    // InternalSmallUML.g:1113:1: entryRuleString0 returns [EObject current=null] : iv_ruleString0= ruleString0 EOF ;
    public final EObject entryRuleString0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleString0 = null;


        try {
            // InternalSmallUML.g:1113:48: (iv_ruleString0= ruleString0 EOF )
            // InternalSmallUML.g:1114:2: iv_ruleString0= ruleString0 EOF
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
    // InternalSmallUML.g:1120:1: ruleString0 returns [EObject current=null] : ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleString0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1126:2: ( ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1127:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1127:2: ( () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1128:3: () otherlv_1= 'String' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1128:3: ()
            // InternalSmallUML.g:1129:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		
            // InternalSmallUML.g:1139:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1140:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1140:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1141:5: lv_name_2_0= ruleEString
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
    // InternalSmallUML.g:1162:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // InternalSmallUML.g:1162:45: (iv_ruleDate= ruleDate EOF )
            // InternalSmallUML.g:1163:2: iv_ruleDate= ruleDate EOF
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
    // InternalSmallUML.g:1169:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1175:2: ( ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSmallUML.g:1176:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSmallUML.g:1176:2: ( () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSmallUML.g:1177:3: () otherlv_1= 'Date' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSmallUML.g:1177:3: ()
            // InternalSmallUML.g:1178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDateAccess().getDateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
            		
            // InternalSmallUML.g:1188:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:1189:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:1189:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:1190:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:1211:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:1211:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:1212:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:1218:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' otherlv_4= '{' ( (lv_supertype_5_0= ruleSuperType ) ) (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_supertype_5_0 = null;

        EObject lv_supertype_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:1224:2: ( (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' otherlv_4= '{' ( (lv_supertype_5_0= ruleSuperType ) ) (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:1225:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' otherlv_4= '{' ( (lv_supertype_5_0= ruleSuperType ) ) (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:1225:2: (otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' otherlv_4= '{' ( (lv_supertype_5_0= ruleSuperType ) ) (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:1226:3: otherlv_0= 'Enumeration' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supertype' otherlv_4= '{' ( (lv_supertype_5_0= ruleSuperType ) ) (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalSmallUML.g:1230:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:1231:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:1231:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:1232:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getSupertypeKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:1261:3: ( (lv_supertype_5_0= ruleSuperType ) )
            // InternalSmallUML.g:1262:4: (lv_supertype_5_0= ruleSuperType )
            {
            // InternalSmallUML.g:1262:4: (lv_supertype_5_0= ruleSuperType )
            // InternalSmallUML.g:1263:5: lv_supertype_5_0= ruleSuperType
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getSupertypeSuperTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_6);
            lv_supertype_5_0=ruleSuperType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					add(
            						current,
            						"supertype",
            						lv_supertype_5_0,
            						"org.smalluml.SmallUML.SuperType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:1280:3: (otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==14) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:1281:4: otherlv_6= ',' ( (lv_supertype_7_0= ruleSuperType ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_27); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:1285:4: ( (lv_supertype_7_0= ruleSuperType ) )
            	    // InternalSmallUML.g:1286:5: (lv_supertype_7_0= ruleSuperType )
            	    {
            	    // InternalSmallUML.g:1286:5: (lv_supertype_7_0= ruleSuperType )
            	    // InternalSmallUML.g:1287:6: lv_supertype_7_0= ruleSuperType
            	    {

            	    						newCompositeNode(grammarAccess.getEnumerationAccess().getSupertypeSuperTypeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_supertype_7_0=ruleSuperType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"supertype",
            	    							lv_supertype_7_0,
            	    							"org.smalluml.SmallUML.SuperType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:1317:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1317:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1318:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:1324:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1330:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1331:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1331:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1332:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1332:3: (kw= '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:1333:4: kw= '-'
                    {
                    kw=(Token)match(input,38,FOLLOW_28); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\20\3\uffff\1\31\7\uffff";
    static final String dfa_3s = "\1\44\3\uffff\1\35\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\7\1\10\1\11\1\12\1\6\1\4";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\3\uffff\1\3\1\uffff\1\4\3\uffff\1\5\4\uffff\1\6\1\7\1\10\1\11",
            "",
            "",
            "",
            "\1\13\3\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "174:2: (this_Attribute_0= ruleAttribute | this_Role_1= ruleRole | this_Association_2= ruleAssociation | this_Operation_3= ruleOperation | this_Parameter_4= ruleParameter | this_Class_5= ruleClass | this_Integer_6= ruleInteger | this_String0_7= ruleString0 | this_Date_8= ruleDate | this_Enumeration_9= ruleEnumeration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001E11450000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000001C0008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000E01000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});

}