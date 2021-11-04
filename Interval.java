package p1;
import java.util.ArrayList;
import java.util.Arrays;
public class Interval implements Comparable<Interval>{
  private int starts;
  private int duration;

public Interval(int starts, int duration){ 
    this.starts = starts;
    this.duration = duration;
    
  }

public boolean equals(Interval other){ 
  
/**returns true if other has the same start and duration as the corresponding attributes in the true object, otherwise returns false; this— object, otherwise
returns false;*/
}

public boolean isAfter(Interval other){ /** returns true if other, when its start and duration are taken
into account are strictly before this.start otherwise returns false;*/
}
public boolean isBefore(Interval other){ /** returns true if other is strictly after the this object’s end,
otherwise returns false;*/
}
public boolean overlapsOnTheLeft(Interval other){ /** other overlaps with the this object on the left, i.e.,
other starts before and ends within its duration, otherwise returns false;*/
}
public boolean overlapsOnTheRight(Interval other){ /** other overlaps with the this object’ on the right,
i.e., other starts after, is within the duration of, and ends after, otherwise returns false;*/
}
public boolean overlaps(Interval other){ /** other overlaps with the this object, left or right;*/
}

public boolean contains(Interval other){ /**other is contained within the this object (when contains is
true, equals is false), otherwise returns false;*/
}
public boolean isContiguousWith(Interval other){  /**other is beside the this object, for example if other
has start and duration of 3 and 2 respectively and the this object has start and duration
of 5 and 4 respectively (or 1 and 2 respectively), the method should return true and false
otherwise;*/
}

public int getStart(){ /**returns the start of the interval;*/
}
public int getDuration(){  /**returns the duration of the interval;*/
}
public int getEnd(){ /**calculates and returns the end of the interval – an interval that starts at instant
with value 3 and has duration 5 ends at instant with value of 7, i.e., at the end of the instant
with value 7;*/
}

public boolean validate(int maxValue){ /**returns true if the interval is valid with respect to maxValue,
i.e., start and duration are both greater than or equal to 1, and the end of the interval is less
then or equal to maxValue.*/
}

@Override
public int compareTo(Interval ine) {
    return Integer.compare(this.starts, ine.starts);
}
}