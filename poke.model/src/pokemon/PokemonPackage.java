/**
 */
package pokemon;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pokemon.PokemonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/acceleo/query/1.0'"
 * @generated
 */
public interface PokemonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pokemon";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/pokeMDD/model/pokemon.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pokemon";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PokemonPackage eINSTANCE = pokemon.impl.PokemonPackageImpl.init();

	/**
	 * The meta object id for the '{@link pokemon.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.RootImpl
	 * @see pokemon.impl.PokemonPackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Pokemon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__POKEMON = 0;

	/**
	 * The feature id for the '<em><b>Move</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__MOVE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Trainer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__TRAINER = 3;

	/**
	 * The feature id for the '<em><b>Pokemon Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__POKEMON_INSTANCE = 4;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pokemon.impl.PokemonImpl <em>Pokemon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.PokemonImpl
	 * @see pokemon.impl.PokemonPackageImpl#getPokemon()
	 * @generated
	 */
	int POKEMON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__ID = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__SPRITE = 4;

	/**
	 * The feature id for the '<em><b>Base Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__BASE_EXPERIENCE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__TYPE = 6;

	/**
	 * The feature id for the '<em><b>Move</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__MOVE = 7;

	/**
	 * The number of structural features of the '<em>Pokemon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Pokemon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pokemon.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.MoveImpl
	 * @see pokemon.impl.PokemonPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ID = 1;

	/**
	 * The feature id for the '<em><b>Pp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__PP = 2;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__POWER = 3;

	/**
	 * The feature id for the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__ACCURACY = 4;

	/**
	 * The feature id for the '<em><b>Pokemon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__POKEMON = 5;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pokemon.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.TypeImpl
	 * @see pokemon.impl.PokemonPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Pokemon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__POKEMON = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pokemon.impl.PokemonInstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.PokemonInstanceImpl
	 * @see pokemon.impl.PokemonPackageImpl#getPokemonInstance()
	 * @generated
	 */
	int POKEMON_INSTANCE = 4;

	/**
	 * The feature id for the '<em><b>Pokemon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE__POKEMON = 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE__LEVEL = 1;

	/**
	 * The feature id for the '<em><b>Moves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE__MOVES = 2;

	/**
	 * The feature id for the '<em><b>Trainer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE__TRAINER = 3;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pokemon.impl.TrainerImpl <em>Trainer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pokemon.impl.TrainerImpl
	 * @see pokemon.impl.PokemonPackageImpl#getTrainer()
	 * @generated
	 */
	int TRAINER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pokemon</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINER__POKEMON = 1;

	/**
	 * The number of structural features of the '<em>Trainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Trainer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAINER_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link pokemon.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see pokemon.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link pokemon.Root#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pokemon</em>'.
	 * @see pokemon.Root#getPokemon()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Pokemon();

	/**
	 * Returns the meta object for the containment reference list '{@link pokemon.Root#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move</em>'.
	 * @see pokemon.Root#getMove()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Move();

	/**
	 * Returns the meta object for the containment reference list '{@link pokemon.Root#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see pokemon.Root#getType()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link pokemon.Root#getTrainer <em>Trainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trainer</em>'.
	 * @see pokemon.Root#getTrainer()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Trainer();

	/**
	 * Returns the meta object for the containment reference list '{@link pokemon.Root#getPokemonInstance <em>Pokemon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pokemon Instance</em>'.
	 * @see pokemon.Root#getPokemonInstance()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_PokemonInstance();

	/**
	 * Returns the meta object for class '{@link pokemon.Pokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pokemon</em>'.
	 * @see pokemon.Pokemon
	 * @generated
	 */
	EClass getPokemon();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pokemon.Pokemon#getName()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Name();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pokemon.Pokemon#getId()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Id();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see pokemon.Pokemon#getHeight()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Height();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see pokemon.Pokemon#getWeight()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Weight();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getSprite <em>Sprite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sprite</em>'.
	 * @see pokemon.Pokemon#getSprite()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Sprite();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Pokemon#getBaseExperience <em>Base Experience</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Experience</em>'.
	 * @see pokemon.Pokemon#getBaseExperience()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_BaseExperience();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.Pokemon#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Type</em>'.
	 * @see pokemon.Pokemon#getType()
	 * @see #getPokemon()
	 * @generated
	 */
	EReference getPokemon_Type();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.Pokemon#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Move</em>'.
	 * @see pokemon.Pokemon#getMove()
	 * @see #getPokemon()
	 * @generated
	 */
	EReference getPokemon_Move();

	/**
	 * Returns the meta object for class '{@link pokemon.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see pokemon.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Move#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pokemon.Move#getName()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Name();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Move#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pokemon.Move#getId()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Id();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Move#getPp <em>Pp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pp</em>'.
	 * @see pokemon.Move#getPp()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Pp();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Move#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see pokemon.Move#getPower()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Power();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Move#getAccuracy <em>Accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accuracy</em>'.
	 * @see pokemon.Move#getAccuracy()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Accuracy();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.Move#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pokemon</em>'.
	 * @see pokemon.Move#getPokemon()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Pokemon();

	/**
	 * Returns the meta object for class '{@link pokemon.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see pokemon.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pokemon.Type#getId()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Id();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pokemon.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.Type#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pokemon</em>'.
	 * @see pokemon.Type#getPokemon()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Pokemon();

	/**
	 * Returns the meta object for class '{@link pokemon.PokemonInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see pokemon.PokemonInstance
	 * @generated
	 */
	EClass getPokemonInstance();

	/**
	 * Returns the meta object for the reference '{@link pokemon.PokemonInstance#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pokemon</em>'.
	 * @see pokemon.PokemonInstance#getPokemon()
	 * @see #getPokemonInstance()
	 * @generated
	 */
	EReference getPokemonInstance_Pokemon();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.PokemonInstance#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see pokemon.PokemonInstance#getLevel()
	 * @see #getPokemonInstance()
	 * @generated
	 */
	EAttribute getPokemonInstance_Level();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.PokemonInstance#getMoves <em>Moves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Moves</em>'.
	 * @see pokemon.PokemonInstance#getMoves()
	 * @see #getPokemonInstance()
	 * @generated
	 */
	EReference getPokemonInstance_Moves();

	/**
	 * Returns the meta object for the reference '{@link pokemon.PokemonInstance#getTrainer <em>Trainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trainer</em>'.
	 * @see pokemon.PokemonInstance#getTrainer()
	 * @see #getPokemonInstance()
	 * @generated
	 */
	EReference getPokemonInstance_Trainer();

	/**
	 * Returns the meta object for class '{@link pokemon.Trainer <em>Trainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trainer</em>'.
	 * @see pokemon.Trainer
	 * @generated
	 */
	EClass getTrainer();

	/**
	 * Returns the meta object for the attribute '{@link pokemon.Trainer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pokemon.Trainer#getName()
	 * @see #getTrainer()
	 * @generated
	 */
	EAttribute getTrainer_Name();

	/**
	 * Returns the meta object for the reference list '{@link pokemon.Trainer#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pokemon</em>'.
	 * @see pokemon.Trainer#getPokemon()
	 * @see #getTrainer()
	 * @generated
	 */
	EReference getTrainer_Pokemon();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PokemonFactory getPokemonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pokemon.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.RootImpl
		 * @see pokemon.impl.PokemonPackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Pokemon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__POKEMON = eINSTANCE.getRoot_Pokemon();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__MOVE = eINSTANCE.getRoot_Move();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TYPE = eINSTANCE.getRoot_Type();

		/**
		 * The meta object literal for the '<em><b>Trainer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__TRAINER = eINSTANCE.getRoot_Trainer();

		/**
		 * The meta object literal for the '<em><b>Pokemon Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__POKEMON_INSTANCE = eINSTANCE.getRoot_PokemonInstance();

		/**
		 * The meta object literal for the '{@link pokemon.impl.PokemonImpl <em>Pokemon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.PokemonImpl
		 * @see pokemon.impl.PokemonPackageImpl#getPokemon()
		 * @generated
		 */
		EClass POKEMON = eINSTANCE.getPokemon();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__NAME = eINSTANCE.getPokemon_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__ID = eINSTANCE.getPokemon_Id();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__HEIGHT = eINSTANCE.getPokemon_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__WEIGHT = eINSTANCE.getPokemon_Weight();

		/**
		 * The meta object literal for the '<em><b>Sprite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__SPRITE = eINSTANCE.getPokemon_Sprite();

		/**
		 * The meta object literal for the '<em><b>Base Experience</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__BASE_EXPERIENCE = eINSTANCE.getPokemon_BaseExperience();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON__TYPE = eINSTANCE.getPokemon_Type();

		/**
		 * The meta object literal for the '<em><b>Move</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON__MOVE = eINSTANCE.getPokemon_Move();

		/**
		 * The meta object literal for the '{@link pokemon.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.MoveImpl
		 * @see pokemon.impl.PokemonPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__NAME = eINSTANCE.getMove_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__ID = eINSTANCE.getMove_Id();

		/**
		 * The meta object literal for the '<em><b>Pp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__PP = eINSTANCE.getMove_Pp();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__POWER = eINSTANCE.getMove_Power();

		/**
		 * The meta object literal for the '<em><b>Accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__ACCURACY = eINSTANCE.getMove_Accuracy();

		/**
		 * The meta object literal for the '<em><b>Pokemon</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__POKEMON = eINSTANCE.getMove_Pokemon();

		/**
		 * The meta object literal for the '{@link pokemon.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.TypeImpl
		 * @see pokemon.impl.PokemonPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__ID = eINSTANCE.getType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Pokemon</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__POKEMON = eINSTANCE.getType_Pokemon();

		/**
		 * The meta object literal for the '{@link pokemon.impl.PokemonInstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.PokemonInstanceImpl
		 * @see pokemon.impl.PokemonPackageImpl#getPokemonInstance()
		 * @generated
		 */
		EClass POKEMON_INSTANCE = eINSTANCE.getPokemonInstance();

		/**
		 * The meta object literal for the '<em><b>Pokemon</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_INSTANCE__POKEMON = eINSTANCE.getPokemonInstance_Pokemon();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON_INSTANCE__LEVEL = eINSTANCE.getPokemonInstance_Level();

		/**
		 * The meta object literal for the '<em><b>Moves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_INSTANCE__MOVES = eINSTANCE.getPokemonInstance_Moves();

		/**
		 * The meta object literal for the '<em><b>Trainer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_INSTANCE__TRAINER = eINSTANCE.getPokemonInstance_Trainer();

		/**
		 * The meta object literal for the '{@link pokemon.impl.TrainerImpl <em>Trainer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pokemon.impl.TrainerImpl
		 * @see pokemon.impl.PokemonPackageImpl#getTrainer()
		 * @generated
		 */
		EClass TRAINER = eINSTANCE.getTrainer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAINER__NAME = eINSTANCE.getTrainer_Name();

		/**
		 * The meta object literal for the '<em><b>Pokemon</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAINER__POKEMON = eINSTANCE.getTrainer_Pokemon();

	}

} //PokemonPackage
