package p1;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Integer;

public class Event implements Comparable<Event>{


private static long nextEventIID = 1;
private long eventID;
private EventStatus status;
private int proposedStartDay;
private int proposedStartInstant;
private int duration;
private EventPriority priority;
private long totalWaitTime;
private String data;
private ArrayList<Instant> instantsOfEvent;


/** Constructor */
public Event(int psd, int psi, int duration, EventPriority priority, String data, EventStatus Initialised){
  eventID = nextEventIID;
  nextEventIID +=1;
  status = Initialised;
  proposedStartDay = psd; 
  proposedStartInstant = psi;
  totalWaitTime = 0;
  this.duration = duration;
  this.priority = priority;
  this.data = data;
  ArrayList<Instant> instantsOfEvent = new ArrayList<Instant>();
}
/**to cancel the event, set the status to cancelled, a cancelled event cannot be restarted or execute a step;*/
public void stop(){

}
/**to start the event, set the status to started, does not make a step*/
public void start(){

} 
/**make a step by adding the instant to instantsOfEvent, if the step causes the event to complete, mark it as complete;*/
public boolean step(Instant instant){
  if (step = instant + instantsOfEvent){
    System.out.println("Event complete");
  }
  return instant;

}
/**adds 1 to the totalWaitTime*/
public void waitAStep(){

}
/**to get the instants when the event executed;*/
public ArrayList<Instant> getInstantsOfEvent(){
ArrayList<Instant> instantsOfEvent = new ArrayList<Instant>();
return instantsOfEvent;

}
/**returns the total instants the event was made to wait;*/
public long getTotalWaitTime(){
  return totalWaitTime;

}
/**returns the eventID;*/
public long getEventID(){
  return eventID;

}
/**returns the proposedStartDay;*/
public int getProposedStartDay(){
  return proposedStartDay;

} 
/**returns the proposedStartInstant;*/
public int getProposedStartInstant() {
  return proposedStartInstant;

}
/**returns the status*/
public EventStatus getStatus(){
  return status;

} 
/**returns the priority*/
public EventPriority getEventPriority(){
  return priority;
}

@Override
public int compareTo(Event eve) {
    return Long.compare(this.eventID, eve.eventID);
}
}
