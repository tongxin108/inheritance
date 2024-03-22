public class MusicConcertEvent {
    private boolean merchandiseRequired;
    private double merchandiseCost;

    public MusicConcertEvent(boolean merchandiseRequired, double merchandiseCost) {
        this.merchandiseRequired = merchandiseRequired;
        this.merchandiseCost = merchandiseCost;
    }

    public void calculateEventCost() {
        double totalCost = 0;

        if (merchandiseRequired) {
            totalCost += merchandiseCost;
        }

        

        System.out.println("Total Event Cost: $" + totalCost);
    }

    @Override
    public String toString() {
        return "Merchandise Required: " + merchandiseRequired +
                "\nMerchandise Cost: $" + merchandiseCost;
    }
}