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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Course;
import tdt4250.assign1.model.assign1.ElectiveCoursesGroup;
import tdt4250.assign1.model.assign1.ProgramSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elective Courses Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ElectiveCoursesGroupImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectiveCoursesGroupImpl extends MinimalEObjectImpl.Container implements ElectiveCoursesGroup {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCoursesGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.ELECTIVE_COURSES_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectWithInverseResolvingEList<Course>(Course.class, this,
					Assign1Package.ELECTIVE_COURSES_GROUP__COURSES, Assign1Package.COURSE__GROUP);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramSemester getSlot() {
		if (eContainerFeatureID() != Assign1Package.ELECTIVE_COURSES_GROUP__SLOT)
			return null;
		return (ProgramSemester) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(ProgramSemester newSlot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSlot, Assign1Package.ELECTIVE_COURSES_GROUP__SLOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlot(ProgramSemester newSlot) {
		if (newSlot != eInternalContainer()
				|| (eContainerFeatureID() != Assign1Package.ELECTIVE_COURSES_GROUP__SLOT && newSlot != null)) {
			if (EcoreUtil.isAncestor(this, newSlot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSlot != null)
				msgs = ((InternalEObject) newSlot).eInverseAdd(this,
						Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS, ProgramSemester.class, msgs);
			msgs = basicSetSlot(newSlot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.ELECTIVE_COURSES_GROUP__SLOT, newSlot,
					newSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.ELECTIVE_COURSES_GROUP__NAME, oldName,
					name));
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourses()).basicAdd(otherEnd, msgs);
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetSlot((ProgramSemester) otherEnd, msgs);
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			return basicSetSlot(null, msgs);
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			return eInternalContainer().eInverseRemove(this, Assign1Package.PROGRAM_SEMESTER__ELECTIVE_COURSES_SLOTS,
					ProgramSemester.class, msgs);
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			return getCourses();
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			return getSlot();
		case Assign1Package.ELECTIVE_COURSES_GROUP__NAME:
			return getName();
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends Course>) newValue);
			return;
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			setSlot((ProgramSemester) newValue);
			return;
		case Assign1Package.ELECTIVE_COURSES_GROUP__NAME:
			setName((String) newValue);
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			getCourses().clear();
			return;
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			setSlot((ProgramSemester) null);
			return;
		case Assign1Package.ELECTIVE_COURSES_GROUP__NAME:
			setName(NAME_EDEFAULT);
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
		case Assign1Package.ELECTIVE_COURSES_GROUP__COURSES:
			return courses != null && !courses.isEmpty();
		case Assign1Package.ELECTIVE_COURSES_GROUP__SLOT:
			return getSlot() != null;
		case Assign1Package.ELECTIVE_COURSES_GROUP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElectiveCoursesGroupImpl
