/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.Program#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Program#getBaseSemesters <em>Base Semesters</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Program#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgram()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='semestersAreContinous noDuplicateSemesters'"
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Base Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.ProgramSemester}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ProgramSemester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Semesters</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgram_BaseSemesters()
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<ProgramSemester> getBaseSemesters();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Specialization}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Specialization#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgram_Specializations()
	 * @see tdt4250.assign1.model.assign1.Specialization#getProgram
	 * @model opposite="program" containment="true"
	 * @generated
	 */
	EList<Specialization> getSpecializations();

} // Program
