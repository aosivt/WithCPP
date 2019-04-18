package aos.factory;

public class DoughnutFactory {

    private Integer cherryDoughnutCount = 0;
    private Integer chocolateDoughnutCount = 0;
    private Integer almondDoughnutCount = 0;

    public Doughnut getDoughnut(DoughnutTypes type){

        return type.getDoughut(this);
    }


    public <T extends CherryDoughnut>void setDoughnutCount(T aClass){
        cherryDoughnutCount++;
    }
    public <T extends ChocolateDoughnut> void setDoughnutCount(T aClass){
        chocolateDoughnutCount++;
    }
    public <T extends AlmondDoughnut> void setDoughnutCount(T aClass){
        almondDoughnutCount++;
    }

    public Integer getCherryDoughnutCount() {
        return cherryDoughnutCount;
    }

    public Integer getChocolateDoughnutCount() {
        return chocolateDoughnutCount;
    }

    public Integer getAlmondDoughnutCount() {
        return almondDoughnutCount;
    }
}
