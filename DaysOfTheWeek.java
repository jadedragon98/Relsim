package p1;
public enum DaysOfTheWeek {
Monday("Monday"), 
Tuesday("Tuesday"), 
Wednesday("Wednesday"),
Thursday("Thursday"),
Friday("Friday"),
Saturday("Saturday"), 
Sunday("Sunday");

 /** Constructor */
private String description;
DaysOfTheWeek(String description) {
this.description = description;
}

public String getDescription() {
return description; /**@return description of fields*/
}
public static DaysOfTheWeek firstDayAmerican() {
return Sunday;
}
public static DaysOfTheWeek firstDayBritish() {
return Monday;
}
public static DaysOfTheWeek next(DaysOfTheWeek day) {
return DaysOfTheWeek.values()[(day.ordinal() == 6 ? 0 : day.ordinal() + 1)];
}
}