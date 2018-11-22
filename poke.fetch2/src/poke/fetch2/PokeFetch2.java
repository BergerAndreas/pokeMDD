package poke.fetch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
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

public class PokeFetch2 {
	public static void main(String[] args) {
		PokemonPackage.eINSTANCE.eClass();
		
		PokemonFactory factory = PokemonFactory.eINSTANCE;
		
		Root root = factory.createRoot();
		
		try {
	        URL url = new URL("https://pokeapi.co/api/v2/" + "generation/1/");
	        
	        try {
	        	HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		        con.setRequestMethod("GET");
		        con.setRequestProperty("User-Agent" , "value");
		        
		        InputStream is = con.getInputStream();
		        InputStreamReader isr = new InputStreamReader(is);
		        BufferedReader br = new BufferedReader(isr);
		        
		        String all = br.lines().collect(Collectors.joining());
		      
		        ObjectMapper mapper = new ObjectMapper();
		        JsonNode node = mapper.readTree(all);
		        
		        //Add moves
		        for(JsonNode move : node.get("moves")) {
		        	
		        	Move m = factory.createMove();
		        	m.setName(move.get("name").asText());
		        	root.getMove().add(m);
		        }
		        
		        br.close();
		        
	        }
	       
	        catch (IOException ioe) {
	            ioe.printStackTrace(System.err);
	      }
		
	    } catch (MalformedURLException mue) {
	       mue.printStackTrace(System.err);
	    }
		catch (Exception e) {
			System.out.println("is fine");
		}
		
		//Save the model
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