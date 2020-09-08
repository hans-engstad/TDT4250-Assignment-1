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
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Program;
import tdt4250.assign1.model.assign1.ProgramSemester;
import tdt4250.assign1.model.assign1.Specialization;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramImpl#getBaseSemesters <em>Base Semesters</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.ProgramImpl#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
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
	 * The cached value of the '{@link #getBaseSemesters() <em>Base Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgramSemester> baseSemesters;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specialization> specializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.PROGRAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgramSemester> getBaseSemesters() {
		if (baseSemesters == null) {
			baseSemesters = new EObjectContainmentWithInverseEList<ProgramSemester>(ProgramSemester.class, this,
					Assign1Package.PROGRAM__BASE_SEMESTERS, Assign1Package.PROGRAM_SEMESTER__PROGRAM);
		}
		return baseSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specialization> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specialization>(Specialization.class, this,
					Assign1Package.PROGRAM__SPECIALIZATIONS, Assign1Package.SPECIALIZATION__PROGRAM);
		}
		return specializations;
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
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getBaseSemesters()).basicAdd(otherEnd, msgs);
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSpecializations()).basicAdd(otherEnd, msgs);
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
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			return ((InternalEList<?>) getBaseSemesters()).basicRemove(otherEnd, msgs);
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			return ((InternalEList<?>) getSpecializations()).basicRemove(otherEnd, msgs);
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
		case Assign1Package.PROGRAM__NAME:
			return getName();
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			return getBaseSemesters();
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			return getSpecializations();
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
		case Assign1Package.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			getBaseSemesters().clear();
			getBaseSemesters().addAll((Collection<? extends ProgramSemester>) newValue);
			return;
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			getSpecializations().clear();
			getSpecializations().addAll((Collection<? extends Specialization>) newValue);
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
		case Assign1Package.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			getBaseSemesters().clear();
			return;
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			getSpecializations().clear();
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
		case Assign1Package.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assign1Package.PROGRAM__BASE_SEMESTERS:
			return baseSemesters != null && !baseSemesters.isEmpty();
		case Assign1Package.PROGRAM__SPECIALIZATIONS:
			return specializations != null && !specializations.isEmpty();
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

} //ProgramImpl
