public class Simulation {
    public Bins bins;
    private Dice dice;
    private Integer numberOfTosses;
    private Integer numberOfDice;


    public Simulation(Integer numberOfDies, Integer numberOfTosses){
        this.dice = new Dice(numberOfDies);
        this.numberOfTosses = numberOfTosses;
        this.numberOfDice = numberOfDies;
        this.bins = new Bins(numberOfDies, numberOfDies * 6);
    }


    public void runSimulation(){
        for (int i = 0; i < numberOfTosses; i++){
            Integer toss = dice.tossAndSum();
            bins.incrementBin(toss - 2);
        }
    }

    public void printResults(){
        System.out.println("***\nSimulation of " + numberOfDice + " dice tossed for " + numberOfTosses + " times.\n***\n");


        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.bins.binArray.length; i++){
            double percent = (double)bins.getBin(i)/numberOfTosses;
            int percentage = (int)(percent * 100);
            for (int j = 0; j < percentage; j++){
                builder.append("*");
            }
            System.out.println(String.format("%2d :%9d: %.2f ", i+2, bins.binArray[i], percent)+builder.toString());
            builder = new StringBuilder();
        }
    }
}
