/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.g10.meinshop.rest;

import com.g10.meinshop.domain.Artikel;
import com.g10.meinshop.service.ArtikelService;
import java.net.URI;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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
@Consumes(MediaType.APPLICATION_JSON)
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
    public Response findArtikelById(@PathParam("id") Integer id) {
        final Artikel artikel = as.findArtikelById(id);
        if(artikel == null)
            throw new NotFoundException("Kein Artikel mit der ID " + id + " gefunden.");
        
        return Response.ok(artikel)
                       .build();
    }
    
    @DELETE
    @Path("{id:[1-9][0-9]*}")
    public void deleteArtikel(@PathParam("id") Integer id) {
        as.deleteProdukt(id);
    }
    
    @POST
    public Response createArtikel(@Valid Artikel artikel) {
        final Artikel neuerArtikel = as.createArtikel(artikel);
        
        return Response.created(URI.create("/" + neuerArtikel.getId()))
                       .build();
    }
    
    @PUT
    public void updateArtikel(@Valid Artikel artikel) {
        as.updateArtikel(artikel);
    }
}
