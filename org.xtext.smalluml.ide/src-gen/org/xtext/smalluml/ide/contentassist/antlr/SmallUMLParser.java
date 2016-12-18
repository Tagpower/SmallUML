/*
 * generated by Xtext 2.10.0
 */
package org.xtext.smalluml.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.smalluml.ide.contentassist.antlr.internal.InternalSmallUMLParser;
import org.xtext.smalluml.services.SmallUMLGrammarAccess;

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
					put(grammarAccess.getPackageAccess().getGroup(), "rule__Package__Group__0");
					put(grammarAccess.getPackageAccess().getGroup_4(), "rule__Package__Group_4__0");
					put(grammarAccess.getPackageAccess().getGroup_5(), "rule__Package__Group_5__0");
					put(grammarAccess.getPackageAccess().getGroup_5_3(), "rule__Package__Group_5_3__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup_6(), "rule__Association__Group_6__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getClassAccess().getGroup_3(), "rule__Class__Group_3__0");
					put(grammarAccess.getClassAccess().getGroup_5(), "rule__Class__Group_5__0");
					put(grammarAccess.getClassAccess().getGroup_5_3(), "rule__Class__Group_5_3__0");
					put(grammarAccess.getClassAccess().getGroup_6(), "rule__Class__Group_6__0");
					put(grammarAccess.getClassAccess().getGroup_6_3(), "rule__Class__Group_6_3__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup_4(), "rule__Enumeration__Group_4__0");
					put(grammarAccess.getEnumerationAccess().getGroup_4_1(), "rule__Enumeration__Group_4_1__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getOperationAccess().getGroup_4(), "rule__Operation__Group_4__0");
					put(grammarAccess.getOperationAccess().getGroup_4_2(), "rule__Operation__Group_4_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getRoleAccess().getGroup(), "rule__Role__Group__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getPackageAccess().getNameAssignment_2(), "rule__Package__NameAssignment_2");
					put(grammarAccess.getPackageAccess().getElementsAssignment_4_2(), "rule__Package__ElementsAssignment_4_2");
					put(grammarAccess.getPackageAccess().getAssociationAssignment_5_2(), "rule__Package__AssociationAssignment_5_2");
					put(grammarAccess.getPackageAccess().getAssociationAssignment_5_3_1(), "rule__Package__AssociationAssignment_5_3_1");
					put(grammarAccess.getAssociationAccess().getNameAssignment_1(), "rule__Association__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getRoleAssignment_5(), "rule__Association__RoleAssignment_5");
					put(grammarAccess.getAssociationAccess().getRoleAssignment_6_1(), "rule__Association__RoleAssignment_6_1");
					put(grammarAccess.getClassAccess().getIsAbstractAssignment_0(), "rule__Class__IsAbstractAssignment_0");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getSuperAssignment_3_1(), "rule__Class__SuperAssignment_3_1");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_2(), "rule__Class__AttributeAssignment_5_2");
					put(grammarAccess.getClassAccess().getAttributeAssignment_5_3_1(), "rule__Class__AttributeAssignment_5_3_1");
					put(grammarAccess.getClassAccess().getOperationAssignment_6_2(), "rule__Class__OperationAssignment_6_2");
					put(grammarAccess.getClassAccess().getOperationAssignment_6_3_1(), "rule__Class__OperationAssignment_6_3_1");
					put(grammarAccess.getTypeAccess().getNameAssignment_2(), "rule__Type__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getNameAssignment_2(), "rule__Enumeration__NameAssignment_2");
					put(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_0(), "rule__Enumeration__EnumerationAssignment_4_0");
					put(grammarAccess.getEnumerationAccess().getEnumerationAssignment_4_1_1(), "rule__Enumeration__EnumerationAssignment_4_1_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_1(), "rule__Attribute__NameAssignment_1");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_3(), "rule__Attribute__TypeAssignment_3");
					put(grammarAccess.getOperationAccess().getIsAbstractAssignment_0(), "rule__Operation__IsAbstractAssignment_0");
					put(grammarAccess.getOperationAccess().getNameAssignment_2(), "rule__Operation__NameAssignment_2");
					put(grammarAccess.getOperationAccess().getReturnTypeAssignment_3_1(), "rule__Operation__ReturnTypeAssignment_3_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_4_1(), "rule__Operation__ParametersAssignment_4_1");
					put(grammarAccess.getOperationAccess().getParametersAssignment_4_2_1(), "rule__Operation__ParametersAssignment_4_2_1");
					put(grammarAccess.getParameterAccess().getNameAssignment_0(), "rule__Parameter__NameAssignment_0");
					put(grammarAccess.getParameterAccess().getTypeAssignment_2(), "rule__Parameter__TypeAssignment_2");
					put(grammarAccess.getRoleAccess().getNameAssignment_1(), "rule__Role__NameAssignment_1");
					put(grammarAccess.getRoleAccess().getLowerBoundAssignment_3(), "rule__Role__LowerBoundAssignment_3");
					put(grammarAccess.getRoleAccess().getUpperBoundAssignment_5(), "rule__Role__UpperBoundAssignment_5");
					put(grammarAccess.getRoleAccess().getClassAssignment_8(), "rule__Role__ClassAssignment_8");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalSmallUMLParser typedParser = (InternalSmallUMLParser) parser;
			typedParser.entryRulePackage();
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