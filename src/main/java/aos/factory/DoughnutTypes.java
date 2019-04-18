package aos.factory;

public enum DoughnutTypes {
    CHERRY{
        @Override
        public Doughnut getDoughut() {
            return new CherryDoughnut();
        }
    },
    CHOCOLATE{
        @Override
        public Doughnut getDoughut() {
            return new ChocolateDoughnut();
        }
    },
    ALMOND{
        @Override
        public Doughnut getDoughut() {
            return new AlmondDoughnut();
        }
    };

    public abstract Doughnut getDoughut();
}
