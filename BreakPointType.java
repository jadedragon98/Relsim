package p1;
public enum BreakPointType{
  /** Enum fields */
  Day ("Simulation will have a breakpoints after each day"),
  EndOfWeek ("Simulation will have a breakpoints after the end of the week, the end of the week is defined based on the SequenceType enumeration"),
  SevenDays ("Simulation will have a breakpoints after each seven (7) days"),
  FourteenDays ("Simulation will have a breakpoints after each fourteen (14) days"),
  TwentyEightDays ("Simulation will have a breakpoints after each twenty-eight (28) days"),
  ExecuteToCompletion ("Simulation will have no breakpoints");
  
  /** Constructor */
  private String description;
  BreakPointType(String description) {
this.description = description;
}
public String getDescription() {
  return description;
}
}