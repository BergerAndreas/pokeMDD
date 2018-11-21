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
			/*
	        // Generate absolute URL
	        // Base URL = www.gnu.org
	        URL url1 = new URL("http://www.gnu.org");
	        System.out.println("URL1: " + url1.toString());
	
	        // Generate URL for pages with a common base
	        URL url2 = new URL(url1, "licenses/gpl.txt");
	        System.out.println("URL2: " + url2.toString());
	
	        // Generate URLs from different pieces of data
	        URL url3 = new URL("http", "www.gnu.org", "/licenses/gpl.txt");
	        System.out.println("URL3: " + url3.toString());
	
	        URL url4 = new URL("http", "www.gnu.org", 80, "/licenses/gpl.txt");
	        System.out.println("URL4: " + url4.toString() + "\n");
	        */
	        
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
		        
		        /*
		        String inputLine;

		        while ((inputLine = br.readLine()) != null) {
		            System.out.println(inputLine);
		        }
				
		        
		        ObjectMapper mapper = new ObjectMapper();
		        Pokemon mon = mapper.readValue(url, Pokemon.class);
		        */
		        
		        
		        br.close();
		        //System.out.println(mon.getName());
		        
	        }
	        
	        /*
	            // Open URL stream as an input stream and print contents to command line
	        try (BufferedReader in = new BufferedReader(new InputStreamReader(url4.openStream()))) {
	            String inputLine;
	
	            // Read the "gpl.txt" text file from its URL representation
	          System.out.println("/***** File content (URL4) *****n");
	            while((inputLine = in.readLine()) != null) {
	                System.out.println(inputLine);
	            }
	        } */
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