package model;

public class DefenderPlayer extends Player {

    private int tackles;

    public DefenderPlayer(String name, int backNumber, int tackles) {
        super(name, backNumber);
        this.tackles = tackles;
    }

    @Override
    public String getPosition() {
        return "수비수";
    }

    @Override
    public String getStatInfo() {
        return tackles + "태클";
    }
}