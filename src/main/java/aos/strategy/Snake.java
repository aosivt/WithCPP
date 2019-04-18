package aos.strategy;

public class Snake implements Animals {
    public final static String MOVE = "crawl";
    @Override
    public String move() {
        System.out.println(MOVE);
        return MOVE;
    }
}