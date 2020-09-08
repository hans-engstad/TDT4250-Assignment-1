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
import tdt4250.assign1.model.assign1.StudyPlan;
import tdt4250.assign1.model.assign1.StudyPlanSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.StudyPlanSemesterImpl#getStudyPlan <em>Study Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanSemesterImpl extends MinimalEObjectImpl.Container implements StudyPlanSemester {
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
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanSemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.STUDY_PLAN_SEMESTER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.STUDY_PLAN_SEMESTER__INDEX, oldIndex,
					index));
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
					Assign1Package.STUDY_PLAN_SEMESTER__COURSES, Assign1Package.COURSE__STUDY_PLAN_SEMESTER);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlan getStudyPlan() {
		if (eContainerFeatureID() != Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN)
			return null;
		return (StudyPlan) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlan(StudyPlan newStudyPlan, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newStudyPlan, Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlan(StudyPlan newStudyPlan) {
		if (newStudyPlan != eInternalContainer()
				|| (eContainerFeatureID() != Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN && newStudyPlan != null)) {
			if (EcoreUtil.isAncestor(this, newStudyPlan))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyPlan != null)
				msgs = ((InternalEObject) newStudyPlan).eInverseAdd(this, Assign1Package.STUDY_PLAN__SEMESTERS,
						StudyPlan.class, msgs);
			msgs = basicSetStudyPlan(newStudyPlan, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN,
					newStudyPlan, newStudyPlan));
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
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getCourses()).basicAdd(otherEnd, msgs);
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetStudyPlan((StudyPlan) otherEnd, msgs);
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
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			return ((InternalEList<?>) getCourses()).basicRemove(otherEnd, msgs);
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			return basicSetStudyPlan(null, msgs);
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
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			return eInternalContainer().eInverseRemove(this, Assign1Package.STUDY_PLAN__SEMESTERS, StudyPlan.class,
					msgs);
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
		case Assign1Package.STUDY_PLAN_SEMESTER__INDEX:
			return getIndex();
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			return getCourses();
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			return getStudyPlan();
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
		case Assign1Package.STUDY_PLAN_SEMESTER__INDEX:
			setIndex((Integer) newValue);
			return;
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			getCourses().clear();
			getCourses().addAll((Collection<? extends Course>) newValue);
			return;
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			setStudyPlan((StudyPlan) newValue);
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
		case Assign1Package.STUDY_PLAN_SEMESTER__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			getCourses().clear();
			return;
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			setStudyPlan((StudyPlan) null);
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
		case Assign1Package.STUDY_PLAN_SEMESTER__INDEX:
			return index != INDEX_EDEFAULT;
		case Assign1Package.STUDY_PLAN_SEMESTER__COURSES:
			return courses != null && !courses.isEmpty();
		case Assign1Package.STUDY_PLAN_SEMESTER__STUDY_PLAN:
			return getStudyPlan() != null;
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

} //StudyPlanSemesterImpl
