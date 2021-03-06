/*
 * generated by Xtext 2.10.0
 */
package org.xtext.smalluml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.smalluml.services.SmallUMLGrammarAccess;
import smalluml.Association;
import smalluml.Attribute;
import smalluml.Enumeration;
import smalluml.Operation;
import smalluml.Role;
import smalluml.SmallumlPackage;
import smalluml.Type;

@SuppressWarnings("all")
public class SmallUMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallUMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmallumlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmallumlPackage.ASSOCIATION:
				sequence_Association(context, (Association) semanticObject); 
				return; 
			case SmallumlPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case SmallumlPackage.CLASS:
				sequence_Class(context, (smalluml.Class) semanticObject); 
				return; 
			case SmallumlPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case SmallumlPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case SmallumlPackage.PACKAGE:
				sequence_Package(context, (smalluml.Package) semanticObject); 
				return; 
			case SmallumlPackage.PARAMETER:
				sequence_Parameter(context, (smalluml.Parameter) semanticObject); 
				return; 
			case SmallumlPackage.ROLE:
				sequence_Role(context, (Role) semanticObject); 
				return; 
			case SmallumlPackage.TYPE:
				sequence_Type(context, (Type) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Association returns Association
	 *
	 * Constraint:
	 *     (name=ID role+=Role role+=Role*)
	 */
	protected void sequence_Association(ISerializationContext context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=EString type=[SuperType|EString])
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeSuperTypeEStringParserRuleCall_3_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperType returns Class
	 *     Class returns Class
	 *
	 * Constraint:
	 *     (
	 *         isAbstract?='abstract'? 
	 *         name=ID 
	 *         super=[Class|EString]? 
	 *         (attribute+=Attribute attribute+=Attribute*)? 
	 *         (operation+=Operation operation+=Operation*)?
	 *     )
	 */
	protected void sequence_Class(ISerializationContext context, smalluml.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperType returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID (enumeration+=EString enumeration+=EString*)?)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     (isAbstract?='abstract'? name=EString returnType=[SuperType|EString]? (parameters+=Parameter parameters+=Parameter*)?)
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Package returns Package
	 *
	 * Constraint:
	 *     (name=ID elements+=SuperType* (association+=Association association+=Association*)?)
	 */
	protected void sequence_Package(ISerializationContext context, smalluml.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=EString type=[SuperType|EString])
	 */
	protected void sequence_Parameter(ISerializationContext context, smalluml.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.PARAMETER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeSuperTypeEStringParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Role returns Role
	 *
	 * Constraint:
	 *     (name=EString lowerBound=EInt upperBound=EInt class=[Class|EString])
	 */
	protected void sequence_Role(ISerializationContext context, Role semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__UPPER_BOUND));
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.ROLE__CLASS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.ROLE__CLASS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRoleAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRoleAccess().getLowerBoundEIntParserRuleCall_3_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getRoleAccess().getUpperBoundEIntParserRuleCall_5_0(), semanticObject.getUpperBound());
		feeder.accept(grammarAccess.getRoleAccess().getClassClassEStringParserRuleCall_8_0_1(), semanticObject.getClass_());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     SuperType returns Type
	 *     Type returns Type
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Type(ISerializationContext context, Type semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallumlPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
