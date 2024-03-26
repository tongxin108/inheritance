public class MusicConcertEvent{
    
    private boolean merchandiseRequired;
    private double merchandiseCost;
    private CalculateEventCostClass calculateEventCostObject;
    
    private int totalParticipants;


    public MusicConcertEvent(String eventID, String eventName, String eventLocation, String eventPointOfContact, double eventCost, int totalParticipants, int totalEventDays, boolean merchandiseRequired, double merchandiseCost) {
        //super(eventID, eventName, eventLocation, eventPointOfContact, eventCost, totalParticipants, totalEventDays);
        this.calculateEventCostObject = new CalculateEventCostClass();
        this.merchandiseCost = merchandiseCost;
        this.merchandiseRequired = merchandiseRequired;
}

    public boolean getMerchandiseRequired() {
        return merchandiseRequired;
    }
    public void setMerchandiseRequired(boolean merchandiseRequired) {
        this.merchandiseRequired = merchandiseRequired;
    }
    public double getMerchandiseCost() {
        return merchandiseCost;
    }
    public void setMerchandiseCost(double merchandiseCost) {
        this.merchandiseCost = merchandiseCost;
    }

    
    public double calculateEventCost() {
        double totalCost = calculateEventCost();
        if (merchandiseRequired) {
            totalCost += merchandiseCost * totalParticipants;
        }
        return totalCost;
    }
   
    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Merchandise Required: " + merchandiseRequired + "\n" +
        "Merchandise Cost: " + merchandiseCost;
    }
}