package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "game shows")
public class GameShow extends Programme {

    private String quiz;

    public GameShow(){

    }

    public GameShow(int id, String name, int duration, Producer producer, Ads ads, List<Presenter> presenters, String quiz) {
        super(id, name, duration, producer, ads, presenters);
        this.quiz = quiz;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }
}
