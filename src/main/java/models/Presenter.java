package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "presenters")
public class Presenter extends Employee{
    private PresenterType presenterType;

    public Presenter(){

    }

    public Presenter(int id, String name, double salary, PresenterType presenterType) {
        super(id, name, salary);
        this.presenterType = presenterType;
    }

    public PresenterType getPresenterType() {
        return presenterType;
    }

    public void setPresenterType(PresenterType presenterType) {
        this.presenterType = presenterType;
    }
}
