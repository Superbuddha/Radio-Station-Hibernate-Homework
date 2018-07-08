import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Producer producer1 = new Producer(1,"Stephan", 100000, "Auditorium");
        Producer producer2 = new Producer(2, "Manu", 10000, "Studio 105");
        Producer producer3 = new Producer(3, "Jacques", 10000, "Studio 305");

        Presenter presenter1 = new Presenter(1, "Joanna", 20000,PresenterType.ANNOUNCER);
        Presenter presenter2 = new Presenter(2, "Henri",20000, PresenterType.JOURNALIST);
        Presenter presenter3 = new Presenter(3, "Mark",20000,PresenterType.DJ);
        Presenter presenter4 = new Presenter(4, "Maude", 20000, PresenterType.TALKSHOWHOST);



        Programme nightfly = new Programme("The Nightfly", 120, "Stephan", Ads.EASYJET);
        DBHelper.save(nightfly);

        MusicProgramme allTheHits = new MusicProgramme("All the Hits", 180, "Stephan", Ads.GLASGOWCC, "Hits");
        DBHelper.save(allTheHits);

        NewsProgramme newsAtSix = new NewsProgramme( "News at Six", 60, "Manu",Ads.STATIONIDENT, "Local News", 25);
        DBHelper.save(newsAtSix);

        GameShow thousandPoundQuestion = new GameShow("The £1000 Question", 45, "Jacques", Ads.CODECLAN, "Music Quiz");


        List<Presenter> allPresenters = DBHelper.getAll(Presenter.class);
        List<Producer>allProducers = DBHelper.getAll(Producer.class);
        List<Programme>allProgrammes = DBHelper.getAll(Programme.class);

    }


}
