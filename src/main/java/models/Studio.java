package models;

public class Studio {
    private int id;
    private String name;
    private int capacity;

    public Studio(){

    }

    public Studio(int id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }
}
