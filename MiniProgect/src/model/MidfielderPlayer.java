package model;

public class MidfielderPlayer extends Player {

    private int assists;

    public MidfielderPlayer(String name, int backNumber, int assists) {
        super(name, backNumber);
        this.assists = assists;
    }

    @Override
    public String getPosition() {
        return "미드필더";
    }

    @Override
    public String getStatInfo() {
        return assists + "어시스트";
    }
}