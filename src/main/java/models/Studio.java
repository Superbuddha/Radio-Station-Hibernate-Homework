package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "studios")
public class Studio {
    private int id;
    private String name;
    private int capacity;
    private Producer producer;

    public Studio(){

    }

    public Studio( String name, int capacity, Producer producer) {
        this.name = name;
        this.capacity = capacity;
        this.producer = producer;
    }

    @Column(name = "id") public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name") public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "capacity")
    public int getCapacity() {
        return capacity;
    }

   public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Column(name = "producer") public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }
}

