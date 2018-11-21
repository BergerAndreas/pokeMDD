/**
 */
package pokemon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pokemon.PokemonInstance#getPokemon <em>Pokemon</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getLevel <em>Level</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getMoves <em>Moves</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getTrainer <em>Trainer</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getPokemonInstance()
 * @model
 * @generated
 */
public interface PokemonInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Pokemon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon</em>' reference.
	 * @see #setPokemon(Pokemon)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Pokemon()
	 * @model required="true"
	 * @generated
	 */
	Pokemon getPokemon();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getPokemon <em>Pokemon</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pokemon</em>' reference.
	 * @see #getPokemon()
	 * @generated
	 */
	void setPokemon(Pokemon value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Moves</b></em>' reference list.
	 * The list contents are of type {@link pokemon.Move}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Moves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moves</em>' reference list.
	 * @see pokemon.PokemonPackage#getPokemonInstance_Moves()
	 * @model required="true" upper="4"
	 * @generated
	 */
	EList<Move> getMoves();

	/**
	 * Returns the value of the '<em><b>Trainer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pokemon.Trainer#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trainer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trainer</em>' reference.
	 * @see #setTrainer(Trainer)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Trainer()
	 * @see pokemon.Trainer#getPokemon
	 * @model opposite="pokemon"
	 * @generated
	 */
	Trainer getTrainer();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getTrainer <em>Trainer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trainer</em>' reference.
	 * @see #getTrainer()
	 * @generated
	 */
	void setTrainer(Trainer value);

} // PokemonInstance
