/**
 */
package pokemon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonInstance;
import pokemon.PokemonPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pokemon.impl.PokemonInstanceImpl#getPokemon <em>Pokemon</em>}</li>
 *   <li>{@link pokemon.impl.PokemonInstanceImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link pokemon.impl.PokemonInstanceImpl#getMoves <em>Moves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonInstanceImpl extends MinimalEObjectImpl.Container implements PokemonInstance {
	/**
	 * The cached value of the '{@link #getPokemon() <em>Pokemon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPokemon()
	 * @generated
	 * @ordered
	 */
	protected Pokemon pokemon;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected int level = LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMoves() <em>Moves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoves()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> moves;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PokemonInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemonPackage.Literals.POKEMON_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pokemon getPokemon() {
		if (pokemon != null && pokemon.eIsProxy()) {
			InternalEObject oldPokemon = (InternalEObject)pokemon;
			pokemon = (Pokemon)eResolveProxy(oldPokemon);
			if (pokemon != oldPokemon) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PokemonPackage.POKEMON_INSTANCE__POKEMON, oldPokemon, pokemon));
			}
		}
		return pokemon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pokemon basicGetPokemon() {
		return pokemon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPokemon(Pokemon newPokemon) {
		Pokemon oldPokemon = pokemon;
		pokemon = newPokemon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON_INSTANCE__POKEMON, oldPokemon, pokemon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(int newLevel) {
		int oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON_INSTANCE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMoves() {
		if (moves == null) {
			moves = new EObjectResolvingEList<Move>(Move.class, this, PokemonPackage.POKEMON_INSTANCE__MOVES);
		}
		return moves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				if (resolve) return getPokemon();
				return basicGetPokemon();
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				return getLevel();
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				return getMoves();
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				setPokemon((Pokemon)newValue);
				return;
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				setLevel((Integer)newValue);
				return;
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				getMoves().clear();
				getMoves().addAll((Collection<? extends Move>)newValue);
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				setPokemon((Pokemon)null);
				return;
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				getMoves().clear();
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				return pokemon != null;
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				return moves != null && !moves.isEmpty();
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
		result.append(" (level: ");
		result.append(level);
		result.append(')');
		return result.toString();
	}

} //PokemonInstanceImpl
