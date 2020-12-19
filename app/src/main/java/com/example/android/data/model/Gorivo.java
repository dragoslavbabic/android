package com.example.android.data.model;

public class Gorivo {
    private String id;
    private Integer litre;
    private Integer iznos;
    private String vrsta;

    public Gorivo() {
    }

    public Gorivo(String id, Integer litre, Integer iznos, String vrsta) {
        this.id = id;
        this.litre = litre;
        this.iznos = iznos;
        this.vrsta = vrsta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLitre() {
        return litre;
    }

    public void setLitre(Integer litre) {
        this.litre = litre;
    }

    public Integer getIznos() {
        return iznos;
    }

    public void setIznos(Integer iznos) {
        this.iznos = iznos;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }


}
