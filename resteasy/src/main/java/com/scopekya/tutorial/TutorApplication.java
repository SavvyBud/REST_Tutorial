package com.scopekya.tutorial;

import java.util.HashSet;
import java.util.Set;


public class TutorApplication extends javax.ws.rs.core.Application {
	   private Set<Object> singletons = new HashSet<Object>();
	   private Set<Class<?>> empty = new HashSet<Class<?>>();

	   public TutorApplication() {
		   StatusResource.init();
		   singletons.add(new StatusResource());
	   }

	   @Override
	   public Set<Class<?>> getClasses() {
	      return empty;
	   }

	   @Override
	   public Set<Object> getSingletons() {
	      return singletons;
	   }
}
