package com.example.android.data.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Vozilo {

    private String id;
    private Date datum_registracije;
    private Integer predjeno_km;
    private String registarski_broj;
    private String naziv;
    private Boolean zauzeto;
    private Map<String,Object> additionalProperties = new HashMap<String,Object>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatum_registracije() {
        return datum_registracije;
    }

    public void setDatum_registracije(Date datum_registracije) {
        this.datum_registracije = datum_registracije;
    }

    public Integer getPredjeno_km() {
        return predjeno_km;
    }

    public void setPredjeno_km(Integer predjeno_km) {
        this.predjeno_km = predjeno_km;
    }

    public String getRegistarski_broj() {
        return registarski_broj;
    }

    public void setRegistarski_broj(String registarski_broj) {
        this.registarski_broj = registarski_broj;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Boolean getZauzeto() {
        return zauzeto;
    }

    public void setZauzeto(Boolean zauzeto) {
        this.zauzeto = zauzeto;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
