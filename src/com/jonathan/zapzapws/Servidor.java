package com.jonathan.zapzapws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jonathan.zapzapws.Cliente.userName;


/**
 * @author naiara e david
 *
 */
@Path("/sjba")
public class Servidor{

	@GET
	@Path("/texto/")
	@Produces(MediaType.TEXT_PLAIN)
	public String sjbaTexto() {
	  return "Hello Word!! (texto)";
	}
	
	@GET
	@Path("/texto/{parametro}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sjbaTextoParam(@PathParam("parametro") String parametro) {
	  System.out.println(parametro);
		return "o paraemtro passado foi " + parametro;
	}
	
	
	@GET
	@Path("/json/")
	@Produces(MediaType.APPLICATION_JSON)
	public String helloWordJSON() {
	  return "{}";
	}
	//formato json
	
		//passar por pârametro uma string e um id - metodos diferentes e impressos no servidor
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String helloWordXML() {
	  return "<?xml version=\"1.0\"?> <hello> Hello Word!! (xml) </hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String helloWordHTML() {
	  return "<html>"
	  			+ "<title>Hello Word</title> "
	  			+ "<body>"
	  				+ "<h1>Hello Word (html)</h1>"
	  			+ "</body>"
	  		+ "</html> ";
	}
	

	@Path("/users")
	public class HttpPostExample {
	    @POST
	    @Consumes(MediaType.APPLICATION_JSON)
	    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	    public userName createUserProfile(userName userProfile) {
	        //we can make use of UserProfile now
	        String firstName = userProfile.getFirstName();
	        String lastName = userProfile.getLastName();
	        
	        System.out.println("First name = " + firstName);
	        System.out.println("Last name = " + lastName);
	       // And when we are done we can return user profile back
	        return userProfile;
	    }
	}
}


