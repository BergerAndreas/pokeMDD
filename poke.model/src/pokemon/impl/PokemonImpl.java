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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonInstance;
import pokemon.PokemonPackage;
import pokemon.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pokemon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pokemon.impl.PokemonImpl#getName <em>Name</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getId <em>Id</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getSprite <em>Sprite</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getBaseExperience <em>Base Experience</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getType <em>Type</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getMove <em>Move</em>}</li>
 *   <li>{@link pokemon.impl.PokemonImpl#getPokemonInstance <em>Pokemon Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonImpl extends MinimalEObjectImpl.Container implements Pokemon {
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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSprite() <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprite()
	 * @generated
	 * @ordered
	 */
	protected static final String SPRITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSprite() <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSprite()
	 * @generated
	 * @ordered
	 */
	protected String sprite = SPRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseExperience() <em>Base Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExperience()
	 * @generated
	 * @ordered
	 */
	protected static final int BASE_EXPERIENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBaseExperience() <em>Base Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseExperience()
	 * @generated
	 * @ordered
	 */
	protected int baseExperience = BASE_EXPERIENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * The cached value of the '{@link #getMove() <em>Move</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMove()
	 * @generated
	 * @ordered
	 */
	protected EList<Move> move;

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
	protected PokemonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemonPackage.Literals.POKEMON;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSprite() {
		return sprite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSprite(String newSprite) {
		String oldSprite = sprite;
		sprite = newSprite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__SPRITE, oldSprite, sprite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBaseExperience() {
		return baseExperience;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseExperience(int newBaseExperience) {
		int oldBaseExperience = baseExperience;
		baseExperience = newBaseExperience;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemonPackage.POKEMON__BASE_EXPERIENCE, oldBaseExperience, baseExperience));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectWithInverseResolvingEList.ManyInverse<Type>(Type.class, this, PokemonPackage.POKEMON__TYPE, PokemonPackage.TYPE__POKEMON);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Move> getMove() {
		if (move == null) {
			move = new EObjectWithInverseResolvingEList.ManyInverse<Move>(Move.class, this, PokemonPackage.POKEMON__MOVE, PokemonPackage.MOVE__POKEMON);
		}
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PokemonInstance> getPokemonInstance() {
		if (pokemonInstance == null) {
			pokemonInstance = new EObjectContainmentWithInverseEList<PokemonInstance>(PokemonInstance.class, this, PokemonPackage.POKEMON__POKEMON_INSTANCE, PokemonPackage.POKEMON_INSTANCE__POKEMON);
		}
		return pokemonInstance;
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
			case PokemonPackage.POKEMON__TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getType()).basicAdd(otherEnd, msgs);
			case PokemonPackage.POKEMON__MOVE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMove()).basicAdd(otherEnd, msgs);
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPokemonInstance()).basicAdd(otherEnd, msgs);
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
			case PokemonPackage.POKEMON__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case PokemonPackage.POKEMON__MOVE:
				return ((InternalEList<?>)getMove()).basicRemove(otherEnd, msgs);
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
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
			case PokemonPackage.POKEMON__NAME:
				return getName();
			case PokemonPackage.POKEMON__ID:
				return getId();
			case PokemonPackage.POKEMON__HEIGHT:
				return getHeight();
			case PokemonPackage.POKEMON__WEIGHT:
				return getWeight();
			case PokemonPackage.POKEMON__SPRITE:
				return getSprite();
			case PokemonPackage.POKEMON__BASE_EXPERIENCE:
				return getBaseExperience();
			case PokemonPackage.POKEMON__TYPE:
				return getType();
			case PokemonPackage.POKEMON__MOVE:
				return getMove();
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
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
			case PokemonPackage.POKEMON__NAME:
				setName((String)newValue);
				return;
			case PokemonPackage.POKEMON__ID:
				setId((Integer)newValue);
				return;
			case PokemonPackage.POKEMON__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case PokemonPackage.POKEMON__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case PokemonPackage.POKEMON__SPRITE:
				setSprite((String)newValue);
				return;
			case PokemonPackage.POKEMON__BASE_EXPERIENCE:
				setBaseExperience((Integer)newValue);
				return;
			case PokemonPackage.POKEMON__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
				return;
			case PokemonPackage.POKEMON__MOVE:
				getMove().clear();
				getMove().addAll((Collection<? extends Move>)newValue);
				return;
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
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
			case PokemonPackage.POKEMON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__ID:
				setId(ID_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__SPRITE:
				setSprite(SPRITE_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__BASE_EXPERIENCE:
				setBaseExperience(BASE_EXPERIENCE_EDEFAULT);
				return;
			case PokemonPackage.POKEMON__TYPE:
				getType().clear();
				return;
			case PokemonPackage.POKEMON__MOVE:
				getMove().clear();
				return;
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
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
			case PokemonPackage.POKEMON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PokemonPackage.POKEMON__ID:
				return id != ID_EDEFAULT;
			case PokemonPackage.POKEMON__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case PokemonPackage.POKEMON__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case PokemonPackage.POKEMON__SPRITE:
				return SPRITE_EDEFAULT == null ? sprite != null : !SPRITE_EDEFAULT.equals(sprite);
			case PokemonPackage.POKEMON__BASE_EXPERIENCE:
				return baseExperience != BASE_EXPERIENCE_EDEFAULT;
			case PokemonPackage.POKEMON__TYPE:
				return type != null && !type.isEmpty();
			case PokemonPackage.POKEMON__MOVE:
				return move != null && !move.isEmpty();
			case PokemonPackage.POKEMON__POKEMON_INSTANCE:
				return pokemonInstance != null && !pokemonInstance.isEmpty();
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
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", sprite: ");
		result.append(sprite);
		result.append(", baseExperience: ");
		result.append(baseExperience);
		result.append(')');
		return result.toString();
	}

} //PokemonImpl
