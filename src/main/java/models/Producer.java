package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "producers")
public class Producer extends Employee {
    private String studio;

    public Producer(){

    }

    public Producer( String name, double salary, String studio) {
        super( name, salary);
        this.studio = studio;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
