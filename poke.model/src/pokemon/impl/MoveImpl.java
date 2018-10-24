/**
 */
package pokemon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pokemon.impl.MoveImpl#getName <em>Name</em>}</li>
 *   <li>{@link pokemon.impl.MoveImpl#getId <em>Id</em>}</li>
 *   <li>{@link pokemon.impl.MoveImpl#getPp <em>Pp</em>}</li>
 *   <li>{@link pokemon.impl.MoveImpl#getPower <em>Power</em>}</li>
 *   <li>{@link pokemon.impl.MoveImpl#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link pokemon.impl.MoveImpl#getPokemon <em>Pokemon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveImpl extends MinimalEObjectImpl.Container implements Move {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected static final int PP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPp() <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPp()
	 * @generated
	 * @ordered
	 */
	protected int pp = PP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected int power = POWER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCURACY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccuracy() <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccuracy()
	 * @generated
	 * @ordered
	 */
	protected int accuracy = ACCURACY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPokemon() <em>Pokemon</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPokemon()
	 * @generated
	 * @ordered
	 */
	protected EList<Pokemon> pokemon;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemonPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.MOVE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.MOVE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPp() {
		return pp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPp(int newPp) {
		int oldPp = pp;
		pp = newPp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.MOVE__PP, oldPp, pp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(int newPower) {
		int oldPower = power;
		power = newPower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.MOVE__POWER, oldPower, power));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccuracy() {
		return accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccuracy(int newAccuracy) {
		int oldAccuracy = accuracy;
		accuracy = newAccuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.MOVE__ACCURACY, oldAccuracy, accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pokemon> getPokemon() {
		if (pokemon == null) {
			pokemon = new EObjectWithInverseResolvingEList.ManyInverse<Pokemon>(Pokemon.class, this, PokemonPackage.MOVE__POKEMON, PokemonPackage.POKEMON__MOVE);
		}
		return pokemon;
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
			case PokemonPackage.MOVE__POKEMON:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPokemon()).basicAdd(otherEnd, msgs);
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
			case PokemonPackage.MOVE__POKEMON:
				return ((InternalEList<?>)getPokemon()).basicRemove(otherEnd, msgs);
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
			case PokemonPackage.MOVE__NAME:
				return getName();
			case PokemonPackage.MOVE__ID:
				return getId();
			case PokemonPackage.MOVE__PP:
				return getPp();
			case PokemonPackage.MOVE__POWER:
				return getPower();
			case PokemonPackage.MOVE__ACCURACY:
				return getAccuracy();
			case PokemonPackage.MOVE__POKEMON:
				return getPokemon();
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
			case PokemonPackage.MOVE__NAME:
				setName((String)newValue);
				return;
			case PokemonPackage.MOVE__ID:
				setId((Integer)newValue);
				return;
			case PokemonPackage.MOVE__PP:
				setPp((Integer)newValue);
				return;
			case PokemonPackage.MOVE__POWER:
				setPower((Integer)newValue);
				return;
			case PokemonPackage.MOVE__ACCURACY:
				setAccuracy((Integer)newValue);
				return;
			case PokemonPackage.MOVE__POKEMON:
				getPokemon().clear();
				getPokemon().addAll((Collection<? extends Pokemon>)newValue);
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
			case PokemonPackage.MOVE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PokemonPackage.MOVE__ID:
				setId(ID_EDEFAULT);
				return;
			case PokemonPackage.MOVE__PP:
				setPp(PP_EDEFAULT);
				return;
			case PokemonPackage.MOVE__POWER:
				setPower(POWER_EDEFAULT);
				return;
			case PokemonPackage.MOVE__ACCURACY:
				setAccuracy(ACCURACY_EDEFAULT);
				return;
			case PokemonPackage.MOVE__POKEMON:
				getPokemon().clear();
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
			case PokemonPackage.MOVE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PokemonPackage.MOVE__ID:
				return id != ID_EDEFAULT;
			case PokemonPackage.MOVE__PP:
				return pp != PP_EDEFAULT;
			case PokemonPackage.MOVE__POWER:
				return power != POWER_EDEFAULT;
			case PokemonPackage.MOVE__ACCURACY:
				return accuracy != ACCURACY_EDEFAULT;
			case PokemonPackage.MOVE__POKEMON:
				return pokemon != null && !pokemon.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", pp: ");
		result.append(pp);
		result.append(", power: ");
		result.append(power);
		result.append(", accuracy: ");
		result.append(accuracy);
		result.append(')');
		return result.toString();
	}

} //MoveImpl
