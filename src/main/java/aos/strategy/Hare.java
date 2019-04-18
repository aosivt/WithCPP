package aos.strategy;

public class Hare implements Animals {
    public final static String MOVE = "jumping gallop";

    @Override
    public String move() {
        System.out.println(MOVE);
        return MOVE;
    }
}