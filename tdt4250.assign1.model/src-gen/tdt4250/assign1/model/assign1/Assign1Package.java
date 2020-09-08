/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.assign1.model.assign1.Assign1Factory
 * @model kind="package"
 * @generated
 */
public interface Assign1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assign1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/assign1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assign1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assign1Package eINSTANCE = tdt4250.assign1.model.assign1.impl.Assign1PackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.DepartmentImpl <em>Department</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.DepartmentImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getDepartment()
	 * @generated
	 */
	int DEPARTMENT = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Programs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__PROGRAMS = 1;

	/**
	 * The feature id for the '<em><b>Study Plans</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT__STUDY_PLANS = 2;

	/**
	 * The number of structural features of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Department</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPARTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.CourseImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__GROUP = 3;

	/**
	 * The feature id for the '<em><b>Study Plan Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__STUDY_PLAN_SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Program Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__PROGRAM_SEMESTER = 6;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl <em>Elective Courses Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getElectiveCoursesGroup()
	 * @generated
	 */
	int ELECTIVE_COURSES_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSES_GROUP__COURSES = 0;

	/**
	 * The feature id for the '<em><b>Slot</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSES_GROUP__SLOT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSES_GROUP__NAME = 2;

	/**
	 * The number of structural features of the '<em>Elective Courses Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSES_GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Elective Courses Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTIVE_COURSES_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.ProgramImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Base Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__BASE_SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__SPECIALIZATIONS = 2;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl <em>Program Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getProgramSemester()
	 * @generated
	 */
	int PROGRAM_SEMESTER = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Specialization</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__SPECIALIZATION = 2;

	/**
	 * The feature id for the '<em><b>Elective Courses Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS = 3;

	/**
	 * The feature id for the '<em><b>Mandatory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER__MANDATORY_COURSES = 4;

	/**
	 * The number of structural features of the '<em>Program Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl <em>Specialization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.SpecializationImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getSpecialization()
	 * @generated
	 */
	int SPECIALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__PROGRAM = 2;

	/**
	 * The feature id for the '<em><b>Required Completed Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION = 3;

	/**
	 * The number of structural features of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Specialization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.StudyPlanImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 6;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__SEMESTERS = 0;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl <em>Study Plan Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getStudyPlanSemester()
	 * @generated
	 */
	int STUDY_PLAN_SEMESTER = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__COURSES = 1;

	/**
	 * The feature id for the '<em><b>Study Plan</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER__STUDY_PLAN = 2;

	/**
	 * The number of structural features of the '<em>Study Plan Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study Plan Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.assign1.model.assign1.CourseLevel <em>Course Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.assign1.model.assign1.CourseLevel
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourseLevel()
	 * @generated
	 */
	int COURSE_LEVEL = 8;

	/**
	 * The meta object id for the '<em>Course Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourseCode()
	 * @generated
	 */
	int COURSE_CODE = 9;

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.Department <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Department</em>'.
	 * @see tdt4250.assign1.model.assign1.Department
	 * @generated
	 */
	EClass getDepartment();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Department#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Courses</em>'.
	 * @see tdt4250.assign1.model.assign1.Department#getCourses()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Courses();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Department#getPrograms <em>Programs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programs</em>'.
	 * @see tdt4250.assign1.model.assign1.Department#getPrograms()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_Programs();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Department#getStudyPlans <em>Study Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Plans</em>'.
	 * @see tdt4250.assign1.model.assign1.Department#getStudyPlans()
	 * @see #getDepartment()
	 * @generated
	 */
	EReference getDepartment_StudyPlans();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see tdt4250.assign1.model.assign1.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.assign1.model.assign1.Course#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Group</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getGroup()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_Group();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.assign1.model.assign1.Course#getStudyPlanSemester <em>Study Plan Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Study Plan Semester</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getStudyPlanSemester()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_StudyPlanSemester();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Course#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getLevel()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Level();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.assign1.model.assign1.Course#getProgramSemester <em>Program Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program Semester</em>'.
	 * @see tdt4250.assign1.model.assign1.Course#getProgramSemester()
	 * @see #getCourse()
	 * @generated
	 */
	EReference getCourse_ProgramSemester();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup <em>Elective Courses Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elective Courses Group</em>'.
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup
	 * @generated
	 */
	EClass getElectiveCoursesGroup();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getCourses()
	 * @see #getElectiveCoursesGroup()
	 * @generated
	 */
	EReference getElectiveCoursesGroup_Courses();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Slot</em>'.
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot()
	 * @see #getElectiveCoursesGroup()
	 * @generated
	 */
	EReference getElectiveCoursesGroup_Slot();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getName()
	 * @see #getElectiveCoursesGroup()
	 * @generated
	 */
	EAttribute getElectiveCoursesGroup_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see tdt4250.assign1.model.assign1.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.assign1.model.assign1.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Program#getBaseSemesters <em>Base Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Base Semesters</em>'.
	 * @see tdt4250.assign1.model.assign1.Program#getBaseSemesters()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_BaseSemesters();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Program#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Specializations</em>'.
	 * @see tdt4250.assign1.model.assign1.Program#getSpecializations()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Specializations();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.ProgramSemester <em>Program Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program Semester</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester
	 * @generated
	 */
	EClass getProgramSemester();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.ProgramSemester#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getIndex()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EAttribute getProgramSemester_Index();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.assign1.model.assign1.ProgramSemester#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getProgram()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_Program();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specialization</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_Specialization();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.ProgramSemester#getElectiveCoursesSlots <em>Elective Courses Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elective Courses Slots</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getElectiveCoursesSlots()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_ElectiveCoursesSlots();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.assign1.model.assign1.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory Courses</em>'.
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getMandatoryCourses()
	 * @see #getProgramSemester()
	 * @generated
	 */
	EReference getProgramSemester_MandatoryCourses();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.Specialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialization</em>'.
	 * @see tdt4250.assign1.model.assign1.Specialization
	 * @generated
	 */
	EClass getSpecialization();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.Specialization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.assign1.model.assign1.Specialization#getName()
	 * @see #getSpecialization()
	 * @generated
	 */
	EAttribute getSpecialization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see tdt4250.assign1.model.assign1.Specialization#getSemesters()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.assign1.model.assign1.Specialization#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see tdt4250.assign1.model.assign1.Specialization#getProgram()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_Program();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.assign1.model.assign1.Specialization#getRequiredCompletedSpecialization <em>Required Completed Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required Completed Specialization</em>'.
	 * @see tdt4250.assign1.model.assign1.Specialization#getRequiredCompletedSpecialization()
	 * @see #getSpecialization()
	 * @generated
	 */
	EReference getSpecialization_RequiredCompletedSpecialization();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.assign1.model.assign1.StudyPlan#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlan#getSemesters()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Semesters();

	/**
	 * Returns the meta object for class '{@link tdt4250.assign1.model.assign1.StudyPlanSemester <em>Study Plan Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan Semester</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlanSemester
	 * @generated
	 */
	EClass getStudyPlanSemester();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlanSemester#getIndex()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EAttribute getStudyPlanSemester_Index();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getCourses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Courses</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlanSemester#getCourses()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EReference getStudyPlanSemester_Courses();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.assign1.model.assign1.StudyPlanSemester#getStudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Plan</em>'.
	 * @see tdt4250.assign1.model.assign1.StudyPlanSemester#getStudyPlan()
	 * @see #getStudyPlanSemester()
	 * @generated
	 */
	EReference getStudyPlanSemester_StudyPlan();

	/**
	 * Returns the meta object for enum '{@link tdt4250.assign1.model.assign1.CourseLevel <em>Course Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Course Level</em>'.
	 * @see tdt4250.assign1.model.assign1.CourseLevel
	 * @generated
	 */
	EEnum getCourseLevel();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Course Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Course Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="pattern='\\p{L}+\\d+'"
	 * @generated
	 */
	EDataType getCourseCode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assign1Factory getAssign1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.DepartmentImpl <em>Department</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.DepartmentImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getDepartment()
		 * @generated
		 */
		EClass DEPARTMENT = eINSTANCE.getDepartment();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__COURSES = eINSTANCE.getDepartment_Courses();

		/**
		 * The meta object literal for the '<em><b>Programs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__PROGRAMS = eINSTANCE.getDepartment_Programs();

		/**
		 * The meta object literal for the '<em><b>Study Plans</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPARTMENT__STUDY_PLANS = eINSTANCE.getDepartment_StudyPlans();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.CourseImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__GROUP = eINSTANCE.getCourse_Group();

		/**
		 * The meta object literal for the '<em><b>Study Plan Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__STUDY_PLAN_SEMESTER = eINSTANCE.getCourse_StudyPlanSemester();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__LEVEL = eINSTANCE.getCourse_Level();

		/**
		 * The meta object literal for the '<em><b>Program Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE__PROGRAM_SEMESTER = eINSTANCE.getCourse_ProgramSemester();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl <em>Elective Courses Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getElectiveCoursesGroup()
		 * @generated
		 */
		EClass ELECTIVE_COURSES_GROUP = eINSTANCE.getElectiveCoursesGroup();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSES_GROUP__COURSES = eINSTANCE.getElectiveCoursesGroup_Courses();

		/**
		 * The meta object literal for the '<em><b>Slot</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTIVE_COURSES_GROUP__SLOT = eINSTANCE.getElectiveCoursesGroup_Slot();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTIVE_COURSES_GROUP__NAME = eINSTANCE.getElectiveCoursesGroup_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.ProgramImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>Base Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__BASE_SEMESTERS = eINSTANCE.getProgram_BaseSemesters();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__SPECIALIZATIONS = eINSTANCE.getProgram_Specializations();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl <em>Program Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getProgramSemester()
		 * @generated
		 */
		EClass PROGRAM_SEMESTER = eINSTANCE.getProgramSemester();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM_SEMESTER__INDEX = eINSTANCE.getProgramSemester_Index();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__PROGRAM = eINSTANCE.getProgramSemester_Program();

		/**
		 * The meta object literal for the '<em><b>Specialization</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__SPECIALIZATION = eINSTANCE.getProgramSemester_Specialization();

		/**
		 * The meta object literal for the '<em><b>Elective Courses Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS = eINSTANCE.getProgramSemester_ElectiveCoursesSlots();

		/**
		 * The meta object literal for the '<em><b>Mandatory Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM_SEMESTER__MANDATORY_COURSES = eINSTANCE.getProgramSemester_MandatoryCourses();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl <em>Specialization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.SpecializationImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getSpecialization()
		 * @generated
		 */
		EClass SPECIALIZATION = eINSTANCE.getSpecialization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATION__NAME = eINSTANCE.getSpecialization_Name();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__SEMESTERS = eINSTANCE.getSpecialization_Semesters();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__PROGRAM = eINSTANCE.getSpecialization_Program();

		/**
		 * The meta object literal for the '<em><b>Required Completed Specialization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION = eINSTANCE
				.getSpecialization_RequiredCompletedSpecialization();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.StudyPlanImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__SEMESTERS = eINSTANCE.getStudyPlan_Semesters();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl <em>Study Plan Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getStudyPlanSemester()
		 * @generated
		 */
		EClass STUDY_PLAN_SEMESTER = eINSTANCE.getStudyPlanSemester();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_PLAN_SEMESTER__INDEX = eINSTANCE.getStudyPlanSemester_Index();

		/**
		 * The meta object literal for the '<em><b>Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN_SEMESTER__COURSES = eINSTANCE.getStudyPlanSemester_Courses();

		/**
		 * The meta object literal for the '<em><b>Study Plan</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN_SEMESTER__STUDY_PLAN = eINSTANCE.getStudyPlanSemester_StudyPlan();

		/**
		 * The meta object literal for the '{@link tdt4250.assign1.model.assign1.CourseLevel <em>Course Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.assign1.model.assign1.CourseLevel
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourseLevel()
		 * @generated
		 */
		EEnum COURSE_LEVEL = eINSTANCE.getCourseLevel();

		/**
		 * The meta object literal for the '<em>Course Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see tdt4250.assign1.model.assign1.impl.Assign1PackageImpl#getCourseCode()
		 * @generated
		 */
		EDataType COURSE_CODE = eINSTANCE.getCourseCode();

	}

} //Assign1Package
