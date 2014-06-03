/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.g10.meinshop.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jean
 */
@Path("")
@Produces(MediaType.TEXT_PLAIN)
public class Resource {
    
    @GET
    @Path("version")
    public String getVersion() {
        return "1.0";
    }
    
}
