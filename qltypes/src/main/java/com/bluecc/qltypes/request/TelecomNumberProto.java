package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TelecomNumberProto {
    String id;
    ContactMechFlatData contactMech;
    TelecomNumberFlatData telecomNumber;
}



