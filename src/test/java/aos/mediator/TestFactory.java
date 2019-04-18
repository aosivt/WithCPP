package aos.mediator;

import aos.factory.Doughnut;
import aos.factory.DoughnutFactory;
import aos.factory.DoughnutTypes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFactory {
    @Before
    public void init(){

    }
    @After
    public void end(){

    }
    @Test
    public void testFactory(){
        DoughnutFactory doughnutFactory = new DoughnutFactory();

        Doughnut cherry     =    doughnutFactory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut chocolate  =    doughnutFactory.getDoughnut(DoughnutTypes.CHOCOLATE);
        Doughnut almond     =    doughnutFactory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        chocolate.eat();
        almond.eat();

    }
}
