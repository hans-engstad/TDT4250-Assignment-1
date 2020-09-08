/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getIndex <em>Index</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getStudyPlanSemester()
 * @model
 * @generated
 */
public interface StudyPlanSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getStudyPlanSemester_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Course#getStudyPlanSemester <em>Study Plan Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getStudyPlanSemester_Courses()
	 * @see tdt4250.assign1.model.assign1.Course#getStudyPlanSemester
	 * @model opposite="studyPlanSemester"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Study Plan</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan</em>' container reference.
	 * @see #setStudyPlan(StudyPlan)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getStudyPlanSemester_StudyPlan()
	 * @see tdt4250.assign1.model.assign1.StudyPlan#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	StudyPlan getStudyPlan();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan</em>' container reference.
	 * @see #getStudyPlan()
	 * @generated
	 */
	void setStudyPlan(StudyPlan value);

} // StudyPlanSemester
