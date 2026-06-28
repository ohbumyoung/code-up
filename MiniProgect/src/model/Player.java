package model;

public abstract class Player {

    protected String name;
    protected int backNumber;

    public Player(String name, int backNumber) {
        this.name = name;
        this.backNumber = backNumber;
    }

    public String getName() {
        return name;
    }

    public int getBackNumber() {
        return backNumber;
    }

    public abstract String getPosition();

    public abstract String getStatInfo();

    @Override
    public String toString() {
        return name + "," +
               getPosition() + "," +
               getStatInfo() + "," +
               backNumber;
    }
}
