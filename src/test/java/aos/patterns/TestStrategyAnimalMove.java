package aos.patterns;

import aos.strategy.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestStrategyAnimalMove {


    private StrategyAnimalMove strategyAnimalMove;
    private Animals bear;
    private Animals hare;
    private Animals snake;
    private Animals woolf;

    @Before
    public void init(){
        bear = new Bear();
        hare = new Hare();
        snake = new Snake();
        woolf = new Woolf();
    }

    @After
    public void end(){}

    @Test
    public void testStrategy(){
        strategyAnimalMove = new StrategyAnimalMove(bear);
        Assert.assertEquals(Bear.MOVE, strategyAnimalMove.move());
        strategyAnimalMove.setAnimals(hare);
        Assert.assertEquals(Hare.MOVE, strategyAnimalMove.move());
        strategyAnimalMove.setAnimals(snake);
        Assert.assertEquals(Snake.MOVE, strategyAnimalMove.move());
        strategyAnimalMove.setAnimals(woolf);
        Assert.assertEquals(Woolf.MOVE, strategyAnimalMove.move());
    }

}
