public class Main {
    public static void main(String[] args) {
        ConferenceEvent conferenceEvent = new ConferenceEvent("E001","AI Conference","Paris","Gua df",50,2,25,40,60);     
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);
    }
    
}
