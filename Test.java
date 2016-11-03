package org.binoj.exozet.util;

import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * 
 * Utility class JSON parsing
 * 
 * @author Binoj V
 *
 */

public class RestResponseParser {
	
	private static ObjectMapper mapper;
	private static JsonFactory factory;

	static{
		 mapper = new ObjectMapper();
		 factory = mapper.getJsonFactory(); 
	}

	
	/**
	 * Converts Key/value string into a JSON object [Jackson]
	 * @param jsonText
	 * @return
	 * @throws IOException
	 */
	
	public static JsonNode convertIntoJSONObject(String jsonText) throws IOException{
	
		JsonParser jp;
		try {
			jp = factory.createJsonParser(jsonText);
			return mapper.readTree(jp);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		
		}	
	}
}
