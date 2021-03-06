/**
 */
package org.somox.sourcecodedecorator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmt.modisco.java.Type;
import org.somox.sourcecodedecorator.ComponentImplementingClassesLink;
import org.somox.sourcecodedecorator.InterfaceSourceCodeLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;

import de.uka.ipd.sdq.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementing Classes Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#isCompositeComponent <em>Is Composite Component</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#getImplementingClasses <em>Implementing Classes</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#getSubComponents <em>Sub Components</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#getProvidedInterfaces <em>Provided Interfaces</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#getRequiredInterfaces <em>Required Interfaces</em>}</li>
 *   <li>{@link org.somox.sourcecodedecorator.impl.ComponentImplementingClassesLinkImpl#isInitialComponent <em>Is Initial Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImplementingClassesLinkImpl extends EObjectImpl implements ComponentImplementingClassesLink {
	/**
	 * The default value of the '{@link #isCompositeComponent() <em>Is Composite Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCompositeComponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_COMPONENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * The cached value of the '{@link #getImplementingClasses() <em>Implementing Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementingClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> implementingClasses;

	/**
	 * The cached value of the '{@link #getSubComponents() <em>Sub Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentImplementingClassesLink> subComponents;

	/**
	 * The cached value of the '{@link #getProvidedInterfaces() <em>Provided Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceSourceCodeLink> providedInterfaces;

	/**
	 * The cached value of the '{@link #getRequiredInterfaces() <em>Required Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceSourceCodeLink> requiredInterfaces;

	/**
	 * The default value of the '{@link #isInitialComponent() <em>Is Initial Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialComponent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INITIAL_COMPONENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitialComponent() <em>Is Initial Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialComponent()
	 * @generated
	 * @ordered
	 */
	protected boolean isInitialComponent = IS_INITIAL_COMPONENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementingClassesLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourceCodeDecoratorPackage.Literals.COMPONENT_IMPLEMENTING_CLASSES_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public boolean isCompositeComponent() {
		return this.getSubComponents().size() > 0;	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCompositeComponent() {
		// TODO: implement this method to return whether the 'Is Composite Component' attribute is set
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && component.eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject)component;
			component = (RepositoryComponent)eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getImplementingClasses() {
		if (implementingClasses == null) {
			implementingClasses = new EObjectResolvingEList<Type>(Type.class, this, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IMPLEMENTING_CLASSES);
		}
		return implementingClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentImplementingClassesLink> getSubComponents() {
		if (subComponents == null) {
			subComponents = new EObjectResolvingEList<ComponentImplementingClassesLink>(ComponentImplementingClassesLink.class, this, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__SUB_COMPONENTS);
		}
		return subComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceSourceCodeLink> getProvidedInterfaces() {
		if (providedInterfaces == null) {
			providedInterfaces = new EObjectResolvingEList<InterfaceSourceCodeLink>(InterfaceSourceCodeLink.class, this, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__PROVIDED_INTERFACES);
		}
		return providedInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceSourceCodeLink> getRequiredInterfaces() {
		if (requiredInterfaces == null) {
			requiredInterfaces = new EObjectResolvingEList<InterfaceSourceCodeLink>(InterfaceSourceCodeLink.class, this, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__REQUIRED_INTERFACES);
		}
		return requiredInterfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialComponent() {
		return isInitialComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitialComponent(boolean newIsInitialComponent) {
		boolean oldIsInitialComponent = isInitialComponent;
		isInitialComponent = newIsInitialComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_INITIAL_COMPONENT, oldIsInitialComponent, isInitialComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_COMPOSITE_COMPONENT:
				return isCompositeComponent();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT:
				if (resolve) return getComponent();
				return basicGetComponent();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IMPLEMENTING_CLASSES:
				return getImplementingClasses();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__SUB_COMPONENTS:
				return getSubComponents();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__PROVIDED_INTERFACES:
				return getProvidedInterfaces();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__REQUIRED_INTERFACES:
				return getRequiredInterfaces();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_INITIAL_COMPONENT:
				return isInitialComponent();
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
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT:
				setComponent((RepositoryComponent)newValue);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IMPLEMENTING_CLASSES:
				getImplementingClasses().clear();
				getImplementingClasses().addAll((Collection<? extends Type>)newValue);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__SUB_COMPONENTS:
				getSubComponents().clear();
				getSubComponents().addAll((Collection<? extends ComponentImplementingClassesLink>)newValue);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				getProvidedInterfaces().addAll((Collection<? extends InterfaceSourceCodeLink>)newValue);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				getRequiredInterfaces().addAll((Collection<? extends InterfaceSourceCodeLink>)newValue);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_INITIAL_COMPONENT:
				setIsInitialComponent((Boolean)newValue);
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
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT:
				setComponent((RepositoryComponent)null);
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IMPLEMENTING_CLASSES:
				getImplementingClasses().clear();
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__SUB_COMPONENTS:
				getSubComponents().clear();
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__PROVIDED_INTERFACES:
				getProvidedInterfaces().clear();
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__REQUIRED_INTERFACES:
				getRequiredInterfaces().clear();
				return;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_INITIAL_COMPONENT:
				setIsInitialComponent(IS_INITIAL_COMPONENT_EDEFAULT);
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
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_COMPOSITE_COMPONENT:
				return isSetIsCompositeComponent();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__COMPONENT:
				return component != null;
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IMPLEMENTING_CLASSES:
				return implementingClasses != null && !implementingClasses.isEmpty();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__SUB_COMPONENTS:
				return subComponents != null && !subComponents.isEmpty();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__PROVIDED_INTERFACES:
				return providedInterfaces != null && !providedInterfaces.isEmpty();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__REQUIRED_INTERFACES:
				return requiredInterfaces != null && !requiredInterfaces.isEmpty();
			case SourceCodeDecoratorPackage.COMPONENT_IMPLEMENTING_CLASSES_LINK__IS_INITIAL_COMPONENT:
				return isInitialComponent != IS_INITIAL_COMPONENT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isInitialComponent: ");
		result.append(isInitialComponent);
		result.append(')');
		return result.toString();
	}

} //ComponentImplementingClassesLinkImpl
