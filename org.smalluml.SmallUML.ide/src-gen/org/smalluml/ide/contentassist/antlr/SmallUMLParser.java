/*
 * generated by Xtext 2.10.0
 */
package org.smalluml.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.smalluml.ide.contentassist.antlr.internal.InternalSmallUMLParser;
import org.smalluml.services.SmallUMLGrammarAccess;

public class SmallUMLParser extends AbstractContentAssistParser {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalSmallUMLParser createParser() {
		InternalSmallUMLParser result = new InternalSmallUMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSuperTypeAccess().getAlternatives(), "rule__SuperType__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_6(), "rule__Association__Group_6__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_5(), "rule__Operation__Group_5__0");
					put(grammarAccess.getOperationAccess().getGroup_5_3(), "rule__Operation__Group_5_3__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_4(), "rule__Class__Group_4__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_5_3(), "rule__Class__Group_5_3__0");
					put(grammarAccess.getClassAccess().getGroup_6(), "rule__Class__Group_6__0");
					put(grammarAccess.getClassAccess().getGroup_6_3(), "rule__Class__Group_6_3__0");
					put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
					put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
					put(grammarAccess.getDateAccess().getGroup(), "rule__Date__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getInheritanceAccess().getGroup(), "rule__Inheritance__Group__0");
					put(grammarAccess.getInheritanceAccess().getGroup_3(), "rule__Inheritance__Group_3__0");
					put(grammarAccess.getInheritanceAccess().getGroup_3_3(), "rule__Inheritance__Group_3_3__0");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_4(), "rule__Attribute__TypeAssignment_4");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getLowerBoundAssignment_4(), "rule__Role__LowerBoundAssignment_4");
					put(grammarAccess.getRoleAccess().getUpperBoundAssignment_6(), "rule__Role__UpperBoundAssignment_6");
					put(grammarAccess.getAssociationAccess().getNameAssignment_1(), "rule__Association__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getRoleAssignment_5(), "rule__Association__RoleAssignment_5");
					put(grammarAccess.getAssociationAccess().getRoleAssignment_6_1(), "rule__Association__RoleAssignment_6_1");
					put(grammarAccess.getOperationAccess().getIsAbstractAssignment_0(), "rule__Operation__IsAbstractAssignment_0");
					put(grammarAccess.getOperationAccess().getNameAssignment_2(), "rule__Operation__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getReturnTypeAssignment_4_1(), "rule__Operation__ReturnTypeAssignment_4_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_5_2(), "rule__Operation__ParametersAssignment_5_2");
					put(grammarAccess.getOperationAccess().getParametersAssignment_5_3_1(), "rule__Operation__ParametersAssignment_5_3_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getTypeAssignment_4(), "rule__Parameter__TypeAssignment_4");
					put(grammarAccess.getClassAccess().getIsAbstractAssignment_0(), "rule__Class__IsAbstractAssignment_0");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getSuperAssignment_4_1(), "rule__Class__SuperAssignment_4_1");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_2(), "rule__Class__AttributeAssignment_5_2");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1(), "rule__Class__AttributeAssignment_5_3_1");
					put(grammarAccess.getClassAccess().getOperationAssignment_6_2(), "rule__Class__OperationAssignment_6_2");
					put(grammarAccess.getClassAccess().getOperationAssignment_6_3_1(), "rule__Class__OperationAssignment_6_3_1");
					put(grammarAccess.getIntegerAccess().getNameAssignment_2(), "rule__Integer__NameAssignment_2");
					put(grammarAccess.getString0Access().getNameAssignment_2(), "rule__String0__NameAssignment_2");
					put(grammarAccess.getDateAccess().getNameAssignment_2(), "rule__Date__NameAssignment_2");
					put(grammarAccess.getInheritanceAccess().getChildrenAssignment_3_2(), "rule__Inheritance__ChildrenAssignment_3_2");
					put(grammarAccess.getInheritanceAccess().getChildrenAssignment_3_3_1(), "rule__Inheritance__ChildrenAssignment_3_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUMLParser typedParser = (InternalSmallUMLParser) parser;
			typedParser.entryRuleSuperType();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmallUMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmallUMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
