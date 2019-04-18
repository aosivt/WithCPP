package aos.patterns;

import aos.factory.*;
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
        Doughnut cherry2     =    doughnutFactory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut cherry3     =    doughnutFactory.getDoughnut(DoughnutTypes.CHERRY);
        Doughnut chocolate  =    doughnutFactory.getDoughnut(DoughnutTypes.CHOCOLATE);
        Doughnut almond     =    doughnutFactory.getDoughnut(DoughnutTypes.ALMOND);

        cherry.eat();
        cherry2.eat();
        cherry3.eat();
        chocolate.eat();
        almond.eat();

        Assert.assertEquals(3, (int) doughnutFactory.getCherryDoughnutCount());
        Assert.assertEquals(1, (int) doughnutFactory.getAlmondDoughnutCount());
        Assert.assertEquals(1, (int) doughnutFactory.getChocolateDoughnutCount());

    }
}
