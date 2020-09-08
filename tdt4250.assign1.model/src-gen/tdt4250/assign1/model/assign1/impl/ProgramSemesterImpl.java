/**
 */
package tdt4250.assign1.model.assign1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Course;
import tdt4250.assign1.model.assign1.ElectiveCoursesGroup;
import tdt4250.assign1.model.assign1.Program;
import tdt4250.assign1.model.assign1.ProgramSemester;
import tdt4250.assign1.model.assign1.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl#getSpecialization <em>Specialization</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl#getElectiveCoursesSlots <em>Elective Courses Slots</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramSemesterImpl#getMandatoryCourses <em>Mandatory Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramSemesterImpl extends MinimalEObjectImpl.Container implements ProgramSemester {
	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectiveCoursesSlots() <em>Elective Courses Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCoursesSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectiveCoursesGroup> electiveCoursesSlots;

	/**
	 * The cached value of the '{@link #getMandatoryCourses() <em>Mandatory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> mandatoryCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.PROGRAM_SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.PROGRAM_SEMESTER__INDEX, oldIndex,
					index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != Assign1Package.PROGRAM_SEMESTER__PROGRAM)
			return null;
		return (Program) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProgram, Assign1Package.PROGRAM_SEMESTER__PROGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgram(Program newProgram) {
		if (newProgram != eInternalContainer()
				|| (eContainerFeatureID() != Assign1Package.PROGRAM_SEMESTER__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject) newProgram).eInverseAdd(this, Assign1Package.PROGRAM__BASE_SEMESTERS,
						Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.PROGRAM_SEMESTER__PROGRAM, newProgram,
					newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getSpecialization() {
		if (eContainerFeatureID() != Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION)
			return null;
		return (Specialization) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Specialization newSpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSpecialization, Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(Specialization newSpecialization) {
		if (newSpecialization != eInternalContainer()
				|| (eContainerFeatureID() != Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION
						&& newSpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject) newSpecialization).eInverseAdd(this, Assign1Package.SPECIALIZATION__SEMESTERS,
						Specialization.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION,
					newSpecialization, newSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElectiveCoursesGroup> getElectiveCoursesSlots() {
		if (electiveCoursesSlots == null) {
			electiveCoursesSlots = new EObjectContainmentWithInverseEList<ElectiveCoursesGroup>(
					ElectiveCoursesGroup.class, this, Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS,
					Assign1Package.ELECTIVE_COURSES_GROUP__SLOT);
		}
		return electiveCoursesSlots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getMandatoryCourses() {
		if (mandatoryCourses == null) {
			mandatoryCourses = new EObjectWithInverseResolvingEList<Course>(Course.class, this,
					Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES, Assign1Package.COURSE__PROGRAM_SEMESTER);
		}
		return mandatoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProgram((Program) otherEnd, msgs);
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSpecialization((Specialization) otherEnd, msgs);
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElectiveCoursesSlots()).basicAdd(otherEnd,
					msgs);
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getMandatoryCourses()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			return basicSetProgram(null, msgs);
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			return basicSetSpecialization(null, msgs);
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			return ((InternalEList<?>) getElectiveCoursesSlots()).basicRemove(otherEnd, msgs);
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			return ((InternalEList<?>) getMandatoryCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			return eInternalContainer().eInverseRemove(this, Assign1Package.PROGRAM__BASE_SEMESTERS, Program.class,
					msgs);
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			return eInternalContainer().eInverseRemove(this, Assign1Package.SPECIALIZATION__SEMESTERS,
					Specialization.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__INDEX:
			return getIndex();
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			return getProgram();
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			return getSpecialization();
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			return getElectiveCoursesSlots();
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			return getMandatoryCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__INDEX:
			setIndex((Integer) newValue);
			return;
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			setProgram((Program) newValue);
			return;
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			setSpecialization((Specialization) newValue);
			return;
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			getElectiveCoursesSlots().clear();
			getElectiveCoursesSlots().addAll((Collection<? extends ElectiveCoursesGroup>) newValue);
			return;
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			getMandatoryCourses().clear();
			getMandatoryCourses().addAll((Collection<? extends Course>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			setProgram((Program) null);
			return;
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			setSpecialization((Specialization) null);
			return;
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			getElectiveCoursesSlots().clear();
			return;
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			getMandatoryCourses().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Assign1Package.PROGRAM_SEMESTER__INDEX:
			return index != INDEX_EDEFAULT;
		case Assign1Package.PROGRAM_SEMESTER__PROGRAM:
			return getProgram() != null;
		case Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION:
			return getSpecialization() != null;
		case Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS:
			return electiveCoursesSlots != null && !electiveCoursesSlots.isEmpty();
		case Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES:
			return mandatoryCourses != null && !mandatoryCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //ProgramSemesterImpl
