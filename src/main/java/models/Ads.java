package models;

public enum Ads {
    STATIONIDENT(15),
    CODECLAN(30),
    GLASGOWCC(30),
    EASYJET(30);

    private int duration;

    Ads(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
