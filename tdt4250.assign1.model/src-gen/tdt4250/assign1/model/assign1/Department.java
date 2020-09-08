/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.Department#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Department#getPrograms <em>Programs</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Department#getStudyPlans <em>Study Plans</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getDepartment()
 * @model
 * @generated
 */
public interface Department extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getDepartment_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Programs</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getDepartment_Programs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Program> getPrograms();

	/**
	 * Returns the value of the '<em><b>Study Plans</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plans</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getDepartment_StudyPlans()
	 * @model containment="true"
	 * @generated
	 */
	EList<StudyPlan> getStudyPlans();

} // Department
