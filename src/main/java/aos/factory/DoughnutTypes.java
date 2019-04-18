package aos.factory;

public enum DoughnutTypes {

    CHERRY{
        @Override
        public Doughnut getDoughut(DoughnutFactory doughnutFactory) {
            CherryDoughnut doughnut = new CherryDoughnut();
            doughnutFactory.setDoughnutCount(doughnut);
            return doughnut;
        }
    },
    CHOCOLATE{
        @Override
        public Doughnut getDoughut(DoughnutFactory doughnutFactory) {
            ChocolateDoughnut doughnut = new ChocolateDoughnut();
            doughnutFactory.setDoughnutCount(doughnut);
            return doughnut;
        }
    },
    ALMOND{
        @Override
        public Doughnut getDoughut(DoughnutFactory doughnutFactory) {
            AlmondDoughnut doughnut = new AlmondDoughnut();
            doughnutFactory.setDoughnutCount(doughnut);
            return doughnut;
        }
    };

    public abstract Doughnut getDoughut(DoughnutFactory doughnutFactory);
}
