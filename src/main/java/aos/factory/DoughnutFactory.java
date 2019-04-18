package aos.factory;

public class DoughnutFactory {

    private Integer cherryDoughnutCount = 0;
    private Integer chocolateDoughnutCount = 0;
    private Integer almondDoughnutCount = 0;

    public Doughnut getDoughnut(DoughnutTypes type){
        Doughnut doughnut = type.getDoughut();

        setDoughnutCount(doughnut);
        return type.getDoughut();
    }


    private <T extends Doughnut> void setDoughnutCount(T doughnut){
        cherryDoughnutCount++;
    }

    private <T extends CherryDoughnut> void setDoughnutCount(T doughnut){
        cherryDoughnutCount++;
    }
    private <T extends ChocolateDoughnut> void setDoughnutCount(T doughnut){
        chocolateDoughnutCount++;
    }
    private <T extends AlmondDoughnut> void setDoughnutCount(T doughnut){
        almondDoughnutCount++;
    }


}
