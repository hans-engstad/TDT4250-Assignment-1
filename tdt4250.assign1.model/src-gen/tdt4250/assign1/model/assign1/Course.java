/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getGroup <em>Group</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getStudyPlanSemester <em>Study Plan Semester</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.Course#getProgramSemester <em>Program Semester</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_Code()
	 * @model dataType="tdt4250.assign1.model.assign1.CourseCode"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(ElectiveCoursesGroup)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_Group()
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getCourses
	 * @model opposite="courses"
	 * @generated
	 */
	ElectiveCoursesGroup getGroup();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(ElectiveCoursesGroup value);

	/**
	 * Returns the value of the '<em><b>Study Plan Semester</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Plan Semester</em>' reference.
	 * @see #setStudyPlanSemester(StudyPlanSemester)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_StudyPlanSemester()
	 * @see tdt4250.assign1.model.assign1.StudyPlanSemester#getCourses
	 * @model opposite="courses"
	 * @generated
	 */
	StudyPlanSemester getStudyPlanSemester();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getStudyPlanSemester <em>Study Plan Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Plan Semester</em>' reference.
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	void setStudyPlanSemester(StudyPlanSemester value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.assign1.model.assign1.CourseLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.assign1.model.assign1.CourseLevel
	 * @see #setLevel(CourseLevel)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_Level()
	 * @model
	 * @generated
	 */
	CourseLevel getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.assign1.model.assign1.CourseLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(CourseLevel value);

	/**
	 * Returns the value of the '<em><b>Program Semester</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Semester</em>' reference.
	 * @see #setProgramSemester(ProgramSemester)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getCourse_ProgramSemester()
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getMandatoryCourses
	 * @model opposite="mandatoryCourses"
	 * @generated
	 */
	ProgramSemester getProgramSemester();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.Course#getProgramSemester <em>Program Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Semester</em>' reference.
	 * @see #getProgramSemester()
	 * @generated
	 */
	void setProgramSemester(ProgramSemester value);

} // Course
