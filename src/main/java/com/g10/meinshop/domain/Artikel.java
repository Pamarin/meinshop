/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.g10.meinshop.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jean-Luc Burot
 */
@Entity
@XmlRootElement
public class Artikel implements Serializable {
    @Id
    @GeneratedValue
    @XmlAttribute
    private Integer id;
    
    @NotNull
    private String artikelnummer;
    
    @NotNull
    private String bezeichnung;
    
    @NotNull
    private BigDecimal preis;
    
    @Basic(optional = false)
    private boolean verfuegbar;
    
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getArtikelnummer() {
        return this.artikelnummer;
    }
    
    public void setArtikelnummer(String artikelnummer) {
        this.artikelnummer = artikelnummer;
    }
    
    public String getBezeichnung() {
        return this.bezeichnung;
    }
    
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
    
    public BigDecimal getPreis() {
        return this.preis;
    }
    
    public void setPreis(BigDecimal preis) {
        this.preis = preis;
    }
    
    public boolean getVerfuegbar() {
        return this.verfuegbar;
    }
    
    public void setVerfuegbar(boolean verfuegbar) {
        this.verfuegbar = verfuegbar;
    }
}
