/**
 */
package tdt4250.assign1.model.assign1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elective Courses Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot <em>Slot</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.assign1.model.assign1.Assign1Package#getElectiveCoursesGroup()
 * @model
 * @generated
 */
public interface ElectiveCoursesGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.assign1.model.assign1.Course}.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.Course#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getElectiveCoursesGroup_Courses()
	 * @see tdt4250.assign1.model.assign1.Course#getGroup
	 * @model opposite="group"
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.assign1.model.assign1.ProgramSemester#getElectiveCoursesSlots <em>Elective Courses Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' container reference.
	 * @see #setSlot(ProgramSemester)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getElectiveCoursesGroup_Slot()
	 * @see tdt4250.assign1.model.assign1.ProgramSemester#getElectiveCoursesSlots
	 * @model opposite="electiveCoursesSlots" transient="false"
	 * @generated
	 */
	ProgramSemester getSlot();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getSlot <em>Slot</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' container reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(ProgramSemester value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.assign1.model.assign1.Assign1Package#getElectiveCoursesGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ElectiveCoursesGroup
