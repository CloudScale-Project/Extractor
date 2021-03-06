/**
 */
package org.somox.sourcecodedecorator.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.somox.sourcecodedecorator.PCMSystemImplementatingClassesLink;
import org.somox.sourcecodedecorator.SourceCodeDecoratorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCM System Implementating Classes Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.somox.sourcecodedecorator.impl.PCMSystemImplementatingClassesLinkImpl#getSystemModel <em>System Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PCMSystemImplementatingClassesLinkImpl extends ComponentImplementingClassesLinkImpl implements PCMSystemImplementatingClassesLink {
	/**
	 * The cached value of the '{@link #getSystemModel() <em>System Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemModel()
	 * @generated
	 * @ordered
	 */
	protected de.uka.ipd.sdq.pcm.system.System systemModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PCMSystemImplementatingClassesLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SourceCodeDecoratorPackage.Literals.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uka.ipd.sdq.pcm.system.System getSystemModel() {
		if (systemModel != null && systemModel.eIsProxy()) {
			InternalEObject oldSystemModel = (InternalEObject)systemModel;
			systemModel = (de.uka.ipd.sdq.pcm.system.System)eResolveProxy(oldSystemModel);
			if (systemModel != oldSystemModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL, oldSystemModel, systemModel));
			}
		}
		return systemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public de.uka.ipd.sdq.pcm.system.System basicGetSystemModel() {
		return systemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemModel(de.uka.ipd.sdq.pcm.system.System newSystemModel) {
		de.uka.ipd.sdq.pcm.system.System oldSystemModel = systemModel;
		systemModel = newSystemModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL, oldSystemModel, systemModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL:
				if (resolve) return getSystemModel();
				return basicGetSystemModel();
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
			case SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL:
				setSystemModel((de.uka.ipd.sdq.pcm.system.System)newValue);
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
			case SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL:
				setSystemModel((de.uka.ipd.sdq.pcm.system.System)null);
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
			case SourceCodeDecoratorPackage.PCM_SYSTEM_IMPLEMENTATING_CLASSES_LINK__SYSTEM_MODEL:
				return systemModel != null;
		}
		return super.eIsSet(featureID);
	}

} //PCMSystemImplementatingClassesLinkImpl
