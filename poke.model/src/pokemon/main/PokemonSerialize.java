package pokemon.main;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import pokemon.Pokemon;
import pokemon.PokemonFactory;
import pokemon.PokemonPackage;

public class PokemonSerialize {
	public static void main(String[] args) {
		
		PokemonPackage.eINSTANCE.eClass();
		
		PokemonFactory factory = PokemonFactory.eINSTANCE;
		
		Pokemon pokemon = factory.createPokemon();
		pokemon.setName("Pikasjku");
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("pokemon", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		
		Resource resource = resSet.createResource(URI.createURI("model/mm1m.pokemon"));
		resource.getContents().add(pokemon);
		try {
			resource.save(Collections.EMPTY_MAP);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}	
