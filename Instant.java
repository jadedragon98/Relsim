package p1;
import java.util.ArrayList;
import java.util.Arrays;
public class Instant implements Comparable<Instant>{
  private int instant;
  private String name;
  private boolean isBlackout;
  private ArrayList<Event> eventsAtInstant;
  private int getInstant;


  public Instant(int day, String dayString, int instant, String value){
  
    this.instant = instant;
    name = value;
    isBlackout = false;
    ArrayList<Event> eventsAtInstant = new ArrayList<Event>(); /**eventsAtInstant to a new and empty ArrayList of the declared type*/
  }

  public String getName(){
    return name;

  } /** returns the name of the instant*/


  public int getInstant(){
    return instant;
  } /** returns the value of the instant*/


  public boolean isBlackout() {
  boolean isBlackout= true;
    if (isBlackout) {
      return true;
    } else{
        return false;
    }

  } /** returns true if the instant is a blackout instant, and false otherwise*/


  public void switchBlackout(){
    if (isBlackout == true) {
      isBlackout = false;
    } else {
        isBlackout = true;
      }
  } /**if the value in the isBlackout attribute is currently true, changes it to
false and if it is false changes it to true*/


  public void addEvent(Event event){
    eventsAtInstant.add(event);

  } /**adds the event to the end of the eventsAtInstant*/

@Override
public int compareTo(Instant ins) {
    return Integer.compare(this.instant, ins.instant);
}
  }
