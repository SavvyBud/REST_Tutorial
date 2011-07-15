package com.scopekya.tutorial;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.restlet.ext.json.JsonRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class StatusResource extends ServerResource {
	public static Date upsince;
	
	public static void init(){
		upsince = new Date();
	}
	
	
	@Get("json")
	public Representation represent(){
		Map<String,String> map = new HashMap<String,String>();
		map.put("status", "alive");
		map.put("time", (new Date()).toString());
		map.put("upsince", StatusResource.upsince.toString());
		JsonRepresentation response = new JsonRepresentation(new JSONObject(map));		
		return response;
	}
}
