package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TimeOfDayValue {
    int hours;
    int minutes;
    int seconds;
    int nanos;
    String iso;
}



