
public class Event{
    public static final double insuranceCost = 1000.00;
    public static final double tax = 0.3 ;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String eventPointOFContact;
    private double eventCost;
    private int totalParticipants;
    private int totalEventDays;


    public Event(String eventID,String eventName,String eventLocation,String eventPointOFContact,int totalParticipants,int totalEventDays ){
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventLocation = eventLocation;
        this.eventPointOFContact = eventPointOFContact;
        this.eventCost = eventCost;
        this.totalParticipants = totalParticipants;
        this.totalEventDays = totalEventDays;



    }
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }
    public String getEventID(){
        return eventID;
    }
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    public String getEventName(){
        return eventName;
    }
    public void setEventLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }
    public String getEventLocation(){
        return eventLocation;
    }
    public void setEventPointOFContact(String eventPointOFContact){
        this.eventPointOFContact = eventPointOFContact;
    }
    public String getEventPointOFContact(){
        return eventPointOFContact;
    }
    public void setEventCost(double eventCost){
        this.eventCost = eventCost;
    }
    public double getEventCost(){
        return eventCost;
    }
    public void setTotalParticipants(int totalParticipants){
        this.totalParticipants = totalParticipants;
    }
    public int getTotalParticipants(){
        return totalParticipants;
    }
    public void setTotalEventDays(int totalEventDays){
        this.totalEventDays = totalEventDays;
    }
    public int getTotalEventDays(){
        return totalEventDays;
    }
    public String toString(){
        return eventID+" "+ eventName+" "+eventLocation +" "+eventPointOFContact +" " + eventCost +" " +totalParticipants +" " +totalEventDays;
    }
    public void calculateEventCost(){
        this.eventCost = eventCost +(eventCost * tax)+insuranceCost;
    }


}