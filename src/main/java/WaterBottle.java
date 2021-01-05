public class WaterBottle {
    private int volume = 100;
    private int sipDrink = 10;
    private int volumeDifference;

    public WaterBottle(int volume, int sipDrink, int volumeDifference){
        this.volume = volume;
        this.sipDrink = sipDrink;
        this.volumeDifference = volumeDifference;
    }
    /*
     - Create a water bottle class with a volume property.
     - The volume should start at 100.
     - Add a drink function that takes 10 from the volume each time it is called.
     - Create an empty function that brings the volume down to 0.
     - Create a fill function that fills the volume back to 100.
    */
}
