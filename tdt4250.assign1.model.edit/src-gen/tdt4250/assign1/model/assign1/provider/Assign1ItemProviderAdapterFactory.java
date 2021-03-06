/**
 */
package tdt4250.assign1.model.assign1.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import tdt4250.assign1.model.assign1.util.Assign1AdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Assign1ItemProviderAdapterFactory extends Assign1AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assign1ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.Department} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepartmentItemProvider departmentItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.Department}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepartmentAdapter() {
		if (departmentItemProvider == null) {
			departmentItemProvider = new DepartmentItemProvider(this);
		}

		return departmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.Course} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseItemProvider courseItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCourseAdapter() {
		if (courseItemProvider == null) {
			courseItemProvider = new CourseItemProvider(this);
		}

		return courseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectiveCoursesGroupItemProvider electiveCoursesGroupItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.ElectiveCoursesGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createElectiveCoursesGroupAdapter() {
		if (electiveCoursesGroupItemProvider == null) {
			electiveCoursesGroupItemProvider = new ElectiveCoursesGroupItemProvider(this);
		}

		return electiveCoursesGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.Program} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramItemProvider programItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.Program}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramAdapter() {
		if (programItemProvider == null) {
			programItemProvider = new ProgramItemProvider(this);
		}

		return programItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.ProgramSemester} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramSemesterItemProvider programSemesterItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.ProgramSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramSemesterAdapter() {
		if (programSemesterItemProvider == null) {
			programSemesterItemProvider = new ProgramSemesterItemProvider(this);
		}

		return programSemesterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.Specialization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationItemProvider specializationItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.Specialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSpecializationAdapter() {
		if (specializationItemProvider == null) {
			specializationItemProvider = new SpecializationItemProvider(this);
		}

		return specializationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.StudyPlan} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanItemProvider studyPlanItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.StudyPlan}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudyPlanAdapter() {
		if (studyPlanItemProvider == null) {
			studyPlanItemProvider = new StudyPlanItemProvider(this);
		}

		return studyPlanItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link tdt4250.assign1.model.assign1.StudyPlanSemester} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanSemesterItemProvider studyPlanSemesterItemProvider;

	/**
	 * This creates an adapter for a {@link tdt4250.assign1.model.assign1.StudyPlanSemester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStudyPlanSemesterAdapter() {
		if (studyPlanSemesterItemProvider == null) {
			studyPlanSemesterItemProvider = new StudyPlanSemesterItemProvider(this);
		}

		return studyPlanSemesterItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (departmentItemProvider != null)
			departmentItemProvider.dispose();
		if (courseItemProvider != null)
			courseItemProvider.dispose();
		if (electiveCoursesGroupItemProvider != null)
			electiveCoursesGroupItemProvider.dispose();
		if (programItemProvider != null)
			programItemProvider.dispose();
		if (programSemesterItemProvider != null)
			programSemesterItemProvider.dispose();
		if (specializationItemProvider != null)
			specializationItemProvider.dispose();
		if (studyPlanItemProvider != null)
			studyPlanItemProvider.dispose();
		if (studyPlanSemesterItemProvider != null)
			studyPlanSemesterItemProvider.dispose();
	}

}
