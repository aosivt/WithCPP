package aos.strategy;

public class Woolf implements Animals {
    public final static String MOVE = "fuck RUUUUUUUUUUUUN";
    @Override
    public String move() {
        System.out.println(MOVE);
        return MOVE;
    }
}