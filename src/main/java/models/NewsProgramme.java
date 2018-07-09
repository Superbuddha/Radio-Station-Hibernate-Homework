package models;

import sun.tools.tree.NewArrayExpression;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "news_programmes") public class NewsProgramme extends Programme {
    private String news;
    private int weatherTemperature;

    public NewsProgramme(){
    }

    public NewsProgramme( String name, int duration, Producer producer, Ads ads, String news, int weatherTemperature) {
        super( name, duration, producer, ads);
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
