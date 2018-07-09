package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "music_programme")
public class MusicProgramme extends Programme{

    private String music;

    public MusicProgramme(){

    }

    public MusicProgramme( String name, int duration, Producer producer, Ads ads, String music) {
        super( name, duration, producer, ads);
        this.music = music;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }
}
