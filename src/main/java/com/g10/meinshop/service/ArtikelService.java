/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.g10.meinshop.service;

import com.g10.meinshop.domain.Artikel;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author Jean-Luc Burot
 */
@Dependent
public class ArtikelService {
    public List<Artikel> findAllArtikel() {
        
        Artikel a1 = new Artikel();
        a1.setId(1);
        a1.setArtikelnummer("ladfji2k8");
        a1.setBezeichnung("Buegeleisen");
        a1.setPreis(BigDecimal.valueOf(499.99));
        a1.setVerfuegbar(true);
        
        Artikel a2 = new Artikel();
        a2.setId(3);
        a2.setArtikelnummer("leimdm388");
        a2.setBezeichnung("Magnet");
        a2.setPreis(BigDecimal.valueOf(45.99));
        a2.setVerfuegbar(false);
        
        Artikel a3 = new Artikel();
        a3.setId(6);
        a3.setArtikelnummer("bad838920");
        a3.setBezeichnung("Baum");
        a3.setPreis(BigDecimal.valueOf(45.99));
        a3.setVerfuegbar(true);
        
        List<Artikel> artikel = new ArrayList<>();
        artikel.add(a1);
        artikel.add(a2);
        artikel.add(a3);
        
        return artikel;
    }
    
    public Artikel findArtikelById(Integer id) {
        if (id == 1) {
            Artikel a1 = new Artikel();
            a1.setId(1);
            a1.setArtikelnummer("ladfji2k8");
            a1.setBezeichnung("Buegeleisen");
            a1.setPreis(BigDecimal.valueOf(499.99));
            a1.setVerfuegbar(true);
            return a1;
            
        } else if (id == 3) {
            Artikel a2 = new Artikel();
            a2.setId(3);
            a2.setArtikelnummer("leimdm388");
            a2.setBezeichnung("Magnet");
            a2.setPreis(BigDecimal.valueOf(45.99));
            a2.setVerfuegbar(false);
            return a2;
            
        } else if (id == 6) {
            Artikel a3 = new Artikel();
            a3.setId(6);
            a3.setArtikelnummer("bad838920");
            a3.setBezeichnung("Baum");
            a3.setPreis(BigDecimal.valueOf(45.99));
            a3.setVerfuegbar(true);
            return a3;
            
        } else {
            return null;
        }
    }
    
    public void deleteProdukt(Integer id) {
        return;
    }
    
    public Artikel createArtikel(Artikel artikel) {
        if(artikel == null)
            return null;
        
        artikel.setId(artikel.getId()+1);
        return artikel;
    }
    
    public Artikel updateArtikel(Artikel artikel) {
        if(artikel == null)
            return null;
        
        return artikel;
    }
}
