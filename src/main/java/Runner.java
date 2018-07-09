import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Producer producer1 = new Producer("Stephan", 100000, "Auditorium");
        Producer producer2 = new Producer("Manu", 10000, "Studio 105");
        Producer producer3 = new Producer("Jacques", 10000, "Studio 305");

        Presenter presenter1 = new Presenter("Joanna", 20000,PresenterType.ANNOUNCER);
        Presenter presenter2 = new Presenter("Henri",20000, PresenterType.JOURNALIST);
        Presenter presenter3 = new Presenter("Mark",20000,PresenterType.DJ);
        Presenter presenter4 = new Presenter("Maude", 20000, PresenterType.TALKSHOWHOST);

        Studio studio1 = new Studio("Studio Charles Trenet", 2000, producer1);
        Studio studio2 = new Studio("Studio 105", 25, producer2);
        Studio studio = new Studio("Studio 305", 15, producer3);



        Programme nightfly = new Programme("The Nightfly", 120, producer1, Ads.EASYJET);
        DBHelper.save(nightfly);

        MusicProgramme allTheHits = new MusicProgramme("All the Hits", 180, producer1, Ads.GLASGOWCC, "Hits");
        DBHelper.save(allTheHits);

        NewsProgramme newsAtSix = new NewsProgramme( "News at Six", 60, producer2, Ads.STATIONIDENT, "Local News", 25);
        DBHelper.save(newsAtSix);

        GameShow thousandPoundQuestion = new GameShow("The £1000 Question", 45, producer3, Ads.CODECLAN, "History Quiz");


        List<Presenter> allPresenters = DBHelper.getAll(Presenter.class);
        List<Producer>allProducers = DBHelper.getAll(Producer.class);
        List<Programme>allProgrammes = DBHelper.getAll(Programme.class);

    }


}
