package p1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
public class SequenceDay implements Comparable<SequenceDay>{
  private int day;
  private DaysOfTheWeek name;
  private ArrayList<Instant> instants;
  private ArrayList<Interval> blackoutIntervals;

  public SequenceDay(int dayValue, DaysOfTheWeek name, int instantsPerDay) {
    day = dayValue;
    this.name = name;
    ArrayList<Interval> blackoutIntervals = new ArrayList<Interval>();
    ArrayList<Instant> instants  = instantsPerDay; 

  }
public void addBlackoutInterval(int i_starts, int i_duration){
 Instant blackouts = blackout.plus(i_duration);


  /** for (int x : blackoutIntervals) {
    if (x == blackouts) {
        isBlackout = true;
        break;
    } */
}
} /**adds a blackout interval starting at
i_start whose duration is for i_duration and updates the isBlackout attribute for the associated
instants to true*/

public void removeBlackoutInterval(int i_starts, int i_duration) {
  int blackouts = i_starts + i_duration;
  blackoutIntervals.remove(blackouts);
  for (int x : blackoutIntervals) {
    if (x != blackouts) {
        isBlackout = false;
        break;
    }
  }
}


/**removes the blackout interval(s)
starting at i_start with duration of i_duration and updates the isBlackout attribute for the
associated instants to false*/
public boolean validate(int instantsPerDay) {
} 
/**checks that the attributes produce a valid configuration
such that a) there is an Instant for each value in the sequence 1..instantsP erDay inclusive of
the end points b) blackout intervals do no overlap, and c) each blackout interval validate(...)
method returns true – return true if all the conditions are met and false otherwise;*/

public void addEvent(Event event, int atInstant) {
} 
/**adds the event to the events for the instant in instants whose instant value is atInstant */

public int getNbrOfBlackoutInstants(){
  return NbrOfBlackoutInstants;
} 
/**returns the number of blackout instants for the day;*/

public int getNbrOfOperationInstants(){
  return NbrOfOperationInstants;
}
/**returns the number of non-blackout instants for the day;*/

public int getDay(){
  return Day;
}

/**returns the value in day;*/

public DaysOfTheWeek getName(){
  return Name;
} 
/**returns the value in name */

public Instant getInstant(int instant){
  return instant;
}
/**returns the instant object with the instant value*/

@Override
public int compareTo(SequenceDay se) {
    return Integer.compare(this.day, se.day);
}
}