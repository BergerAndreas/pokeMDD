/**
 */
package pokemon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pokemon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pokemon.Pokemon#getName <em>Name</em>}</li>
 *   <li>{@link pokemon.Pokemon#getId <em>Id</em>}</li>
 *   <li>{@link pokemon.Pokemon#getHeight <em>Height</em>}</li>
 *   <li>{@link pokemon.Pokemon#getWeight <em>Weight</em>}</li>
 *   <li>{@link pokemon.Pokemon#getSprite <em>Sprite</em>}</li>
 *   <li>{@link pokemon.Pokemon#getBaseExperience <em>Base Experience</em>}</li>
 *   <li>{@link pokemon.Pokemon#getType <em>Type</em>}</li>
 *   <li>{@link pokemon.Pokemon#getMove <em>Move</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getPokemon()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noNegativeWeight noNegativeHeight noNegativeBaseExperience validSpriteUrl'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 noNegativeWeight='self.weight &gt;= 0' noNegativeHeight='self.height &gt;= 0' noNegativeBaseExperience='self.baseExperience &gt;= 0' validSpriteUrl='self.sprite.matches(\'^(http|https)://[a-zA-Z./]+\\\\d+.png\')'"
 * @generated
 */
public interface Pokemon extends EObject {
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
	 * @see pokemon.PokemonPackage#getPokemon_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see pokemon.PokemonPackage#getPokemon_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see pokemon.PokemonPackage#getPokemon_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see pokemon.PokemonPackage#getPokemon_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Sprite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sprite</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sprite</em>' attribute.
	 * @see #setSprite(String)
	 * @see pokemon.PokemonPackage#getPokemon_Sprite()
	 * @model
	 * @generated
	 */
	String getSprite();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getSprite <em>Sprite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sprite</em>' attribute.
	 * @see #getSprite()
	 * @generated
	 */
	void setSprite(String value);

	/**
	 * Returns the value of the '<em><b>Base Experience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Experience</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Experience</em>' attribute.
	 * @see #setBaseExperience(int)
	 * @see pokemon.PokemonPackage#getPokemon_BaseExperience()
	 * @model required="true"
	 * @generated
	 */
	int getBaseExperience();

	/**
	 * Sets the value of the '{@link pokemon.Pokemon#getBaseExperience <em>Base Experience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Experience</em>' attribute.
	 * @see #getBaseExperience()
	 * @generated
	 */
	void setBaseExperience(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference list.
	 * The list contents are of type {@link pokemon.Type}.
	 * It is bidirectional and its opposite is '{@link pokemon.Type#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference list.
	 * @see pokemon.PokemonPackage#getPokemon_Type()
	 * @see pokemon.Type#getPokemon
	 * @model opposite="pokemon"
	 * @generated
	 */
	EList<Type> getType();

	/**
	 * Returns the value of the '<em><b>Move</b></em>' reference list.
	 * The list contents are of type {@link pokemon.Move}.
	 * It is bidirectional and its opposite is '{@link pokemon.Move#getPokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move</em>' reference list.
	 * @see pokemon.PokemonPackage#getPokemon_Move()
	 * @see pokemon.Move#getPokemon
	 * @model opposite="pokemon"
	 * @generated
	 */
	EList<Move> getMove();

} // Pokemon
