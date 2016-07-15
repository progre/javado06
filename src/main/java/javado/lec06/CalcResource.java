package javado.lec06;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("calc")
public class CalcResource {

    @Path("add/{a}/{b}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int add(@PathParam("a") int a, @PathParam("b") int b) {
        return a + b;
    }

    @Path("div/{a}/{b}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public int div(@PathParam("a") int a, @PathParam("b") int b) {
        return a * b;
    }
}