/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.g10.meinshop.rest;

import com.g10.meinshop.domain.Artikel;
import com.g10.meinshop.service.ArtikelService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jean-Luc Burot
 */
@Path("artikel")
@Produces(MediaType.APPLICATION_JSON)
public class ArtikelResource {
    @Inject
    private ArtikelService as;
    
    @GET
    public Response findArtikel() {
        final List<Artikel> artikel = as.findAllArtikel();
        
        return Response.ok(new GenericEntity<List<Artikel>>(artikel) {})
                       .build();
    }
    
    @GET
    @Path("{id:[1-9][0-9]*}")
    public Response findArtikelById(@PathParam("id") Long id) {
        final Artikel artikel = as.findArtikelById(id);
        if(artikel == null)
            throw new NotFoundException("Kein Artikel mit der ID " + id + " gefunden.");
        
        return Response.ok(artikel)
                       .build();
    }
}
