package cz.expertkom.ju.springdemo.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

import cz.expertkom.ju.interfaces.entity.Item;
import cz.expertkom.ju.springdemo.dto.ItemDto;

@CrossOriginResourceSharing(allowAllOrigins = true)
public interface TestApi {

	@GET
	@Path("test/{param}")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response test(@PathParam(value = "param") String param);
	
//	puvodni
	@GET
	@Path("item")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response item();

	@GET
	@Path("item/{param}")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response item(@PathParam(value = "param") String param);
	
	@POST
	@Path("item")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response saveItem(ItemDto item);
	
	@GET
	@Path("items")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response itemsList();

	@DELETE
	@Path("items/{param}")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam(value = "param") Long param);
		
	@PUT
	@Path("item/{id}")
	@Consumes(MediaType.WILDCARD)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateItem(@PathParam(value = "id") Long id, ItemDto item);
	
}
