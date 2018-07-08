package models;

import sun.tools.tree.NewArrayExpression;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "news programmes") public class NewsProgramme extends Programme {
    private String news;
    private int weatherTemperature;

    public NewsProgramme(){
    }

    public NewsProgramme(int id, String name, int duration, Producer producer, Ads ads, List<Presenter> presenters, String news, int weatherTemperature) {
        super(id, name, duration, producer, ads, presenters);
        this.news = news;
        this.weatherTemperature = weatherTemperature;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getWeatherTemperature() {
        return weatherTemperature;
    }

    public void setWeatherTemperature(int weatherTemperature) {
        this.weatherTemperature = weatherTemperature;
    }
}
