package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

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

    }@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "presenter_programme",
            joinColumns = {@JoinColumn(name = "presenter_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "programme_id", nullable = false, updatable = false)})
    public List<Programme> getProgramme() {
        return programmes;
    }

}
