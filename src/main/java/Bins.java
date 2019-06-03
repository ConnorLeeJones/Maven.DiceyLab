
public class Bins {
    public Integer[] binArray;

    public Bins(Integer minRoll, Integer maxRoll){
        this.binArray = new Integer[maxRoll - minRoll + 1];
        for (int i = 0; i < binArray.length; i++){
            binArray[i] = 0;
        }
    }

    public Integer getBin(Integer bin){
        return binArray[bin];
    }

    public void incrementBin(Integer bin){
        binArray[bin]++;
    }

}
