public class Lawn {
    private static double GrowthPrDay = 0.8;

    public Lawn (){}

    public double whenToCut(double startGrassLength, double maxGrassLength){
        int days;
        while(startGrassLength + GrowthPrDay < maxGrassLength){
            return days = (int) (maxGrassLength/startGrassLength + GrowthPrDay);
        }
        return 0;
    }

}
