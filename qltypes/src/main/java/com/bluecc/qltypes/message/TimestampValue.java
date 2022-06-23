package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TimestampValue {
    Long seconds;
    Integer nanos;
    String localTime;
    String china;
    Boolean afterNow;
    String iso;
}



