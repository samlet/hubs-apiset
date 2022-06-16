package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Value {
    String nullValue;
    double numberValue;
    String stringValue;
    boolean boolValue;
    Struct structValue;
    ListValue listValue;
}



