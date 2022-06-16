package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderContactMech implements WithKey{
    String orderId;
    String contactMechPurposeTypeId;
    String contactMechId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    OrderHeader orderHeader;
    String format;
    ContactMech contactMech;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



