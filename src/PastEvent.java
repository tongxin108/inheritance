public class PastEvent{

    public static final double pastEventCost = 10_000;
    public static final double tax = 0.3;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private String eventID;

    //private double pastEventCost;

    public PastEvent(String eventID, String eventName, String eventLocation, String pointOfContact, int totalParticipants, int totalEventDays) {

    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String status) {
        this.paymentStatus = status;
    }

    public boolean getRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    
    public void calculateCost(){
        double cost = 1000+ (1000 * tax);
        
    }

    public void setPaymentDetails(String paymentStatus, boolean requiresExtension) {
        this.paymentDetails = "The event cost was " +  pastEventCost + " and the payment status is " + paymentStatus + 
        "\n" + "The Customer requires extension?: " + requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    @Override
    public String toString(){
        return "\n"+"Event ID:" + eventID +"\n" + "The past event details: " + "\n" +
        "The payment details are as follows:"+ "\n" +paymentDetails;
    }
    
}
