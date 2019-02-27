package com.demo.cinema.pelicula;

public class PeliculaQuery {

    public static PeliculaQuery empty() {
        return new PeliculaQuery();
    }

    private String id;

    public PeliculaQuery() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
