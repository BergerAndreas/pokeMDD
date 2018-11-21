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
import pokemon.Root;

public class PokemonSerialize {
	public static void main(String[] args) {
		
		PokemonPackage.eINSTANCE.eClass();
		
		PokemonFactory factory = PokemonFactory.eINSTANCE;
		
		Root root = factory.createRoot();
		
		
		for(int i = 0; i<5; i++) {
			Pokemon pokemon = factory.createPokemon();
			pokemon.setName(Integer.toString(i));
			root.getPokemon().add(pokemon);
			
		}
		
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		
		// The string is the package in the ecore model
		m.put("pokemon", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("model/m1mm.pokemon"));
		resource.getContents().add(root);
		try {
			resource.save(Collections.EMPTY_MAP);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}	
