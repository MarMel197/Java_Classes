public class WaterBottle {
    private int volume;
    private int sipDrink;

    public WaterBottle(int volume, int sipDrink){
        this.volume = volume;
        this.sipDrink = sipDrink;
    }

    public Object takeSip() {
        if (this.volume > 10){
            return this.volume - 10;
        } else {
            return this.volume;
        }
    }
    /*
     - Create a water bottle class with a volume property.
     - The volume should start at 100.
     - Add a drink function that takes 10 from the volume each time it is called.
     - Create an empty function that brings the volume down to 0.
     - Create a fill function that fills the volume back to 100.
    */
}
