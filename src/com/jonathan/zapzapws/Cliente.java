package com.jonathan.zapzapws;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.xml.bind.annotation.XmlRootElement;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.filter.LoggingFilter;

public class Cliente {

	public static void main(String[] args) {
		
		Client client = ClientBuilder.newClient( new ClientConfig().register( LoggingFilter.class ) );
		WebTarget webTarget = client.target("http://localhost:80/ZapZap-WS/rest").path("texto").path("fred");
		 
		
		
	}
	
	@XmlRootElement
	public class userName {
	    private String firstName;
	    private String lastName;
	    /**
	     * @return the firstName
	     */
	    public String getFirstName() {
	        return firstName;
	    }
	    /**
	     * @param firstName the firstName to set
	     */
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    /**
	     * @return the lastName
	     */
	    public String getLastName() {
	        return lastName;
	    }
	    /**
	     * @param lastName the lastName to set
	     */
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	}
	
	
}
