/**
 */
package pokemon.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonInstance;
import pokemon.PokemonPackage;
import pokemon.Root;
import pokemon.Trainer;
import pokemon.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pokemon.impl.RootImpl#getPokemon <em>Pokemon</em>}</li>
 *   <li>{@link pokemon.impl.RootImpl#getMove <em>Move</em>}</li>
 *   <li>{@link pokemon.impl.RootImpl#getType <em>Type</em>}</li>
 *   <li>{@link pokemon.impl.RootImpl#getTrainer <em>Trainer</em>}</li>
 *   <li>{@link pokemon.impl.RootImpl#getPokemonInstance <em>Pokemon Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getPokemon() <em>Pokemon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPokemon()
	 * @generated
	 * @ordered
	 */
	protected EList<Pokemon> pokemon;

	/**
	 * The cached value of the '{@link #getMove() <em>Move</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> move;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * The cached value of the '{@link #getTrainer() <em>Trainer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainer()
	 * @generated
	 * @ordered
	 */
	protected EList<Trainer> trainer;

	/**
	 * The cached value of the '{@link #getPokemonInstance() <em>Pokemon Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPokemonInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<PokemonInstance> pokemonInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemonPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pokemon> getPokemon() {
		if (pokemon == null) {
			pokemon = new EObjectContainmentEList<Pokemon>(Pokemon.class, this, PokemonPackage.ROOT__POKEMON);
		}
		return pokemon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMove() {
		if (move == null) {
			move = new EObjectContainmentEList<Move>(Move.class, this, PokemonPackage.ROOT__MOVE);
		}
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Type>(Type.class, this, PokemonPackage.ROOT__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trainer> getTrainer() {
		if (trainer == null) {
			trainer = new EObjectContainmentEList<Trainer>(Trainer.class, this, PokemonPackage.ROOT__TRAINER);
		}
		return trainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PokemonInstance> getPokemonInstance() {
		if (pokemonInstance == null) {
			pokemonInstance = new EObjectContainmentEList<PokemonInstance>(PokemonInstance.class, this, PokemonPackage.ROOT__POKEMON_INSTANCE);
		}
		return pokemonInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PokemonPackage.ROOT__POKEMON:
				return ((InternalEList<?>)getPokemon()).basicRemove(otherEnd, msgs);
			case PokemonPackage.ROOT__MOVE:
				return ((InternalEList<?>)getMove()).basicRemove(otherEnd, msgs);
			case PokemonPackage.ROOT__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case PokemonPackage.ROOT__TRAINER:
				return ((InternalEList<?>)getTrainer()).basicRemove(otherEnd, msgs);
			case PokemonPackage.ROOT__POKEMON_INSTANCE:
				return ((InternalEList<?>)getPokemonInstance()).basicRemove(otherEnd, msgs);
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
			case PokemonPackage.ROOT__POKEMON:
				return getPokemon();
			case PokemonPackage.ROOT__MOVE:
				return getMove();
			case PokemonPackage.ROOT__TYPE:
				return getType();
			case PokemonPackage.ROOT__TRAINER:
				return getTrainer();
			case PokemonPackage.ROOT__POKEMON_INSTANCE:
				return getPokemonInstance();
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
			case PokemonPackage.ROOT__POKEMON:
				getPokemon().clear();
				getPokemon().addAll((Collection<? extends Pokemon>)newValue);
				return;
			case PokemonPackage.ROOT__MOVE:
				getMove().clear();
				getMove().addAll((Collection<? extends Move>)newValue);
				return;
			case PokemonPackage.ROOT__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
				return;
			case PokemonPackage.ROOT__TRAINER:
				getTrainer().clear();
				getTrainer().addAll((Collection<? extends Trainer>)newValue);
				return;
			case PokemonPackage.ROOT__POKEMON_INSTANCE:
				getPokemonInstance().clear();
				getPokemonInstance().addAll((Collection<? extends PokemonInstance>)newValue);
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
			case PokemonPackage.ROOT__POKEMON:
				getPokemon().clear();
				return;
			case PokemonPackage.ROOT__MOVE:
				getMove().clear();
				return;
			case PokemonPackage.ROOT__TYPE:
				getType().clear();
				return;
			case PokemonPackage.ROOT__TRAINER:
				getTrainer().clear();
				return;
			case PokemonPackage.ROOT__POKEMON_INSTANCE:
				getPokemonInstance().clear();
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
			case PokemonPackage.ROOT__POKEMON:
				return pokemon != null && !pokemon.isEmpty();
			case PokemonPackage.ROOT__MOVE:
				return move != null && !move.isEmpty();
			case PokemonPackage.ROOT__TYPE:
				return type != null && !type.isEmpty();
			case PokemonPackage.ROOT__TRAINER:
				return trainer != null && !trainer.isEmpty();
			case PokemonPackage.ROOT__POKEMON_INSTANCE:
				return pokemonInstance != null && !pokemonInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
