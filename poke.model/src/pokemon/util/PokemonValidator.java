/**
 */
package pokemon.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import pokemon.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see pokemon.PokemonPackage
 * @generated
 */
public class PokemonValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PokemonValidator INSTANCE = new PokemonValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "pokemon";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return PokemonPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case PokemonPackage.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			case PokemonPackage.POKEMON:
				return validatePokemon((Pokemon)value, diagnostics, context);
			case PokemonPackage.MOVE:
				return validateMove((Move)value, diagnostics, context);
			case PokemonPackage.TYPE:
				return validateType((Type)value, diagnostics, context);
			case PokemonPackage.POKEMON_INSTANCE:
				return validatePokemonInstance((PokemonInstance)value, diagnostics, context);
			case PokemonPackage.TRAINER:
				return validateTrainer((Trainer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemon(Pokemon pokemon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pokemon, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validatePokemon_noNegativeWeight(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validatePokemon_noNegativeHeight(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validatePokemon_noNegativeBaseExperience(pokemon, diagnostics, context);
		if (result || diagnostics != null) result &= validatePokemon_validSpriteUrl(pokemon, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noNegativeWeight constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POKEMON__NO_NEGATIVE_WEIGHT__EEXPRESSION = "self.weight >= 0";

	/**
	 * Validates the noNegativeWeight constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemon_noNegativeWeight(Pokemon pokemon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.POKEMON,
				 pokemon,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "noNegativeWeight",
				 POKEMON__NO_NEGATIVE_WEIGHT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noNegativeHeight constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POKEMON__NO_NEGATIVE_HEIGHT__EEXPRESSION = "self.height >= 0";

	/**
	 * Validates the noNegativeHeight constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemon_noNegativeHeight(Pokemon pokemon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.POKEMON,
				 pokemon,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "noNegativeHeight",
				 POKEMON__NO_NEGATIVE_HEIGHT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noNegativeBaseExperience constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POKEMON__NO_NEGATIVE_BASE_EXPERIENCE__EEXPRESSION = "self.baseExperience >= 0";

	/**
	 * Validates the noNegativeBaseExperience constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemon_noNegativeBaseExperience(Pokemon pokemon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.POKEMON,
				 pokemon,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "noNegativeBaseExperience",
				 POKEMON__NO_NEGATIVE_BASE_EXPERIENCE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the validSpriteUrl constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POKEMON__VALID_SPRITE_URL__EEXPRESSION = "self.sprite.matches('^(http|https)://[a-zA-Z./]+\\\\d+.png')";

	/**
	 * Validates the validSpriteUrl constraint of '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemon_validSpriteUrl(Pokemon pokemon, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.POKEMON,
				 pokemon,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "validSpriteUrl",
				 POKEMON__VALID_SPRITE_URL__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(move, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(move, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(move, diagnostics, context);
		if (result || diagnostics != null) result &= validateMove_ppMustBePercentage(move, diagnostics, context);
		if (result || diagnostics != null) result &= validateMove_powerMustBePercentage(move, diagnostics, context);
		if (result || diagnostics != null) result &= validateMove_accuracyMustBePercentage(move, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ppMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__PP_MUST_BE_PERCENTAGE__EEXPRESSION = "(self.pp >= 0) and self.pp <= 100";

	/**
	 * Validates the ppMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_ppMustBePercentage(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.MOVE,
				 move,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "ppMustBePercentage",
				 MOVE__PP_MUST_BE_PERCENTAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the powerMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__POWER_MUST_BE_PERCENTAGE__EEXPRESSION = "self.power >= 0 and self.power <= 100";

	/**
	 * Validates the powerMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_powerMustBePercentage(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.MOVE,
				 move,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "powerMustBePercentage",
				 MOVE__POWER_MUST_BE_PERCENTAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the accuracyMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MOVE__ACCURACY_MUST_BE_PERCENTAGE__EEXPRESSION = "self.accuracy >= 0 and self.accuracy <= 100";

	/**
	 * Validates the accuracyMustBePercentage constraint of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMove_accuracyMustBePercentage(Move move, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(PokemonPackage.Literals.MOVE,
				 move,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "accuracyMustBePercentage",
				 MOVE__ACCURACY_MUST_BE_PERCENTAGE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateType(Type type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePokemonInstance(PokemonInstance pokemonInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pokemonInstance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrainer(Trainer trainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trainer, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //PokemonValidator
