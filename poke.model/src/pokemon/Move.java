/**
 */
package pokemon;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pokemon.Move#getName <em>Name</em>}</li>
 *   <li>{@link pokemon.Move#getId <em>Id</em>}</li>
 *   <li>{@link pokemon.Move#getPp <em>Pp</em>}</li>
 *   <li>{@link pokemon.Move#getPower <em>Power</em>}</li>
 *   <li>{@link pokemon.Move#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link pokemon.Move#getPokemon <em>Pokemon</em>}</li>
 * </ul>
 *
 * @see pokemon.PokemonPackage#getMove()
 * @model annotation="http://www.eclipse.org/acceleo/query/1.0 ppMustBePercentage='(self.pp &gt;= 0) and self.pp &lt;= 100' powerMustBePercentage='self.power &gt;= 0 and self.power &lt;= 100' accuracyMustBePercentage='self.accuracy &gt;= 0 and self.accuracy &lt;= 100'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ppMustBePercentage powerMustBePercentage accuracyMustBePercentage'"
 * @generated
 */
public interface Move extends EObject {
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
	 * @see pokemon.PokemonPackage#getMove_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pokemon.Move#getName <em>Name</em>}' attribute.
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
	 * @see pokemon.PokemonPackage#getMove_Id()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link pokemon.Move#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Pp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pp</em>' attribute.
	 * @see #setPp(int)
	 * @see pokemon.PokemonPackage#getMove_Pp()
	 * @model required="true"
	 * @generated
	 */
	int getPp();

	/**
	 * Sets the value of the '{@link pokemon.Move#getPp <em>Pp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pp</em>' attribute.
	 * @see #getPp()
	 * @generated
	 */
	void setPp(int value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(int)
	 * @see pokemon.PokemonPackage#getMove_Power()
	 * @model required="true"
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link pokemon.Move#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accuracy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accuracy</em>' attribute.
	 * @see #setAccuracy(int)
	 * @see pokemon.PokemonPackage#getMove_Accuracy()
	 * @model required="true"
	 * @generated
	 */
	int getAccuracy();

	/**
	 * Sets the value of the '{@link pokemon.Move#getAccuracy <em>Accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' attribute.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(int value);

	/**
	 * Returns the value of the '<em><b>Pokemon</b></em>' reference list.
	 * The list contents are of type {@link pokemon.Pokemon}.
	 * It is bidirectional and its opposite is '{@link pokemon.Pokemon#getMove <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemon</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemon</em>' reference list.
	 * @see pokemon.PokemonPackage#getMove_Pokemon()
	 * @see pokemon.Pokemon#getMove
	 * @model opposite="move"
	 * @generated
	 */
	EList<Pokemon> getPokemon();

} // Move
