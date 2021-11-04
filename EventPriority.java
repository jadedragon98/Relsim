package p1;
public enum EventPriority {
  /** Enum fields */
  High ("Highest priority"),
  Medium ("Second-level priority"),
  Low ("Lowest priority");

/** Constructor */
  private String description;
  EventPriority(String description) {
this.description = description;
}

public String getDescription() {
  return description;
}
}