package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/hello")
public class ReactiveGreetingResource {

    public static class SomeClass {
        public SomeClass(String name) {
            this.name = name;
        }
        public String name;
    }

    @GET
    public SomeClass hello() {
        return new SomeClass("foo");
    }

    @GET
    @Path("xml")
    @Produces(MediaType.APPLICATION_XML)
    public SomeClass helloXml() {
        return new SomeClass("foo");
    }
}