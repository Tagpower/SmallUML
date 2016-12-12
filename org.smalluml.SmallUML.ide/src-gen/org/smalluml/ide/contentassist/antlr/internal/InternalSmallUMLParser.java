package org.smalluml.ide.contentassist.antlr.internal;

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
import org.smalluml.services.SmallUMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallUMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Attribute'", "'{'", "'type'", "'}'", "'Role'", "'lowerBound'", "'upperBound'", "'Operation'", "'returnType'", "'parameters'", "','", "'Parameter'", "'Class'", "'super'", "'attribute'", "'operation'", "'Integer'", "'String'", "'Date'", "'-'", "'isAbstract'"
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



    // $ANTLR start "entryRuleSuperType"
    // InternalSmallUML.g:53:1: entryRuleSuperType : ruleSuperType EOF ;
    public final void entryRuleSuperType() throws RecognitionException {
        try {
            // InternalSmallUML.g:54:1: ( ruleSuperType EOF )
            // InternalSmallUML.g:55:1: ruleSuperType EOF
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
    // InternalSmallUML.g:62:1: ruleSuperType : ( ( rule__SuperType__Alternatives ) ) ;
    public final void ruleSuperType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:66:2: ( ( ( rule__SuperType__Alternatives ) ) )
            // InternalSmallUML.g:67:2: ( ( rule__SuperType__Alternatives ) )
            {
            // InternalSmallUML.g:67:2: ( ( rule__SuperType__Alternatives ) )
            // InternalSmallUML.g:68:3: ( rule__SuperType__Alternatives )
            {
             before(grammarAccess.getSuperTypeAccess().getAlternatives()); 
            // InternalSmallUML.g:69:3: ( rule__SuperType__Alternatives )
            // InternalSmallUML.g:69:4: rule__SuperType__Alternatives
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


    // $ANTLR start "entryRuleEString"
    // InternalSmallUML.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSmallUML.g:79:1: ( ruleEString EOF )
            // InternalSmallUML.g:80:1: ruleEString EOF
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
    // InternalSmallUML.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSmallUML.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSmallUML.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalSmallUML.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSmallUML.g:94:3: ( rule__EString__Alternatives )
            // InternalSmallUML.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleAttribute"
    // InternalSmallUML.g:103:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSmallUML.g:104:1: ( ruleAttribute EOF )
            // InternalSmallUML.g:105:1: ruleAttribute EOF
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
    // InternalSmallUML.g:112:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:116:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalSmallUML.g:117:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalSmallUML.g:117:2: ( ( rule__Attribute__Group__0 ) )
            // InternalSmallUML.g:118:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalSmallUML.g:119:3: ( rule__Attribute__Group__0 )
            // InternalSmallUML.g:119:4: rule__Attribute__Group__0
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


    // $ANTLR start "entryRuleRole"
    // InternalSmallUML.g:128:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // InternalSmallUML.g:129:1: ( ruleRole EOF )
            // InternalSmallUML.g:130:1: ruleRole EOF
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
    // InternalSmallUML.g:137:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:141:2: ( ( ( rule__Role__Group__0 ) ) )
            // InternalSmallUML.g:142:2: ( ( rule__Role__Group__0 ) )
            {
            // InternalSmallUML.g:142:2: ( ( rule__Role__Group__0 ) )
            // InternalSmallUML.g:143:3: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // InternalSmallUML.g:144:3: ( rule__Role__Group__0 )
            // InternalSmallUML.g:144:4: rule__Role__Group__0
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


    // $ANTLR start "entryRuleOperation"
    // InternalSmallUML.g:153:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalSmallUML.g:154:1: ( ruleOperation EOF )
            // InternalSmallUML.g:155:1: ruleOperation EOF
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
    // InternalSmallUML.g:162:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:166:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalSmallUML.g:167:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalSmallUML.g:167:2: ( ( rule__Operation__Group__0 ) )
            // InternalSmallUML.g:168:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalSmallUML.g:169:3: ( rule__Operation__Group__0 )
            // InternalSmallUML.g:169:4: rule__Operation__Group__0
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
    // InternalSmallUML.g:178:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalSmallUML.g:179:1: ( ruleParameter EOF )
            // InternalSmallUML.g:180:1: ruleParameter EOF
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
    // InternalSmallUML.g:187:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:191:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalSmallUML.g:192:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalSmallUML.g:192:2: ( ( rule__Parameter__Group__0 ) )
            // InternalSmallUML.g:193:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalSmallUML.g:194:3: ( rule__Parameter__Group__0 )
            // InternalSmallUML.g:194:4: rule__Parameter__Group__0
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


    // $ANTLR start "entryRuleClass"
    // InternalSmallUML.g:203:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // InternalSmallUML.g:204:1: ( ruleClass EOF )
            // InternalSmallUML.g:205:1: ruleClass EOF
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
    // InternalSmallUML.g:212:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:216:2: ( ( ( rule__Class__Group__0 ) ) )
            // InternalSmallUML.g:217:2: ( ( rule__Class__Group__0 ) )
            {
            // InternalSmallUML.g:217:2: ( ( rule__Class__Group__0 ) )
            // InternalSmallUML.g:218:3: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // InternalSmallUML.g:219:3: ( rule__Class__Group__0 )
            // InternalSmallUML.g:219:4: rule__Class__Group__0
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


    // $ANTLR start "entryRuleInteger"
    // InternalSmallUML.g:228:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // InternalSmallUML.g:229:1: ( ruleInteger EOF )
            // InternalSmallUML.g:230:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
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
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalSmallUML.g:237:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:241:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalSmallUML.g:242:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalSmallUML.g:242:2: ( ( rule__Integer__Group__0 ) )
            // InternalSmallUML.g:243:3: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // InternalSmallUML.g:244:3: ( rule__Integer__Group__0 )
            // InternalSmallUML.g:244:4: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleString0"
    // InternalSmallUML.g:253:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalSmallUML.g:254:1: ( ruleString0 EOF )
            // InternalSmallUML.g:255:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalSmallUML.g:262:1: ruleString0 : ( ( rule__String0__Group__0 ) ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:266:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalSmallUML.g:267:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalSmallUML.g:267:2: ( ( rule__String0__Group__0 ) )
            // InternalSmallUML.g:268:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalSmallUML.g:269:3: ( rule__String0__Group__0 )
            // InternalSmallUML.g:269:4: rule__String0__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getGroup()); 

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
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleDate"
    // InternalSmallUML.g:278:1: entryRuleDate : ruleDate EOF ;
    public final void entryRuleDate() throws RecognitionException {
        try {
            // InternalSmallUML.g:279:1: ( ruleDate EOF )
            // InternalSmallUML.g:280:1: ruleDate EOF
            {
             before(grammarAccess.getDateRule()); 
            pushFollow(FOLLOW_1);
            ruleDate();

            state._fsp--;

             after(grammarAccess.getDateRule()); 
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
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // InternalSmallUML.g:287:1: ruleDate : ( ( rule__Date__Group__0 ) ) ;
    public final void ruleDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:291:2: ( ( ( rule__Date__Group__0 ) ) )
            // InternalSmallUML.g:292:2: ( ( rule__Date__Group__0 ) )
            {
            // InternalSmallUML.g:292:2: ( ( rule__Date__Group__0 ) )
            // InternalSmallUML.g:293:3: ( rule__Date__Group__0 )
            {
             before(grammarAccess.getDateAccess().getGroup()); 
            // InternalSmallUML.g:294:3: ( rule__Date__Group__0 )
            // InternalSmallUML.g:294:4: rule__Date__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getGroup()); 

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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleEInt"
    // InternalSmallUML.g:303:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSmallUML.g:304:1: ( ruleEInt EOF )
            // InternalSmallUML.g:305:1: ruleEInt EOF
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
    // InternalSmallUML.g:312:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:316:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSmallUML.g:317:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSmallUML.g:317:2: ( ( rule__EInt__Group__0 ) )
            // InternalSmallUML.g:318:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSmallUML.g:319:3: ( rule__EInt__Group__0 )
            // InternalSmallUML.g:319:4: rule__EInt__Group__0
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
    // InternalSmallUML.g:327:1: rule__SuperType__Alternatives : ( ( ruleClass ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleDate ) );
    public final void rule__SuperType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:331:1: ( ( ruleClass ) | ( ruleInteger ) | ( ruleString0 ) | ( ruleDate ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
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
                    // InternalSmallUML.g:332:2: ( ruleClass )
                    {
                    // InternalSmallUML.g:332:2: ( ruleClass )
                    // InternalSmallUML.g:333:3: ruleClass
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
                    // InternalSmallUML.g:338:2: ( ruleInteger )
                    {
                    // InternalSmallUML.g:338:2: ( ruleInteger )
                    // InternalSmallUML.g:339:3: ruleInteger
                    {
                     before(grammarAccess.getSuperTypeAccess().getIntegerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getIntegerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSmallUML.g:344:2: ( ruleString0 )
                    {
                    // InternalSmallUML.g:344:2: ( ruleString0 )
                    // InternalSmallUML.g:345:3: ruleString0
                    {
                     before(grammarAccess.getSuperTypeAccess().getString0ParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleString0();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getString0ParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSmallUML.g:350:2: ( ruleDate )
                    {
                    // InternalSmallUML.g:350:2: ( ruleDate )
                    // InternalSmallUML.g:351:3: ruleDate
                    {
                     before(grammarAccess.getSuperTypeAccess().getDateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDate();

                    state._fsp--;

                     after(grammarAccess.getSuperTypeAccess().getDateParserRuleCall_3()); 

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
    // InternalSmallUML.g:360:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:364:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSmallUML.g:365:2: ( RULE_STRING )
                    {
                    // InternalSmallUML.g:365:2: ( RULE_STRING )
                    // InternalSmallUML.g:366:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSmallUML.g:371:2: ( RULE_ID )
                    {
                    // InternalSmallUML.g:371:2: ( RULE_ID )
                    // InternalSmallUML.g:372:3: RULE_ID
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


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalSmallUML.g:381:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:385:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalSmallUML.g:386:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:393:1: rule__Attribute__Group__0__Impl : ( 'Attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:397:1: ( ( 'Attribute' ) )
            // InternalSmallUML.g:398:1: ( 'Attribute' )
            {
            // InternalSmallUML.g:398:1: ( 'Attribute' )
            // InternalSmallUML.g:399:2: 'Attribute'
            {
             before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalSmallUML.g:408:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:412:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalSmallUML.g:413:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:420:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:424:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // InternalSmallUML.g:425:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:425:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // InternalSmallUML.g:426:2: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:427:2: ( rule__Attribute__NameAssignment_1 )
            // InternalSmallUML.g:427:3: rule__Attribute__NameAssignment_1
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
    // InternalSmallUML.g:435:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:439:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalSmallUML.g:440:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalSmallUML.g:447:1: rule__Attribute__Group__2__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:451:1: ( ( '{' ) )
            // InternalSmallUML.g:452:1: ( '{' )
            {
            // InternalSmallUML.g:452:1: ( '{' )
            // InternalSmallUML.g:453:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSmallUML.g:462:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:466:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalSmallUML.g:467:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

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
    // InternalSmallUML.g:474:1: rule__Attribute__Group__3__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:478:1: ( ( 'type' ) )
            // InternalSmallUML.g:479:1: ( 'type' )
            {
            // InternalSmallUML.g:479:1: ( 'type' )
            // InternalSmallUML.g:480:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_3()); 

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


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalSmallUML.g:489:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:493:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalSmallUML.g:494:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalSmallUML.g:501:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:505:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // InternalSmallUML.g:506:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // InternalSmallUML.g:506:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // InternalSmallUML.g:507:2: ( rule__Attribute__TypeAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            // InternalSmallUML.g:508:2: ( rule__Attribute__TypeAssignment_4 )
            // InternalSmallUML.g:508:3: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalSmallUML.g:516:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:520:1: ( rule__Attribute__Group__5__Impl )
            // InternalSmallUML.g:521:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalSmallUML.g:527:1: rule__Attribute__Group__5__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:531:1: ( ( '}' ) )
            // InternalSmallUML.g:532:1: ( '}' )
            {
            // InternalSmallUML.g:532:1: ( '}' )
            // InternalSmallUML.g:533:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Role__Group__0"
    // InternalSmallUML.g:543:1: rule__Role__Group__0 : rule__Role__Group__0__Impl rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:547:1: ( rule__Role__Group__0__Impl rule__Role__Group__1 )
            // InternalSmallUML.g:548:2: rule__Role__Group__0__Impl rule__Role__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:555:1: rule__Role__Group__0__Impl : ( 'Role' ) ;
    public final void rule__Role__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:559:1: ( ( 'Role' ) )
            // InternalSmallUML.g:560:1: ( 'Role' )
            {
            // InternalSmallUML.g:560:1: ( 'Role' )
            // InternalSmallUML.g:561:2: 'Role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalSmallUML.g:570:1: rule__Role__Group__1 : rule__Role__Group__1__Impl rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:574:1: ( rule__Role__Group__1__Impl rule__Role__Group__2 )
            // InternalSmallUML.g:575:2: rule__Role__Group__1__Impl rule__Role__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:582:1: rule__Role__Group__1__Impl : ( ( rule__Role__NameAssignment_1 ) ) ;
    public final void rule__Role__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:586:1: ( ( ( rule__Role__NameAssignment_1 ) ) )
            // InternalSmallUML.g:587:1: ( ( rule__Role__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:587:1: ( ( rule__Role__NameAssignment_1 ) )
            // InternalSmallUML.g:588:2: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:589:2: ( rule__Role__NameAssignment_1 )
            // InternalSmallUML.g:589:3: rule__Role__NameAssignment_1
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
    // InternalSmallUML.g:597:1: rule__Role__Group__2 : rule__Role__Group__2__Impl rule__Role__Group__3 ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:601:1: ( rule__Role__Group__2__Impl rule__Role__Group__3 )
            // InternalSmallUML.g:602:2: rule__Role__Group__2__Impl rule__Role__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalSmallUML.g:609:1: rule__Role__Group__2__Impl : ( '{' ) ;
    public final void rule__Role__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:613:1: ( ( '{' ) )
            // InternalSmallUML.g:614:1: ( '{' )
            {
            // InternalSmallUML.g:614:1: ( '{' )
            // InternalSmallUML.g:615:2: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // InternalSmallUML.g:624:1: rule__Role__Group__3 : rule__Role__Group__3__Impl rule__Role__Group__4 ;
    public final void rule__Role__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:628:1: ( rule__Role__Group__3__Impl rule__Role__Group__4 )
            // InternalSmallUML.g:629:2: rule__Role__Group__3__Impl rule__Role__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:636:1: rule__Role__Group__3__Impl : ( 'lowerBound' ) ;
    public final void rule__Role__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:640:1: ( ( 'lowerBound' ) )
            // InternalSmallUML.g:641:1: ( 'lowerBound' )
            {
            // InternalSmallUML.g:641:1: ( 'lowerBound' )
            // InternalSmallUML.g:642:2: 'lowerBound'
            {
             before(grammarAccess.getRoleAccess().getLowerBoundKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getLowerBoundKeyword_3()); 

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
    // InternalSmallUML.g:651:1: rule__Role__Group__4 : rule__Role__Group__4__Impl rule__Role__Group__5 ;
    public final void rule__Role__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:655:1: ( rule__Role__Group__4__Impl rule__Role__Group__5 )
            // InternalSmallUML.g:656:2: rule__Role__Group__4__Impl rule__Role__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalSmallUML.g:663:1: rule__Role__Group__4__Impl : ( ( rule__Role__LowerBoundAssignment_4 ) ) ;
    public final void rule__Role__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:667:1: ( ( ( rule__Role__LowerBoundAssignment_4 ) ) )
            // InternalSmallUML.g:668:1: ( ( rule__Role__LowerBoundAssignment_4 ) )
            {
            // InternalSmallUML.g:668:1: ( ( rule__Role__LowerBoundAssignment_4 ) )
            // InternalSmallUML.g:669:2: ( rule__Role__LowerBoundAssignment_4 )
            {
             before(grammarAccess.getRoleAccess().getLowerBoundAssignment_4()); 
            // InternalSmallUML.g:670:2: ( rule__Role__LowerBoundAssignment_4 )
            // InternalSmallUML.g:670:3: rule__Role__LowerBoundAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Role__LowerBoundAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getLowerBoundAssignment_4()); 

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
    // InternalSmallUML.g:678:1: rule__Role__Group__5 : rule__Role__Group__5__Impl rule__Role__Group__6 ;
    public final void rule__Role__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:682:1: ( rule__Role__Group__5__Impl rule__Role__Group__6 )
            // InternalSmallUML.g:683:2: rule__Role__Group__5__Impl rule__Role__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:690:1: rule__Role__Group__5__Impl : ( 'upperBound' ) ;
    public final void rule__Role__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:694:1: ( ( 'upperBound' ) )
            // InternalSmallUML.g:695:1: ( 'upperBound' )
            {
            // InternalSmallUML.g:695:1: ( 'upperBound' )
            // InternalSmallUML.g:696:2: 'upperBound'
            {
             before(grammarAccess.getRoleAccess().getUpperBoundKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getUpperBoundKeyword_5()); 

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
    // InternalSmallUML.g:705:1: rule__Role__Group__6 : rule__Role__Group__6__Impl rule__Role__Group__7 ;
    public final void rule__Role__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:709:1: ( rule__Role__Group__6__Impl rule__Role__Group__7 )
            // InternalSmallUML.g:710:2: rule__Role__Group__6__Impl rule__Role__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalSmallUML.g:717:1: rule__Role__Group__6__Impl : ( ( rule__Role__UpperBoundAssignment_6 ) ) ;
    public final void rule__Role__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:721:1: ( ( ( rule__Role__UpperBoundAssignment_6 ) ) )
            // InternalSmallUML.g:722:1: ( ( rule__Role__UpperBoundAssignment_6 ) )
            {
            // InternalSmallUML.g:722:1: ( ( rule__Role__UpperBoundAssignment_6 ) )
            // InternalSmallUML.g:723:2: ( rule__Role__UpperBoundAssignment_6 )
            {
             before(grammarAccess.getRoleAccess().getUpperBoundAssignment_6()); 
            // InternalSmallUML.g:724:2: ( rule__Role__UpperBoundAssignment_6 )
            // InternalSmallUML.g:724:3: rule__Role__UpperBoundAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Role__UpperBoundAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRoleAccess().getUpperBoundAssignment_6()); 

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
    // InternalSmallUML.g:732:1: rule__Role__Group__7 : rule__Role__Group__7__Impl ;
    public final void rule__Role__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:736:1: ( rule__Role__Group__7__Impl )
            // InternalSmallUML.g:737:2: rule__Role__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Role__Group__7__Impl();

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
    // InternalSmallUML.g:743:1: rule__Role__Group__7__Impl : ( '}' ) ;
    public final void rule__Role__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:747:1: ( ( '}' ) )
            // InternalSmallUML.g:748:1: ( '}' )
            {
            // InternalSmallUML.g:748:1: ( '}' )
            // InternalSmallUML.g:749:2: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_7()); 

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


    // $ANTLR start "rule__Operation__Group__0"
    // InternalSmallUML.g:759:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:763:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalSmallUML.g:764:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSmallUML.g:771:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__IsAbstractAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:775:1: ( ( ( rule__Operation__IsAbstractAssignment_0 ) ) )
            // InternalSmallUML.g:776:1: ( ( rule__Operation__IsAbstractAssignment_0 ) )
            {
            // InternalSmallUML.g:776:1: ( ( rule__Operation__IsAbstractAssignment_0 ) )
            // InternalSmallUML.g:777:2: ( rule__Operation__IsAbstractAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUML.g:778:2: ( rule__Operation__IsAbstractAssignment_0 )
            // InternalSmallUML.g:778:3: rule__Operation__IsAbstractAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__IsAbstractAssignment_0();

            state._fsp--;


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
    // InternalSmallUML.g:786:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:790:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalSmallUML.g:791:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:798:1: rule__Operation__Group__1__Impl : ( 'Operation' ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:802:1: ( ( 'Operation' ) )
            // InternalSmallUML.g:803:1: ( 'Operation' )
            {
            // InternalSmallUML.g:803:1: ( 'Operation' )
            // InternalSmallUML.g:804:2: 'Operation'
            {
             before(grammarAccess.getOperationAccess().getOperationKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSmallUML.g:813:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:817:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalSmallUML.g:818:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:825:1: rule__Operation__Group__2__Impl : ( ( rule__Operation__NameAssignment_2 ) ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:829:1: ( ( ( rule__Operation__NameAssignment_2 ) ) )
            // InternalSmallUML.g:830:1: ( ( rule__Operation__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:830:1: ( ( rule__Operation__NameAssignment_2 ) )
            // InternalSmallUML.g:831:2: ( rule__Operation__NameAssignment_2 )
            {
             before(grammarAccess.getOperationAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:832:2: ( rule__Operation__NameAssignment_2 )
            // InternalSmallUML.g:832:3: rule__Operation__NameAssignment_2
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
    // InternalSmallUML.g:840:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:844:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalSmallUML.g:845:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalSmallUML.g:852:1: rule__Operation__Group__3__Impl : ( '{' ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:856:1: ( ( '{' ) )
            // InternalSmallUML.g:857:1: ( '{' )
            {
            // InternalSmallUML.g:857:1: ( '{' )
            // InternalSmallUML.g:858:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSmallUML.g:867:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:871:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalSmallUML.g:872:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

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
    // InternalSmallUML.g:879:1: rule__Operation__Group__4__Impl : ( ( rule__Operation__Group_4__0 )? ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:883:1: ( ( ( rule__Operation__Group_4__0 )? ) )
            // InternalSmallUML.g:884:1: ( ( rule__Operation__Group_4__0 )? )
            {
            // InternalSmallUML.g:884:1: ( ( rule__Operation__Group_4__0 )? )
            // InternalSmallUML.g:885:2: ( rule__Operation__Group_4__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_4()); 
            // InternalSmallUML.g:886:2: ( rule__Operation__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSmallUML.g:886:3: rule__Operation__Group_4__0
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


    // $ANTLR start "rule__Operation__Group__5"
    // InternalSmallUML.g:894:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:898:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalSmallUML.g:899:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

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
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalSmallUML.g:906:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Group_5__0 )? ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:910:1: ( ( ( rule__Operation__Group_5__0 )? ) )
            // InternalSmallUML.g:911:1: ( ( rule__Operation__Group_5__0 )? )
            {
            // InternalSmallUML.g:911:1: ( ( rule__Operation__Group_5__0 )? )
            // InternalSmallUML.g:912:2: ( rule__Operation__Group_5__0 )?
            {
             before(grammarAccess.getOperationAccess().getGroup_5()); 
            // InternalSmallUML.g:913:2: ( rule__Operation__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSmallUML.g:913:3: rule__Operation__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalSmallUML.g:921:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:925:1: ( rule__Operation__Group__6__Impl )
            // InternalSmallUML.g:926:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

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
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalSmallUML.g:932:1: rule__Operation__Group__6__Impl : ( '}' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:936:1: ( ( '}' ) )
            // InternalSmallUML.g:937:1: ( '}' )
            {
            // InternalSmallUML.g:937:1: ( '}' )
            // InternalSmallUML.g:938:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_4__0"
    // InternalSmallUML.g:948:1: rule__Operation__Group_4__0 : rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 ;
    public final void rule__Operation__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:952:1: ( rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1 )
            // InternalSmallUML.g:953:2: rule__Operation__Group_4__0__Impl rule__Operation__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:960:1: rule__Operation__Group_4__0__Impl : ( 'returnType' ) ;
    public final void rule__Operation__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:964:1: ( ( 'returnType' ) )
            // InternalSmallUML.g:965:1: ( 'returnType' )
            {
            // InternalSmallUML.g:965:1: ( 'returnType' )
            // InternalSmallUML.g:966:2: 'returnType'
            {
             before(grammarAccess.getOperationAccess().getReturnTypeKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getReturnTypeKeyword_4_0()); 

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
    // InternalSmallUML.g:975:1: rule__Operation__Group_4__1 : rule__Operation__Group_4__1__Impl ;
    public final void rule__Operation__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:979:1: ( rule__Operation__Group_4__1__Impl )
            // InternalSmallUML.g:980:2: rule__Operation__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_4__1__Impl();

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
    // InternalSmallUML.g:986:1: rule__Operation__Group_4__1__Impl : ( ( rule__Operation__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__Operation__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:990:1: ( ( ( rule__Operation__ReturnTypeAssignment_4_1 ) ) )
            // InternalSmallUML.g:991:1: ( ( rule__Operation__ReturnTypeAssignment_4_1 ) )
            {
            // InternalSmallUML.g:991:1: ( ( rule__Operation__ReturnTypeAssignment_4_1 ) )
            // InternalSmallUML.g:992:2: ( rule__Operation__ReturnTypeAssignment_4_1 )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeAssignment_4_1()); 
            // InternalSmallUML.g:993:2: ( rule__Operation__ReturnTypeAssignment_4_1 )
            // InternalSmallUML.g:993:3: rule__Operation__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ReturnTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getReturnTypeAssignment_4_1()); 

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


    // $ANTLR start "rule__Operation__Group_5__0"
    // InternalSmallUML.g:1002:1: rule__Operation__Group_5__0 : rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 ;
    public final void rule__Operation__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1006:1: ( rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1 )
            // InternalSmallUML.g:1007:2: rule__Operation__Group_5__0__Impl rule__Operation__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__1();

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
    // $ANTLR end "rule__Operation__Group_5__0"


    // $ANTLR start "rule__Operation__Group_5__0__Impl"
    // InternalSmallUML.g:1014:1: rule__Operation__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__Operation__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1018:1: ( ( 'parameters' ) )
            // InternalSmallUML.g:1019:1: ( 'parameters' )
            {
            // InternalSmallUML.g:1019:1: ( 'parameters' )
            // InternalSmallUML.g:1020:2: 'parameters'
            {
             before(grammarAccess.getOperationAccess().getParametersKeyword_5_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getParametersKeyword_5_0()); 

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
    // $ANTLR end "rule__Operation__Group_5__0__Impl"


    // $ANTLR start "rule__Operation__Group_5__1"
    // InternalSmallUML.g:1029:1: rule__Operation__Group_5__1 : rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 ;
    public final void rule__Operation__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1033:1: ( rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2 )
            // InternalSmallUML.g:1034:2: rule__Operation__Group_5__1__Impl rule__Operation__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Operation__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__2();

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
    // $ANTLR end "rule__Operation__Group_5__1"


    // $ANTLR start "rule__Operation__Group_5__1__Impl"
    // InternalSmallUML.g:1041:1: rule__Operation__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Operation__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1045:1: ( ( '{' ) )
            // InternalSmallUML.g:1046:1: ( '{' )
            {
            // InternalSmallUML.g:1046:1: ( '{' )
            // InternalSmallUML.g:1047:2: '{'
            {
             before(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Operation__Group_5__1__Impl"


    // $ANTLR start "rule__Operation__Group_5__2"
    // InternalSmallUML.g:1056:1: rule__Operation__Group_5__2 : rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 ;
    public final void rule__Operation__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1060:1: ( rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3 )
            // InternalSmallUML.g:1061:2: rule__Operation__Group_5__2__Impl rule__Operation__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__3();

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
    // $ANTLR end "rule__Operation__Group_5__2"


    // $ANTLR start "rule__Operation__Group_5__2__Impl"
    // InternalSmallUML.g:1068:1: rule__Operation__Group_5__2__Impl : ( ( rule__Operation__ParametersAssignment_5_2 ) ) ;
    public final void rule__Operation__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1072:1: ( ( ( rule__Operation__ParametersAssignment_5_2 ) ) )
            // InternalSmallUML.g:1073:1: ( ( rule__Operation__ParametersAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1073:1: ( ( rule__Operation__ParametersAssignment_5_2 ) )
            // InternalSmallUML.g:1074:2: ( rule__Operation__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_5_2()); 
            // InternalSmallUML.g:1075:2: ( rule__Operation__ParametersAssignment_5_2 )
            // InternalSmallUML.g:1075:3: rule__Operation__ParametersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_5_2()); 

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
    // $ANTLR end "rule__Operation__Group_5__2__Impl"


    // $ANTLR start "rule__Operation__Group_5__3"
    // InternalSmallUML.g:1083:1: rule__Operation__Group_5__3 : rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4 ;
    public final void rule__Operation__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1087:1: ( rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4 )
            // InternalSmallUML.g:1088:2: rule__Operation__Group_5__3__Impl rule__Operation__Group_5__4
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__4();

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
    // $ANTLR end "rule__Operation__Group_5__3"


    // $ANTLR start "rule__Operation__Group_5__3__Impl"
    // InternalSmallUML.g:1095:1: rule__Operation__Group_5__3__Impl : ( ( rule__Operation__Group_5_3__0 )* ) ;
    public final void rule__Operation__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1099:1: ( ( ( rule__Operation__Group_5_3__0 )* ) )
            // InternalSmallUML.g:1100:1: ( ( rule__Operation__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:1100:1: ( ( rule__Operation__Group_5_3__0 )* )
            // InternalSmallUML.g:1101:2: ( rule__Operation__Group_5_3__0 )*
            {
             before(grammarAccess.getOperationAccess().getGroup_5_3()); 
            // InternalSmallUML.g:1102:2: ( rule__Operation__Group_5_3__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSmallUML.g:1102:3: rule__Operation__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Operation__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Operation__Group_5__3__Impl"


    // $ANTLR start "rule__Operation__Group_5__4"
    // InternalSmallUML.g:1110:1: rule__Operation__Group_5__4 : rule__Operation__Group_5__4__Impl ;
    public final void rule__Operation__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1114:1: ( rule__Operation__Group_5__4__Impl )
            // InternalSmallUML.g:1115:2: rule__Operation__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5__4__Impl();

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
    // $ANTLR end "rule__Operation__Group_5__4"


    // $ANTLR start "rule__Operation__Group_5__4__Impl"
    // InternalSmallUML.g:1121:1: rule__Operation__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Operation__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1125:1: ( ( '}' ) )
            // InternalSmallUML.g:1126:1: ( '}' )
            {
            // InternalSmallUML.g:1126:1: ( '}' )
            // InternalSmallUML.g:1127:2: '}'
            {
             before(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Operation__Group_5__4__Impl"


    // $ANTLR start "rule__Operation__Group_5_3__0"
    // InternalSmallUML.g:1137:1: rule__Operation__Group_5_3__0 : rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 ;
    public final void rule__Operation__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1141:1: ( rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1 )
            // InternalSmallUML.g:1142:2: rule__Operation__Group_5_3__0__Impl rule__Operation__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Operation__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group_5_3__1();

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
    // $ANTLR end "rule__Operation__Group_5_3__0"


    // $ANTLR start "rule__Operation__Group_5_3__0__Impl"
    // InternalSmallUML.g:1149:1: rule__Operation__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Operation__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1153:1: ( ( ',' ) )
            // InternalSmallUML.g:1154:1: ( ',' )
            {
            // InternalSmallUML.g:1154:1: ( ',' )
            // InternalSmallUML.g:1155:2: ','
            {
             before(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Operation__Group_5_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_5_3__1"
    // InternalSmallUML.g:1164:1: rule__Operation__Group_5_3__1 : rule__Operation__Group_5_3__1__Impl ;
    public final void rule__Operation__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1168:1: ( rule__Operation__Group_5_3__1__Impl )
            // InternalSmallUML.g:1169:2: rule__Operation__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_5_3__1"


    // $ANTLR start "rule__Operation__Group_5_3__1__Impl"
    // InternalSmallUML.g:1175:1: rule__Operation__Group_5_3__1__Impl : ( ( rule__Operation__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__Operation__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1179:1: ( ( ( rule__Operation__ParametersAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:1180:1: ( ( rule__Operation__ParametersAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:1180:1: ( ( rule__Operation__ParametersAssignment_5_3_1 ) )
            // InternalSmallUML.g:1181:2: ( rule__Operation__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getOperationAccess().getParametersAssignment_5_3_1()); 
            // InternalSmallUML.g:1182:2: ( rule__Operation__ParametersAssignment_5_3_1 )
            // InternalSmallUML.g:1182:3: rule__Operation__ParametersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ParametersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getParametersAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Operation__Group_5_3__1__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalSmallUML.g:1191:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1195:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalSmallUML.g:1196:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1203:1: rule__Parameter__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1207:1: ( ( 'Parameter' ) )
            // InternalSmallUML.g:1208:1: ( 'Parameter' )
            {
            // InternalSmallUML.g:1208:1: ( 'Parameter' )
            // InternalSmallUML.g:1209:2: 'Parameter'
            {
             before(grammarAccess.getParameterAccess().getParameterKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getParameterKeyword_0()); 

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
    // InternalSmallUML.g:1218:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1222:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalSmallUML.g:1223:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1230:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1234:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalSmallUML.g:1235:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalSmallUML.g:1235:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalSmallUML.g:1236:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalSmallUML.g:1237:2: ( rule__Parameter__NameAssignment_1 )
            // InternalSmallUML.g:1237:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

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
    // InternalSmallUML.g:1245:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1249:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalSmallUML.g:1250:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

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
    // InternalSmallUML.g:1257:1: rule__Parameter__Group__2__Impl : ( '{' ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1261:1: ( ( '{' ) )
            // InternalSmallUML.g:1262:1: ( '{' )
            {
            // InternalSmallUML.g:1262:1: ( '{' )
            // InternalSmallUML.g:1263:2: '{'
            {
             before(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2()); 

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


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalSmallUML.g:1272:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1276:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalSmallUML.g:1277:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

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
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalSmallUML.g:1284:1: rule__Parameter__Group__3__Impl : ( 'type' ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1288:1: ( ( 'type' ) )
            // InternalSmallUML.g:1289:1: ( 'type' )
            {
            // InternalSmallUML.g:1289:1: ( 'type' )
            // InternalSmallUML.g:1290:2: 'type'
            {
             before(grammarAccess.getParameterAccess().getTypeKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getTypeKeyword_3()); 

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
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalSmallUML.g:1299:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1303:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalSmallUML.g:1304:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

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
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalSmallUML.g:1311:1: rule__Parameter__Group__4__Impl : ( ( rule__Parameter__TypeAssignment_4 ) ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1315:1: ( ( ( rule__Parameter__TypeAssignment_4 ) ) )
            // InternalSmallUML.g:1316:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            {
            // InternalSmallUML.g:1316:1: ( ( rule__Parameter__TypeAssignment_4 ) )
            // InternalSmallUML.g:1317:2: ( rule__Parameter__TypeAssignment_4 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_4()); 
            // InternalSmallUML.g:1318:2: ( rule__Parameter__TypeAssignment_4 )
            // InternalSmallUML.g:1318:3: rule__Parameter__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_4()); 

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
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalSmallUML.g:1326:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1330:1: ( rule__Parameter__Group__5__Impl )
            // InternalSmallUML.g:1331:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

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
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalSmallUML.g:1337:1: rule__Parameter__Group__5__Impl : ( '}' ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1341:1: ( ( '}' ) )
            // InternalSmallUML.g:1342:1: ( '}' )
            {
            // InternalSmallUML.g:1342:1: ( '}' )
            // InternalSmallUML.g:1343:2: '}'
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // InternalSmallUML.g:1353:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1357:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // InternalSmallUML.g:1358:2: rule__Class__Group__0__Impl rule__Class__Group__1
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
    // InternalSmallUML.g:1365:1: rule__Class__Group__0__Impl : ( ( rule__Class__IsAbstractAssignment_0 ) ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1369:1: ( ( ( rule__Class__IsAbstractAssignment_0 ) ) )
            // InternalSmallUML.g:1370:1: ( ( rule__Class__IsAbstractAssignment_0 ) )
            {
            // InternalSmallUML.g:1370:1: ( ( rule__Class__IsAbstractAssignment_0 ) )
            // InternalSmallUML.g:1371:2: ( rule__Class__IsAbstractAssignment_0 )
            {
             before(grammarAccess.getClassAccess().getIsAbstractAssignment_0()); 
            // InternalSmallUML.g:1372:2: ( rule__Class__IsAbstractAssignment_0 )
            // InternalSmallUML.g:1372:3: rule__Class__IsAbstractAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Class__IsAbstractAssignment_0();

            state._fsp--;


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
    // InternalSmallUML.g:1380:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1384:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // InternalSmallUML.g:1385:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalSmallUML.g:1392:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1396:1: ( ( 'Class' ) )
            // InternalSmallUML.g:1397:1: ( 'Class' )
            {
            // InternalSmallUML.g:1397:1: ( 'Class' )
            // InternalSmallUML.g:1398:2: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSmallUML.g:1407:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1411:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // InternalSmallUML.g:1412:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1419:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1423:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // InternalSmallUML.g:1424:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:1424:1: ( ( rule__Class__NameAssignment_2 ) )
            // InternalSmallUML.g:1425:2: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:1426:2: ( rule__Class__NameAssignment_2 )
            // InternalSmallUML.g:1426:3: rule__Class__NameAssignment_2
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
    // InternalSmallUML.g:1434:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1438:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // InternalSmallUML.g:1439:2: rule__Class__Group__3__Impl rule__Class__Group__4
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
    // InternalSmallUML.g:1446:1: rule__Class__Group__3__Impl : ( '{' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1450:1: ( ( '{' ) )
            // InternalSmallUML.g:1451:1: ( '{' )
            {
            // InternalSmallUML.g:1451:1: ( '{' )
            // InternalSmallUML.g:1452:2: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3()); 

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
    // InternalSmallUML.g:1461:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1465:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // InternalSmallUML.g:1466:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1473:1: rule__Class__Group__4__Impl : ( ( rule__Class__Group_4__0 )? ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1477:1: ( ( ( rule__Class__Group_4__0 )? ) )
            // InternalSmallUML.g:1478:1: ( ( rule__Class__Group_4__0 )? )
            {
            // InternalSmallUML.g:1478:1: ( ( rule__Class__Group_4__0 )? )
            // InternalSmallUML.g:1479:2: ( rule__Class__Group_4__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_4()); 
            // InternalSmallUML.g:1480:2: ( rule__Class__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSmallUML.g:1480:3: rule__Class__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Class__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getGroup_4()); 

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
    // InternalSmallUML.g:1488:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1492:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // InternalSmallUML.g:1493:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1500:1: rule__Class__Group__5__Impl : ( ( rule__Class__Group_5__0 )? ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1504:1: ( ( ( rule__Class__Group_5__0 )? ) )
            // InternalSmallUML.g:1505:1: ( ( rule__Class__Group_5__0 )? )
            {
            // InternalSmallUML.g:1505:1: ( ( rule__Class__Group_5__0 )? )
            // InternalSmallUML.g:1506:2: ( rule__Class__Group_5__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_5()); 
            // InternalSmallUML.g:1507:2: ( rule__Class__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSmallUML.g:1507:3: rule__Class__Group_5__0
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
    // InternalSmallUML.g:1515:1: rule__Class__Group__6 : rule__Class__Group__6__Impl rule__Class__Group__7 ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1519:1: ( rule__Class__Group__6__Impl rule__Class__Group__7 )
            // InternalSmallUML.g:1520:2: rule__Class__Group__6__Impl rule__Class__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalSmallUML.g:1527:1: rule__Class__Group__6__Impl : ( ( rule__Class__Group_6__0 )? ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1531:1: ( ( ( rule__Class__Group_6__0 )? ) )
            // InternalSmallUML.g:1532:1: ( ( rule__Class__Group_6__0 )? )
            {
            // InternalSmallUML.g:1532:1: ( ( rule__Class__Group_6__0 )? )
            // InternalSmallUML.g:1533:2: ( rule__Class__Group_6__0 )?
            {
             before(grammarAccess.getClassAccess().getGroup_6()); 
            // InternalSmallUML.g:1534:2: ( rule__Class__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSmallUML.g:1534:3: rule__Class__Group_6__0
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
    // InternalSmallUML.g:1542:1: rule__Class__Group__7 : rule__Class__Group__7__Impl ;
    public final void rule__Class__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1546:1: ( rule__Class__Group__7__Impl )
            // InternalSmallUML.g:1547:2: rule__Class__Group__7__Impl
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
    // InternalSmallUML.g:1553:1: rule__Class__Group__7__Impl : ( '}' ) ;
    public final void rule__Class__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1557:1: ( ( '}' ) )
            // InternalSmallUML.g:1558:1: ( '}' )
            {
            // InternalSmallUML.g:1558:1: ( '}' )
            // InternalSmallUML.g:1559:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7()); 
            match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__Class__Group_4__0"
    // InternalSmallUML.g:1569:1: rule__Class__Group_4__0 : rule__Class__Group_4__0__Impl rule__Class__Group_4__1 ;
    public final void rule__Class__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1573:1: ( rule__Class__Group_4__0__Impl rule__Class__Group_4__1 )
            // InternalSmallUML.g:1574:2: rule__Class__Group_4__0__Impl rule__Class__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Class__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1();

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
    // $ANTLR end "rule__Class__Group_4__0"


    // $ANTLR start "rule__Class__Group_4__0__Impl"
    // InternalSmallUML.g:1581:1: rule__Class__Group_4__0__Impl : ( 'super' ) ;
    public final void rule__Class__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1585:1: ( ( 'super' ) )
            // InternalSmallUML.g:1586:1: ( 'super' )
            {
            // InternalSmallUML.g:1586:1: ( 'super' )
            // InternalSmallUML.g:1587:2: 'super'
            {
             before(grammarAccess.getClassAccess().getSuperKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getSuperKeyword_4_0()); 

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
    // $ANTLR end "rule__Class__Group_4__0__Impl"


    // $ANTLR start "rule__Class__Group_4__1"
    // InternalSmallUML.g:1596:1: rule__Class__Group_4__1 : rule__Class__Group_4__1__Impl ;
    public final void rule__Class__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1600:1: ( rule__Class__Group_4__1__Impl )
            // InternalSmallUML.g:1601:2: rule__Class__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Class__Group_4__1__Impl();

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
    // $ANTLR end "rule__Class__Group_4__1"


    // $ANTLR start "rule__Class__Group_4__1__Impl"
    // InternalSmallUML.g:1607:1: rule__Class__Group_4__1__Impl : ( ( rule__Class__SuperAssignment_4_1 ) ) ;
    public final void rule__Class__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1611:1: ( ( ( rule__Class__SuperAssignment_4_1 ) ) )
            // InternalSmallUML.g:1612:1: ( ( rule__Class__SuperAssignment_4_1 ) )
            {
            // InternalSmallUML.g:1612:1: ( ( rule__Class__SuperAssignment_4_1 ) )
            // InternalSmallUML.g:1613:2: ( rule__Class__SuperAssignment_4_1 )
            {
             before(grammarAccess.getClassAccess().getSuperAssignment_4_1()); 
            // InternalSmallUML.g:1614:2: ( rule__Class__SuperAssignment_4_1 )
            // InternalSmallUML.g:1614:3: rule__Class__SuperAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Class__SuperAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getSuperAssignment_4_1()); 

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
    // $ANTLR end "rule__Class__Group_4__1__Impl"


    // $ANTLR start "rule__Class__Group_5__0"
    // InternalSmallUML.g:1623:1: rule__Class__Group_5__0 : rule__Class__Group_5__0__Impl rule__Class__Group_5__1 ;
    public final void rule__Class__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1627:1: ( rule__Class__Group_5__0__Impl rule__Class__Group_5__1 )
            // InternalSmallUML.g:1628:2: rule__Class__Group_5__0__Impl rule__Class__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1635:1: rule__Class__Group_5__0__Impl : ( 'attribute' ) ;
    public final void rule__Class__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1639:1: ( ( 'attribute' ) )
            // InternalSmallUML.g:1640:1: ( 'attribute' )
            {
            // InternalSmallUML.g:1640:1: ( 'attribute' )
            // InternalSmallUML.g:1641:2: 'attribute'
            {
             before(grammarAccess.getClassAccess().getAttributeKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getAttributeKeyword_5_0()); 

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
    // InternalSmallUML.g:1650:1: rule__Class__Group_5__1 : rule__Class__Group_5__1__Impl rule__Class__Group_5__2 ;
    public final void rule__Class__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1654:1: ( rule__Class__Group_5__1__Impl rule__Class__Group_5__2 )
            // InternalSmallUML.g:1655:2: rule__Class__Group_5__1__Impl rule__Class__Group_5__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:1662:1: rule__Class__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1666:1: ( ( '{' ) )
            // InternalSmallUML.g:1667:1: ( '{' )
            {
            // InternalSmallUML.g:1667:1: ( '{' )
            // InternalSmallUML.g:1668:2: '{'
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
    // InternalSmallUML.g:1677:1: rule__Class__Group_5__2 : rule__Class__Group_5__2__Impl rule__Class__Group_5__3 ;
    public final void rule__Class__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1681:1: ( rule__Class__Group_5__2__Impl rule__Class__Group_5__3 )
            // InternalSmallUML.g:1682:2: rule__Class__Group_5__2__Impl rule__Class__Group_5__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1689:1: rule__Class__Group_5__2__Impl : ( ( rule__Class__AttributeAssignment_5_2 ) ) ;
    public final void rule__Class__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1693:1: ( ( ( rule__Class__AttributeAssignment_5_2 ) ) )
            // InternalSmallUML.g:1694:1: ( ( rule__Class__AttributeAssignment_5_2 ) )
            {
            // InternalSmallUML.g:1694:1: ( ( rule__Class__AttributeAssignment_5_2 ) )
            // InternalSmallUML.g:1695:2: ( rule__Class__AttributeAssignment_5_2 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_5_2()); 
            // InternalSmallUML.g:1696:2: ( rule__Class__AttributeAssignment_5_2 )
            // InternalSmallUML.g:1696:3: rule__Class__AttributeAssignment_5_2
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
    // InternalSmallUML.g:1704:1: rule__Class__Group_5__3 : rule__Class__Group_5__3__Impl rule__Class__Group_5__4 ;
    public final void rule__Class__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1708:1: ( rule__Class__Group_5__3__Impl rule__Class__Group_5__4 )
            // InternalSmallUML.g:1709:2: rule__Class__Group_5__3__Impl rule__Class__Group_5__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1716:1: rule__Class__Group_5__3__Impl : ( ( rule__Class__Group_5_3__0 )* ) ;
    public final void rule__Class__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1720:1: ( ( ( rule__Class__Group_5_3__0 )* ) )
            // InternalSmallUML.g:1721:1: ( ( rule__Class__Group_5_3__0 )* )
            {
            // InternalSmallUML.g:1721:1: ( ( rule__Class__Group_5_3__0 )* )
            // InternalSmallUML.g:1722:2: ( rule__Class__Group_5_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_5_3()); 
            // InternalSmallUML.g:1723:2: ( rule__Class__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSmallUML.g:1723:3: rule__Class__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSmallUML.g:1731:1: rule__Class__Group_5__4 : rule__Class__Group_5__4__Impl ;
    public final void rule__Class__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1735:1: ( rule__Class__Group_5__4__Impl )
            // InternalSmallUML.g:1736:2: rule__Class__Group_5__4__Impl
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
    // InternalSmallUML.g:1742:1: rule__Class__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1746:1: ( ( '}' ) )
            // InternalSmallUML.g:1747:1: ( '}' )
            {
            // InternalSmallUML.g:1747:1: ( '}' )
            // InternalSmallUML.g:1748:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSmallUML.g:1758:1: rule__Class__Group_5_3__0 : rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 ;
    public final void rule__Class__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1762:1: ( rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1 )
            // InternalSmallUML.g:1763:2: rule__Class__Group_5_3__0__Impl rule__Class__Group_5_3__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSmallUML.g:1770:1: rule__Class__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1774:1: ( ( ',' ) )
            // InternalSmallUML.g:1775:1: ( ',' )
            {
            // InternalSmallUML.g:1775:1: ( ',' )
            // InternalSmallUML.g:1776:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_5_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1785:1: rule__Class__Group_5_3__1 : rule__Class__Group_5_3__1__Impl ;
    public final void rule__Class__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1789:1: ( rule__Class__Group_5_3__1__Impl )
            // InternalSmallUML.g:1790:2: rule__Class__Group_5_3__1__Impl
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
    // InternalSmallUML.g:1796:1: rule__Class__Group_5_3__1__Impl : ( ( rule__Class__AttributeAssignment_5_3_1 ) ) ;
    public final void rule__Class__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1800:1: ( ( ( rule__Class__AttributeAssignment_5_3_1 ) ) )
            // InternalSmallUML.g:1801:1: ( ( rule__Class__AttributeAssignment_5_3_1 ) )
            {
            // InternalSmallUML.g:1801:1: ( ( rule__Class__AttributeAssignment_5_3_1 ) )
            // InternalSmallUML.g:1802:2: ( rule__Class__AttributeAssignment_5_3_1 )
            {
             before(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1()); 
            // InternalSmallUML.g:1803:2: ( rule__Class__AttributeAssignment_5_3_1 )
            // InternalSmallUML.g:1803:3: rule__Class__AttributeAssignment_5_3_1
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
    // InternalSmallUML.g:1812:1: rule__Class__Group_6__0 : rule__Class__Group_6__0__Impl rule__Class__Group_6__1 ;
    public final void rule__Class__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1816:1: ( rule__Class__Group_6__0__Impl rule__Class__Group_6__1 )
            // InternalSmallUML.g:1817:2: rule__Class__Group_6__0__Impl rule__Class__Group_6__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSmallUML.g:1824:1: rule__Class__Group_6__0__Impl : ( 'operation' ) ;
    public final void rule__Class__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1828:1: ( ( 'operation' ) )
            // InternalSmallUML.g:1829:1: ( 'operation' )
            {
            // InternalSmallUML.g:1829:1: ( 'operation' )
            // InternalSmallUML.g:1830:2: 'operation'
            {
             before(grammarAccess.getClassAccess().getOperationKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getOperationKeyword_6_0()); 

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
    // InternalSmallUML.g:1839:1: rule__Class__Group_6__1 : rule__Class__Group_6__1__Impl rule__Class__Group_6__2 ;
    public final void rule__Class__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1843:1: ( rule__Class__Group_6__1__Impl rule__Class__Group_6__2 )
            // InternalSmallUML.g:1844:2: rule__Class__Group_6__1__Impl rule__Class__Group_6__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1851:1: rule__Class__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Class__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1855:1: ( ( '{' ) )
            // InternalSmallUML.g:1856:1: ( '{' )
            {
            // InternalSmallUML.g:1856:1: ( '{' )
            // InternalSmallUML.g:1857:2: '{'
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
    // InternalSmallUML.g:1866:1: rule__Class__Group_6__2 : rule__Class__Group_6__2__Impl rule__Class__Group_6__3 ;
    public final void rule__Class__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1870:1: ( rule__Class__Group_6__2__Impl rule__Class__Group_6__3 )
            // InternalSmallUML.g:1871:2: rule__Class__Group_6__2__Impl rule__Class__Group_6__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1878:1: rule__Class__Group_6__2__Impl : ( ( rule__Class__OperationAssignment_6_2 ) ) ;
    public final void rule__Class__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1882:1: ( ( ( rule__Class__OperationAssignment_6_2 ) ) )
            // InternalSmallUML.g:1883:1: ( ( rule__Class__OperationAssignment_6_2 ) )
            {
            // InternalSmallUML.g:1883:1: ( ( rule__Class__OperationAssignment_6_2 ) )
            // InternalSmallUML.g:1884:2: ( rule__Class__OperationAssignment_6_2 )
            {
             before(grammarAccess.getClassAccess().getOperationAssignment_6_2()); 
            // InternalSmallUML.g:1885:2: ( rule__Class__OperationAssignment_6_2 )
            // InternalSmallUML.g:1885:3: rule__Class__OperationAssignment_6_2
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
    // InternalSmallUML.g:1893:1: rule__Class__Group_6__3 : rule__Class__Group_6__3__Impl rule__Class__Group_6__4 ;
    public final void rule__Class__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1897:1: ( rule__Class__Group_6__3__Impl rule__Class__Group_6__4 )
            // InternalSmallUML.g:1898:2: rule__Class__Group_6__3__Impl rule__Class__Group_6__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalSmallUML.g:1905:1: rule__Class__Group_6__3__Impl : ( ( rule__Class__Group_6_3__0 )* ) ;
    public final void rule__Class__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1909:1: ( ( ( rule__Class__Group_6_3__0 )* ) )
            // InternalSmallUML.g:1910:1: ( ( rule__Class__Group_6_3__0 )* )
            {
            // InternalSmallUML.g:1910:1: ( ( rule__Class__Group_6_3__0 )* )
            // InternalSmallUML.g:1911:2: ( rule__Class__Group_6_3__0 )*
            {
             before(grammarAccess.getClassAccess().getGroup_6_3()); 
            // InternalSmallUML.g:1912:2: ( rule__Class__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSmallUML.g:1912:3: rule__Class__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Class__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalSmallUML.g:1920:1: rule__Class__Group_6__4 : rule__Class__Group_6__4__Impl ;
    public final void rule__Class__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1924:1: ( rule__Class__Group_6__4__Impl )
            // InternalSmallUML.g:1925:2: rule__Class__Group_6__4__Impl
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
    // InternalSmallUML.g:1931:1: rule__Class__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Class__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1935:1: ( ( '}' ) )
            // InternalSmallUML.g:1936:1: ( '}' )
            {
            // InternalSmallUML.g:1936:1: ( '}' )
            // InternalSmallUML.g:1937:2: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalSmallUML.g:1947:1: rule__Class__Group_6_3__0 : rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 ;
    public final void rule__Class__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1951:1: ( rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1 )
            // InternalSmallUML.g:1952:2: rule__Class__Group_6_3__0__Impl rule__Class__Group_6_3__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSmallUML.g:1959:1: rule__Class__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Class__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1963:1: ( ( ',' ) )
            // InternalSmallUML.g:1964:1: ( ',' )
            {
            // InternalSmallUML.g:1964:1: ( ',' )
            // InternalSmallUML.g:1965:2: ','
            {
             before(grammarAccess.getClassAccess().getCommaKeyword_6_3_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSmallUML.g:1974:1: rule__Class__Group_6_3__1 : rule__Class__Group_6_3__1__Impl ;
    public final void rule__Class__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1978:1: ( rule__Class__Group_6_3__1__Impl )
            // InternalSmallUML.g:1979:2: rule__Class__Group_6_3__1__Impl
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
    // InternalSmallUML.g:1985:1: rule__Class__Group_6_3__1__Impl : ( ( rule__Class__OperationAssignment_6_3_1 ) ) ;
    public final void rule__Class__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:1989:1: ( ( ( rule__Class__OperationAssignment_6_3_1 ) ) )
            // InternalSmallUML.g:1990:1: ( ( rule__Class__OperationAssignment_6_3_1 ) )
            {
            // InternalSmallUML.g:1990:1: ( ( rule__Class__OperationAssignment_6_3_1 ) )
            // InternalSmallUML.g:1991:2: ( rule__Class__OperationAssignment_6_3_1 )
            {
             before(grammarAccess.getClassAccess().getOperationAssignment_6_3_1()); 
            // InternalSmallUML.g:1992:2: ( rule__Class__OperationAssignment_6_3_1 )
            // InternalSmallUML.g:1992:3: rule__Class__OperationAssignment_6_3_1
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


    // $ANTLR start "rule__Integer__Group__0"
    // InternalSmallUML.g:2001:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2005:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalSmallUML.g:2006:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__1();

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
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalSmallUML.g:2013:1: rule__Integer__Group__0__Impl : ( () ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2017:1: ( ( () ) )
            // InternalSmallUML.g:2018:1: ( () )
            {
            // InternalSmallUML.g:2018:1: ( () )
            // InternalSmallUML.g:2019:2: ()
            {
             before(grammarAccess.getIntegerAccess().getIntegerAction_0()); 
            // InternalSmallUML.g:2020:2: ()
            // InternalSmallUML.g:2020:3: 
            {
            }

             after(grammarAccess.getIntegerAccess().getIntegerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalSmallUML.g:2028:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl rule__Integer__Group__2 ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2032:1: ( rule__Integer__Group__1__Impl rule__Integer__Group__2 )
            // InternalSmallUML.g:2033:2: rule__Integer__Group__1__Impl rule__Integer__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Integer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Integer__Group__2();

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
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalSmallUML.g:2040:1: rule__Integer__Group__1__Impl : ( 'Integer' ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2044:1: ( ( 'Integer' ) )
            // InternalSmallUML.g:2045:1: ( 'Integer' )
            {
            // InternalSmallUML.g:2045:1: ( 'Integer' )
            // InternalSmallUML.g:2046:2: 'Integer'
            {
             before(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getIntegerAccess().getIntegerKeyword_1()); 

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
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Integer__Group__2"
    // InternalSmallUML.g:2055:1: rule__Integer__Group__2 : rule__Integer__Group__2__Impl ;
    public final void rule__Integer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2059:1: ( rule__Integer__Group__2__Impl )
            // InternalSmallUML.g:2060:2: rule__Integer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Integer__Group__2__Impl();

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
    // $ANTLR end "rule__Integer__Group__2"


    // $ANTLR start "rule__Integer__Group__2__Impl"
    // InternalSmallUML.g:2066:1: rule__Integer__Group__2__Impl : ( ( rule__Integer__NameAssignment_2 ) ) ;
    public final void rule__Integer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2070:1: ( ( ( rule__Integer__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2071:1: ( ( rule__Integer__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2071:1: ( ( rule__Integer__NameAssignment_2 ) )
            // InternalSmallUML.g:2072:2: ( rule__Integer__NameAssignment_2 )
            {
             before(grammarAccess.getIntegerAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2073:2: ( rule__Integer__NameAssignment_2 )
            // InternalSmallUML.g:2073:3: rule__Integer__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Integer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Integer__Group__2__Impl"


    // $ANTLR start "rule__String0__Group__0"
    // InternalSmallUML.g:2082:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2086:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalSmallUML.g:2087:2: rule__String0__Group__0__Impl rule__String0__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__String0__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__1();

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
    // $ANTLR end "rule__String0__Group__0"


    // $ANTLR start "rule__String0__Group__0__Impl"
    // InternalSmallUML.g:2094:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2098:1: ( ( () ) )
            // InternalSmallUML.g:2099:1: ( () )
            {
            // InternalSmallUML.g:2099:1: ( () )
            // InternalSmallUML.g:2100:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalSmallUML.g:2101:2: ()
            // InternalSmallUML.g:2101:3: 
            {
            }

             after(grammarAccess.getString0Access().getStringAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__String0__Group__0__Impl"


    // $ANTLR start "rule__String0__Group__1"
    // InternalSmallUML.g:2109:1: rule__String0__Group__1 : rule__String0__Group__1__Impl rule__String0__Group__2 ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2113:1: ( rule__String0__Group__1__Impl rule__String0__Group__2 )
            // InternalSmallUML.g:2114:2: rule__String0__Group__1__Impl rule__String0__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__String0__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__String0__Group__2();

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
    // $ANTLR end "rule__String0__Group__1"


    // $ANTLR start "rule__String0__Group__1__Impl"
    // InternalSmallUML.g:2121:1: rule__String0__Group__1__Impl : ( 'String' ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2125:1: ( ( 'String' ) )
            // InternalSmallUML.g:2126:1: ( 'String' )
            {
            // InternalSmallUML.g:2126:1: ( 'String' )
            // InternalSmallUML.g:2127:2: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword_1()); 

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
    // $ANTLR end "rule__String0__Group__1__Impl"


    // $ANTLR start "rule__String0__Group__2"
    // InternalSmallUML.g:2136:1: rule__String0__Group__2 : rule__String0__Group__2__Impl ;
    public final void rule__String0__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2140:1: ( rule__String0__Group__2__Impl )
            // InternalSmallUML.g:2141:2: rule__String0__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__String0__Group__2__Impl();

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
    // $ANTLR end "rule__String0__Group__2"


    // $ANTLR start "rule__String0__Group__2__Impl"
    // InternalSmallUML.g:2147:1: rule__String0__Group__2__Impl : ( ( rule__String0__NameAssignment_2 ) ) ;
    public final void rule__String0__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2151:1: ( ( ( rule__String0__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2152:1: ( ( rule__String0__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2152:1: ( ( rule__String0__NameAssignment_2 ) )
            // InternalSmallUML.g:2153:2: ( rule__String0__NameAssignment_2 )
            {
             before(grammarAccess.getString0Access().getNameAssignment_2()); 
            // InternalSmallUML.g:2154:2: ( rule__String0__NameAssignment_2 )
            // InternalSmallUML.g:2154:3: rule__String0__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__String0__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getString0Access().getNameAssignment_2()); 

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
    // $ANTLR end "rule__String0__Group__2__Impl"


    // $ANTLR start "rule__Date__Group__0"
    // InternalSmallUML.g:2163:1: rule__Date__Group__0 : rule__Date__Group__0__Impl rule__Date__Group__1 ;
    public final void rule__Date__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2167:1: ( rule__Date__Group__0__Impl rule__Date__Group__1 )
            // InternalSmallUML.g:2168:2: rule__Date__Group__0__Impl rule__Date__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Date__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__1();

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
    // $ANTLR end "rule__Date__Group__0"


    // $ANTLR start "rule__Date__Group__0__Impl"
    // InternalSmallUML.g:2175:1: rule__Date__Group__0__Impl : ( () ) ;
    public final void rule__Date__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2179:1: ( ( () ) )
            // InternalSmallUML.g:2180:1: ( () )
            {
            // InternalSmallUML.g:2180:1: ( () )
            // InternalSmallUML.g:2181:2: ()
            {
             before(grammarAccess.getDateAccess().getDateAction_0()); 
            // InternalSmallUML.g:2182:2: ()
            // InternalSmallUML.g:2182:3: 
            {
            }

             after(grammarAccess.getDateAccess().getDateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Date__Group__0__Impl"


    // $ANTLR start "rule__Date__Group__1"
    // InternalSmallUML.g:2190:1: rule__Date__Group__1 : rule__Date__Group__1__Impl rule__Date__Group__2 ;
    public final void rule__Date__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2194:1: ( rule__Date__Group__1__Impl rule__Date__Group__2 )
            // InternalSmallUML.g:2195:2: rule__Date__Group__1__Impl rule__Date__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Date__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Date__Group__2();

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
    // $ANTLR end "rule__Date__Group__1"


    // $ANTLR start "rule__Date__Group__1__Impl"
    // InternalSmallUML.g:2202:1: rule__Date__Group__1__Impl : ( 'Date' ) ;
    public final void rule__Date__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2206:1: ( ( 'Date' ) )
            // InternalSmallUML.g:2207:1: ( 'Date' )
            {
            // InternalSmallUML.g:2207:1: ( 'Date' )
            // InternalSmallUML.g:2208:2: 'Date'
            {
             before(grammarAccess.getDateAccess().getDateKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDateAccess().getDateKeyword_1()); 

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
    // $ANTLR end "rule__Date__Group__1__Impl"


    // $ANTLR start "rule__Date__Group__2"
    // InternalSmallUML.g:2217:1: rule__Date__Group__2 : rule__Date__Group__2__Impl ;
    public final void rule__Date__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2221:1: ( rule__Date__Group__2__Impl )
            // InternalSmallUML.g:2222:2: rule__Date__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Date__Group__2__Impl();

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
    // $ANTLR end "rule__Date__Group__2"


    // $ANTLR start "rule__Date__Group__2__Impl"
    // InternalSmallUML.g:2228:1: rule__Date__Group__2__Impl : ( ( rule__Date__NameAssignment_2 ) ) ;
    public final void rule__Date__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2232:1: ( ( ( rule__Date__NameAssignment_2 ) ) )
            // InternalSmallUML.g:2233:1: ( ( rule__Date__NameAssignment_2 ) )
            {
            // InternalSmallUML.g:2233:1: ( ( rule__Date__NameAssignment_2 ) )
            // InternalSmallUML.g:2234:2: ( rule__Date__NameAssignment_2 )
            {
             before(grammarAccess.getDateAccess().getNameAssignment_2()); 
            // InternalSmallUML.g:2235:2: ( rule__Date__NameAssignment_2 )
            // InternalSmallUML.g:2235:3: rule__Date__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Date__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDateAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Date__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSmallUML.g:2244:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2248:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSmallUML.g:2249:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalSmallUML.g:2256:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2260:1: ( ( ( '-' )? ) )
            // InternalSmallUML.g:2261:1: ( ( '-' )? )
            {
            // InternalSmallUML.g:2261:1: ( ( '-' )? )
            // InternalSmallUML.g:2262:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSmallUML.g:2263:2: ( '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSmallUML.g:2263:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalSmallUML.g:2271:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2275:1: ( rule__EInt__Group__1__Impl )
            // InternalSmallUML.g:2276:2: rule__EInt__Group__1__Impl
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
    // InternalSmallUML.g:2282:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2286:1: ( ( RULE_INT ) )
            // InternalSmallUML.g:2287:1: ( RULE_INT )
            {
            // InternalSmallUML.g:2287:1: ( RULE_INT )
            // InternalSmallUML.g:2288:2: RULE_INT
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


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // InternalSmallUML.g:2298:1: rule__Attribute__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2302:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2303:2: ( ruleEString )
            {
            // InternalSmallUML.g:2303:2: ( ruleEString )
            // InternalSmallUML.g:2304:3: ruleEString
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


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // InternalSmallUML.g:2313:1: rule__Attribute__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2317:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:2318:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:2318:2: ( ( ruleEString ) )
            // InternalSmallUML.g:2319:3: ( ruleEString )
            {
             before(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_4_0()); 
            // InternalSmallUML.g:2320:3: ( ruleEString )
            // InternalSmallUML.g:2321:4: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getTypeSuperTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeSuperTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Role__NameAssignment_1"
    // InternalSmallUML.g:2332:1: rule__Role__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2336:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2337:2: ( ruleEString )
            {
            // InternalSmallUML.g:2337:2: ( ruleEString )
            // InternalSmallUML.g:2338:3: ruleEString
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


    // $ANTLR start "rule__Role__LowerBoundAssignment_4"
    // InternalSmallUML.g:2347:1: rule__Role__LowerBoundAssignment_4 : ( ruleEInt ) ;
    public final void rule__Role__LowerBoundAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2351:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:2352:2: ( ruleEInt )
            {
            // InternalSmallUML.g:2352:2: ( ruleEInt )
            // InternalSmallUML.g:2353:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Role__LowerBoundAssignment_4"


    // $ANTLR start "rule__Role__UpperBoundAssignment_6"
    // InternalSmallUML.g:2362:1: rule__Role__UpperBoundAssignment_6 : ( ruleEInt ) ;
    public final void rule__Role__UpperBoundAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2366:1: ( ( ruleEInt ) )
            // InternalSmallUML.g:2367:2: ( ruleEInt )
            {
            // InternalSmallUML.g:2367:2: ( ruleEInt )
            // InternalSmallUML.g:2368:3: ruleEInt
            {
             before(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Role__UpperBoundAssignment_6"


    // $ANTLR start "rule__Operation__IsAbstractAssignment_0"
    // InternalSmallUML.g:2377:1: rule__Operation__IsAbstractAssignment_0 : ( ( 'isAbstract' ) ) ;
    public final void rule__Operation__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2381:1: ( ( ( 'isAbstract' ) ) )
            // InternalSmallUML.g:2382:2: ( ( 'isAbstract' ) )
            {
            // InternalSmallUML.g:2382:2: ( ( 'isAbstract' ) )
            // InternalSmallUML.g:2383:3: ( 'isAbstract' )
            {
             before(grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0()); 
            // InternalSmallUML.g:2384:3: ( 'isAbstract' )
            // InternalSmallUML.g:2385:4: 'isAbstract'
            {
             before(grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0()); 

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
    // InternalSmallUML.g:2396:1: rule__Operation__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Operation__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2400:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2401:2: ( ruleEString )
            {
            // InternalSmallUML.g:2401:2: ( ruleEString )
            // InternalSmallUML.g:2402:3: ruleEString
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


    // $ANTLR start "rule__Operation__ReturnTypeAssignment_4_1"
    // InternalSmallUML.g:2411:1: rule__Operation__ReturnTypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Operation__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2415:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:2416:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:2416:2: ( ( ruleEString ) )
            // InternalSmallUML.g:2417:3: ( ruleEString )
            {
             before(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_4_1_0()); 
            // InternalSmallUML.g:2418:3: ( ruleEString )
            // InternalSmallUML.g:2419:4: ruleEString
            {
             before(grammarAccess.getOperationAccess().getReturnTypeSuperTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getReturnTypeSuperTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Operation__ReturnTypeAssignment_4_1"


    // $ANTLR start "rule__Operation__ParametersAssignment_5_2"
    // InternalSmallUML.g:2430:1: rule__Operation__ParametersAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2434:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:2435:2: ( ruleParameter )
            {
            // InternalSmallUML.g:2435:2: ( ruleParameter )
            // InternalSmallUML.g:2436:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Operation__ParametersAssignment_5_2"


    // $ANTLR start "rule__Operation__ParametersAssignment_5_3_1"
    // InternalSmallUML.g:2445:1: rule__Operation__ParametersAssignment_5_3_1 : ( ruleParameter ) ;
    public final void rule__Operation__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2449:1: ( ( ruleParameter ) )
            // InternalSmallUML.g:2450:2: ( ruleParameter )
            {
            // InternalSmallUML.g:2450:2: ( ruleParameter )
            // InternalSmallUML.g:2451:3: ruleParameter
            {
             before(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Operation__ParametersAssignment_5_3_1"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalSmallUML.g:2460:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2464:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2465:2: ( ruleEString )
            {
            // InternalSmallUML.g:2465:2: ( ruleEString )
            // InternalSmallUML.g:2466:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__Parameter__TypeAssignment_4"
    // InternalSmallUML.g:2475:1: rule__Parameter__TypeAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__Parameter__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2479:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:2480:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:2480:2: ( ( ruleEString ) )
            // InternalSmallUML.g:2481:3: ( ruleEString )
            {
             before(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_4_0()); 
            // InternalSmallUML.g:2482:3: ( ruleEString )
            // InternalSmallUML.g:2483:4: ruleEString
            {
             before(grammarAccess.getParameterAccess().getTypeSuperTypeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeSuperTypeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_4_0()); 

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
    // $ANTLR end "rule__Parameter__TypeAssignment_4"


    // $ANTLR start "rule__Class__IsAbstractAssignment_0"
    // InternalSmallUML.g:2494:1: rule__Class__IsAbstractAssignment_0 : ( ( 'isAbstract' ) ) ;
    public final void rule__Class__IsAbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2498:1: ( ( ( 'isAbstract' ) ) )
            // InternalSmallUML.g:2499:2: ( ( 'isAbstract' ) )
            {
            // InternalSmallUML.g:2499:2: ( ( 'isAbstract' ) )
            // InternalSmallUML.g:2500:3: ( 'isAbstract' )
            {
             before(grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0()); 
            // InternalSmallUML.g:2501:3: ( 'isAbstract' )
            // InternalSmallUML.g:2502:4: 'isAbstract'
            {
             before(grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0()); 

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
    // InternalSmallUML.g:2513:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2517:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2518:2: ( ruleEString )
            {
            // InternalSmallUML.g:2518:2: ( ruleEString )
            // InternalSmallUML.g:2519:3: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__Class__SuperAssignment_4_1"
    // InternalSmallUML.g:2528:1: rule__Class__SuperAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Class__SuperAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2532:1: ( ( ( ruleEString ) ) )
            // InternalSmallUML.g:2533:2: ( ( ruleEString ) )
            {
            // InternalSmallUML.g:2533:2: ( ( ruleEString ) )
            // InternalSmallUML.g:2534:3: ( ruleEString )
            {
             before(grammarAccess.getClassAccess().getSuperInheritanceCrossReference_4_1_0()); 
            // InternalSmallUML.g:2535:3: ( ruleEString )
            // InternalSmallUML.g:2536:4: ruleEString
            {
             before(grammarAccess.getClassAccess().getSuperInheritanceEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getSuperInheritanceEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getClassAccess().getSuperInheritanceCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Class__SuperAssignment_4_1"


    // $ANTLR start "rule__Class__AttributeAssignment_5_2"
    // InternalSmallUML.g:2547:1: rule__Class__AttributeAssignment_5_2 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2551:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:2552:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:2552:2: ( ruleAttribute )
            // InternalSmallUML.g:2553:3: ruleAttribute
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
    // InternalSmallUML.g:2562:1: rule__Class__AttributeAssignment_5_3_1 : ( ruleAttribute ) ;
    public final void rule__Class__AttributeAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2566:1: ( ( ruleAttribute ) )
            // InternalSmallUML.g:2567:2: ( ruleAttribute )
            {
            // InternalSmallUML.g:2567:2: ( ruleAttribute )
            // InternalSmallUML.g:2568:3: ruleAttribute
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
    // InternalSmallUML.g:2577:1: rule__Class__OperationAssignment_6_2 : ( ruleOperation ) ;
    public final void rule__Class__OperationAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2581:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:2582:2: ( ruleOperation )
            {
            // InternalSmallUML.g:2582:2: ( ruleOperation )
            // InternalSmallUML.g:2583:3: ruleOperation
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
    // InternalSmallUML.g:2592:1: rule__Class__OperationAssignment_6_3_1 : ( ruleOperation ) ;
    public final void rule__Class__OperationAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2596:1: ( ( ruleOperation ) )
            // InternalSmallUML.g:2597:2: ( ruleOperation )
            {
            // InternalSmallUML.g:2597:2: ( ruleOperation )
            // InternalSmallUML.g:2598:3: ruleOperation
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


    // $ANTLR start "rule__Integer__NameAssignment_2"
    // InternalSmallUML.g:2607:1: rule__Integer__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Integer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2611:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2612:2: ( ruleEString )
            {
            // InternalSmallUML.g:2612:2: ( ruleEString )
            // InternalSmallUML.g:2613:3: ruleEString
            {
             before(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Integer__NameAssignment_2"


    // $ANTLR start "rule__String0__NameAssignment_2"
    // InternalSmallUML.g:2622:1: rule__String0__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__String0__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2626:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2627:2: ( ruleEString )
            {
            // InternalSmallUML.g:2627:2: ( ruleEString )
            // InternalSmallUML.g:2628:3: ruleEString
            {
             before(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__String0__NameAssignment_2"


    // $ANTLR start "rule__Date__NameAssignment_2"
    // InternalSmallUML.g:2637:1: rule__Date__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Date__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSmallUML.g:2641:1: ( ( ruleEString ) )
            // InternalSmallUML.g:2642:2: ( ruleEString )
            {
            // InternalSmallUML.g:2642:2: ( ruleEString )
            // InternalSmallUML.g:2643:3: ruleEString
            {
             before(grammarAccess.getDateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDateAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Date__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000184000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007004000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}