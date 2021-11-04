package p1;
import java.util.ArrayList;
import java.util.Arrays;

public class Simulator{
  private SimulationType simulationType ;
  private BreakPointType breakPoint;
  private SequenceType sequenceType;
  private int duration;
  private DaysOfTheWeek startsOn;
  private int instantsPerDay;
  private SimulationStatus status;
  private int currentDay;
  private int currentInstant;
  private ArrayList<SequenceDay> days;
  private ArrayList<Event> eventsQueue;
  private ArrayList<Event> completedEvents;
  private ArrayList<Event> inProgressEvents;

public Simulator(SimulationType Automatic, BreakPointType ExecuteToCompletion, SequenceType American, DaysOfTheWeek firstDay, SimulationStatus Initialised){
  simulationType = Automatic;
  breakPoint = ExecuteToCompletion;
  sequenceType = American;
  duration = 8;
  startsOn = firstDay;
  instantsPerDay = 24;
  status = Initialised;
  currentDay = -1;
  currentInstant = -1;
  ArrayList<SequenceDay> days = new ArrayList<SequenceDay>(days);
  ArrayList<Event> eventsQueue = new ArrayList<Event>(eventsQueue);
  ArrayList<Event> completedEvents = new ArrayList<Event>(completedEvents);
   ArrayList<Event> inProgressEvents = new ArrayList<Event>(inProgressEvents);
}
  public Simulator(SimulationType type, BreakPointType bpType, SequenceType seqType, int duration, DaysOfTheWeek startsOn, int instantsPerDay, SimulationStatus Initialised){
    simulationType = type;
    breakPoint = bpType;
    sequenceType = seqType;
    this.duration = duration;
    this.startsOn = startsOn;
    this.instantsPerDay = instantsPerDay;
    status = Initialised;
    currentDay = -1;
    currentInstant = -1;
    ArrayList<SequenceDay> days = new ArrayList<SequenceDay>();
    ArrayList<Event> eventsQueue = new ArrayList<Event>();
    ArrayList<Event> completedEvents = new ArrayList<Event>();
    ArrayList<Event>inProgressEvents = new ArrayList<Event>();
}
/**this method is called on when, after a simulation starts, an error occurs and
the simulation cannot continue; it should set the simulation status as Aborted and stops the
simulation – an appropriate message should be printed*/
public boolean abort(SimulationStatus Aborted){
  status = Aborted;
  System.out.println ("Error:" + "\n Simulation cannot continue");
  return true;
  
}
/**this method is called on when a predefined breakpoint has arrived – all the events up to the breakpoint has been executed*/
public boolean breakSimulation(SimulationStatus AtBreakPoint){
  status = AtBreakPoint;
  return true;

}
/**user cancelled simulation, can only occur in manual or semi-automatic simulation type*/
public boolean cancel(SimulationType Manual, SimulationType SemiAutomatic){
  if (simulationType == Manual || simulationType == SemiAutomatic); {
    return true;
    } 
    System.out.println("Automatic simulation cannot be cancelled.");
    

}
/**continue simulation to next predefined breakpoint*/
public boolean continueSimulation(){


}
/**continue simulation to the end*/
public boolean continueToCompletion(){

}

/**continue simulation to the breakpoint in the parameter*/
public boolean continueTo(BreakPointType bp){

}
/**start the simulation, set the current day and instant to 0*/
public boolean start(){
  currentDay = 0;
  currentInstant = 0;
  return true;
  }
/**make a step to the next instant in the simulation, and
a) execute one of the events for the current instant that can be executed;
b) advance current instant advance by 1, note that the current day may also change;
c) if an event executes, add the current instant to the event and pass the reference to
the event to the current instant object;
d) update the completedEvents, eventsQueue, and inProgressEvents as necessary;
e) if the simulation is automatic or semi-automatic, choose whether to generate events
for future instants that are put in the events queue – this could be randomised,
sometimes yes, sometimes no; and
f) if an event should execute and could not, update its wait time.*/
public boolean step(){

  

}
/**returns true if simulator is at a predefined breakpoint and false*/
public boolean isAtBreakPoint(SimulationStatus AtBreakPoint){
  return (status = AtBreakPoint);

}
/**returns a list of day values that will be the predefined breakpoints, if there should be no predefined breakpoints an empty list is returned*/
public ArrayList<Integer> getBreakPoints(){
  ArrayList<Integer> dayValue = new ArrayList<Integer>(Arrays.asList(new Integer[]{(int) dayValue}));
  return breakpoints;

}
/**returns the dayValue of the current day */
public int getCurrentDay(){
  return currentDay;
}
/**returns the instant value of the current instant*/
public int getCurrentInstant(){
  return currentInstant;
}
/**returns the number of instants in each day*/
public int getInstantsPerDay(){
  return instantsPerDay;
} 
/**returns the instant object for the day and instant
values;*/
public Instant getInstant(int day, int instant){
  return instant.day;
  return instant.instant;
} 

/**calculates and returns the total number of instants that the simulator will execute; also, add an overloaded variation*/
public long getTotalOperationInstants(int dayValue){
  return totalOperationInstants.dayValue;

} 
/**calculates and returns the total number of instants that the simulator will execute on the day
indicated by the dayValue*/
public long getTotalOperationInstants(){
  return totalOperationInstants;
}
/**calculates and returns the total number of instants that the simulator will not execute; also, add an overloaded variation*/
public long getTotalBlackoutInstants(){

  return totalBlackoutInstants;
}
/**calculates
and returns the total number of instants that the simulator will not execute on the day
indicated by the dayValue.*/
public long getTotalBlackoutInstants(int dayValue){
  return totalBlackoutInstants.dayValue;
} 
/**adds the black out interval to the day with dayValue;*/
public void addBlackoutInterval(int dayValue, Interval interval){
  int Value = dayValue + interval;
  return Value;
}
/**verifies configuration of attributes; based on the description for the attributes you should be able to determine how to verify that the attributes have a correct
configuration – an invalid configuration is one of the reasons a simulation should be aborted;*/
public boolean validateParameters(){

}
/**validates the execution of a simulation – this will be described more in P2 (but you can start thinking about what it would me to validate a simulation);*/
public boolean validateExecution(){

} 
/**adds a new event to the event queue – for P1 we will only test your implementation with events with low priority and with a duration of 1 time instant;*/
public void addNewEvent(EventPriority priority, int day, int instant, int duration, String data){
  ArrayList<Event> eventsQueue = new ArrayList<Event>(); 
      eventsQueue.add(new Event("Low","day", "instant", "1 time", "data"));
}
/**adds \lstinline— events to the eventQueue – this method
should randomise the priority, start time and in each event*/
public void addRandomEvents(int eventsToAdd){

}
/** – returns the event to execute next, keep in mind that:
– events with a high priority have precedence over events with a medium priority and
events with a medium priority have precedence over events with a low priority;
– if there are several events that can be executed, each with the same priority, break the
tie by choosing the event with the lower eventID; and
– you must check both the eventsQueue and the inProgressEvents for potential events.
When a simulation ends, whether it was aborted, cancelled, or completed, the simulator should
not exit as it should wait for the shutdown() instruction to be given by the user; it is at this point
that the program ends.
*/
public Event getNextEventToProcess(){
  return nextEventToProcess;

}
}