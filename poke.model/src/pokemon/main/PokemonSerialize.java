package pokemon.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.annotation.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import pokemon.*;

public class PokemonSerialize {
	public static void main(String[] args) {
		PokemonPackage.eINSTANCE.eClass();
		
		PokemonFactory factory = PokemonFactory.eINSTANCE;
		
		Root root = factory.createRoot();
				
			JsonNode node = fetchData("https://pokeapi.co/api/v2/generation/1/");
	        //Add moves
	        for(JsonNode move : node.get("moves")) {
	        	
	        	Move m = factory.createMove();
	        	m.setName(move.get("name").asText());
	    
	        	int id = Integer.parseInt(move.get("url").asText().split("/")[6]); 
	        	m.setId(id);
	        	
	        	// Add move details
//        		JsonNode moveNode = fetchData("https://pokeapi.co/api/v2/move/"+ id +"/");
//        		m.setAccuracy(moveNode.get("accuracy") == null ? 0 : moveNode.get("accuracy").asInt());
//        		m.setPower(moveNode.get("power") == null ? 0: moveNode.get("power").asInt());
//        		m.setPp(Integer.parseInt(moveNode.get("pp").asText()));

	        	//Save move
	        	root.getMove().add(m);
	        }
	        
	        //Add type
	        for(JsonNode type : node.get("types")) {
	        	
	        	Type t = factory.createType();
	        	t.setName(type.get("name").asText());
	        	root.getType().add(t);
	        }
	        
	        //Add pokemon
	        for(JsonNode pokemon : node.get("pokemon_species")) {
	        	Pokemon p = factory.createPokemon();
	        	p.setName(pokemon.get("name").asText());
	        	int id = Integer.parseInt(pokemon.get("url").asText().split("/")[6]);
	        	p.setId(id);
	        	
	        	//Add attributes
	        	JsonNode pokemonNode = fetchData("https://pokeapi.co/api/v2/pokemon/"+ id +"/");
	        	p.setHeight(pokemonNode.get("height").asInt());
	        	p.setWeight(pokemonNode.get("weight").asInt());
	        	p.setSprite(pokemonNode.get("sprites").get("front_default").asText());
	        	p.setBaseExperience(pokemonNode.get("base_experience").asInt());
	        	
//	        	//Add moves to pokemon
	        	for(JsonNode moves : pokemonNode.get("moves")) {
	        		Move move = root.getMove().stream().filter(x -> x.getName().equals(moves.get("move").get("name").asText())).findFirst().orElse(null);

	        		//Don't add moves from later generations
	        		if(move != null) {
	        			p.getMove().add(move);
	        		}
	        	}
//	        	System.out.println(p.getName());
	        	root.getPokemon().add(p);
	        }
	        
		
		
		//Save the model
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		
		// The string is the package in the ecore model
		map.put("pokemon", new XMIResourceFactoryImpl());
		
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI("model/m1mm.pokemon"));
		resource.getContents().add(root);
		try {
			resource.save(Collections.EMPTY_MAP);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static JsonNode fetchData(String apiUrl) {
		try {
	        URL url = new URL(apiUrl);
	    	HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
	        con.setRequestMethod("GET");
	        con.setRequestProperty("User-Agent" , "value");
	        
	        InputStream is = con.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
	        BufferedReader br = new BufferedReader(isr);
	        
	        String all = br.lines().collect(Collectors.joining());
	      
	        ObjectMapper mapper = new ObjectMapper();
	        JsonNode node = mapper.readTree(all);
			br.close();
			return node;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}