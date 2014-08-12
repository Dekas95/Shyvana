package lolapi.query;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import lolapi.dto.Region;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class QueryManager {
	private String apiKey;
	private URLConnection connection;
	private boolean doOutput = false;

	public QueryManager(String apiKey)
	{
		this.apiKey = apiKey;
	}
	public JsonElement sendQuery(Region reigon, String query)
	{
		 JsonElement jsonx = null;
		 String response = "";
			try {
				// Send data
	            URL url = new URL("https://"+ reigon.getName() +".api.pvp.net" + 
	            		  query + 
				  		 "api_key=" + getValidAPIkey());
	            connection = url.openConnection();
	            if(doOutput)
	            	connection.setDoOutput(doOutput);
	            
	            // Get the response
	            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
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
	public URLConnection getConnection() {
		return connection;
	}
	public void setConnection(URLConnection connection) {
		this.connection = connection;
	}
	public boolean isDoOutput() {
		return doOutput;
	}
	public void setDoOutput(boolean doOutput) {
		this.doOutput = doOutput;
	}

}
