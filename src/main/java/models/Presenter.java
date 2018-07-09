package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "presenters")
public class Presenter extends Employee{
    private PresenterType presenterType;
    private List<Programme> programmes;

    public Presenter(){

    }

    public Presenter( String name, double salary, PresenterType presenterType) {
        super( name, salary);
        this.presenterType = presenterType;
        this.programmes = new ArrayList<Programme>();
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
