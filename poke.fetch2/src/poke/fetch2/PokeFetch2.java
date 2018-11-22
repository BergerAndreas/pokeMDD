package poke.fetch2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

import com.fasterxml.jackson.core.JsonParseException;
//import com.fasterxml.jackson.annotation.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import pokemon.*;

public class PokeFetch2 {
	public static void main(String[] args) {
		try {
	        URL url = new URL("https://pokeapi.co/api/v2/" + "pokemon/1/");
	        
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
		        System.out.println(node.get("name"));
		        System.out.println(node.get("types"));
		        System.out.println(node.get("types").get(1).get("type"));
		        System.out.println(node.get("types").get(1).get("type").get("name"));
		        
		        
		        
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

	}
}