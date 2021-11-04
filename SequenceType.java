package p1;
public enum SequenceType{
  /** Enum fields */
  American ("Weeks start on a Sunday"),
  British ("Weeks start on a Monday");
  
/** Constructor */
  private String description;
SequenceType(String description) {
this.description = description;
}
public String getDescription() {
return description;
}
}