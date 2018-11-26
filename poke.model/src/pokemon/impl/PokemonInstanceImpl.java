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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonInstance;
import pokemon.PokemonPackage;
import pokemon.Trainer;

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
 *   <li>{@link pokemon.impl.PokemonInstanceImpl#getTrainer <em>Trainer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonInstanceImpl extends MinimalEObjectImpl.Container implements PokemonInstance {
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
	 * The cached value of the '{@link #getTrainer() <em>Trainer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainer()
	 * @generated
	 * @ordered
	 */
	protected Trainer trainer;

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
		if (eContainerFeatureID() != PokemonPackage.POKEMON_INSTANCE__POKEMON) return null;
		return (Pokemon)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPokemon(Pokemon newPokemon, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPokemon, PokemonPackage.POKEMON_INSTANCE__POKEMON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPokemon(Pokemon newPokemon) {
		if (newPokemon != eInternalContainer() || (eContainerFeatureID() != PokemonPackage.POKEMON_INSTANCE__POKEMON && newPokemon != null)) {
			if (EcoreUtil.isAncestor(this, newPokemon))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPokemon != null)
				msgs = ((InternalEObject)newPokemon).eInverseAdd(this, PokemonPackage.POKEMON__POKEMON_INSTANCE, Pokemon.class, msgs);
			msgs = basicSetPokemon(newPokemon, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON_INSTANCE__POKEMON, newPokemon, newPokemon));
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
	public Trainer getTrainer() {
		if (trainer != null && trainer.eIsProxy()) {
			InternalEObject oldTrainer = (InternalEObject)trainer;
			trainer = (Trainer)eResolveProxy(oldTrainer);
			if (trainer != oldTrainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PokemonPackage.POKEMON_INSTANCE__TRAINER, oldTrainer, trainer));
			}
		}
		return trainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trainer basicGetTrainer() {
		return trainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrainer(Trainer newTrainer, NotificationChain msgs) {
		Trainer oldTrainer = trainer;
		trainer = newTrainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON_INSTANCE__TRAINER, oldTrainer, newTrainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainer(Trainer newTrainer) {
		if (newTrainer != trainer) {
			NotificationChain msgs = null;
			if (trainer != null)
				msgs = ((InternalEObject)trainer).eInverseRemove(this, PokemonPackage.TRAINER__POKEMON, Trainer.class, msgs);
			if (newTrainer != null)
				msgs = ((InternalEObject)newTrainer).eInverseAdd(this, PokemonPackage.TRAINER__POKEMON, Trainer.class, msgs);
			msgs = basicSetTrainer(newTrainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON_INSTANCE__TRAINER, newTrainer, newTrainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPokemon((Pokemon)otherEnd, msgs);
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				if (trainer != null)
					msgs = ((InternalEObject)trainer).eInverseRemove(this, PokemonPackage.TRAINER__POKEMON, Trainer.class, msgs);
				return basicSetTrainer((Trainer)otherEnd, msgs);
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				return basicSetPokemon(null, msgs);
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				return basicSetTrainer(null, msgs);
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				return eInternalContainer().eInverseRemove(this, PokemonPackage.POKEMON__POKEMON_INSTANCE, Pokemon.class, msgs);
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
			case PokemonPackage.POKEMON_INSTANCE__POKEMON:
				return getPokemon();
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				return getLevel();
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				return getMoves();
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				if (resolve) return getTrainer();
				return basicGetTrainer();
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
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				setTrainer((Trainer)newValue);
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
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				setTrainer((Trainer)null);
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
				return getPokemon() != null;
			case PokemonPackage.POKEMON_INSTANCE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case PokemonPackage.POKEMON_INSTANCE__MOVES:
				return moves != null && !moves.isEmpty();
			case PokemonPackage.POKEMON_INSTANCE__TRAINER:
				return trainer != null;
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
