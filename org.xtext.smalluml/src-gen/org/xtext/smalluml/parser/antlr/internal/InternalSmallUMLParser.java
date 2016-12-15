package org.xtext.smalluml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'elements'", "'}'", "'associations'", "','", "'association'", "'roles'", "'abstract'", "'class'", "'extends'", "'attributes'", "'operations'", "'type'", "';'", "'enumeration'", "'attribute'", "':'", "'operation'", "'returns'", "'role'", "'['", "']'", "'with'", "'-'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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
    // InternalSmallUML.g:71:1: rulePackage returns [EObject current=null] : ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )? (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_elements_6_0 = null;

        EObject lv_association_10_0 = null;

        EObject lv_association_12_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:77:2: ( ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )? (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )? otherlv_14= '}' ) )
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )? (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            {
            // InternalSmallUML.g:78:2: ( () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )? (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )? otherlv_14= '}' )
            // InternalSmallUML.g:79:3: () otherlv_1= 'package' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )? (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )? otherlv_14= '}'
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
            		
            // InternalSmallUML.g:90:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:91:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:91:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:92:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:112:3: (otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSmallUML.g:113:4: otherlv_4= 'elements' otherlv_5= '{' ( (lv_elements_6_0= ruleSuperType ) )* otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getElementsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalSmallUML.g:121:4: ( (lv_elements_6_0= ruleSuperType ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=19 && LA1_0<=20)||LA1_0==24||LA1_0==26) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSmallUML.g:122:5: (lv_elements_6_0= ruleSuperType )
                    	    {
                    	    // InternalSmallUML.g:122:5: (lv_elements_6_0= ruleSuperType )
                    	    // InternalSmallUML.g:123:6: lv_elements_6_0= ruleSuperType
                    	    {

                    	    						newCompositeNode(grammarAccess.getPackageAccess().getElementsSuperTypeParserRuleCall_4_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_elements_6_0=ruleSuperType();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_6_0,
                    	    							"org.xtext.smalluml.SmallUML.SuperType");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:145:3: (otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:146:4: otherlv_8= 'associations' otherlv_9= '{' ( (lv_association_10_0= ruleAssociation ) ) (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getAssociationsKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:154:4: ( (lv_association_10_0= ruleAssociation ) )
                    // InternalSmallUML.g:155:5: (lv_association_10_0= ruleAssociation )
                    {
                    // InternalSmallUML.g:155:5: (lv_association_10_0= ruleAssociation )
                    // InternalSmallUML.g:156:6: lv_association_10_0= ruleAssociation
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_association_10_0=ruleAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"association",
                    							lv_association_10_0,
                    							"org.xtext.smalluml.SmallUML.Association");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:173:4: (otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSmallUML.g:174:5: otherlv_11= ',' ( (lv_association_12_0= ruleAssociation ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_8); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPackageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:178:5: ( (lv_association_12_0= ruleAssociation ) )
                    	    // InternalSmallUML.g:179:6: (lv_association_12_0= ruleAssociation )
                    	    {
                    	    // InternalSmallUML.g:179:6: (lv_association_12_0= ruleAssociation )
                    	    // InternalSmallUML.g:180:7: lv_association_12_0= ruleAssociation
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_association_12_0=ruleAssociation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"association",
                    	    								lv_association_12_0,
                    	    								"org.xtext.smalluml.SmallUML.Association");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleSuperType"
    // InternalSmallUML.g:211:1: entryRuleSuperType returns [EObject current=null] : iv_ruleSuperType= ruleSuperType EOF ;
    public final EObject entryRuleSuperType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperType = null;


        try {
            // InternalSmallUML.g:211:50: (iv_ruleSuperType= ruleSuperType EOF )
            // InternalSmallUML.g:212:2: iv_ruleSuperType= ruleSuperType EOF
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
    // InternalSmallUML.g:218:1: ruleSuperType returns [EObject current=null] : (this_Class_0= ruleClass | this_Type_1= ruleType | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleSuperType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_Type_1 = null;

        EObject this_Enumeration_2 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:224:2: ( (this_Class_0= ruleClass | this_Type_1= ruleType | this_Enumeration_2= ruleEnumeration ) )
            // InternalSmallUML.g:225:2: (this_Class_0= ruleClass | this_Type_1= ruleType | this_Enumeration_2= ruleEnumeration )
            {
            // InternalSmallUML.g:225:2: (this_Class_0= ruleClass | this_Type_1= ruleType | this_Enumeration_2= ruleEnumeration )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSmallUML.g:226:3: this_Class_0= ruleClass
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
                    // InternalSmallUML.g:235:3: this_Type_1= ruleType
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:244:3: this_Enumeration_2= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getSuperTypeAccess().getEnumerationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_2;
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


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:256:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalSmallUML.g:256:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalSmallUML.g:257:2: iv_ruleAssociation= ruleAssociation EOF
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
    // InternalSmallUML.g:263:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'roles' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_role_5_0 = null;

        EObject lv_role_7_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:269:2: ( (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'roles' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' ) )
            // InternalSmallUML.g:270:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'roles' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalSmallUML.g:270:2: (otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'roles' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}' )
            // InternalSmallUML.g:271:3: otherlv_0= 'association' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'roles' otherlv_4= '{' ( (lv_role_5_0= ruleRole ) ) (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )* otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalSmallUML.g:275:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSmallUML.g:276:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSmallUML.g:276:4: (lv_name_1_0= RULE_ID )
            // InternalSmallUML.g:277:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getRolesKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:305:3: ( (lv_role_5_0= ruleRole ) )
            // InternalSmallUML.g:306:4: (lv_role_5_0= ruleRole )
            {
            // InternalSmallUML.g:306:4: (lv_role_5_0= ruleRole )
            // InternalSmallUML.g:307:5: lv_role_5_0= ruleRole
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_role_5_0=ruleRole();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					add(
            						current,
            						"role",
            						lv_role_5_0,
            						"org.xtext.smalluml.SmallUML.Role");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:324:3: (otherlv_6= ',' ( (lv_role_7_0= ruleRole ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:325:4: otherlv_6= ',' ( (lv_role_7_0= ruleRole ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSmallUML.g:329:4: ( (lv_role_7_0= ruleRole ) )
            	    // InternalSmallUML.g:330:5: (lv_role_7_0= ruleRole )
            	    {
            	    // InternalSmallUML.g:330:5: (lv_role_7_0= ruleRole )
            	    // InternalSmallUML.g:331:6: lv_role_7_0= ruleRole
            	    {

            	    						newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_role_7_0=ruleRole();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAssociationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"role",
            	    							lv_role_7_0,
            	    							"org.xtext.smalluml.SmallUML.Role");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_2); 

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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:361:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // InternalSmallUML.g:361:46: (iv_ruleClass= ruleClass EOF )
            // InternalSmallUML.g:362:2: iv_ruleClass= ruleClass EOF
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
    // InternalSmallUML.g:368:1: ruleClass returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_attribute_8_0 = null;

        EObject lv_attribute_10_0 = null;

        EObject lv_operation_14_0 = null;

        EObject lv_operation_16_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:374:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // InternalSmallUML.g:375:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // InternalSmallUML.g:375:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // InternalSmallUML.g:376:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'class' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( ( ruleEString ) ) )? otherlv_5= '{' (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            // InternalSmallUML.g:376:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:377:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalSmallUML.g:377:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalSmallUML.g:378:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,19,FOLLOW_13); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getClassRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
            		
            // InternalSmallUML.g:394:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:395:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:395:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:396:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSmallUML.g:412:3: (otherlv_3= 'extends' ( ( ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:413:4: otherlv_3= 'extends' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getClassAccess().getExtendsKeyword_3_0());
                    			
                    // InternalSmallUML.g:417:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:418:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:418:5: ( ruleEString )
                    // InternalSmallUML.g:419:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSmallUML.g:438:3: (otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:439:4: otherlv_6= 'attributes' otherlv_7= '{' ( (lv_attribute_8_0= ruleAttribute ) ) (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAttributesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_17); 

                    				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalSmallUML.g:447:4: ( (lv_attribute_8_0= ruleAttribute ) )
                    // InternalSmallUML.g:448:5: (lv_attribute_8_0= ruleAttribute )
                    {
                    // InternalSmallUML.g:448:5: (lv_attribute_8_0= ruleAttribute )
                    // InternalSmallUML.g:449:6: lv_attribute_8_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_attribute_8_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"attribute",
                    							lv_attribute_8_0,
                    							"org.xtext.smalluml.SmallUML.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:466:4: (otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSmallUML.g:467:5: otherlv_9= ',' ( (lv_attribute_10_0= ruleAttribute ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_17); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalSmallUML.g:471:5: ( (lv_attribute_10_0= ruleAttribute ) )
                    	    // InternalSmallUML.g:472:6: (lv_attribute_10_0= ruleAttribute )
                    	    {
                    	    // InternalSmallUML.g:472:6: (lv_attribute_10_0= ruleAttribute )
                    	    // InternalSmallUML.g:473:7: lv_attribute_10_0= ruleAttribute
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_attribute_10_0=ruleAttribute();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"attribute",
                    	    								lv_attribute_10_0,
                    	    								"org.xtext.smalluml.SmallUML.Attribute");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalSmallUML.g:496:3: (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSmallUML.g:497:4: otherlv_12= 'operations' otherlv_13= '{' ( (lv_operation_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getOperationsKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalSmallUML.g:505:4: ( (lv_operation_14_0= ruleOperation ) )
                    // InternalSmallUML.g:506:5: (lv_operation_14_0= ruleOperation )
                    {
                    // InternalSmallUML.g:506:5: (lv_operation_14_0= ruleOperation )
                    // InternalSmallUML.g:507:6: lv_operation_14_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_operation_14_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClassRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_14_0,
                    							"org.xtext.smalluml.SmallUML.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:524:4: (otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSmallUML.g:525:5: otherlv_15= ',' ( (lv_operation_16_0= ruleOperation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalSmallUML.g:529:5: ( (lv_operation_16_0= ruleOperation ) )
                    	    // InternalSmallUML.g:530:6: (lv_operation_16_0= ruleOperation )
                    	    {
                    	    // InternalSmallUML.g:530:6: (lv_operation_16_0= ruleOperation )
                    	    // InternalSmallUML.g:531:7: lv_operation_16_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_operation_16_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getClassRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_16_0,
                    	    								"org.xtext.smalluml.SmallUML.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,14,FOLLOW_10); 

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


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:562:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalSmallUML.g:562:45: (iv_ruleType= ruleType EOF )
            // InternalSmallUML.g:563:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:569:1: ruleType returns [EObject current=null] : ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSmallUML.g:575:2: ( ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' ) )
            // InternalSmallUML.g:576:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            {
            // InternalSmallUML.g:576:2: ( () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' )
            // InternalSmallUML.g:577:3: () otherlv_1= 'type' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';'
            {
            // InternalSmallUML.g:577:3: ()
            // InternalSmallUML.g:578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTypeAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTypeAccess().getTypeKeyword_1());
            		
            // InternalSmallUML.g:588:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:589:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:589:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:590:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:614:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSmallUML.g:614:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSmallUML.g:615:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSmallUML.g:621:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_enumeration_4_0 = null;

        AntlrDatatypeRuleToken lv_enumeration_6_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:627:2: ( ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )? otherlv_7= '}' ) )
            // InternalSmallUML.g:628:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )? otherlv_7= '}' )
            {
            // InternalSmallUML.g:628:2: ( () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )? otherlv_7= '}' )
            // InternalSmallUML.g:629:3: () otherlv_1= 'enumeration' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )? otherlv_7= '}'
            {
            // InternalSmallUML.g:629:3: ()
            // InternalSmallUML.g:630:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumerationKeyword_1());
            		
            // InternalSmallUML.g:640:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalSmallUML.g:641:4: (lv_name_2_0= RULE_ID )
            {
            // InternalSmallUML.g:641:4: (lv_name_2_0= RULE_ID )
            // InternalSmallUML.g:642:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSmallUML.g:662:3: ( ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_STRING)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:663:4: ( (lv_enumeration_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )*
                    {
                    // InternalSmallUML.g:663:4: ( (lv_enumeration_4_0= ruleEString ) )
                    // InternalSmallUML.g:664:5: (lv_enumeration_4_0= ruleEString )
                    {
                    // InternalSmallUML.g:664:5: (lv_enumeration_4_0= ruleEString )
                    // InternalSmallUML.g:665:6: lv_enumeration_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_enumeration_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"enumeration",
                    							lv_enumeration_4_0,
                    							"org.xtext.smalluml.SmallUML.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:682:4: (otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==16) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSmallUML.g:683:5: otherlv_5= ',' ( (lv_enumeration_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalSmallUML.g:687:5: ( (lv_enumeration_6_0= ruleEString ) )
                    	    // InternalSmallUML.g:688:6: (lv_enumeration_6_0= ruleEString )
                    	    {
                    	    // InternalSmallUML.g:688:6: (lv_enumeration_6_0= ruleEString )
                    	    // InternalSmallUML.g:689:7: lv_enumeration_6_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_enumeration_6_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"enumeration",
                    	    								lv_enumeration_6_0,
                    	    								"org.xtext.smalluml.SmallUML.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:716:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSmallUML.g:716:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSmallUML.g:717:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSmallUML.g:723:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:729:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:730:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:730:2: (otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalSmallUML.g:731:3: otherlv_0= 'attribute' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSmallUML.g:735:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:736:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:736:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:737:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSmallUML.g:758:3: ( ( ruleEString ) )
            // InternalSmallUML.g:759:4: ( ruleEString )
            {
            // InternalSmallUML.g:759:4: ( ruleEString )
            // InternalSmallUML.g:760:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:778:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalSmallUML.g:778:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalSmallUML.g:779:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalSmallUML.g:785:1: ruleOperation returns [EObject current=null] : ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'operation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'returns' ( ( ruleEString ) ) )? (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_isAbstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_parameters_8_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:791:2: ( ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'operation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'returns' ( ( ruleEString ) ) )? (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? ) )
            // InternalSmallUML.g:792:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'operation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'returns' ( ( ruleEString ) ) )? (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? )
            {
            // InternalSmallUML.g:792:2: ( ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'operation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'returns' ( ( ruleEString ) ) )? (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )? )
            // InternalSmallUML.g:793:3: ( (lv_isAbstract_0_0= 'abstract' ) )? otherlv_1= 'operation' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'returns' ( ( ruleEString ) ) )? (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            {
            // InternalSmallUML.g:793:3: ( (lv_isAbstract_0_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSmallUML.g:794:4: (lv_isAbstract_0_0= 'abstract' )
                    {
                    // InternalSmallUML.g:794:4: (lv_isAbstract_0_0= 'abstract' )
                    // InternalSmallUML.g:795:5: lv_isAbstract_0_0= 'abstract'
                    {
                    lv_isAbstract_0_0=(Token)match(input,19,FOLLOW_23); 

                    					newLeafNode(lv_isAbstract_0_0, grammarAccess.getOperationAccess().getIsAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getOperationRule());
                    					}
                    					setWithLastConsumed(current, "isAbstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
            		
            // InternalSmallUML.g:811:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSmallUML.g:812:4: (lv_name_2_0= ruleEString )
            {
            // InternalSmallUML.g:812:4: (lv_name_2_0= ruleEString )
            // InternalSmallUML.g:813:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSmallUML.g:830:3: (otherlv_3= 'returns' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:831:4: otherlv_3= 'returns' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getReturnsKeyword_3_0());
                    			
                    // InternalSmallUML.g:835:4: ( ( ruleEString ) )
                    // InternalSmallUML.g:836:5: ( ruleEString )
                    {
                    // InternalSmallUML.g:836:5: ( ruleEString )
                    // InternalSmallUML.g:837:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOperationRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSmallUML.g:852:3: (otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmallUML.g:853:4: otherlv_5= '{' ( (lv_parameters_6_0= ruleParameter ) ) (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSmallUML.g:857:4: ( (lv_parameters_6_0= ruleParameter ) )
                    // InternalSmallUML.g:858:5: (lv_parameters_6_0= ruleParameter )
                    {
                    // InternalSmallUML.g:858:5: (lv_parameters_6_0= ruleParameter )
                    // InternalSmallUML.g:859:6: lv_parameters_6_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameters_6_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOperationRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_6_0,
                    							"org.xtext.smalluml.SmallUML.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSmallUML.g:876:4: (otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==16) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSmallUML.g:877:5: otherlv_7= ',' ( (lv_parameters_8_0= ruleParameter ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FOLLOW_15); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSmallUML.g:881:5: ( (lv_parameters_8_0= ruleParameter ) )
                    	    // InternalSmallUML.g:882:6: (lv_parameters_8_0= ruleParameter )
                    	    {
                    	    // InternalSmallUML.g:882:6: (lv_parameters_8_0= ruleParameter )
                    	    // InternalSmallUML.g:883:7: lv_parameters_8_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_parameters_8_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_8_0,
                    	    								"org.xtext.smalluml.SmallUML.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUML.g:910:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalSmallUML.g:910:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalSmallUML.g:911:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalSmallUML.g:917:1: ruleParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:923:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:924:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:924:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) ) )
            // InternalSmallUML.g:925:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( ( ruleEString ) )
            {
            // InternalSmallUML.g:925:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSmallUML.g:926:4: (lv_name_0_0= ruleEString )
            {
            // InternalSmallUML.g:926:4: (lv_name_0_0= ruleEString )
            // InternalSmallUML.g:927:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
            		
            // InternalSmallUML.g:948:3: ( ( ruleEString ) )
            // InternalSmallUML.g:949:4: ( ruleEString )
            {
            // InternalSmallUML.g:949:4: ( ruleEString )
            // InternalSmallUML.g:950:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:968:1: entryRuleRole returns [EObject current=null] : iv_ruleRole= ruleRole EOF ;
    public final EObject entryRuleRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRole = null;


        try {
            // InternalSmallUML.g:968:45: (iv_ruleRole= ruleRole EOF )
            // InternalSmallUML.g:969:2: iv_ruleRole= ruleRole EOF
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
    // InternalSmallUML.g:975:1: ruleRole returns [EObject current=null] : (otherlv_0= 'role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= 'with' ( ( ruleEString ) ) ) ;
    public final EObject ruleRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_3_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalSmallUML.g:981:2: ( (otherlv_0= 'role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= 'with' ( ( ruleEString ) ) ) )
            // InternalSmallUML.g:982:2: (otherlv_0= 'role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= 'with' ( ( ruleEString ) ) )
            {
            // InternalSmallUML.g:982:2: (otherlv_0= 'role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= 'with' ( ( ruleEString ) ) )
            // InternalSmallUML.g:983:3: otherlv_0= 'role' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_lowerBound_3_0= ruleEInt ) ) otherlv_4= ',' ( (lv_upperBound_5_0= ruleEInt ) ) otherlv_6= ']' otherlv_7= 'with' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
            		
            // InternalSmallUML.g:987:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSmallUML.g:988:4: (lv_name_1_0= ruleEString )
            {
            // InternalSmallUML.g:988:4: (lv_name_1_0= ruleEString )
            // InternalSmallUML.g:989:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.smalluml.SmallUML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalSmallUML.g:1010:3: ( (lv_lowerBound_3_0= ruleEInt ) )
            // InternalSmallUML.g:1011:4: (lv_lowerBound_3_0= ruleEInt )
            {
            // InternalSmallUML.g:1011:4: (lv_lowerBound_3_0= ruleEInt )
            // InternalSmallUML.g:1012:5: lv_lowerBound_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_lowerBound_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"lowerBound",
            						lv_lowerBound_3_0,
            						"org.xtext.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getRoleAccess().getCommaKeyword_4());
            		
            // InternalSmallUML.g:1033:3: ( (lv_upperBound_5_0= ruleEInt ) )
            // InternalSmallUML.g:1034:4: (lv_upperBound_5_0= ruleEInt )
            {
            // InternalSmallUML.g:1034:4: (lv_upperBound_5_0= ruleEInt )
            // InternalSmallUML.g:1035:5: lv_upperBound_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_29);
            lv_upperBound_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoleRule());
            					}
            					set(
            						current,
            						"upperBound",
            						lv_upperBound_5_0,
            						"org.xtext.smalluml.SmallUML.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,33,FOLLOW_30); 

            			newLeafNode(otherlv_6, grammarAccess.getRoleAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getWithKeyword_7());
            		
            // InternalSmallUML.g:1060:3: ( ( ruleEString ) )
            // InternalSmallUML.g:1061:4: ( ruleEString )
            {
            // InternalSmallUML.g:1061:4: ( ruleEString )
            // InternalSmallUML.g:1062:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRoleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_8_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:1080:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSmallUML.g:1080:47: (iv_ruleEString= ruleEString EOF )
            // InternalSmallUML.g:1081:2: iv_ruleEString= ruleEString EOF
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
    // InternalSmallUML.g:1087:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1093:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSmallUML.g:1094:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSmallUML.g:1094:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalSmallUML.g:1095:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:1103:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:1114:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSmallUML.g:1114:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSmallUML.g:1115:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSmallUML.g:1121:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSmallUML.g:1127:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSmallUML.g:1128:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSmallUML.g:1128:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSmallUML.g:1129:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSmallUML.g:1129:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmallUML.g:1130:4: kw= '-'
                    {
                    kw=(Token)match(input,35,FOLLOW_31); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000005184000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});

}