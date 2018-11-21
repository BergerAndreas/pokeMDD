/**
 */
package pokemon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trainer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pokemon.Trainer#getName <em>Name</em>}</li>
 *   <li>{@link pokemon.Trainer#getPokemon <em>Pokemon</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getTrainer()
 * @model
 * @generated
 */
public interface Trainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pokemon.PokemonPackage#getTrainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pokemon.Trainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Pokemon</b></em>' reference list.
	 * The list contents are of type {@link pokemon.PokemonInstance}.
	 * It is bidirectional and its opposite is '{@link pokemon.PokemonInstance#getTrainer <em>Trainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon</em>' reference list.
	 * @see pokemon.PokemonPackage#getTrainer_Pokemon()
	 * @see pokemon.PokemonInstance#getTrainer
	 * @model opposite="trainer" required="true" upper="6"
	 * @generated
	 */
	EList<PokemonInstance> getPokemon();

} // Trainer
