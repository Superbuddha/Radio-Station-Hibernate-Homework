package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "programmes")
@Inheritance(strategy = InheritanceType.JOINED)

public class Programme {
    private int id;
    private String name;
    private int duration;
    private Producer producer;
    private Ads ads;
private List<Presenter> presenters;

public Programme(){

}


    public Programme(int id, String name, int duration, Producer producer, Ads ads, List<Presenter> presenters) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.producer = producer;
        this.ads = ads;
        this.presenters = new ArrayList<Presenter>();
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
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

    @Column(name = "duration") public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Column(name = "producer") public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Enumerated(value = EnumType.STRING)
    public Ads getAds() {
        return ads;
    }

    public void setAds(Ads ads) {
        this.ads = ads;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "programme_presenter",
    joinColumns = {@JoinColumn(name = "programme_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name = "presenter_id", nullable = false, updatable = false)})
    public List<Presenter> getPresenters() {
        return presenters;
    }

    public void setPresenters(List<Presenter> presenters) {
        this.presenters = presenters;
    }
    public void addPresenter(Presenter presenter){
    this.presenters.add(presenter);
    }
}
