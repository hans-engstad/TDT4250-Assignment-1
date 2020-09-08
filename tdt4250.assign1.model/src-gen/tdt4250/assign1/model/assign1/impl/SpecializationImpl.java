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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Program;
import tdt4250.assign1.model.assign1.ProgramSemester;
import tdt4250.assign1.model.assign1.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specialization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl#getProgram <em>Program</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.SpecializationImpl#getRequiredCompletedSpecialization <em>Required Completed Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationImpl extends MinimalEObjectImpl.Container implements Specialization {
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
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramSemester> semesters;

	/**
	 * The cached value of the '{@link #getRequiredCompletedSpecialization() <em>Required Completed Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredCompletedSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization requiredCompletedSpecialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.SPECIALIZATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.SPECIALIZATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<ProgramSemester>(ProgramSemester.class, this,
					Assign1Package.SPECIALIZATION__SEMESTERS, Assign1Package.PROGRAM_SEMESTER__SPECIALIZATION);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program getProgram() {
		if (eContainerFeatureID() != Assign1Package.SPECIALIZATION__PROGRAM)
			return null;
		return (Program) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgram(Program newProgram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newProgram, Assign1Package.SPECIALIZATION__PROGRAM, msgs);
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
				|| (eContainerFeatureID() != Assign1Package.SPECIALIZATION__PROGRAM && newProgram != null)) {
			if (EcoreUtil.isAncestor(this, newProgram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgram != null)
				msgs = ((InternalEObject) newProgram).eInverseAdd(this, Assign1Package.PROGRAM__SPECIALIZATIONS,
						Program.class, msgs);
			msgs = basicSetProgram(newProgram, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.SPECIALIZATION__PROGRAM, newProgram,
					newProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specialization getRequiredCompletedSpecialization() {
		if (requiredCompletedSpecialization != null && requiredCompletedSpecialization.eIsProxy()) {
			InternalEObject oldRequiredCompletedSpecialization = (InternalEObject) requiredCompletedSpecialization;
			requiredCompletedSpecialization = (Specialization) eResolveProxy(oldRequiredCompletedSpecialization);
			if (requiredCompletedSpecialization != oldRequiredCompletedSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION,
							oldRequiredCompletedSpecialization, requiredCompletedSpecialization));
			}
		}
		return requiredCompletedSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetRequiredCompletedSpecialization() {
		return requiredCompletedSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequiredCompletedSpecialization(Specialization newRequiredCompletedSpecialization) {
		Specialization oldRequiredCompletedSpecialization = requiredCompletedSpecialization;
		requiredCompletedSpecialization = newRequiredCompletedSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION,
					oldRequiredCompletedSpecialization, requiredCompletedSpecialization));
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
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSemesters()).basicAdd(otherEnd, msgs);
		case Assign1Package.SPECIALIZATION__PROGRAM:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetProgram((Program) otherEnd, msgs);
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
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			return ((InternalEList<?>) getSemesters()).basicRemove(otherEnd, msgs);
		case Assign1Package.SPECIALIZATION__PROGRAM:
			return basicSetProgram(null, msgs);
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
		case Assign1Package.SPECIALIZATION__PROGRAM:
			return eInternalContainer().eInverseRemove(this, Assign1Package.PROGRAM__SPECIALIZATIONS, Program.class,
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
		case Assign1Package.SPECIALIZATION__NAME:
			return getName();
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			return getSemesters();
		case Assign1Package.SPECIALIZATION__PROGRAM:
			return getProgram();
		case Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION:
			if (resolve)
				return getRequiredCompletedSpecialization();
			return basicGetRequiredCompletedSpecialization();
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
		case Assign1Package.SPECIALIZATION__NAME:
			setName((String) newValue);
			return;
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			getSemesters().clear();
			getSemesters().addAll((Collection<? extends ProgramSemester>) newValue);
			return;
		case Assign1Package.SPECIALIZATION__PROGRAM:
			setProgram((Program) newValue);
			return;
		case Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION:
			setRequiredCompletedSpecialization((Specialization) newValue);
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
		case Assign1Package.SPECIALIZATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			getSemesters().clear();
			return;
		case Assign1Package.SPECIALIZATION__PROGRAM:
			setProgram((Program) null);
			return;
		case Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION:
			setRequiredCompletedSpecialization((Specialization) null);
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
		case Assign1Package.SPECIALIZATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assign1Package.SPECIALIZATION__SEMESTERS:
			return semesters != null && !semesters.isEmpty();
		case Assign1Package.SPECIALIZATION__PROGRAM:
			return getProgram() != null;
		case Assign1Package.SPECIALIZATION__REQUIRED_COMPLETED_SPECIALIZATION:
			return requiredCompletedSpecialization != null;
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

} //SpecializationImpl
