package p1;
public enum EventStatus{
  /** Enum fields */
  Completed ("Event has executed to completion"), 
  Cancelled ("Event was cancelled"),
  Initialised ("Event is initialised, execution has not started"), 
  Skipped ("Event was skipped"), 
  Started  ("Event has started execution");
  
/** Constructor*/
  private String description;
  EventStatus(String description) {
this.description = description;
}

public String getDescription() {
  return description;
}
  
}