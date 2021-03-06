/**
 */
package org.somox.seff2javaast.impl;

import de.uka.ipd.sdq.pcm.seff.ServiceEffectSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmt.modisco.java.Block;

import org.somox.seff2javaast.SEFF2MethodMapping;
import org.somox.seff2javaast.Seff2methodPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEFF2 Method Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.somox.seff2javaast.impl.SEFF2MethodMappingImpl#getBlockstatement <em>Blockstatement</em>}</li>
 *   <li>{@link org.somox.seff2javaast.impl.SEFF2MethodMappingImpl#getSeff <em>Seff</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SEFF2MethodMappingImpl extends EObjectImpl implements SEFF2MethodMapping {
	/**
	 * The cached value of the '{@link #getBlockstatement() <em>Blockstatement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockstatement()
	 * @generated
	 * @ordered
	 */
	protected Block blockstatement;

	/**
	 * The cached value of the '{@link #getSeff() <em>Seff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeff()
	 * @generated
	 * @ordered
	 */
	protected ServiceEffectSpecification seff;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SEFF2MethodMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Seff2methodPackage.Literals.SEFF2_METHOD_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlockstatement() {
		if (blockstatement != null && blockstatement.eIsProxy()) {
			InternalEObject oldBlockstatement = (InternalEObject)blockstatement;
			blockstatement = (Block)eResolveProxy(oldBlockstatement);
			if (blockstatement != oldBlockstatement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT, oldBlockstatement, blockstatement));
			}
		}
		return blockstatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block basicGetBlockstatement() {
		return blockstatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockstatement(Block newBlockstatement) {
		Block oldBlockstatement = blockstatement;
		blockstatement = newBlockstatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT, oldBlockstatement, blockstatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEffectSpecification getSeff() {
		if (seff != null && seff.eIsProxy()) {
			InternalEObject oldSeff = (InternalEObject)seff;
			seff = (ServiceEffectSpecification)eResolveProxy(oldSeff);
			if (seff != oldSeff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF, oldSeff, seff));
			}
		}
		return seff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceEffectSpecification basicGetSeff() {
		return seff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeff(ServiceEffectSpecification newSeff) {
		ServiceEffectSpecification oldSeff = seff;
		seff = newSeff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF, oldSeff, seff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT:
				if (resolve) return getBlockstatement();
				return basicGetBlockstatement();
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF:
				if (resolve) return getSeff();
				return basicGetSeff();
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
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT:
				setBlockstatement((Block)newValue);
				return;
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF:
				setSeff((ServiceEffectSpecification)newValue);
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
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT:
				setBlockstatement((Block)null);
				return;
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF:
				setSeff((ServiceEffectSpecification)null);
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
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__BLOCKSTATEMENT:
				return blockstatement != null;
			case Seff2methodPackage.SEFF2_METHOD_MAPPING__SEFF:
				return seff != null;
		}
		return super.eIsSet(featureID);
	}

} //SEFF2MethodMappingImpl
