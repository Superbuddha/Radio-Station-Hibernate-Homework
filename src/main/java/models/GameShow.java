package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "game_shows")
public class GameShow extends Programme {

    private String quiz;

    public GameShow(){

    }

    public GameShow(String name, int duration, Producer producer, Ads ads, String quiz) {
        super( name, duration, producer, ads);
        this.quiz = quiz;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }
}
