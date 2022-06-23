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
    String format;
    ContactMech contactMech;
    OrderHeader orderHeader;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



