package p1;
public enum SimulationStatus{
  Aborted ("Simulation was aborted due to an error"),AtBreakPoint ("Simulation is at a (predefined), breakpoint"),
  Completed ("Simulation has executed to completion"),Cancelled ("Simulation was cancelled"),
  Initialised ("Simulation is initialised, execution has not started"),
  Started ("Simulation has started execution");
  
/** Constructor */
  private String description;
  SimulationStatus(String description) {
this.description = description;
}
public String getDescription() {
  return description;
}
}