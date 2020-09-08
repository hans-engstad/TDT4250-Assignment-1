/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.ProgramSemester#getIndex <em>Index</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ProgramSemester#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ProgramSemester#getElectiveCoursesSlots <em>Elective Courses Slots</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ProgramSemester#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester()
 * @model
 * @generated
 */
public interface ProgramSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.ProgramSemester#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Program</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Program#getBaseSemesters <em>Base Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program</em>' container reference.
	 * @see #setProgram(Program)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester_Program()
	 * @see tdt4250.assign1.model.assign1.Program#getBaseSemesters
	 * @model opposite="baseSemesters" transient="false"
	 * @generated
	 */
	Program getProgram();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.ProgramSemester#getProgram <em>Program</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program</em>' container reference.
	 * @see #getProgram()
	 * @generated
	 */
	void setProgram(Program value);

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Specialization#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specialization)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester_Specialization()
	 * @see tdt4250.assign1.model.assign1.Specialization#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.ProgramSemester#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

	/**
	 * Returns the value of the '<em><b>Elective Courses Slots</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot <em>Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses Slots</em>' containment reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester_ElectiveCoursesSlots()
	 * @see tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot
	 * @model opposite="slot" containment="true"
	 * @generated
	 */
	EList<ElectiveCoursesGroup> getElectiveCoursesSlots();

	/**
	 * Returns the value of the '<em><b>Mandatory Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Course#getProgramSemester <em>Program Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Courses</em>' reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getProgramSemester_MandatoryCourses()
	 * @see tdt4250.assign1.model.assign1.Course#getProgramSemester
	 * @model opposite="programSemester"
	 * @generated
	 */
	EList<Course> getMandatoryCourses();

} // ProgramSemester
