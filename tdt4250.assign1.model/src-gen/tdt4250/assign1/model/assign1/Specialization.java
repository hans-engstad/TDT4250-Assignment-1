/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.Specialization#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Specialization#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Specialization#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Specialization#getRequiredCompletedSpecialization <em>Required Completed Specialization</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getSpecialization()
 * @model
 * @generated
 */
public interface Specialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getSpecialization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Specialization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getSpecialization_Semesters()
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization
	 * @model opposite="specialization" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Program#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getSpecialization_Program()
	 * @see tdt4250.assign1.model.assign1.Program#getSpecializations
	 * @model opposite="specializations" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Specialization#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Required Completed Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Completed Specialization</em>' reference.
	 * @see #setRequiredCompletedSpecialization(Specialization)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getSpecialization_RequiredCompletedSpecialization()
	 * @model
	 * @generated
	 */
	Specialization getRequiredCompletedSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Specialization#getRequiredCompletedSpecialization <em>Required Completed Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Completed Specialization</em>' reference.
	 * @see #getRequiredCompletedSpecialization()
	 * @generated
	 */
	void setRequiredCompletedSpecialization(Specialization value);

} // Specialization
