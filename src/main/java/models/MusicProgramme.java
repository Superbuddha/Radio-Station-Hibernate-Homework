package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "music programme")
public class MusicProgramme extends Programme{

    private String music;

    public MusicProgramme(){

    }

    public MusicProgramme(int id, String name, int duration, Producer producer, Ads ads, List<Presenter> presenters, String music) {
        super(id, name, duration, producer, ads, presenters);
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
