/**
 */
package tdt4250.assign1.model.assign1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Course;
import tdt4250.assign1.model.assign1.Department;
import tdt4250.assign1.model.assign1.Program;
import tdt4250.assign1.model.assign1.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Department</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.DepartmentImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.DepartmentImpl#getPrograms <em>Programs</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.DepartmentImpl#getStudyPlans <em>Study Plans</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DepartmentImpl extends MinimalEObjectImpl.Container implements Department {
	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The cached value of the '{@link #getPrograms() <em>Programs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrograms()
	 * @generated
	 * @ordered
	 */
	protected EList<Program> programs;

	/**
	 * The cached value of the '{@link #getStudyPlans() <em>Study Plans</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlans()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyPlan> studyPlans;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.DEPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectContainmentEList<Course>(Course.class, this, Assign1Package.DEPARTMENT__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Program> getPrograms() {
		if (programs == null) {
			programs = new EObjectContainmentEList<Program>(Program.class, this, Assign1Package.DEPARTMENT__PROGRAMS);
		}
		return programs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyPlan> getStudyPlans() {
		if (studyPlans == null) {
			studyPlans = new EObjectContainmentEList<StudyPlan>(StudyPlan.class, this,
					Assign1Package.DEPARTMENT__STUDY_PLANS);
		}
		return studyPlans;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assign1Package.DEPARTMENT__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case Assign1Package.DEPARTMENT__PROGRAMS:
			return ((InternalEList<?>) getPrograms()).basicRemove(otherEnd, msgs);
		case Assign1Package.DEPARTMENT__STUDY_PLANS:
			return ((InternalEList<?>) getStudyPlans()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Assign1Package.DEPARTMENT__COURSES:
			return getCourses();
		case Assign1Package.DEPARTMENT__PROGRAMS:
			return getPrograms();
		case Assign1Package.DEPARTMENT__STUDY_PLANS:
			return getStudyPlans();
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
		case Assign1Package.DEPARTMENT__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends Course>) newValue);
			return;
		case Assign1Package.DEPARTMENT__PROGRAMS:
			getPrograms().clear();
			getPrograms().addAll((Collection<? extends Program>) newValue);
			return;
		case Assign1Package.DEPARTMENT__STUDY_PLANS:
			getStudyPlans().clear();
			getStudyPlans().addAll((Collection<? extends StudyPlan>) newValue);
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
		case Assign1Package.DEPARTMENT__COURSES:
			getCourses().clear();
			return;
		case Assign1Package.DEPARTMENT__PROGRAMS:
			getPrograms().clear();
			return;
		case Assign1Package.DEPARTMENT__STUDY_PLANS:
			getStudyPlans().clear();
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
		case Assign1Package.DEPARTMENT__COURSES:
			return courses != null && !courses.isEmpty();
		case Assign1Package.DEPARTMENT__PROGRAMS:
			return programs != null && !programs.isEmpty();
		case Assign1Package.DEPARTMENT__STUDY_PLANS:
			return studyPlans != null && !studyPlans.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DepartmentImpl
