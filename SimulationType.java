package p1;
public enum SimulationType {
  Automatic("Simulation executes to completion without User input."), 
  Manual("Each step in the simulation must be manually activated, actions are also manual "),
  SemiAutomatic("The simulation will execute until predefined break points -- user must manually continue the simulation to the next breakpoint or continue to the end.");
  
/** Constructor */
  private String description;
  SimulationType(String description) {
this.description = description;
}
public String getDescription() {
  return description;
}
}