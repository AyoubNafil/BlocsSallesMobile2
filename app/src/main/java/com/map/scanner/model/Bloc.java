package com.map.scanner.model;



public class Bloc {
    private String id;
    private String name;

    public Bloc(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Bloc(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

