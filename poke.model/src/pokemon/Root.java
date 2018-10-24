/**
 */
package pokemon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pokemon.Root#getPokemon <em>Pokemon</em>}</li>
 *   <li>{@link pokemon.Root#getMove <em>Move</em>}</li>
 *   <li>{@link pokemon.Root#getType <em>Type</em>}</li>
 *   <li>{@link pokemon.Root#getTrainer <em>Trainer</em>}</li>
 *   <li>{@link pokemon.Root#getPokemonInstance <em>Pokemon Instance</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Pokemon</b></em>' containment reference list.
	 * The list contents are of type {@link pokemon.Pokemon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon</em>' containment reference list.
	 * @see pokemon.PokemonPackage#getRoot_Pokemon()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pokemon> getPokemon();

	/**
	 * Returns the value of the '<em><b>Move</b></em>' containment reference list.
	 * The list contents are of type {@link pokemon.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' containment reference list.
	 * @see pokemon.PokemonPackage#getRoot_Move()
	 * @model containment="true"
	 * @generated
	 */
	EList<Move> getMove();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link pokemon.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see pokemon.PokemonPackage#getRoot_Type()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Trainer</b></em>' containment reference list.
	 * The list contents are of type {@link pokemon.Trainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trainer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainer</em>' containment reference list.
	 * @see pokemon.PokemonPackage#getRoot_Trainer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Trainer> getTrainer();

	/**
	 * Returns the value of the '<em><b>Pokemon Instance</b></em>' reference list.
	 * The list contents are of type {@link pokemon.PokemonInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon Instance</em>' reference list.
	 * @see pokemon.PokemonPackage#getRoot_PokemonInstance()
	 * @model
	 * @generated
	 */
	EList<PokemonInstance> getPokemonInstance();

} // Root
