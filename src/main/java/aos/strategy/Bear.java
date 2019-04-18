package aos.strategy;

public class Bear implements Animals {
    public final static String MOVE = "head over heels";
    @Override
    public String move() {
        System.out.println(MOVE);
        return MOVE;
    }
}
