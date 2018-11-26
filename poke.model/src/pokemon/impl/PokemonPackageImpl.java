/**
 */
package pokemon.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pokemon.Move;
import pokemon.Pokemon;
import pokemon.PokemonFactory;
import pokemon.PokemonInstance;
import pokemon.PokemonPackage;
import pokemon.Root;
import pokemon.Trainer;
import pokemon.Type;

import pokemon.util.PokemonValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PokemonPackageImpl extends EPackageImpl implements PokemonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pokemon.PokemonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PokemonPackageImpl() {
		super(eNS_URI, PokemonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PokemonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PokemonPackage init() {
		if (isInited) return (PokemonPackage)EPackage.Registry.INSTANCE.getEPackage(PokemonPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPokemonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PokemonPackageImpl thePokemonPackage = registeredPokemonPackage instanceof PokemonPackageImpl ? (PokemonPackageImpl)registeredPokemonPackage : new PokemonPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePokemonPackage.createPackageContents();

		// Initialize created meta-data
		thePokemonPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(thePokemonPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return PokemonValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePokemonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PokemonPackage.eNS_URI, thePokemonPackage);
		return thePokemonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Pokemon() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Move() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Type() {
		return (EReference)rootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Trainer() {
		return (EReference)rootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemon() {
		return pokemonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Name() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Id() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Height() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Weight() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Sprite() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_BaseExperience() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemon_Type() {
		return (EReference)pokemonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemon_Move() {
		return (EReference)pokemonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemon_PokemonInstance() {
		return (EReference)pokemonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Name() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Id() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Pp() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Power() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Accuracy() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Pokemon() {
		return (EReference)moveEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Id() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getType_Name() {
		return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Pokemon() {
		return (EReference)typeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemonInstance() {
		return pokemonInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonInstance_Pokemon() {
		return (EReference)pokemonInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemonInstance_Level() {
		return (EAttribute)pokemonInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonInstance_Moves() {
		return (EReference)pokemonInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonInstance_Trainer() {
		return (EReference)pokemonInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrainer() {
		return trainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrainer_Name() {
		return (EAttribute)trainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrainer_Pokemon() {
		return (EReference)trainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonFactory getPokemonFactory() {
		return (PokemonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__POKEMON);
		createEReference(rootEClass, ROOT__MOVE);
		createEReference(rootEClass, ROOT__TYPE);
		createEReference(rootEClass, ROOT__TRAINER);

		pokemonEClass = createEClass(POKEMON);
		createEAttribute(pokemonEClass, POKEMON__NAME);
		createEAttribute(pokemonEClass, POKEMON__ID);
		createEAttribute(pokemonEClass, POKEMON__HEIGHT);
		createEAttribute(pokemonEClass, POKEMON__WEIGHT);
		createEAttribute(pokemonEClass, POKEMON__SPRITE);
		createEAttribute(pokemonEClass, POKEMON__BASE_EXPERIENCE);
		createEReference(pokemonEClass, POKEMON__TYPE);
		createEReference(pokemonEClass, POKEMON__MOVE);
		createEReference(pokemonEClass, POKEMON__POKEMON_INSTANCE);

		moveEClass = createEClass(MOVE);
		createEAttribute(moveEClass, MOVE__NAME);
		createEAttribute(moveEClass, MOVE__ID);
		createEAttribute(moveEClass, MOVE__PP);
		createEAttribute(moveEClass, MOVE__POWER);
		createEAttribute(moveEClass, MOVE__ACCURACY);
		createEReference(moveEClass, MOVE__POKEMON);

		typeEClass = createEClass(TYPE);
		createEAttribute(typeEClass, TYPE__ID);
		createEAttribute(typeEClass, TYPE__NAME);
		createEReference(typeEClass, TYPE__POKEMON);

		pokemonInstanceEClass = createEClass(POKEMON_INSTANCE);
		createEReference(pokemonInstanceEClass, POKEMON_INSTANCE__POKEMON);
		createEAttribute(pokemonInstanceEClass, POKEMON_INSTANCE__LEVEL);
		createEReference(pokemonInstanceEClass, POKEMON_INSTANCE__MOVES);
		createEReference(pokemonInstanceEClass, POKEMON_INSTANCE__TRAINER);

		trainerEClass = createEClass(TRAINER);
		createEAttribute(trainerEClass, TRAINER__NAME);
		createEReference(trainerEClass, TRAINER__POKEMON);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Pokemon(), this.getPokemon(), null, "pokemon", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Move(), this.getMove(), null, "move", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Type(), this.getType(), null, "type", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Trainer(), this.getTrainer(), null, "trainer", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pokemonEClass, Pokemon.class, "Pokemon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPokemon_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Height(), ecorePackage.getEInt(), "height", null, 1, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Weight(), ecorePackage.getEInt(), "weight", null, 1, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Sprite(), ecorePackage.getEString(), "sprite", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_BaseExperience(), ecorePackage.getEInt(), "baseExperience", null, 1, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemon_Type(), this.getType(), this.getType_Pokemon(), "type", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemon_Move(), this.getMove(), this.getMove_Pokemon(), "move", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemon_PokemonInstance(), this.getPokemonInstance(), this.getPokemonInstance_Pokemon(), "pokemonInstance", null, 0, -1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMove_Name(), ecorePackage.getEString(), "name", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Pp(), ecorePackage.getEInt(), "pp", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Power(), ecorePackage.getEInt(), "power", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMove_Accuracy(), ecorePackage.getEInt(), "accuracy", null, 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMove_Pokemon(), this.getPokemon(), this.getPokemon_Move(), "pokemon", null, 0, -1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getType_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 1, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType_Pokemon(), this.getPokemon(), this.getPokemon_Type(), "pokemon", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pokemonInstanceEClass, PokemonInstance.class, "PokemonInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPokemonInstance_Pokemon(), this.getPokemon(), this.getPokemon_PokemonInstance(), "pokemon", null, 1, 1, PokemonInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemonInstance_Level(), ecorePackage.getEInt(), "level", null, 0, 1, PokemonInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemonInstance_Moves(), this.getMove(), null, "moves", null, 1, 4, PokemonInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemonInstance_Trainer(), this.getTrainer(), this.getTrainer_Pokemon(), "trainer", null, 0, 1, PokemonInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trainerEClass, Trainer.class, "Trainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrainer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Trainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrainer_Pokemon(), this.getPokemonInstance(), this.getPokemonInstance_Trainer(), "pokemon", null, 1, 6, Trainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/acceleo/query/1.0
		create_1Annotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "validationDelegates", "http://www.eclipse.org/acceleo/query/1.0"
		   });
		addAnnotation
		  (pokemonEClass,
		   source,
		   new String[] {
			   "constraints", "noNegativeWeight noNegativeHeight noNegativeBaseExperience validSpriteUrl"
		   });
		addAnnotation
		  (moveEClass,
		   source,
		   new String[] {
			   "constraints", "ppMustBePercentage powerMustBePercentage accuracyMustBePercentage"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/acceleo/query/1.0</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void create_1Annotations() {
		String source = "http://www.eclipse.org/acceleo/query/1.0";
		addAnnotation
		  (pokemonEClass,
		   source,
		   new String[] {
			   "noNegativeWeight", "self.weight >= 0",
			   "noNegativeHeight", "self.height >= 0",
			   "noNegativeBaseExperience", "self.baseExperience >= 0",
			   "validSpriteUrl", "self.sprite.matches(\'^(http|https)://[a-zA-Z./]+\\\\d+.png\')"
		   });
		addAnnotation
		  (moveEClass,
		   source,
		   new String[] {
			   "ppMustBePercentage", "(self.pp >= 0) and self.pp <= 100",
			   "powerMustBePercentage", "self.power >= 0 and self.power <= 100",
			   "accuracyMustBePercentage", "self.accuracy >= 0 and self.accuracy <= 100"
		   });
	}

} //PokemonPackageImpl
