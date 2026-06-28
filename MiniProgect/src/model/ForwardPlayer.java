package model;

public class ForwardPlayer extends Player {

    private int goals;

    public ForwardPlayer(String name, int backNumber, int goals) {
        super(name, backNumber);
        this.goals = goals;
    }

    @Override
    public String getPosition() {
        return "공격수";
    }

    @Override
    public String getStatInfo() {
        return goals + "골";
    }
}