package lolapi.query;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class QueryManager {
	private String apiKey;
	public QueryManager(String apiKey)
	{
		this.apiKey = apiKey;
	}
	public JsonElement sendQuery(String query)
	{
		 JsonElement jsonx = null;
		 String response = "";
			try {
				// Send data
	            URL url = new URL("https://prod.api.pvp.net" + 
	            		  query + 
				  		 "&api_key=" + getValidAPIkey());
	            URLConnection conn = url.openConnection();
	            conn.setDoOutput(true);

	            // Get the response
	            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	            String line;
	            while ((line = rd.readLine()) != null) {
	            	response += line;    	
	            }
	            jsonx = new JsonParser().parse(response);
	            System.out.println(jsonx);
	            rd.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return jsonx;
	}

	private String getValidAPIkey() {
		return apiKey;
	}
	
	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
}
