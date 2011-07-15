package com.scopekya.tutorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

@Path("status")
public class StatusResource {
	public static Date upsince;
	
	public static void init(){
		upsince = new Date();
	}
	
	@BadgerFish
	@GET
	@Path("/json")
	@Produces("application/json")
	public Status getJSONObject(){
		Status s = new Status();
		s.status = "alive";
		s.time = (new Date()).toString();
		s.upsince = StatusResource.upsince.toString();
		List<Status> list = new ArrayList<Status>();
		list.add(s);
		return s;
	}
}
