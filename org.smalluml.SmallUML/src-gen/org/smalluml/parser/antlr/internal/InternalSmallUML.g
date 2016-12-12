/*
 * generated by Xtext 2.10.0
 */
grammar InternalSmallUML;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.smalluml.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRulePackage
entryRulePackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPackageRule()); }
	iv_rulePackage=rulePackage
	{ $current=$iv_rulePackage.current; }
	EOF;

// Rule Package
rulePackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getPackageAccess().getPackageAction_0(),
					$current);
			}
		)
		otherlv_1='Package'
		{
			newLeafNode(otherlv_1, grammarAccess.getPackageAccess().getPackageKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='elements'
			{
				newLeafNode(otherlv_3, grammarAccess.getPackageAccess().getElementsKeyword_3_0());
			}
			otherlv_4='{'
			{
				newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPackageAccess().getElementsNamedElementParserRuleCall_3_2_0());
					}
					lv_elements_5_0=ruleNamedElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPackageRule());
						}
						add(
							$current,
							"elements",
							lv_elements_5_0,
							"org.smalluml.SmallUML.NamedElement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_6=','
				{
					newLeafNode(otherlv_6, grammarAccess.getPackageAccess().getCommaKeyword_3_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getPackageAccess().getElementsNamedElementParserRuleCall_3_3_1_0());
						}
						lv_elements_7_0=ruleNamedElement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPackageRule());
							}
							add(
								$current,
								"elements",
								lv_elements_7_0,
								"org.smalluml.SmallUML.NamedElement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_8='}'
			{
				newLeafNode(otherlv_8, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_3_4());
			}
		)?
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleNamedElement
entryRuleNamedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedElementRule()); }
	iv_ruleNamedElement=ruleNamedElement
	{ $current=$iv_ruleNamedElement.current; }
	EOF;

// Rule NamedElement
ruleNamedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getAttributeParserRuleCall_0());
		}
		this_Attribute_0=ruleAttribute
		{
			$current = $this_Attribute_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getRoleParserRuleCall_1());
		}
		this_Role_1=ruleRole
		{
			$current = $this_Role_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getAssociationParserRuleCall_2());
		}
		this_Association_2=ruleAssociation
		{
			$current = $this_Association_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getOperationParserRuleCall_3());
		}
		this_Operation_3=ruleOperation
		{
			$current = $this_Operation_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getParameterParserRuleCall_4());
		}
		this_Parameter_4=ruleParameter
		{
			$current = $this_Parameter_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getClassParserRuleCall_5());
		}
		this_Class_5=ruleClass
		{
			$current = $this_Class_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getIntegerParserRuleCall_6());
		}
		this_Integer_6=ruleInteger
		{
			$current = $this_Integer_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getString0ParserRuleCall_7());
		}
		this_String0_7=ruleString0
		{
			$current = $this_String0_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getDateParserRuleCall_8());
		}
		this_Date_8=ruleDate
		{
			$current = $this_Date_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNamedElementAccess().getEnumerationParserRuleCall_9());
		}
		this_Enumeration_9=ruleEnumeration
		{
			$current = $this_Enumeration_9.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSuperType
entryRuleSuperType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuperTypeRule()); }
	iv_ruleSuperType=ruleSuperType
	{ $current=$iv_ruleSuperType.current; }
	EOF;

// Rule SuperType
ruleSuperType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSuperTypeAccess().getClassParserRuleCall_0());
		}
		this_Class_0=ruleClass
		{
			$current = $this_Class_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSuperTypeAccess().getIntegerParserRuleCall_1());
		}
		this_Integer_1=ruleInteger
		{
			$current = $this_Integer_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSuperTypeAccess().getString0ParserRuleCall_2());
		}
		this_String0_2=ruleString0
		{
			$current = $this_String0_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSuperTypeAccess().getDateParserRuleCall_3());
		}
		this_Date_3=ruleDate
		{
			$current = $this_Date_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleAttribute
entryRuleAttribute returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeRule()); }
	iv_ruleAttribute=ruleAttribute
	{ $current=$iv_ruleAttribute.current; }
	EOF;

// Rule Attribute
ruleAttribute returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Attribute'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAttributeAccess().getTypeSuperTypeCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleRole
entryRuleRole returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRoleRule()); }
	iv_ruleRole=ruleRole
	{ $current=$iv_ruleRole.current; }
	EOF;

// Rule Role
ruleRole returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Role'
		{
			newLeafNode(otherlv_0, grammarAccess.getRoleAccess().getRoleKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoleRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='lowerBound'
		{
			newLeafNode(otherlv_3, grammarAccess.getRoleAccess().getLowerBoundKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_4_0());
				}
				lv_lowerBound_4_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoleRule());
					}
					set(
						$current,
						"lowerBound",
						lv_lowerBound_4_0,
						"org.smalluml.SmallUML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='upperBound'
		{
			newLeafNode(otherlv_5, grammarAccess.getRoleAccess().getUpperBoundKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_6_0());
				}
				lv_upperBound_6_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRoleRule());
					}
					set(
						$current,
						"upperBound",
						lv_upperBound_6_0,
						"org.smalluml.SmallUML.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='class'
		{
			newLeafNode(otherlv_7, grammarAccess.getRoleAccess().getClassKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRoleRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRoleAccess().getClassClassCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleAssociation
entryRuleAssociation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssociationRule()); }
	iv_ruleAssociation=ruleAssociation
	{ $current=$iv_ruleAssociation.current; }
	EOF;

// Rule Association
ruleAssociation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Association'
		{
			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='role'
		{
			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getRoleKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_5_0());
				}
				lv_role_5_0=ruleRole
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssociationRule());
					}
					add(
						$current,
						"role",
						lv_role_5_0,
						"org.smalluml.SmallUML.Role");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssociationAccess().getRoleRoleParserRuleCall_6_1_0());
					}
					lv_role_7_0=ruleRole
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssociationRule());
						}
						add(
							$current,
							"role",
							lv_role_7_0,
							"org.smalluml.SmallUML.Role");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleOperation
entryRuleOperation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOperationRule()); }
	iv_ruleOperation=ruleOperation
	{ $current=$iv_ruleOperation.current; }
	EOF;

// Rule Operation
ruleOperation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='isAbstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getOperationAccess().getIsAbstractIsAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOperationRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "isAbstract");
				}
			)
		)
		otherlv_1='Operation'
		{
			newLeafNode(otherlv_1, grammarAccess.getOperationAccess().getOperationKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getOperationRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='returnType'
			{
				newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getReturnTypeKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getOperationRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeSuperTypeCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='parameters'
			{
				newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getParametersKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_2_0());
					}
					lv_parameters_8_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOperationRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_8_0,
							"org.smalluml.SmallUML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getOperationAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_5_3_1_0());
						}
						lv_parameters_10_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOperationRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_10_0,
								"org.smalluml.SmallUML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		otherlv_12='}'
		{
			newLeafNode(otherlv_12, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Parameter'
		{
			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='type'
		{
			newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeSuperTypeCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleClass
entryRuleClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassRule()); }
	iv_ruleClass=ruleClass
	{ $current=$iv_ruleClass.current; }
	EOF;

// Rule Class
ruleClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_isAbstract_0_0='isAbstract'
				{
					newLeafNode(lv_isAbstract_0_0, grammarAccess.getClassAccess().getIsAbstractIsAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClassRule());
					}
					setWithLastConsumed($current, "isAbstract", true, "isAbstract");
				}
			)
		)
		otherlv_1='Class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClassAccess().getClassKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClassRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='super'
			{
				newLeafNode(otherlv_4, grammarAccess.getClassAccess().getSuperKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClassRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getClassAccess().getSuperInheritanceCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='attribute'
			{
				newLeafNode(otherlv_6, grammarAccess.getClassAccess().getAttributeKeyword_5_0());
			}
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_2_0());
					}
					lv_attribute_8_0=ruleAttribute
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"attribute",
							lv_attribute_8_0,
							"org.smalluml.SmallUML.Attribute");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassAccess().getAttributeAttributeParserRuleCall_5_3_1_0());
						}
						lv_attribute_10_0=ruleAttribute
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassRule());
							}
							add(
								$current,
								"attribute",
								lv_attribute_10_0,
								"org.smalluml.SmallUML.Attribute");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_11='}'
			{
				newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_12='operation'
			{
				newLeafNode(otherlv_12, grammarAccess.getClassAccess().getOperationKeyword_6_0());
			}
			otherlv_13='{'
			{
				newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_2_0());
					}
					lv_operation_14_0=ruleOperation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getClassRule());
						}
						add(
							$current,
							"operation",
							lv_operation_14_0,
							"org.smalluml.SmallUML.Operation");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_15=','
				{
					newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getClassAccess().getOperationOperationParserRuleCall_6_3_1_0());
						}
						lv_operation_16_0=ruleOperation
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getClassRule());
							}
							add(
								$current,
								"operation",
								lv_operation_16_0,
								"org.smalluml.SmallUML.Operation");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_17='}'
			{
				newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_18='}'
		{
			newLeafNode(otherlv_18, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleInteger
entryRuleInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current; }
	EOF;

// Rule Integer
ruleInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerAccess().getIntegerAction_0(),
					$current);
			}
		)
		otherlv_1='Integer'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerAccess().getIntegerKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleString0
entryRuleString0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getString0Rule()); }
	iv_ruleString0=ruleString0
	{ $current=$iv_ruleString0.current; }
	EOF;

// Rule String0
ruleString0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getString0Access().getStringAction_0(),
					$current);
			}
		)
		otherlv_1='String'
		{
			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getString0Access().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getString0Rule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDate
entryRuleDate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDateRule()); }
	iv_ruleDate=ruleDate
	{ $current=$iv_ruleDate.current; }
	EOF;

// Rule Date
ruleDate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDateAccess().getDateAction_0(),
					$current);
			}
		)
		otherlv_1='Date'
		{
			newLeafNode(otherlv_1, grammarAccess.getDateAccess().getDateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDateAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDateRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Enumeration'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.smalluml.SmallUML.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='supertype'
		{
			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getSupertypeKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getSupertypeSuperTypeParserRuleCall_5_0());
				}
				lv_supertype_5_0=ruleSuperType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"supertype",
						lv_supertype_5_0,
						"org.smalluml.SmallUML.SuperType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationAccess().getSupertypeSuperTypeParserRuleCall_6_1_0());
					}
					lv_supertype_7_0=ruleSuperType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationRule());
						}
						add(
							$current,
							"supertype",
							lv_supertype_7_0,
							"org.smalluml.SmallUML.SuperType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
