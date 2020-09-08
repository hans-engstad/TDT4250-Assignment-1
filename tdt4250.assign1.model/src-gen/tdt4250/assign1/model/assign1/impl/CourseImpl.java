/**
 */
package tdt4250.assign1.model.assign1.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.assign1.model.assign1.Assign1Package;
import tdt4250.assign1.model.assign1.Course;
import tdt4250.assign1.model.assign1.CourseLevel;
import tdt4250.assign1.model.assign1.ElectiveCoursesGroup;
import tdt4250.assign1.model.assign1.ProgramSemester;
import tdt4250.assign1.model.assign1.StudyPlanSemester;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getStudyPlanSemester <em>Study Plan Semester</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.assign1.model.assign1.impl.CourseImpl#getProgramSemester <em>Program Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

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
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected ElectiveCoursesGroup group;

	/**
	 * The cached value of the '{@link #getStudyPlanSemester() <em>Study Plan Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyPlanSemester()
	 * @generated
	 * @ordered
	 */
	protected StudyPlanSemester studyPlanSemester;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final CourseLevel LEVEL_EDEFAULT = CourseLevel.UNDERGRADUATE;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected CourseLevel level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProgramSemester() <em>Program Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramSemester()
	 * @generated
	 * @ordered
	 */
	protected ProgramSemester programSemester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assign1Package.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__CODE, oldCode, code));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElectiveCoursesGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject) group;
			group = (ElectiveCoursesGroup) eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assign1Package.COURSE__GROUP, oldGroup,
							group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectiveCoursesGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(ElectiveCoursesGroup newGroup, NotificationChain msgs) {
		ElectiveCoursesGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__GROUP,
					oldGroup, newGroup);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGroup(ElectiveCoursesGroup newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject) group).eInverseRemove(this, Assign1Package.ELECTIVE_COURSES_GROUP__COURSES,
						ElectiveCoursesGroup.class, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject) newGroup).eInverseAdd(this, Assign1Package.ELECTIVE_COURSES_GROUP__COURSES,
						ElectiveCoursesGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyPlanSemester getStudyPlanSemester() {
		if (studyPlanSemester != null && studyPlanSemester.eIsProxy()) {
			InternalEObject oldStudyPlanSemester = (InternalEObject) studyPlanSemester;
			studyPlanSemester = (StudyPlanSemester) eResolveProxy(oldStudyPlanSemester);
			if (studyPlanSemester != oldStudyPlanSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Assign1Package.COURSE__STUDY_PLAN_SEMESTER, oldStudyPlanSemester, studyPlanSemester));
			}
		}
		return studyPlanSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyPlanSemester basicGetStudyPlanSemester() {
		return studyPlanSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyPlanSemester(StudyPlanSemester newStudyPlanSemester, NotificationChain msgs) {
		StudyPlanSemester oldStudyPlanSemester = studyPlanSemester;
		studyPlanSemester = newStudyPlanSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assign1Package.COURSE__STUDY_PLAN_SEMESTER, oldStudyPlanSemester, newStudyPlanSemester);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyPlanSemester(StudyPlanSemester newStudyPlanSemester) {
		if (newStudyPlanSemester != studyPlanSemester) {
			NotificationChain msgs = null;
			if (studyPlanSemester != null)
				msgs = ((InternalEObject) studyPlanSemester).eInverseRemove(this,
						Assign1Package.STUDY_PLAN_SEMESTER__COURSES, StudyPlanSemester.class, msgs);
			if (newStudyPlanSemester != null)
				msgs = ((InternalEObject) newStudyPlanSemester).eInverseAdd(this,
						Assign1Package.STUDY_PLAN_SEMESTER__COURSES, StudyPlanSemester.class, msgs);
			msgs = basicSetStudyPlanSemester(newStudyPlanSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__STUDY_PLAN_SEMESTER,
					newStudyPlanSemester, newStudyPlanSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLevel(CourseLevel newLevel) {
		CourseLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgramSemester getProgramSemester() {
		if (programSemester != null && programSemester.eIsProxy()) {
			InternalEObject oldProgramSemester = (InternalEObject) programSemester;
			programSemester = (ProgramSemester) eResolveProxy(oldProgramSemester);
			if (programSemester != oldProgramSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assign1Package.COURSE__PROGRAM_SEMESTER,
							oldProgramSemester, programSemester));
			}
		}
		return programSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramSemester basicGetProgramSemester() {
		return programSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramSemester(ProgramSemester newProgramSemester, NotificationChain msgs) {
		ProgramSemester oldProgramSemester = programSemester;
		programSemester = newProgramSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Assign1Package.COURSE__PROGRAM_SEMESTER, oldProgramSemester, newProgramSemester);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramSemester(ProgramSemester newProgramSemester) {
		if (newProgramSemester != programSemester) {
			NotificationChain msgs = null;
			if (programSemester != null)
				msgs = ((InternalEObject) programSemester).eInverseRemove(this,
						Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES, ProgramSemester.class, msgs);
			if (newProgramSemester != null)
				msgs = ((InternalEObject) newProgramSemester).eInverseAdd(this,
						Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES, ProgramSemester.class, msgs);
			msgs = basicSetProgramSemester(newProgramSemester, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assign1Package.COURSE__PROGRAM_SEMESTER,
					newProgramSemester, newProgramSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Assign1Package.COURSE__GROUP:
			if (group != null)
				msgs = ((InternalEObject) group).eInverseRemove(this, Assign1Package.ELECTIVE_COURSES_GROUP__COURSES,
						ElectiveCoursesGroup.class, msgs);
			return basicSetGroup((ElectiveCoursesGroup) otherEnd, msgs);
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			if (studyPlanSemester != null)
				msgs = ((InternalEObject) studyPlanSemester).eInverseRemove(this,
						Assign1Package.STUDY_PLAN_SEMESTER__COURSES, StudyPlanSemester.class, msgs);
			return basicSetStudyPlanSemester((StudyPlanSemester) otherEnd, msgs);
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			if (programSemester != null)
				msgs = ((InternalEObject) programSemester).eInverseRemove(this,
						Assign1Package.PROGRAM_SEMESTER__MANDATORY_COURSES, ProgramSemester.class, msgs);
			return basicSetProgramSemester((ProgramSemester) otherEnd, msgs);
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
		case Assign1Package.COURSE__GROUP:
			return basicSetGroup(null, msgs);
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			return basicSetStudyPlanSemester(null, msgs);
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			return basicSetProgramSemester(null, msgs);
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
		case Assign1Package.COURSE__CODE:
			return getCode();
		case Assign1Package.COURSE__NAME:
			return getName();
		case Assign1Package.COURSE__CREDITS:
			return getCredits();
		case Assign1Package.COURSE__GROUP:
			if (resolve)
				return getGroup();
			return basicGetGroup();
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			if (resolve)
				return getStudyPlanSemester();
			return basicGetStudyPlanSemester();
		case Assign1Package.COURSE__LEVEL:
			return getLevel();
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			if (resolve)
				return getProgramSemester();
			return basicGetProgramSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Assign1Package.COURSE__CODE:
			setCode((String) newValue);
			return;
		case Assign1Package.COURSE__NAME:
			setName((String) newValue);
			return;
		case Assign1Package.COURSE__CREDITS:
			setCredits((Float) newValue);
			return;
		case Assign1Package.COURSE__GROUP:
			setGroup((ElectiveCoursesGroup) newValue);
			return;
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			setStudyPlanSemester((StudyPlanSemester) newValue);
			return;
		case Assign1Package.COURSE__LEVEL:
			setLevel((CourseLevel) newValue);
			return;
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			setProgramSemester((ProgramSemester) newValue);
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
		case Assign1Package.COURSE__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Assign1Package.COURSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Assign1Package.COURSE__CREDITS:
			setCredits(CREDITS_EDEFAULT);
			return;
		case Assign1Package.COURSE__GROUP:
			setGroup((ElectiveCoursesGroup) null);
			return;
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			setStudyPlanSemester((StudyPlanSemester) null);
			return;
		case Assign1Package.COURSE__LEVEL:
			setLevel(LEVEL_EDEFAULT);
			return;
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			setProgramSemester((ProgramSemester) null);
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
		case Assign1Package.COURSE__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Assign1Package.COURSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Assign1Package.COURSE__CREDITS:
			return credits != CREDITS_EDEFAULT;
		case Assign1Package.COURSE__GROUP:
			return group != null;
		case Assign1Package.COURSE__STUDY_PLAN_SEMESTER:
			return studyPlanSemester != null;
		case Assign1Package.COURSE__LEVEL:
			return level != LEVEL_EDEFAULT;
		case Assign1Package.COURSE__PROGRAM_SEMESTER:
			return programSemester != null;
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
		result.append(" (code: ");
		result.append(code);
		result.append(", name: ");
		result.append(name);
		result.append(", credits: ");
		result.append(credits);
		result.append(", level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
