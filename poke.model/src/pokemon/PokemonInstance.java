/**
 */
package pokemon;

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
 *   <li>{@link pokemon.PokemonInstance#getTrainer <em>Trainer</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getMove1 <em>Move1</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getMove2 <em>Move2</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getMove3 <em>Move3</em>}</li>
 *   <li>{@link pokemon.PokemonInstance#getMove4 <em>Move4</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getPokemonInstance()
 * @model
 * @generated
 */
public interface PokemonInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Pokemon</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link pokemon.Pokemon#getPokemonInstance <em>Pokemon Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon</em>' container reference.
	 * @see #setPokemon(Pokemon)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Pokemon()
	 * @see pokemon.Pokemon#getPokemonInstance
	 * @model opposite="pokemonInstance" required="true" transient="false"
	 * @generated
	 */
	Pokemon getPokemon();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getPokemon <em>Pokemon</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pokemon</em>' container reference.
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

	/**
	 * Returns the value of the '<em><b>Move1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move1</em>' reference.
	 * @see #setMove1(Move)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Move1()
	 * @model
	 * @generated
	 */
	Move getMove1();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getMove1 <em>Move1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move1</em>' reference.
	 * @see #getMove1()
	 * @generated
	 */
	void setMove1(Move value);

	/**
	 * Returns the value of the '<em><b>Move2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move2</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move2</em>' reference.
	 * @see #setMove2(Move)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Move2()
	 * @model
	 * @generated
	 */
	Move getMove2();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getMove2 <em>Move2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move2</em>' reference.
	 * @see #getMove2()
	 * @generated
	 */
	void setMove2(Move value);

	/**
	 * Returns the value of the '<em><b>Move3</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move3</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move3</em>' reference.
	 * @see #setMove3(Move)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Move3()
	 * @model
	 * @generated
	 */
	Move getMove3();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getMove3 <em>Move3</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move3</em>' reference.
	 * @see #getMove3()
	 * @generated
	 */
	void setMove3(Move value);

	/**
	 * Returns the value of the '<em><b>Move4</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move4</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move4</em>' reference.
	 * @see #setMove4(Move)
	 * @see pokemon.PokemonPackage#getPokemonInstance_Move4()
	 * @model
	 * @generated
	 */
	Move getMove4();

	/**
	 * Sets the value of the '{@link pokemon.PokemonInstance#getMove4 <em>Move4</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move4</em>' reference.
	 * @see #getMove4()
	 * @generated
	 */
	void setMove4(Move value);

} // PokemonInstance
