package aos.strategy;

public class StrategyAnimalMove {
    Animals animals;

    public StrategyAnimalMove(Animals animals){
        this.animals = animals;
    }

    public void setAnimals(Animals animals) {
        this.animals = animals;
    }

    public String move(){
        return animals.move();
    }
}
