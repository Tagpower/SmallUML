package org.xtext.smalluml.ide.contentassist.antlr.internal;

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
import org.xtext.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'elements'", "'associations'", "','", "'association'", "'roles'", "'class'", "'extends'", "'attributes'", "'operations'", "'type'", "';'", "'enumeration'", "'attribute'", "':'", "'operation'", "'returns'", "'role'", "'['", "']'", "'with'", "'-'", "'abstract'"
    };
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRulePackage"
    // InternalSmallUML.g:53:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( rulePackage EOF )
            // InternalSmallUML.g:55:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalSmallUML.g:62:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__Package__Group__0 ) )
            // InternalSmallUML.g:68:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalSmallUML.g:69:3: ( rule__Package__Group__0 )
            // InternalSmallUML.g:69:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSuperType"
    // InternalSmallUML.g:78:1: entryRuleSuperType : ruleSuperType EOF ;
    public final void entryRuleSuperType() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleSuperType EOF )
            // InternalSmallUML.g:80:1: ruleSuperType EOF
            {
             before(grammarAccess.getSuperTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSuperType();

            state._fsp--;

             after(grammarAccess.getSuperTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSuperType"


    // $ANTLR start "ruleSuperType"
    // InternalSmallUML.g:87:1: ruleSuperType : ( ( rule__SuperType__Alternatives ) ) ;
    public final void ruleSuperType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__SuperType__Alternatives ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__SuperType__Alternatives ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__SuperType__Alternatives ) )
            // InternalSmallUML.g:93:3: ( rule__SuperType__Alternatives )
            {
             before(grammarAccess.getSuperTypeAccess().getAlternatives()); 
            // InternalSmallUML.g:94:3: ( rule__SuperType__Alternatives )
            // InternalSmallUML.g:94:4: rule__SuperType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SuperType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSuperTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSuperType"


    // $ANTLR start "entryRuleAssociation"
    // InternalSmallUML.g:103:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleAssociation EOF )
            // InternalSmallUML.g:105:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalSmallUML.g:112:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__Association__Group__0 ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__Association__Group__0 ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__Association__Group__0 ) )
            // InternalSmallUML.g:118:3: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // InternalSmallUML.g:119:3: ( rule__Association__Group__0 )
            // InternalSmallUML.g:119:4: rule__Association__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:128:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleClass EOF )
            // InternalSmallUML.g:130:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_1);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // InternalSmallUML.g:137:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUML.g:143:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUML.g:144:3: ( rule__Class__Group__0 )
            // InternalSmallUML.g:144:4: rule__Class__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "entryRuleType"
    // InternalSmallUML.g:153:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleType EOF )
            // InternalSmallUML.g:155:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalSmallUML.g:162:1: ruleType : ( ( rule__Type__Group__0 ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__Type__Group__0 ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__Type__Group__0 ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__Type__Group__0 ) )
            // InternalSmallUML.g:168:3: ( rule__Type__Group__0 )
            {
             before(grammarAccess.getTypeAccess().getGroup()); 
            // InternalSmallUML.g:169:3: ( rule__Type__Group__0 )
            // InternalSmallUML.g:169:4: rule__Type__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSmallUML.g:178:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleEnumeration EOF )
            // InternalSmallUML.g:180:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSmallUML.g:187:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__Enumeration__Group__0 )
            // InternalSmallUML.g:194:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:203:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleAttribute EOF )
            // InternalSmallUML.g:205:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSmallUML.g:212:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Attribute__Group__0 )
            // InternalSmallUML.g:219:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:228:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleOperation EOF )
            // InternalSmallUML.g:230:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalSmallUML.g:237:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Operation__Group__0 ) )
            // InternalSmallUML.g:243:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalSmallUML.g:244:3: ( rule__Operation__Group__0 )
            // InternalSmallUML.g:244:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleParameter"
    // InternalSmallUML.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleParameter EOF )
            // InternalSmallUML.g:255:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalSmallUML.g:262:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSmallUML.g:268:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSmallUML.g:269:3: ( rule__Parameter__Group__0 )
            // InternalSmallUML.g:269:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:278:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleRole EOF )
            // InternalSmallUML.g:280:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRole"


    // $ANTLR start "ruleRole"
    // InternalSmallUML.g:287:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Role__Group__0 ) )
            // InternalSmallUML.g:293:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSmallUML.g:294:3: ( rule__Role__Group__0 )
            // InternalSmallUML.g:294:4: rule__Role__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRole"


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleEString EOF )
            // InternalSmallUML.g:305:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSmallUML.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:319:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:319:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:328:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:329:1: ( ruleEInt EOF )
            // InternalSmallUML.g:330:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSmallUML.g:337:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:341:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:342:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:342:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:343:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:344:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:344:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "rule__SuperType__Alternatives"
    // InternalSmallUML.g:352:1: rule__SuperType__Alternatives : ( ( ruleClass ) | ( ruleType ) | ( ruleEnumeration ) );
    public final void rule__SuperType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:356:1: ( ( ruleClass ) | ( ruleType ) | ( ruleEnumeration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 19:
            case 35:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case 25:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSmallUML.g:357:2: ( ruleClass )
                    {
                    // InternalSmallUML.g:357:2: ( ruleClass )
                    // InternalSmallUML.g:358:3: ruleClass
                    {
                     before(grammarAccess.getSuperTypeAccess().getClassParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClass();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getClassParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:363:2: ( ruleType )
                    {
                    // InternalSmallUML.g:363:2: ( ruleType )
                    // InternalSmallUML.g:364:3: ruleType
                    {
                     before(grammarAccess.getSuperTypeAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:369:2: ( ruleEnumeration )
                    {
                    // InternalSmallUML.g:369:2: ( ruleEnumeration )
                    // InternalSmallUML.g:370:3: ruleEnumeration
                    {
                     before(grammarAccess.getSuperTypeAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getEnumerationParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SuperType__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSmallUML.g:379:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:383:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUML.g:384:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:384:2: ( RULE_STRING )
                    // InternalSmallUML.g:385:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:390:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:390:2: ( RULE_ID )
                    // InternalSmallUML.g:391:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Package__Group__0"
    // InternalSmallUML.g:400:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:404:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalSmallUML.g:405:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalSmallUML.g:412:1: rule__Package__Group__0__Impl : ( () ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:416:1: ( ( () ) )
            // InternalSmallUML.g:417:1: ( () )
            {
            // InternalSmallUML.g:417:1: ( () )
            // InternalSmallUML.g:418:2: ()
            {
             before(grammarAccess.getPackageAccess().getPackageAction_0()); 
            // InternalSmallUML.g:419:2: ()
            // InternalSmallUML.g:419:3: 
            {
            }

             after(grammarAccess.getPackageAccess().getPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalSmallUML.g:427:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:431:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalSmallUML.g:432:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalSmallUML.g:439:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:443:1: ( ( 'package' ) )
            // InternalSmallUML.g:444:1: ( 'package' )
            {
            // InternalSmallUML.g:444:1: ( 'package' )
            // InternalSmallUML.g:445:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalSmallUML.g:454:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:458:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalSmallUML.g:459:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalSmallUML.g:466:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:470:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalSmallUML.g:471:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:471:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalSmallUML.g:472:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:473:2: ( rule__Package__NameAssignment_2 )
            // InternalSmallUML.g:473:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalSmallUML.g:481:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:485:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalSmallUML.g:486:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalSmallUML.g:493:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:497:1: ( ( '{' ) )
            // InternalSmallUML.g:498:1: ( '{' )
            {
            // InternalSmallUML.g:498:1: ( '{' )
            // InternalSmallUML.g:499:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalSmallUML.g:508:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:512:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalSmallUML.g:513:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalSmallUML.g:520:1: rule__Package__Group__4__Impl : ( ( rule__Package__Group_4__0 )? ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:524:1: ( ( ( rule__Package__Group_4__0 )? ) )
            // InternalSmallUML.g:525:1: ( ( rule__Package__Group_4__0 )? )
            {
            // InternalSmallUML.g:525:1: ( ( rule__Package__Group_4__0 )? )
            // InternalSmallUML.g:526:2: ( rule__Package__Group_4__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_4()); 
            // InternalSmallUML.g:527:2: ( rule__Package__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:527:3: rule__Package__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalSmallUML.g:535:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:539:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalSmallUML.g:540:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalSmallUML.g:547:1: rule__Package__Group__5__Impl : ( ( rule__Package__Group_5__0 )? ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:551:1: ( ( ( rule__Package__Group_5__0 )? ) )
            // InternalSmallUML.g:552:1: ( ( rule__Package__Group_5__0 )? )
            {
            // InternalSmallUML.g:552:1: ( ( rule__Package__Group_5__0 )? )
            // InternalSmallUML.g:553:2: ( rule__Package__Group_5__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_5()); 
            // InternalSmallUML.g:554:2: ( rule__Package__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:554:3: rule__Package__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // InternalSmallUML.g:562:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:566:1: ( rule__Package__Group__6__Impl )
            // InternalSmallUML.g:567:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalSmallUML.g:573:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:577:1: ( ( '}' ) )
            // InternalSmallUML.g:578:1: ( '}' )
            {
            // InternalSmallUML.g:578:1: ( '}' )
            // InternalSmallUML.g:579:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group_4__0"
    // InternalSmallUML.g:589:1: rule__Package__Group_4__0 : rule__Package__Group_4__0__Impl rule__Package__Group_4__1 ;
    public final void rule__Package__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:593:1: ( rule__Package__Group_4__0__Impl rule__Package__Group_4__1 )
            // InternalSmallUML.g:594:2: rule__Package__Group_4__0__Impl rule__Package__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0"


    // $ANTLR start "rule__Package__Group_4__0__Impl"
    // InternalSmallUML.g:601:1: rule__Package__Group_4__0__Impl : ( 'elements' ) ;
    public final void rule__Package__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:605:1: ( ( 'elements' ) )
            // InternalSmallUML.g:606:1: ( 'elements' )
            {
            // InternalSmallUML.g:606:1: ( 'elements' )
            // InternalSmallUML.g:607:2: 'elements'
            {
             before(grammarAccess.getPackageAccess().getElementsKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getElementsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__0__Impl"


    // $ANTLR start "rule__Package__Group_4__1"
    // InternalSmallUML.g:616:1: rule__Package__Group_4__1 : rule__Package__Group_4__1__Impl rule__Package__Group_4__2 ;
    public final void rule__Package__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:620:1: ( rule__Package__Group_4__1__Impl rule__Package__Group_4__2 )
            // InternalSmallUML.g:621:2: rule__Package__Group_4__1__Impl rule__Package__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1"


    // $ANTLR start "rule__Package__Group_4__1__Impl"
    // InternalSmallUML.g:628:1: rule__Package__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:632:1: ( ( '{' ) )
            // InternalSmallUML.g:633:1: ( '{' )
            {
            // InternalSmallUML.g:633:1: ( '{' )
            // InternalSmallUML.g:634:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__1__Impl"


    // $ANTLR start "rule__Package__Group_4__2"
    // InternalSmallUML.g:643:1: rule__Package__Group_4__2 : rule__Package__Group_4__2__Impl rule__Package__Group_4__3 ;
    public final void rule__Package__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:647:1: ( rule__Package__Group_4__2__Impl rule__Package__Group_4__3 )
            // InternalSmallUML.g:648:2: rule__Package__Group_4__2__Impl rule__Package__Group_4__3
            {
            pushFollow(FOLLOW_7);
            rule__Package__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2"


    // $ANTLR start "rule__Package__Group_4__2__Impl"
    // InternalSmallUML.g:655:1: rule__Package__Group_4__2__Impl : ( ( rule__Package__ElementsAssignment_4_2 )* ) ;
    public final void rule__Package__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:659:1: ( ( ( rule__Package__ElementsAssignment_4_2 )* ) )
            // InternalSmallUML.g:660:1: ( ( rule__Package__ElementsAssignment_4_2 )* )
            {
            // InternalSmallUML.g:660:1: ( ( rule__Package__ElementsAssignment_4_2 )* )
            // InternalSmallUML.g:661:2: ( rule__Package__ElementsAssignment_4_2 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_4_2()); 
            // InternalSmallUML.g:662:2: ( rule__Package__ElementsAssignment_4_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19||LA5_0==23||LA5_0==25||LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:662:3: rule__Package__ElementsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Package__ElementsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__2__Impl"


    // $ANTLR start "rule__Package__Group_4__3"
    // InternalSmallUML.g:670:1: rule__Package__Group_4__3 : rule__Package__Group_4__3__Impl ;
    public final void rule__Package__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:674:1: ( rule__Package__Group_4__3__Impl )
            // InternalSmallUML.g:675:2: rule__Package__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3"


    // $ANTLR start "rule__Package__Group_4__3__Impl"
    // InternalSmallUML.g:681:1: rule__Package__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Package__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:685:1: ( ( '}' ) )
            // InternalSmallUML.g:686:1: ( '}' )
            {
            // InternalSmallUML.g:686:1: ( '}' )
            // InternalSmallUML.g:687:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_4__3__Impl"


    // $ANTLR start "rule__Package__Group_5__0"
    // InternalSmallUML.g:697:1: rule__Package__Group_5__0 : rule__Package__Group_5__0__Impl rule__Package__Group_5__1 ;
    public final void rule__Package__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:701:1: ( rule__Package__Group_5__0__Impl rule__Package__Group_5__1 )
            // InternalSmallUML.g:702:2: rule__Package__Group_5__0__Impl rule__Package__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0"


    // $ANTLR start "rule__Package__Group_5__0__Impl"
    // InternalSmallUML.g:709:1: rule__Package__Group_5__0__Impl : ( 'associations' ) ;
    public final void rule__Package__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:713:1: ( ( 'associations' ) )
            // InternalSmallUML.g:714:1: ( 'associations' )
            {
            // InternalSmallUML.g:714:1: ( 'associations' )
            // InternalSmallUML.g:715:2: 'associations'
            {
             before(grammarAccess.getPackageAccess().getAssociationsKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getAssociationsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__0__Impl"


    // $ANTLR start "rule__Package__Group_5__1"
    // InternalSmallUML.g:724:1: rule__Package__Group_5__1 : rule__Package__Group_5__1__Impl rule__Package__Group_5__2 ;
    public final void rule__Package__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:728:1: ( rule__Package__Group_5__1__Impl rule__Package__Group_5__2 )
            // InternalSmallUML.g:729:2: rule__Package__Group_5__1__Impl rule__Package__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1"


    // $ANTLR start "rule__Package__Group_5__1__Impl"
    // InternalSmallUML.g:736:1: rule__Package__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Package__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:740:1: ( ( '{' ) )
            // InternalSmallUML.g:741:1: ( '{' )
            {
            // InternalSmallUML.g:741:1: ( '{' )
            // InternalSmallUML.g:742:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__1__Impl"


    // $ANTLR start "rule__Package__Group_5__2"
    // InternalSmallUML.g:751:1: rule__Package__Group_5__2 : rule__Package__Group_5__2__Impl rule__Package__Group_5__3 ;
    public final void rule__Package__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:755:1: ( rule__Package__Group_5__2__Impl rule__Package__Group_5__3 )
            // InternalSmallUML.g:756:2: rule__Package__Group_5__2__Impl rule__Package__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2"


    // $ANTLR start "rule__Package__Group_5__2__Impl"
    // InternalSmallUML.g:763:1: rule__Package__Group_5__2__Impl : ( ( rule__Package__AssociationAssignment_5_2 ) ) ;
    public final void rule__Package__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:767:1: ( ( ( rule__Package__AssociationAssignment_5_2 ) ) )
            // InternalSmallUML.g:768:1: ( ( rule__Package__AssociationAssignment_5_2 ) )
            {
            // InternalSmallUML.g:768:1: ( ( rule__Package__AssociationAssignment_5_2 ) )
            // InternalSmallUML.g:769:2: ( rule__Package__AssociationAssignment_5_2 )
            {
             before(grammarAccess.getPackageAccess().getAssociationAssignment_5_2()); 
            // InternalSmallUML.g:770:2: ( rule__Package__AssociationAssignment_5_2 )
            // InternalSmallUML.g:770:3: rule__Package__AssociationAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__AssociationAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAssociationAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__2__Impl"


    // $ANTLR start "rule__Package__Group_5__3"
    // InternalSmallUML.g:778:1: rule__Package__Group_5__3 : rule__Package__Group_5__3__Impl rule__Package__Group_5__4 ;
    public final void rule__Package__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:782:1: ( rule__Package__Group_5__3__Impl rule__Package__Group_5__4 )
            // InternalSmallUML.g:783:2: rule__Package__Group_5__3__Impl rule__Package__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3"


    // $ANTLR start "rule__Package__Group_5__3__Impl"
    // InternalSmallUML.g:790:1: rule__Package__Group_5__3__Impl : ( ( rule__Package__Group_5_3__0 )* ) ;
    public final void rule__Package__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:794:1: ( ( ( rule__Package__Group_5_3__0 )* ) )
            // InternalSmallUML.g:795:1: ( ( rule__Package__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:795:1: ( ( rule__Package__Group_5_3__0 )* )
            // InternalSmallUML.g:796:2: ( rule__Package__Group_5_3__0 )*
            {
             before(grammarAccess.getPackageAccess().getGroup_5_3()); 
            // InternalSmallUML.g:797:2: ( rule__Package__Group_5_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSmallUML.g:797:3: rule__Package__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Package__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__3__Impl"


    // $ANTLR start "rule__Package__Group_5__4"
    // InternalSmallUML.g:805:1: rule__Package__Group_5__4 : rule__Package__Group_5__4__Impl ;
    public final void rule__Package__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:809:1: ( rule__Package__Group_5__4__Impl )
            // InternalSmallUML.g:810:2: rule__Package__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4"


    // $ANTLR start "rule__Package__Group_5__4__Impl"
    // InternalSmallUML.g:816:1: rule__Package__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Package__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:820:1: ( ( '}' ) )
            // InternalSmallUML.g:821:1: ( '}' )
            {
            // InternalSmallUML.g:821:1: ( '}' )
            // InternalSmallUML.g:822:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5__4__Impl"


    // $ANTLR start "rule__Package__Group_5_3__0"
    // InternalSmallUML.g:832:1: rule__Package__Group_5_3__0 : rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 ;
    public final void rule__Package__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:836:1: ( rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1 )
            // InternalSmallUML.g:837:2: rule__Package__Group_5_3__0__Impl rule__Package__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0"


    // $ANTLR start "rule__Package__Group_5_3__0__Impl"
    // InternalSmallUML.g:844:1: rule__Package__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Package__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:848:1: ( ( ',' ) )
            // InternalSmallUML.g:849:1: ( ',' )
            {
            // InternalSmallUML.g:849:1: ( ',' )
            // InternalSmallUML.g:850:2: ','
            {
             before(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__0__Impl"


    // $ANTLR start "rule__Package__Group_5_3__1"
    // InternalSmallUML.g:859:1: rule__Package__Group_5_3__1 : rule__Package__Group_5_3__1__Impl ;
    public final void rule__Package__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:863:1: ( rule__Package__Group_5_3__1__Impl )
            // InternalSmallUML.g:864:2: rule__Package__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1"


    // $ANTLR start "rule__Package__Group_5_3__1__Impl"
    // InternalSmallUML.g:870:1: rule__Package__Group_5_3__1__Impl : ( ( rule__Package__AssociationAssignment_5_3_1 ) ) ;
    public final void rule__Package__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:874:1: ( ( ( rule__Package__AssociationAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:875:1: ( ( rule__Package__AssociationAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:875:1: ( ( rule__Package__AssociationAssignment_5_3_1 ) )
            // InternalSmallUML.g:876:2: ( rule__Package__AssociationAssignment_5_3_1 )
            {
             before(grammarAccess.getPackageAccess().getAssociationAssignment_5_3_1()); 
            // InternalSmallUML.g:877:2: ( rule__Package__AssociationAssignment_5_3_1 )
            // InternalSmallUML.g:877:3: rule__Package__AssociationAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Package__AssociationAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getAssociationAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__Group_5_3__1__Impl"


    // $ANTLR start "rule__Association__Group__0"
    // InternalSmallUML.g:886:1: rule__Association__Group__0 : rule__Association__Group__0__Impl rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:890:1: ( rule__Association__Group__0__Impl rule__Association__Group__1 )
            // InternalSmallUML.g:891:2: rule__Association__Group__0__Impl rule__Association__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Association__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0"


    // $ANTLR start "rule__Association__Group__0__Impl"
    // InternalSmallUML.g:898:1: rule__Association__Group__0__Impl : ( 'association' ) ;
    public final void rule__Association__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:902:1: ( ( 'association' ) )
            // InternalSmallUML.g:903:1: ( 'association' )
            {
            // InternalSmallUML.g:903:1: ( 'association' )
            // InternalSmallUML.g:904:2: 'association'
            {
             before(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getAssociationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__0__Impl"


    // $ANTLR start "rule__Association__Group__1"
    // InternalSmallUML.g:913:1: rule__Association__Group__1 : rule__Association__Group__1__Impl rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:917:1: ( rule__Association__Group__1__Impl rule__Association__Group__2 )
            // InternalSmallUML.g:918:2: rule__Association__Group__1__Impl rule__Association__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1"


    // $ANTLR start "rule__Association__Group__1__Impl"
    // InternalSmallUML.g:925:1: rule__Association__Group__1__Impl : ( ( rule__Association__NameAssignment_1 ) ) ;
    public final void rule__Association__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:929:1: ( ( ( rule__Association__NameAssignment_1 ) ) )
            // InternalSmallUML.g:930:1: ( ( rule__Association__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:930:1: ( ( rule__Association__NameAssignment_1 ) )
            // InternalSmallUML.g:931:2: ( rule__Association__NameAssignment_1 )
            {
             before(grammarAccess.getAssociationAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:932:2: ( rule__Association__NameAssignment_1 )
            // InternalSmallUML.g:932:3: rule__Association__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__1__Impl"


    // $ANTLR start "rule__Association__Group__2"
    // InternalSmallUML.g:940:1: rule__Association__Group__2 : rule__Association__Group__2__Impl rule__Association__Group__3 ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:944:1: ( rule__Association__Group__2__Impl rule__Association__Group__3 )
            // InternalSmallUML.g:945:2: rule__Association__Group__2__Impl rule__Association__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Association__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2"


    // $ANTLR start "rule__Association__Group__2__Impl"
    // InternalSmallUML.g:952:1: rule__Association__Group__2__Impl : ( '{' ) ;
    public final void rule__Association__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:956:1: ( ( '{' ) )
            // InternalSmallUML.g:957:1: ( '{' )
            {
            // InternalSmallUML.g:957:1: ( '{' )
            // InternalSmallUML.g:958:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__2__Impl"


    // $ANTLR start "rule__Association__Group__3"
    // InternalSmallUML.g:967:1: rule__Association__Group__3 : rule__Association__Group__3__Impl rule__Association__Group__4 ;
    public final void rule__Association__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:971:1: ( rule__Association__Group__3__Impl rule__Association__Group__4 )
            // InternalSmallUML.g:972:2: rule__Association__Group__3__Impl rule__Association__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Association__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3"


    // $ANTLR start "rule__Association__Group__3__Impl"
    // InternalSmallUML.g:979:1: rule__Association__Group__3__Impl : ( 'roles' ) ;
    public final void rule__Association__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:983:1: ( ( 'roles' ) )
            // InternalSmallUML.g:984:1: ( 'roles' )
            {
            // InternalSmallUML.g:984:1: ( 'roles' )
            // InternalSmallUML.g:985:2: 'roles'
            {
             before(grammarAccess.getAssociationAccess().getRolesKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRolesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__3__Impl"


    // $ANTLR start "rule__Association__Group__4"
    // InternalSmallUML.g:994:1: rule__Association__Group__4 : rule__Association__Group__4__Impl rule__Association__Group__5 ;
    public final void rule__Association__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:998:1: ( rule__Association__Group__4__Impl rule__Association__Group__5 )
            // InternalSmallUML.g:999:2: rule__Association__Group__4__Impl rule__Association__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Association__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4"


    // $ANTLR start "rule__Association__Group__4__Impl"
    // InternalSmallUML.g:1006:1: rule__Association__Group__4__Impl : ( '{' ) ;
    public final void rule__Association__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1010:1: ( ( '{' ) )
            // InternalSmallUML.g:1011:1: ( '{' )
            {
            // InternalSmallUML.g:1011:1: ( '{' )
            // InternalSmallUML.g:1012:2: '{'
            {
             before(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__4__Impl"


    // $ANTLR start "rule__Association__Group__5"
    // InternalSmallUML.g:1021:1: rule__Association__Group__5 : rule__Association__Group__5__Impl rule__Association__Group__6 ;
    public final void rule__Association__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1025:1: ( rule__Association__Group__5__Impl rule__Association__Group__6 )
            // InternalSmallUML.g:1026:2: rule__Association__Group__5__Impl rule__Association__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Association__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5"


    // $ANTLR start "rule__Association__Group__5__Impl"
    // InternalSmallUML.g:1033:1: rule__Association__Group__5__Impl : ( ( rule__Association__RoleAssignment_5 ) ) ;
    public final void rule__Association__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1037:1: ( ( ( rule__Association__RoleAssignment_5 ) ) )
            // InternalSmallUML.g:1038:1: ( ( rule__Association__RoleAssignment_5 ) )
            {
            // InternalSmallUML.g:1038:1: ( ( rule__Association__RoleAssignment_5 ) )
            // InternalSmallUML.g:1039:2: ( rule__Association__RoleAssignment_5 )
            {
             before(grammarAccess.getAssociationAccess().getRoleAssignment_5()); 
            // InternalSmallUML.g:1040:2: ( rule__Association__RoleAssignment_5 )
            // InternalSmallUML.g:1040:3: rule__Association__RoleAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Association__RoleAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRoleAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__5__Impl"


    // $ANTLR start "rule__Association__Group__6"
    // InternalSmallUML.g:1048:1: rule__Association__Group__6 : rule__Association__Group__6__Impl rule__Association__Group__7 ;
    public final void rule__Association__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1052:1: ( rule__Association__Group__6__Impl rule__Association__Group__7 )
            // InternalSmallUML.g:1053:2: rule__Association__Group__6__Impl rule__Association__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Association__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6"


    // $ANTLR start "rule__Association__Group__6__Impl"
    // InternalSmallUML.g:1060:1: rule__Association__Group__6__Impl : ( ( rule__Association__Group_6__0 )* ) ;
    public final void rule__Association__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1064:1: ( ( ( rule__Association__Group_6__0 )* ) )
            // InternalSmallUML.g:1065:1: ( ( rule__Association__Group_6__0 )* )
            {
            // InternalSmallUML.g:1065:1: ( ( rule__Association__Group_6__0 )* )
            // InternalSmallUML.g:1066:2: ( rule__Association__Group_6__0 )*
            {
             before(grammarAccess.getAssociationAccess().getGroup_6()); 
            // InternalSmallUML.g:1067:2: ( rule__Association__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSmallUML.g:1067:3: rule__Association__Group_6__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Association__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getAssociationAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__6__Impl"


    // $ANTLR start "rule__Association__Group__7"
    // InternalSmallUML.g:1075:1: rule__Association__Group__7 : rule__Association__Group__7__Impl rule__Association__Group__8 ;
    public final void rule__Association__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1079:1: ( rule__Association__Group__7__Impl rule__Association__Group__8 )
            // InternalSmallUML.g:1080:2: rule__Association__Group__7__Impl rule__Association__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__Association__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7"


    // $ANTLR start "rule__Association__Group__7__Impl"
    // InternalSmallUML.g:1087:1: rule__Association__Group__7__Impl : ( '}' ) ;
    public final void rule__Association__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1091:1: ( ( '}' ) )
            // InternalSmallUML.g:1092:1: ( '}' )
            {
            // InternalSmallUML.g:1092:1: ( '}' )
            // InternalSmallUML.g:1093:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__7__Impl"


    // $ANTLR start "rule__Association__Group__8"
    // InternalSmallUML.g:1102:1: rule__Association__Group__8 : rule__Association__Group__8__Impl ;
    public final void rule__Association__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1106:1: ( rule__Association__Group__8__Impl )
            // InternalSmallUML.g:1107:2: rule__Association__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8"


    // $ANTLR start "rule__Association__Group__8__Impl"
    // InternalSmallUML.g:1113:1: rule__Association__Group__8__Impl : ( '}' ) ;
    public final void rule__Association__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1117:1: ( ( '}' ) )
            // InternalSmallUML.g:1118:1: ( '}' )
            {
            // InternalSmallUML.g:1118:1: ( '}' )
            // InternalSmallUML.g:1119:2: '}'
            {
             before(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group__8__Impl"


    // $ANTLR start "rule__Association__Group_6__0"
    // InternalSmallUML.g:1129:1: rule__Association__Group_6__0 : rule__Association__Group_6__0__Impl rule__Association__Group_6__1 ;
    public final void rule__Association__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1133:1: ( rule__Association__Group_6__0__Impl rule__Association__Group_6__1 )
            // InternalSmallUML.g:1134:2: rule__Association__Group_6__0__Impl rule__Association__Group_6__1
            {
            pushFollow(FOLLOW_13);
            rule__Association__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Association__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0"


    // $ANTLR start "rule__Association__Group_6__0__Impl"
    // InternalSmallUML.g:1141:1: rule__Association__Group_6__0__Impl : ( ',' ) ;
    public final void rule__Association__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1145:1: ( ( ',' ) )
            // InternalSmallUML.g:1146:1: ( ',' )
            {
            // InternalSmallUML.g:1146:1: ( ',' )
            // InternalSmallUML.g:1147:2: ','
            {
             before(grammarAccess.getAssociationAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__0__Impl"


    // $ANTLR start "rule__Association__Group_6__1"
    // InternalSmallUML.g:1156:1: rule__Association__Group_6__1 : rule__Association__Group_6__1__Impl ;
    public final void rule__Association__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1160:1: ( rule__Association__Group_6__1__Impl )
            // InternalSmallUML.g:1161:2: rule__Association__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Association__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1"


    // $ANTLR start "rule__Association__Group_6__1__Impl"
    // InternalSmallUML.g:1167:1: rule__Association__Group_6__1__Impl : ( ( rule__Association__RoleAssignment_6_1 ) ) ;
    public final void rule__Association__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1171:1: ( ( ( rule__Association__RoleAssignment_6_1 ) ) )
            // InternalSmallUML.g:1172:1: ( ( rule__Association__RoleAssignment_6_1 ) )
            {
            // InternalSmallUML.g:1172:1: ( ( rule__Association__RoleAssignment_6_1 ) )
            // InternalSmallUML.g:1173:2: ( rule__Association__RoleAssignment_6_1 )
            {
             before(grammarAccess.getAssociationAccess().getRoleAssignment_6_1()); 
            // InternalSmallUML.g:1174:2: ( rule__Association__RoleAssignment_6_1 )
            // InternalSmallUML.g:1174:3: rule__Association__RoleAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Association__RoleAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getAssociationAccess().getRoleAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUML.g:1183:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1187:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:1188:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // InternalSmallUML.g:1195:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 )? ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1199:1: ( ( ( rule__Class__IsAbstractAssignment_0 )? ) )
            // InternalSmallUML.g:1200:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            {
            // InternalSmallUML.g:1200:1: ( ( rule__Class__IsAbstractAssignment_0 )? )
            // InternalSmallUML.g:1201:2: ( rule__Class__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUML.g:1202:2: ( rule__Class__IsAbstractAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==35) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1202:3: rule__Class__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // InternalSmallUML.g:1210:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1214:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:1215:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // InternalSmallUML.g:1222:1: rule__Class__Group__1__Impl : ( 'class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1226:1: ( ( 'class' ) )
            // InternalSmallUML.g:1227:1: ( 'class' )
            {
            // InternalSmallUML.g:1227:1: ( 'class' )
            // InternalSmallUML.g:1228:2: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // InternalSmallUML.g:1237:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1241:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:1242:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // InternalSmallUML.g:1249:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1253:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1254:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1254:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUML.g:1255:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1256:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUML.g:1256:3: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // InternalSmallUML.g:1264:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1268:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:1269:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // InternalSmallUML.g:1276:1: rule__Class__Group__3__Impl : ( ( rule__Class__Group_3__0 )? ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1280:1: ( ( ( rule__Class__Group_3__0 )? ) )
            // InternalSmallUML.g:1281:1: ( ( rule__Class__Group_3__0 )? )
            {
            // InternalSmallUML.g:1281:1: ( ( rule__Class__Group_3__0 )? )
            // InternalSmallUML.g:1282:2: ( rule__Class__Group_3__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_3()); 
            // InternalSmallUML.g:1283:2: ( rule__Class__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSmallUML.g:1283:3: rule__Class__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // InternalSmallUML.g:1291:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1295:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:1296:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // InternalSmallUML.g:1303:1: rule__Class__Group__4__Impl : ( '{' ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1307:1: ( ( '{' ) )
            // InternalSmallUML.g:1308:1: ( '{' )
            {
            // InternalSmallUML.g:1308:1: ( '{' )
            // InternalSmallUML.g:1309:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // InternalSmallUML.g:1318:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1322:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:1323:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // InternalSmallUML.g:1330:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1334:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUML.g:1335:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUML.g:1335:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUML.g:1336:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUML.g:1337:2: ( rule__Class__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSmallUML.g:1337:3: rule__Class__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // InternalSmallUML.g:1345:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1349:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUML.g:1350:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Class__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // InternalSmallUML.g:1357:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1361:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUML.g:1362:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUML.g:1362:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUML.g:1363:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUML.g:1364:2: ( rule__Class__Group_6__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:1364:3: rule__Class__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Class__Group__7"
    // InternalSmallUML.g:1372:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1376:1: ( rule__Class__Group__7__Impl )
            // InternalSmallUML.g:1377:2: rule__Class__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7"


    // $ANTLR start "rule__Class__Group__7__Impl"
    // InternalSmallUML.g:1383:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1387:1: ( ( '}' ) )
            // InternalSmallUML.g:1388:1: ( '}' )
            {
            // InternalSmallUML.g:1388:1: ( '}' )
            // InternalSmallUML.g:1389:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__7__Impl"


    // $ANTLR start "rule__Class__Group_3__0"
    // InternalSmallUML.g:1399:1: rule__Class__Group_3__0 : rule__Class__Group_3__0__Impl rule__Class__Group_3__1 ;
    public final void rule__Class__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1403:1: ( rule__Class__Group_3__0__Impl rule__Class__Group_3__1 )
            // InternalSmallUML.g:1404:2: rule__Class__Group_3__0__Impl rule__Class__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Class__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0"


    // $ANTLR start "rule__Class__Group_3__0__Impl"
    // InternalSmallUML.g:1411:1: rule__Class__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__Class__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1415:1: ( ( 'extends' ) )
            // InternalSmallUML.g:1416:1: ( 'extends' )
            {
            // InternalSmallUML.g:1416:1: ( 'extends' )
            // InternalSmallUML.g:1417:2: 'extends'
            {
             before(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__0__Impl"


    // $ANTLR start "rule__Class__Group_3__1"
    // InternalSmallUML.g:1426:1: rule__Class__Group_3__1 : rule__Class__Group_3__1__Impl ;
    public final void rule__Class__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1430:1: ( rule__Class__Group_3__1__Impl )
            // InternalSmallUML.g:1431:2: rule__Class__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1"


    // $ANTLR start "rule__Class__Group_3__1__Impl"
    // InternalSmallUML.g:1437:1: rule__Class__Group_3__1__Impl : ( ( rule__Class__SuperAssignment_3_1 ) ) ;
    public final void rule__Class__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1441:1: ( ( ( rule__Class__SuperAssignment_3_1 ) ) )
            // InternalSmallUML.g:1442:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            {
            // InternalSmallUML.g:1442:1: ( ( rule__Class__SuperAssignment_3_1 ) )
            // InternalSmallUML.g:1443:2: ( rule__Class__SuperAssignment_3_1 )
            {
             before(grammarAccess.getClassAccess().getSuperAssignment_3_1()); 
            // InternalSmallUML.g:1444:2: ( rule__Class__SuperAssignment_3_1 )
            // InternalSmallUML.g:1444:3: rule__Class__SuperAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalSmallUML.g:1453:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1457:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUML.g:1458:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0"


    // $ANTLR start "rule__Class__Group_5__0__Impl"
    // InternalSmallUML.g:1465:1: rule__Class__Group_5__0__Impl : ( 'attributes' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1469:1: ( ( 'attributes' ) )
            // InternalSmallUML.g:1470:1: ( 'attributes' )
            {
            // InternalSmallUML.g:1470:1: ( 'attributes' )
            // InternalSmallUML.g:1471:2: 'attributes'
            {
             before(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__0__Impl"


    // $ANTLR start "rule__Class__Group_5__1"
    // InternalSmallUML.g:1480:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1484:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUML.g:1485:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_19);
            rule__Class__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1"


    // $ANTLR start "rule__Class__Group_5__1__Impl"
    // InternalSmallUML.g:1492:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1496:1: ( ( '{' ) )
            // InternalSmallUML.g:1497:1: ( '{' )
            {
            // InternalSmallUML.g:1497:1: ( '{' )
            // InternalSmallUML.g:1498:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__1__Impl"


    // $ANTLR start "rule__Class__Group_5__2"
    // InternalSmallUML.g:1507:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1511:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUML.g:1512:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2"


    // $ANTLR start "rule__Class__Group_5__2__Impl"
    // InternalSmallUML.g:1519:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__AttributeAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1523:1: ( ( ( rule__Class__AttributeAssignment_5_2 ) ) )
            // InternalSmallUML.g:1524:1: ( ( rule__Class__AttributeAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1524:1: ( ( rule__Class__AttributeAssignment_5_2 ) )
            // InternalSmallUML.g:1525:2: ( rule__Class__AttributeAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_5_2()); 
            // InternalSmallUML.g:1526:2: ( rule__Class__AttributeAssignment_5_2 )
            // InternalSmallUML.g:1526:3: rule__Class__AttributeAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributeAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributeAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__2__Impl"


    // $ANTLR start "rule__Class__Group_5__3"
    // InternalSmallUML.g:1534:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1538:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUML.g:1539:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3"


    // $ANTLR start "rule__Class__Group_5__3__Impl"
    // InternalSmallUML.g:1546:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__Group_5_3__0 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1550:1: ( ( ( rule__Class__Group_5_3__0 )* ) )
            // InternalSmallUML.g:1551:1: ( ( rule__Class__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:1551:1: ( ( rule__Class__Group_5_3__0 )* )
            // InternalSmallUML.g:1552:2: ( rule__Class__Group_5_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_3()); 
            // InternalSmallUML.g:1553:2: ( rule__Class__Group_5_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSmallUML.g:1553:3: rule__Class__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__3__Impl"


    // $ANTLR start "rule__Class__Group_5__4"
    // InternalSmallUML.g:1561:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1565:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUML.g:1566:2: rule__Class__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4"


    // $ANTLR start "rule__Class__Group_5__4__Impl"
    // InternalSmallUML.g:1572:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1576:1: ( ( '}' ) )
            // InternalSmallUML.g:1577:1: ( '}' )
            {
            // InternalSmallUML.g:1577:1: ( '}' )
            // InternalSmallUML.g:1578:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5__4__Impl"


    // $ANTLR start "rule__Class__Group_5_3__0"
    // InternalSmallUML.g:1588:1: rule__Class__Group_5_3__0 : rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 ;
    public final void rule__Class__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1592:1: ( rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 )
            // InternalSmallUML.g:1593:2: rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Class__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__0"


    // $ANTLR start "rule__Class__Group_5_3__0__Impl"
    // InternalSmallUML.g:1600:1: rule__Class__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1604:1: ( ( ',' ) )
            // InternalSmallUML.g:1605:1: ( ',' )
            {
            // InternalSmallUML.g:1605:1: ( ',' )
            // InternalSmallUML.g:1606:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__0__Impl"


    // $ANTLR start "rule__Class__Group_5_3__1"
    // InternalSmallUML.g:1615:1: rule__Class__Group_5_3__1 : rule__Class__Group_5_3__1__Impl ;
    public final void rule__Class__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1619:1: ( rule__Class__Group_5_3__1__Impl )
            // InternalSmallUML.g:1620:2: rule__Class__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__1"


    // $ANTLR start "rule__Class__Group_5_3__1__Impl"
    // InternalSmallUML.g:1626:1: rule__Class__Group_5_3__1__Impl : ( ( rule__Class__AttributeAssignment_5_3_1 ) ) ;
    public final void rule__Class__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1630:1: ( ( ( rule__Class__AttributeAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:1631:1: ( ( rule__Class__AttributeAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:1631:1: ( ( rule__Class__AttributeAssignment_5_3_1 ) )
            // InternalSmallUML.g:1632:2: ( rule__Class__AttributeAssignment_5_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1()); 
            // InternalSmallUML.g:1633:2: ( rule__Class__AttributeAssignment_5_3_1 )
            // InternalSmallUML.g:1633:3: rule__Class__AttributeAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__AttributeAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_5_3__1__Impl"


    // $ANTLR start "rule__Class__Group_6__0"
    // InternalSmallUML.g:1642:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1646:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUML.g:1647:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Class__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0"


    // $ANTLR start "rule__Class__Group_6__0__Impl"
    // InternalSmallUML.g:1654:1: rule__Class__Group_6__0__Impl : ( 'operations' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1658:1: ( ( 'operations' ) )
            // InternalSmallUML.g:1659:1: ( 'operations' )
            {
            // InternalSmallUML.g:1659:1: ( 'operations' )
            // InternalSmallUML.g:1660:2: 'operations'
            {
             before(grammarAccess.getClassAccess().getOperationsKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getOperationsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__0__Impl"


    // $ANTLR start "rule__Class__Group_6__1"
    // InternalSmallUML.g:1669:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1673:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUML.g:1674:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1"


    // $ANTLR start "rule__Class__Group_6__1__Impl"
    // InternalSmallUML.g:1681:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1685:1: ( ( '{' ) )
            // InternalSmallUML.g:1686:1: ( '{' )
            {
            // InternalSmallUML.g:1686:1: ( '{' )
            // InternalSmallUML.g:1687:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__1__Impl"


    // $ANTLR start "rule__Class__Group_6__2"
    // InternalSmallUML.g:1696:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1700:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUML.g:1701:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2"


    // $ANTLR start "rule__Class__Group_6__2__Impl"
    // InternalSmallUML.g:1708:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__OperationAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1712:1: ( ( ( rule__Class__OperationAssignment_6_2 ) ) )
            // InternalSmallUML.g:1713:1: ( ( rule__Class__OperationAssignment_6_2 ) )
            {
            // InternalSmallUML.g:1713:1: ( ( rule__Class__OperationAssignment_6_2 ) )
            // InternalSmallUML.g:1714:2: ( rule__Class__OperationAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getOperationAssignment_6_2()); 
            // InternalSmallUML.g:1715:2: ( rule__Class__OperationAssignment_6_2 )
            // InternalSmallUML.g:1715:3: rule__Class__OperationAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__2__Impl"


    // $ANTLR start "rule__Class__Group_6__3"
    // InternalSmallUML.g:1723:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1727:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUML.g:1728:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_10);
            rule__Class__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3"


    // $ANTLR start "rule__Class__Group_6__3__Impl"
    // InternalSmallUML.g:1735:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1739:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalSmallUML.g:1740:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalSmallUML.g:1740:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalSmallUML.g:1741:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalSmallUML.g:1742:2: ( rule__Class__Group_6_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSmallUML.g:1742:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getClassAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__3__Impl"


    // $ANTLR start "rule__Class__Group_6__4"
    // InternalSmallUML.g:1750:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1754:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUML.g:1755:2: rule__Class__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4"


    // $ANTLR start "rule__Class__Group_6__4__Impl"
    // InternalSmallUML.g:1761:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1765:1: ( ( '}' ) )
            // InternalSmallUML.g:1766:1: ( '}' )
            {
            // InternalSmallUML.g:1766:1: ( '}' )
            // InternalSmallUML.g:1767:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6__4__Impl"


    // $ANTLR start "rule__Class__Group_6_3__0"
    // InternalSmallUML.g:1777:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1781:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalSmallUML.g:1782:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_20);
            rule__Class__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0"


    // $ANTLR start "rule__Class__Group_6_3__0__Impl"
    // InternalSmallUML.g:1789:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1793:1: ( ( ',' ) )
            // InternalSmallUML.g:1794:1: ( ',' )
            {
            // InternalSmallUML.g:1794:1: ( ',' )
            // InternalSmallUML.g:1795:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__0__Impl"


    // $ANTLR start "rule__Class__Group_6_3__1"
    // InternalSmallUML.g:1804:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1808:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalSmallUML.g:1809:2: rule__Class__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1"


    // $ANTLR start "rule__Class__Group_6_3__1__Impl"
    // InternalSmallUML.g:1815:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__OperationAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1819:1: ( ( ( rule__Class__OperationAssignment_6_3_1 ) ) )
            // InternalSmallUML.g:1820:1: ( ( rule__Class__OperationAssignment_6_3_1 ) )
            {
            // InternalSmallUML.g:1820:1: ( ( rule__Class__OperationAssignment_6_3_1 ) )
            // InternalSmallUML.g:1821:2: ( rule__Class__OperationAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getOperationAssignment_6_3_1()); 
            // InternalSmallUML.g:1822:2: ( rule__Class__OperationAssignment_6_3_1 )
            // InternalSmallUML.g:1822:3: rule__Class__OperationAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__OperationAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getOperationAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group_6_3__1__Impl"


    // $ANTLR start "rule__Type__Group__0"
    // InternalSmallUML.g:1831:1: rule__Type__Group__0 : rule__Type__Group__0__Impl rule__Type__Group__1 ;
    public final void rule__Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1835:1: ( rule__Type__Group__0__Impl rule__Type__Group__1 )
            // InternalSmallUML.g:1836:2: rule__Type__Group__0__Impl rule__Type__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Type__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0"


    // $ANTLR start "rule__Type__Group__0__Impl"
    // InternalSmallUML.g:1843:1: rule__Type__Group__0__Impl : ( () ) ;
    public final void rule__Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1847:1: ( ( () ) )
            // InternalSmallUML.g:1848:1: ( () )
            {
            // InternalSmallUML.g:1848:1: ( () )
            // InternalSmallUML.g:1849:2: ()
            {
             before(grammarAccess.getTypeAccess().getTypeAction_0()); 
            // InternalSmallUML.g:1850:2: ()
            // InternalSmallUML.g:1850:3: 
            {
            }

             after(grammarAccess.getTypeAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__0__Impl"


    // $ANTLR start "rule__Type__Group__1"
    // InternalSmallUML.g:1858:1: rule__Type__Group__1 : rule__Type__Group__1__Impl rule__Type__Group__2 ;
    public final void rule__Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1862:1: ( rule__Type__Group__1__Impl rule__Type__Group__2 )
            // InternalSmallUML.g:1863:2: rule__Type__Group__1__Impl rule__Type__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Type__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1"


    // $ANTLR start "rule__Type__Group__1__Impl"
    // InternalSmallUML.g:1870:1: rule__Type__Group__1__Impl : ( 'type' ) ;
    public final void rule__Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1874:1: ( ( 'type' ) )
            // InternalSmallUML.g:1875:1: ( 'type' )
            {
            // InternalSmallUML.g:1875:1: ( 'type' )
            // InternalSmallUML.g:1876:2: 'type'
            {
             before(grammarAccess.getTypeAccess().getTypeKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__1__Impl"


    // $ANTLR start "rule__Type__Group__2"
    // InternalSmallUML.g:1885:1: rule__Type__Group__2 : rule__Type__Group__2__Impl rule__Type__Group__3 ;
    public final void rule__Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1889:1: ( rule__Type__Group__2__Impl rule__Type__Group__3 )
            // InternalSmallUML.g:1890:2: rule__Type__Group__2__Impl rule__Type__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Type__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2"


    // $ANTLR start "rule__Type__Group__2__Impl"
    // InternalSmallUML.g:1897:1: rule__Type__Group__2__Impl : ( ( rule__Type__NameAssignment_2 ) ) ;
    public final void rule__Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1901:1: ( ( ( rule__Type__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1902:1: ( ( rule__Type__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1902:1: ( ( rule__Type__NameAssignment_2 ) )
            // InternalSmallUML.g:1903:2: ( rule__Type__NameAssignment_2 )
            {
             before(grammarAccess.getTypeAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1904:2: ( rule__Type__NameAssignment_2 )
            // InternalSmallUML.g:1904:3: rule__Type__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Type__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__2__Impl"


    // $ANTLR start "rule__Type__Group__3"
    // InternalSmallUML.g:1912:1: rule__Type__Group__3 : rule__Type__Group__3__Impl ;
    public final void rule__Type__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1916:1: ( rule__Type__Group__3__Impl )
            // InternalSmallUML.g:1917:2: rule__Type__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3"


    // $ANTLR start "rule__Type__Group__3__Impl"
    // InternalSmallUML.g:1923:1: rule__Type__Group__3__Impl : ( ';' ) ;
    public final void rule__Type__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1927:1: ( ( ';' ) )
            // InternalSmallUML.g:1928:1: ( ';' )
            {
            // InternalSmallUML.g:1928:1: ( ';' )
            // InternalSmallUML.g:1929:2: ';'
            {
             before(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSmallUML.g:1939:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1943:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSmallUML.g:1944:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalSmallUML.g:1951:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1955:1: ( ( () ) )
            // InternalSmallUML.g:1956:1: ( () )
            {
            // InternalSmallUML.g:1956:1: ( () )
            // InternalSmallUML.g:1957:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalSmallUML.g:1958:2: ()
            // InternalSmallUML.g:1958:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSmallUML.g:1966:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1970:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSmallUML.g:1971:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalSmallUML.g:1978:1: rule__Enumeration__Group__1__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1982:1: ( ( 'enumeration' ) )
            // InternalSmallUML.g:1983:1: ( 'enumeration' )
            {
            // InternalSmallUML.g:1983:1: ( 'enumeration' )
            // InternalSmallUML.g:1984:2: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalSmallUML.g:1993:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1997:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSmallUML.g:1998:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalSmallUML.g:2005:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2009:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2010:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2010:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalSmallUML.g:2011:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2012:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalSmallUML.g:2012:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalSmallUML.g:2020:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2024:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSmallUML.g:2025:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalSmallUML.g:2032:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2036:1: ( ( '{' ) )
            // InternalSmallUML.g:2037:1: ( '{' )
            {
            // InternalSmallUML.g:2037:1: ( '{' )
            // InternalSmallUML.g:2038:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalSmallUML.g:2047:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2051:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSmallUML.g:2052:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalSmallUML.g:2059:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )? ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2063:1: ( ( ( rule__Enumeration__Group_4__0 )? ) )
            // InternalSmallUML.g:2064:1: ( ( rule__Enumeration__Group_4__0 )? )
            {
            // InternalSmallUML.g:2064:1: ( ( rule__Enumeration__Group_4__0 )? )
            // InternalSmallUML.g:2065:2: ( rule__Enumeration__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalSmallUML.g:2066:2: ( rule__Enumeration__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSmallUML.g:2066:3: rule__Enumeration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalSmallUML.g:2074:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2078:1: ( rule__Enumeration__Group__5__Impl )
            // InternalSmallUML.g:2079:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalSmallUML.g:2085:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2089:1: ( ( '}' ) )
            // InternalSmallUML.g:2090:1: ( '}' )
            {
            // InternalSmallUML.g:2090:1: ( '}' )
            // InternalSmallUML.g:2091:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__0"
    // InternalSmallUML.g:2101:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2105:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalSmallUML.g:2106:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0"


    // $ANTLR start "rule__Enumeration__Group_4__0__Impl"
    // InternalSmallUML.g:2113:1: rule__Enumeration__Group_4__0__Impl : ( ( rule__Enumeration__EnumerationAssignment_4_0 ) ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2117:1: ( ( ( rule__Enumeration__EnumerationAssignment_4_0 ) ) )
            // InternalSmallUML.g:2118:1: ( ( rule__Enumeration__EnumerationAssignment_4_0 ) )
            {
            // InternalSmallUML.g:2118:1: ( ( rule__Enumeration__EnumerationAssignment_4_0 ) )
            // InternalSmallUML.g:2119:2: ( rule__Enumeration__EnumerationAssignment_4_0 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_0()); 
            // InternalSmallUML.g:2120:2: ( rule__Enumeration__EnumerationAssignment_4_0 )
            // InternalSmallUML.g:2120:3: rule__Enumeration__EnumerationAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__EnumerationAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__1"
    // InternalSmallUML.g:2128:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2132:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalSmallUML.g:2133:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1"


    // $ANTLR start "rule__Enumeration__Group_4__1__Impl"
    // InternalSmallUML.g:2139:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__Group_4_1__0 )* ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2143:1: ( ( ( rule__Enumeration__Group_4_1__0 )* ) )
            // InternalSmallUML.g:2144:1: ( ( rule__Enumeration__Group_4_1__0 )* )
            {
            // InternalSmallUML.g:2144:1: ( ( rule__Enumeration__Group_4_1__0 )* )
            // InternalSmallUML.g:2145:2: ( rule__Enumeration__Group_4_1__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4_1()); 
            // InternalSmallUML.g:2146:2: ( rule__Enumeration__Group_4_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==16) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSmallUML.g:2146:3: rule__Enumeration__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Enumeration__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1__Impl"


    // $ANTLR start "rule__Enumeration__Group_4_1__0"
    // InternalSmallUML.g:2155:1: rule__Enumeration__Group_4_1__0 : rule__Enumeration__Group_4_1__0__Impl rule__Enumeration__Group_4_1__1 ;
    public final void rule__Enumeration__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2159:1: ( rule__Enumeration__Group_4_1__0__Impl rule__Enumeration__Group_4_1__1 )
            // InternalSmallUML.g:2160:2: rule__Enumeration__Group_4_1__0__Impl rule__Enumeration__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Enumeration__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4_1__0"


    // $ANTLR start "rule__Enumeration__Group_4_1__0__Impl"
    // InternalSmallUML.g:2167:1: rule__Enumeration__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2171:1: ( ( ',' ) )
            // InternalSmallUML.g:2172:1: ( ',' )
            {
            // InternalSmallUML.g:2172:1: ( ',' )
            // InternalSmallUML.g:2173:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4_1__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4_1__1"
    // InternalSmallUML.g:2182:1: rule__Enumeration__Group_4_1__1 : rule__Enumeration__Group_4_1__1__Impl ;
    public final void rule__Enumeration__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2186:1: ( rule__Enumeration__Group_4_1__1__Impl )
            // InternalSmallUML.g:2187:2: rule__Enumeration__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4_1__1"


    // $ANTLR start "rule__Enumeration__Group_4_1__1__Impl"
    // InternalSmallUML.g:2193:1: rule__Enumeration__Group_4_1__1__Impl : ( ( rule__Enumeration__EnumerationAssignment_4_1_1 ) ) ;
    public final void rule__Enumeration__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2197:1: ( ( ( rule__Enumeration__EnumerationAssignment_4_1_1 ) ) )
            // InternalSmallUML.g:2198:1: ( ( rule__Enumeration__EnumerationAssignment_4_1_1 ) )
            {
            // InternalSmallUML.g:2198:1: ( ( rule__Enumeration__EnumerationAssignment_4_1_1 ) )
            // InternalSmallUML.g:2199:2: ( rule__Enumeration__EnumerationAssignment_4_1_1 )
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_1_1()); 
            // InternalSmallUML.g:2200:2: ( rule__Enumeration__EnumerationAssignment_4_1_1 )
            // InternalSmallUML.g:2200:3: rule__Enumeration__EnumerationAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__EnumerationAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUML.g:2209:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2213:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:2214:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalSmallUML.g:2221:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2225:1: ( ( 'attribute' ) )
            // InternalSmallUML.g:2226:1: ( 'attribute' )
            {
            // InternalSmallUML.g:2226:1: ( 'attribute' )
            // InternalSmallUML.g:2227:2: 'attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalSmallUML.g:2236:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2240:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:2241:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalSmallUML.g:2248:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2252:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUML.g:2253:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:2253:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUML.g:2254:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:2255:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUML.g:2255:3: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalSmallUML.g:2263:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2267:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:2268:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalSmallUML.g:2275:1: rule__Attribute__Group__2__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2279:1: ( ( ':' ) )
            // InternalSmallUML.g:2280:1: ( ':' )
            {
            // InternalSmallUML.g:2280:1: ( ':' )
            // InternalSmallUML.g:2281:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalSmallUML.g:2290:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2294:1: ( rule__Attribute__Group__3__Impl )
            // InternalSmallUML.g:2295:2: rule__Attribute__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalSmallUML.g:2301:1: rule__Attribute__Group__3__Impl : ( ( rule__Attribute__TypeAssignment_3 ) ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2305:1: ( ( ( rule__Attribute__TypeAssignment_3 ) ) )
            // InternalSmallUML.g:2306:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            {
            // InternalSmallUML.g:2306:1: ( ( rule__Attribute__TypeAssignment_3 ) )
            // InternalSmallUML.g:2307:2: ( rule__Attribute__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 
            // InternalSmallUML.g:2308:2: ( rule__Attribute__TypeAssignment_3 )
            // InternalSmallUML.g:2308:3: rule__Attribute__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalSmallUML.g:2317:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2321:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSmallUML.g:2322:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalSmallUML.g:2329:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__IsAbstractAssignment_0 )? ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2333:1: ( ( ( rule__Operation__IsAbstractAssignment_0 )? ) )
            // InternalSmallUML.g:2334:1: ( ( rule__Operation__IsAbstractAssignment_0 )? )
            {
            // InternalSmallUML.g:2334:1: ( ( rule__Operation__IsAbstractAssignment_0 )? )
            // InternalSmallUML.g:2335:2: ( rule__Operation__IsAbstractAssignment_0 )?
            {
             before(grammarAccess.getOperationAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUML.g:2336:2: ( rule__Operation__IsAbstractAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSmallUML.g:2336:3: rule__Operation__IsAbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__IsAbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getIsAbstractAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalSmallUML.g:2344:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2348:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSmallUML.g:2349:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalSmallUML.g:2356:1: rule__Operation__Group__1__Impl : ( 'operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2360:1: ( ( 'operation' ) )
            // InternalSmallUML.g:2361:1: ( 'operation' )
            {
            // InternalSmallUML.g:2361:1: ( 'operation' )
            // InternalSmallUML.g:2362:2: 'operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperationKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalSmallUML.g:2371:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2375:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalSmallUML.g:2376:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalSmallUML.g:2383:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2387:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2388:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2388:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalSmallUML.g:2389:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2390:2: ( rule__Operation__NameAssignment_2 )
            // InternalSmallUML.g:2390:3: rule__Operation__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
    // InternalSmallUML.g:2398:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2402:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalSmallUML.g:2403:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalSmallUML.g:2410:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )? ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2414:1: ( ( ( rule__Operation__Group_3__0 )? ) )
            // InternalSmallUML.g:2415:1: ( ( rule__Operation__Group_3__0 )? )
            {
            // InternalSmallUML.g:2415:1: ( ( rule__Operation__Group_3__0 )? )
            // InternalSmallUML.g:2416:2: ( rule__Operation__Group_3__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_3()); 
            // InternalSmallUML.g:2417:2: ( rule__Operation__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSmallUML.g:2417:3: rule__Operation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalSmallUML.g:2425:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2429:1: ( rule__Operation__Group__4__Impl )
            // InternalSmallUML.g:2430:2: rule__Operation__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalSmallUML.g:2436:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2440:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalSmallUML.g:2441:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalSmallUML.g:2441:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalSmallUML.g:2442:2: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // InternalSmallUML.g:2443:2: ( rule__Operation__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==12) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSmallUML.g:2443:3: rule__Operation__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
    // InternalSmallUML.g:2452:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2456:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalSmallUML.g:2457:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
    // InternalSmallUML.g:2464:1: rule__Operation__Group_3__0__Impl : ( 'returns' ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2468:1: ( ( 'returns' ) )
            // InternalSmallUML.g:2469:1: ( 'returns' )
            {
            // InternalSmallUML.g:2469:1: ( 'returns' )
            // InternalSmallUML.g:2470:2: 'returns'
            {
             before(grammarAccess.getOperationAccess().getReturnsKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getReturnsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
    // InternalSmallUML.g:2479:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2483:1: ( rule__Operation__Group_3__1__Impl )
            // InternalSmallUML.g:2484:2: rule__Operation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
    // InternalSmallUML.g:2490:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2494:1: ( ( ( rule__Operation__ReturnTypeAssignment_3_1 ) ) )
            // InternalSmallUML.g:2495:1: ( ( rule__Operation__ReturnTypeAssignment_3_1 ) )
            {
            // InternalSmallUML.g:2495:1: ( ( rule__Operation__ReturnTypeAssignment_3_1 ) )
            // InternalSmallUML.g:2496:2: ( rule__Operation__ReturnTypeAssignment_3_1 )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_3_1()); 
            // InternalSmallUML.g:2497:2: ( rule__Operation__ReturnTypeAssignment_3_1 )
            // InternalSmallUML.g:2497:3: rule__Operation__ReturnTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ReturnTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getReturnTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalSmallUML.g:2506:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2510:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalSmallUML.g:2511:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0"


    // $ANTLR start "rule__Operation__Group_4__0__Impl"
    // InternalSmallUML.g:2518:1: rule__Operation__Group_4__0__Impl : ( '{' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2522:1: ( ( '{' ) )
            // InternalSmallUML.g:2523:1: ( '{' )
            {
            // InternalSmallUML.g:2523:1: ( '{' )
            // InternalSmallUML.g:2524:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__0__Impl"


    // $ANTLR start "rule__Operation__Group_4__1"
    // InternalSmallUML.g:2533:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2537:1: ( rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2 )
            // InternalSmallUML.g:2538:2: rule__Operation__Group_4__1__Impl rule__Operation__Group_4__2
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1"


    // $ANTLR start "rule__Operation__Group_4__1__Impl"
    // InternalSmallUML.g:2545:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__ParametersAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2549:1: ( ( ( rule__Operation__ParametersAssignment_4_1 ) ) )
            // InternalSmallUML.g:2550:1: ( ( rule__Operation__ParametersAssignment_4_1 ) )
            {
            // InternalSmallUML.g:2550:1: ( ( rule__Operation__ParametersAssignment_4_1 ) )
            // InternalSmallUML.g:2551:2: ( rule__Operation__ParametersAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_4_1()); 
            // InternalSmallUML.g:2552:2: ( rule__Operation__ParametersAssignment_4_1 )
            // InternalSmallUML.g:2552:3: rule__Operation__ParametersAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__1__Impl"


    // $ANTLR start "rule__Operation__Group_4__2"
    // InternalSmallUML.g:2560:1: rule__Operation__Group_4__2 : rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 ;
    public final void rule__Operation__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2564:1: ( rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3 )
            // InternalSmallUML.g:2565:2: rule__Operation__Group_4__2__Impl rule__Operation__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Operation__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__2"


    // $ANTLR start "rule__Operation__Group_4__2__Impl"
    // InternalSmallUML.g:2572:1: rule__Operation__Group_4__2__Impl : ( ( rule__Operation__Group_4_2__0 )* ) ;
    public final void rule__Operation__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2576:1: ( ( ( rule__Operation__Group_4_2__0 )* ) )
            // InternalSmallUML.g:2577:1: ( ( rule__Operation__Group_4_2__0 )* )
            {
            // InternalSmallUML.g:2577:1: ( ( rule__Operation__Group_4_2__0 )* )
            // InternalSmallUML.g:2578:2: ( rule__Operation__Group_4_2__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_4_2()); 
            // InternalSmallUML.g:2579:2: ( rule__Operation__Group_4_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==16) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSmallUML.g:2579:3: rule__Operation__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Operation__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__2__Impl"


    // $ANTLR start "rule__Operation__Group_4__3"
    // InternalSmallUML.g:2587:1: rule__Operation__Group_4__3 : rule__Operation__Group_4__3__Impl ;
    public final void rule__Operation__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2591:1: ( rule__Operation__Group_4__3__Impl )
            // InternalSmallUML.g:2592:2: rule__Operation__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__3"


    // $ANTLR start "rule__Operation__Group_4__3__Impl"
    // InternalSmallUML.g:2598:1: rule__Operation__Group_4__3__Impl : ( '}' ) ;
    public final void rule__Operation__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2602:1: ( ( '}' ) )
            // InternalSmallUML.g:2603:1: ( '}' )
            {
            // InternalSmallUML.g:2603:1: ( '}' )
            // InternalSmallUML.g:2604:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4__3__Impl"


    // $ANTLR start "rule__Operation__Group_4_2__0"
    // InternalSmallUML.g:2614:1: rule__Operation__Group_4_2__0 : rule__Operation__Group_4_2__0__Impl rule__Operation__Group_4_2__1 ;
    public final void rule__Operation__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2618:1: ( rule__Operation__Group_4_2__0__Impl rule__Operation__Group_4_2__1 )
            // InternalSmallUML.g:2619:2: rule__Operation__Group_4_2__0__Impl rule__Operation__Group_4_2__1
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_2__0"


    // $ANTLR start "rule__Operation__Group_4_2__0__Impl"
    // InternalSmallUML.g:2626:1: rule__Operation__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2630:1: ( ( ',' ) )
            // InternalSmallUML.g:2631:1: ( ',' )
            {
            // InternalSmallUML.g:2631:1: ( ',' )
            // InternalSmallUML.g:2632:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_4_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_2__0__Impl"


    // $ANTLR start "rule__Operation__Group_4_2__1"
    // InternalSmallUML.g:2641:1: rule__Operation__Group_4_2__1 : rule__Operation__Group_4_2__1__Impl ;
    public final void rule__Operation__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2645:1: ( rule__Operation__Group_4_2__1__Impl )
            // InternalSmallUML.g:2646:2: rule__Operation__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_2__1"


    // $ANTLR start "rule__Operation__Group_4_2__1__Impl"
    // InternalSmallUML.g:2652:1: rule__Operation__Group_4_2__1__Impl : ( ( rule__Operation__ParametersAssignment_4_2_1 ) ) ;
    public final void rule__Operation__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2656:1: ( ( ( rule__Operation__ParametersAssignment_4_2_1 ) ) )
            // InternalSmallUML.g:2657:1: ( ( rule__Operation__ParametersAssignment_4_2_1 ) )
            {
            // InternalSmallUML.g:2657:1: ( ( rule__Operation__ParametersAssignment_4_2_1 ) )
            // InternalSmallUML.g:2658:2: ( rule__Operation__ParametersAssignment_4_2_1 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_4_2_1()); 
            // InternalSmallUML.g:2659:2: ( rule__Operation__ParametersAssignment_4_2_1 )
            // InternalSmallUML.g:2659:3: rule__Operation__ParametersAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_4_2__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSmallUML.g:2668:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2672:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSmallUML.g:2673:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalSmallUML.g:2680:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__NameAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2684:1: ( ( ( rule__Parameter__NameAssignment_0 ) ) )
            // InternalSmallUML.g:2685:1: ( ( rule__Parameter__NameAssignment_0 ) )
            {
            // InternalSmallUML.g:2685:1: ( ( rule__Parameter__NameAssignment_0 ) )
            // InternalSmallUML.g:2686:2: ( rule__Parameter__NameAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_0()); 
            // InternalSmallUML.g:2687:2: ( rule__Parameter__NameAssignment_0 )
            // InternalSmallUML.g:2687:3: rule__Parameter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalSmallUML.g:2695:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2699:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSmallUML.g:2700:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalSmallUML.g:2707:1: rule__Parameter__Group__1__Impl : ( ':' ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2711:1: ( ( ':' ) )
            // InternalSmallUML.g:2712:1: ( ':' )
            {
            // InternalSmallUML.g:2712:1: ( ':' )
            // InternalSmallUML.g:2713:2: ':'
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalSmallUML.g:2722:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2726:1: ( rule__Parameter__Group__2__Impl )
            // InternalSmallUML.g:2727:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalSmallUML.g:2733:1: rule__Parameter__Group__2__Impl : ( ( rule__Parameter__TypeAssignment_2 ) ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2737:1: ( ( ( rule__Parameter__TypeAssignment_2 ) ) )
            // InternalSmallUML.g:2738:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            {
            // InternalSmallUML.g:2738:1: ( ( rule__Parameter__TypeAssignment_2 ) )
            // InternalSmallUML.g:2739:2: ( rule__Parameter__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_2()); 
            // InternalSmallUML.g:2740:2: ( rule__Parameter__TypeAssignment_2 )
            // InternalSmallUML.g:2740:3: rule__Parameter__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSmallUML.g:2749:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2753:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSmallUML.g:2754:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Role__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0"


    // $ANTLR start "rule__Role__Group__0__Impl"
    // InternalSmallUML.g:2761:1: rule__Role__Group__0__Impl : ( 'role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2765:1: ( ( 'role' ) )
            // InternalSmallUML.g:2766:1: ( 'role' )
            {
            // InternalSmallUML.g:2766:1: ( 'role' )
            // InternalSmallUML.g:2767:2: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__0__Impl"


    // $ANTLR start "rule__Role__Group__1"
    // InternalSmallUML.g:2776:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2780:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSmallUML.g:2781:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Role__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1"


    // $ANTLR start "rule__Role__Group__1__Impl"
    // InternalSmallUML.g:2788:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2792:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalSmallUML.g:2793:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:2793:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalSmallUML.g:2794:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:2795:2: ( rule__Role__NameAssignment_1 )
            // InternalSmallUML.g:2795:3: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Role__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__1__Impl"


    // $ANTLR start "rule__Role__Group__2"
    // InternalSmallUML.g:2803:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2807:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSmallUML.g:2808:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Role__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2"


    // $ANTLR start "rule__Role__Group__2__Impl"
    // InternalSmallUML.g:2815:1: rule__Role__Group__2__Impl : ( '[' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2819:1: ( ( '[' ) )
            // InternalSmallUML.g:2820:1: ( '[' )
            {
            // InternalSmallUML.g:2820:1: ( '[' )
            // InternalSmallUML.g:2821:2: '['
            {
             before(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__2__Impl"


    // $ANTLR start "rule__Role__Group__3"
    // InternalSmallUML.g:2830:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2834:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSmallUML.g:2835:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Role__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3"


    // $ANTLR start "rule__Role__Group__3__Impl"
    // InternalSmallUML.g:2842:1: rule__Role__Group__3__Impl : ( ( rule__Role__LowerBoundAssignment_3 ) ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2846:1: ( ( ( rule__Role__LowerBoundAssignment_3 ) ) )
            // InternalSmallUML.g:2847:1: ( ( rule__Role__LowerBoundAssignment_3 ) )
            {
            // InternalSmallUML.g:2847:1: ( ( rule__Role__LowerBoundAssignment_3 ) )
            // InternalSmallUML.g:2848:2: ( rule__Role__LowerBoundAssignment_3 )
            {
             before(grammarAccess.getRoleAccess().getLowerBoundAssignment_3()); 
            // InternalSmallUML.g:2849:2: ( rule__Role__LowerBoundAssignment_3 )
            // InternalSmallUML.g:2849:3: rule__Role__LowerBoundAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Role__LowerBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getLowerBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__3__Impl"


    // $ANTLR start "rule__Role__Group__4"
    // InternalSmallUML.g:2857:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2861:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSmallUML.g:2862:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Role__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4"


    // $ANTLR start "rule__Role__Group__4__Impl"
    // InternalSmallUML.g:2869:1: rule__Role__Group__4__Impl : ( ',' ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2873:1: ( ( ',' ) )
            // InternalSmallUML.g:2874:1: ( ',' )
            {
            // InternalSmallUML.g:2874:1: ( ',' )
            // InternalSmallUML.g:2875:2: ','
            {
             before(grammarAccess.getRoleAccess().getCommaKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__4__Impl"


    // $ANTLR start "rule__Role__Group__5"
    // InternalSmallUML.g:2884:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2888:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalSmallUML.g:2889:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Role__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5"


    // $ANTLR start "rule__Role__Group__5__Impl"
    // InternalSmallUML.g:2896:1: rule__Role__Group__5__Impl : ( ( rule__Role__UpperBoundAssignment_5 ) ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2900:1: ( ( ( rule__Role__UpperBoundAssignment_5 ) ) )
            // InternalSmallUML.g:2901:1: ( ( rule__Role__UpperBoundAssignment_5 ) )
            {
            // InternalSmallUML.g:2901:1: ( ( rule__Role__UpperBoundAssignment_5 ) )
            // InternalSmallUML.g:2902:2: ( rule__Role__UpperBoundAssignment_5 )
            {
             before(grammarAccess.getRoleAccess().getUpperBoundAssignment_5()); 
            // InternalSmallUML.g:2903:2: ( rule__Role__UpperBoundAssignment_5 )
            // InternalSmallUML.g:2903:3: rule__Role__UpperBoundAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Role__UpperBoundAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getUpperBoundAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__6"
    // InternalSmallUML.g:2911:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2915:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // InternalSmallUML.g:2916:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Role__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6"


    // $ANTLR start "rule__Role__Group__6__Impl"
    // InternalSmallUML.g:2923:1: rule__Role__Group__6__Impl : ( ']' ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2927:1: ( ( ']' ) )
            // InternalSmallUML.g:2928:1: ( ']' )
            {
            // InternalSmallUML.g:2928:1: ( ']' )
            // InternalSmallUML.g:2929:2: ']'
            {
             before(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__6__Impl"


    // $ANTLR start "rule__Role__Group__7"
    // InternalSmallUML.g:2938:1: rule__Role__Group__7 : rule__Role__Group__7__Impl rule__Role__Group__8 ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2942:1: ( rule__Role__Group__7__Impl rule__Role__Group__8 )
            // InternalSmallUML.g:2943:2: rule__Role__Group__7__Impl rule__Role__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Role__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Role__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7"


    // $ANTLR start "rule__Role__Group__7__Impl"
    // InternalSmallUML.g:2950:1: rule__Role__Group__7__Impl : ( 'with' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2954:1: ( ( 'with' ) )
            // InternalSmallUML.g:2955:1: ( 'with' )
            {
            // InternalSmallUML.g:2955:1: ( 'with' )
            // InternalSmallUML.g:2956:2: 'with'
            {
             before(grammarAccess.getRoleAccess().getWithKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getWithKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__7__Impl"


    // $ANTLR start "rule__Role__Group__8"
    // InternalSmallUML.g:2965:1: rule__Role__Group__8 : rule__Role__Group__8__Impl ;
    public final void rule__Role__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2969:1: ( rule__Role__Group__8__Impl )
            // InternalSmallUML.g:2970:2: rule__Role__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8"


    // $ANTLR start "rule__Role__Group__8__Impl"
    // InternalSmallUML.g:2976:1: rule__Role__Group__8__Impl : ( ( rule__Role__ClassAssignment_8 ) ) ;
    public final void rule__Role__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2980:1: ( ( ( rule__Role__ClassAssignment_8 ) ) )
            // InternalSmallUML.g:2981:1: ( ( rule__Role__ClassAssignment_8 ) )
            {
            // InternalSmallUML.g:2981:1: ( ( rule__Role__ClassAssignment_8 ) )
            // InternalSmallUML.g:2982:2: ( rule__Role__ClassAssignment_8 )
            {
             before(grammarAccess.getRoleAccess().getClassAssignment_8()); 
            // InternalSmallUML.g:2983:2: ( rule__Role__ClassAssignment_8 )
            // InternalSmallUML.g:2983:3: rule__Role__ClassAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Role__ClassAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getClassAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__Group__8__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUML.g:2992:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2996:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:2997:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalSmallUML.g:3004:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3008:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:3009:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:3009:1: ( ( '-' )? )
            // InternalSmallUML.g:3010:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:3011:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSmallUML.g:3011:3: '-'
                    {
                    match(input,34,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalSmallUML.g:3019:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3023:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:3024:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalSmallUML.g:3030:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3034:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:3035:1: ( RULE_INT )
            {
            // InternalSmallUML.g:3035:1: ( RULE_INT )
            // InternalSmallUML.g:3036:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalSmallUML.g:3046:1: rule__Package__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3050:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3051:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3051:2: ( RULE_ID )
            // InternalSmallUML.g:3052:3: RULE_ID
            {
             before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementsAssignment_4_2"
    // InternalSmallUML.g:3061:1: rule__Package__ElementsAssignment_4_2 : ( ruleSuperType ) ;
    public final void rule__Package__ElementsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3065:1: ( ( ruleSuperType ) )
            // InternalSmallUML.g:3066:2: ( ruleSuperType )
            {
            // InternalSmallUML.g:3066:2: ( ruleSuperType )
            // InternalSmallUML.g:3067:3: ruleSuperType
            {
             before(grammarAccess.getPackageAccess().getElementsSuperTypeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSuperType();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsSuperTypeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__ElementsAssignment_4_2"


    // $ANTLR start "rule__Package__AssociationAssignment_5_2"
    // InternalSmallUML.g:3076:1: rule__Package__AssociationAssignment_5_2 : ( ruleAssociation ) ;
    public final void rule__Package__AssociationAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3080:1: ( ( ruleAssociation ) )
            // InternalSmallUML.g:3081:2: ( ruleAssociation )
            {
            // InternalSmallUML.g:3081:2: ( ruleAssociation )
            // InternalSmallUML.g:3082:3: ruleAssociation
            {
             before(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AssociationAssignment_5_2"


    // $ANTLR start "rule__Package__AssociationAssignment_5_3_1"
    // InternalSmallUML.g:3091:1: rule__Package__AssociationAssignment_5_3_1 : ( ruleAssociation ) ;
    public final void rule__Package__AssociationAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3095:1: ( ( ruleAssociation ) )
            // InternalSmallUML.g:3096:2: ( ruleAssociation )
            {
            // InternalSmallUML.g:3096:2: ( ruleAssociation )
            // InternalSmallUML.g:3097:3: ruleAssociation
            {
             before(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssociation();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getAssociationAssociationParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Package__AssociationAssignment_5_3_1"


    // $ANTLR start "rule__Association__NameAssignment_1"
    // InternalSmallUML.g:3106:1: rule__Association__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Association__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3110:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3111:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3111:2: ( RULE_ID )
            // InternalSmallUML.g:3112:3: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssociationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__NameAssignment_1"


    // $ANTLR start "rule__Association__RoleAssignment_5"
    // InternalSmallUML.g:3121:1: rule__Association__RoleAssignment_5 : ( ruleRole ) ;
    public final void rule__Association__RoleAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3125:1: ( ( ruleRole ) )
            // InternalSmallUML.g:3126:2: ( ruleRole )
            {
            // InternalSmallUML.g:3126:2: ( ruleRole )
            // InternalSmallUML.g:3127:3: ruleRole
            {
             before(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RoleAssignment_5"


    // $ANTLR start "rule__Association__RoleAssignment_6_1"
    // InternalSmallUML.g:3136:1: rule__Association__RoleAssignment_6_1 : ( ruleRole ) ;
    public final void rule__Association__RoleAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3140:1: ( ( ruleRole ) )
            // InternalSmallUML.g:3141:2: ( ruleRole )
            {
            // InternalSmallUML.g:3141:2: ( ruleRole )
            // InternalSmallUML.g:3142:3: ruleRole
            {
             before(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRole();

            state._fsp--;

             after(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Association__RoleAssignment_6_1"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalSmallUML.g:3151:1: rule__Class__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3155:1: ( ( ( 'abstract' ) ) )
            // InternalSmallUML.g:3156:2: ( ( 'abstract' ) )
            {
            // InternalSmallUML.g:3156:2: ( ( 'abstract' ) )
            // InternalSmallUML.g:3157:3: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalSmallUML.g:3158:3: ( 'abstract' )
            // InternalSmallUML.g:3159:4: 'abstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__IsAbstractAssignment_0"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // InternalSmallUML.g:3170:1: rule__Class__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3174:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3175:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3175:2: ( RULE_ID )
            // InternalSmallUML.g:3176:3: RULE_ID
            {
             before(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_2"


    // $ANTLR start "rule__Class__SuperAssignment_3_1"
    // InternalSmallUML.g:3185:1: rule__Class__SuperAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__SuperAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3189:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3190:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3190:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3191:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0()); 
            // InternalSmallUML.g:3192:3: ( ruleEString )
            // InternalSmallUML.g:3193:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperClassEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperClassCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__SuperAssignment_3_1"


    // $ANTLR start "rule__Class__AttributeAssignment_5_2"
    // InternalSmallUML.g:3204:1: rule__Class__AttributeAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3208:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3209:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3209:2: ( ruleAttribute )
            // InternalSmallUML.g:3210:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributeAssignment_5_2"


    // $ANTLR start "rule__Class__AttributeAssignment_5_3_1"
    // InternalSmallUML.g:3219:1: rule__Class__AttributeAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3223:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:3224:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:3224:2: ( ruleAttribute )
            // InternalSmallUML.g:3225:3: ruleAttribute
            {
             before(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AttributeAssignment_5_3_1"


    // $ANTLR start "rule__Class__OperationAssignment_6_2"
    // InternalSmallUML.g:3234:1: rule__Class__OperationAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__Class__OperationAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3238:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:3239:2: ( ruleOperation )
            {
            // InternalSmallUML.g:3239:2: ( ruleOperation )
            // InternalSmallUML.g:3240:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationAssignment_6_2"


    // $ANTLR start "rule__Class__OperationAssignment_6_3_1"
    // InternalSmallUML.g:3249:1: rule__Class__OperationAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__Class__OperationAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3253:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:3254:2: ( ruleOperation )
            {
            // InternalSmallUML.g:3254:2: ( ruleOperation )
            // InternalSmallUML.g:3255:3: ruleOperation
            {
             before(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__OperationAssignment_6_3_1"


    // $ANTLR start "rule__Type__NameAssignment_2"
    // InternalSmallUML.g:3264:1: rule__Type__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Type__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3268:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3269:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3269:2: ( RULE_ID )
            // InternalSmallUML.g:3270:3: RULE_ID
            {
             before(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalSmallUML.g:3279:1: rule__Enumeration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3283:1: ( ( RULE_ID ) )
            // InternalSmallUML.g:3284:2: ( RULE_ID )
            {
            // InternalSmallUML.g:3284:2: ( RULE_ID )
            // InternalSmallUML.g:3285:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__EnumerationAssignment_4_0"
    // InternalSmallUML.g:3294:1: rule__Enumeration__EnumerationAssignment_4_0 : ( ruleEString ) ;
    public final void rule__Enumeration__EnumerationAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3298:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3299:2: ( ruleEString )
            {
            // InternalSmallUML.g:3299:2: ( ruleEString )
            // InternalSmallUML.g:3300:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumerationAssignment_4_0"


    // $ANTLR start "rule__Enumeration__EnumerationAssignment_4_1_1"
    // InternalSmallUML.g:3309:1: rule__Enumeration__EnumerationAssignment_4_1_1 : ( ruleEString ) ;
    public final void rule__Enumeration__EnumerationAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3313:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3314:2: ( ruleEString )
            {
            // InternalSmallUML.g:3314:2: ( ruleEString )
            // InternalSmallUML.g:3315:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getEnumerationEStringParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__EnumerationAssignment_4_1_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUML.g:3324:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3328:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3329:2: ( ruleEString )
            {
            // InternalSmallUML.g:3329:2: ( ruleEString )
            // InternalSmallUML.g:3330:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_3"
    // InternalSmallUML.g:3339:1: rule__Attribute__TypeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Attribute__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3343:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3344:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3344:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3345:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_3_0()); 
            // InternalSmallUML.g:3346:3: ( ruleEString )
            // InternalSmallUML.g:3347:4: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeSuperTypeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeSuperTypeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_3"


    // $ANTLR start "rule__Operation__IsAbstractAssignment_0"
    // InternalSmallUML.g:3358:1: rule__Operation__IsAbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Operation__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3362:1: ( ( ( 'abstract' ) ) )
            // InternalSmallUML.g:3363:2: ( ( 'abstract' ) )
            {
            // InternalSmallUML.g:3363:2: ( ( 'abstract' ) )
            // InternalSmallUML.g:3364:3: ( 'abstract' )
            {
             before(grammarAccess.getOperationAccess().getIsAbstractAbstractKeyword_0_0()); 
            // InternalSmallUML.g:3365:3: ( 'abstract' )
            // InternalSmallUML.g:3366:4: 'abstract'
            {
             before(grammarAccess.getOperationAccess().getIsAbstractAbstractKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getOperationAccess().getIsAbstractAbstractKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__IsAbstractAssignment_0"


    // $ANTLR start "rule__Operation__NameAssignment_2"
    // InternalSmallUML.g:3377:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3381:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3382:2: ( ruleEString )
            {
            // InternalSmallUML.g:3382:2: ( ruleEString )
            // InternalSmallUML.g:3383:3: ruleEString
            {
             before(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_2"


    // $ANTLR start "rule__Operation__ReturnTypeAssignment_3_1"
    // InternalSmallUML.g:3392:1: rule__Operation__ReturnTypeAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3396:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3397:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3397:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3398:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_3_1_0()); 
            // InternalSmallUML.g:3399:3: ( ruleEString )
            // InternalSmallUML.g:3400:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getReturnTypeSuperTypeEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getReturnTypeSuperTypeEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ReturnTypeAssignment_3_1"


    // $ANTLR start "rule__Operation__ParametersAssignment_4_1"
    // InternalSmallUML.g:3411:1: rule__Operation__ParametersAssignment_4_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3415:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:3416:2: ( ruleParameter )
            {
            // InternalSmallUML.g:3416:2: ( ruleParameter )
            // InternalSmallUML.g:3417:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_4_1"


    // $ANTLR start "rule__Operation__ParametersAssignment_4_2_1"
    // InternalSmallUML.g:3426:1: rule__Operation__ParametersAssignment_4_2_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3430:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:3431:2: ( ruleParameter )
            {
            // InternalSmallUML.g:3431:2: ( ruleParameter )
            // InternalSmallUML.g:3432:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ParametersAssignment_4_2_1"


    // $ANTLR start "rule__Parameter__NameAssignment_0"
    // InternalSmallUML.g:3441:1: rule__Parameter__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3445:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3446:2: ( ruleEString )
            {
            // InternalSmallUML.g:3446:2: ( ruleEString )
            // InternalSmallUML.g:3447:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_0"


    // $ANTLR start "rule__Parameter__TypeAssignment_2"
    // InternalSmallUML.g:3456:1: rule__Parameter__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3460:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3461:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3461:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3462:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_2_0()); 
            // InternalSmallUML.g:3463:3: ( ruleEString )
            // InternalSmallUML.g:3464:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeSuperTypeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeSuperTypeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_2"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalSmallUML.g:3475:1: rule__Role__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3479:1: ( ( ruleEString ) )
            // InternalSmallUML.g:3480:2: ( ruleEString )
            {
            // InternalSmallUML.g:3480:2: ( ruleEString )
            // InternalSmallUML.g:3481:3: ruleEString
            {
             before(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__NameAssignment_1"


    // $ANTLR start "rule__Role__LowerBoundAssignment_3"
    // InternalSmallUML.g:3490:1: rule__Role__LowerBoundAssignment_3 : ( ruleEInt ) ;
    public final void rule__Role__LowerBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3494:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3495:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3495:2: ( ruleEInt )
            // InternalSmallUML.g:3496:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__LowerBoundAssignment_3"


    // $ANTLR start "rule__Role__UpperBoundAssignment_5"
    // InternalSmallUML.g:3505:1: rule__Role__UpperBoundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Role__UpperBoundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3509:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:3510:2: ( ruleEInt )
            {
            // InternalSmallUML.g:3510:2: ( ruleEInt )
            // InternalSmallUML.g:3511:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__UpperBoundAssignment_5"


    // $ANTLR start "rule__Role__ClassAssignment_8"
    // InternalSmallUML.g:3520:1: rule__Role__ClassAssignment_8 : ( ( ruleEString ) ) ;
    public final void rule__Role__ClassAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:3524:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:3525:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:3525:2: ( ( ruleEString ) )
            // InternalSmallUML.g:3526:3: ( ruleEString )
            {
             before(grammarAccess.getRoleAccess().getClassClassCrossReference_8_0()); 
            // InternalSmallUML.g:3527:3: ( ruleEString )
            // InternalSmallUML.g:3528:4: ruleEString
            {
             before(grammarAccess.getRoleAccess().getClassClassEStringParserRuleCall_8_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getClassClassEStringParserRuleCall_8_0_1()); 

            }

             after(grammarAccess.getRoleAccess().getClassClassCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Role__ClassAssignment_8"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000802882000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000802880002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000101000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000602000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000802880000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000020001000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});

}