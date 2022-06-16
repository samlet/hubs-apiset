package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderRole implements WithKey{
    String orderId;
    String partyId;
    String roleTypeId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Party party;
    ModelEntity model;
    String proto;
    String format;
    FieldCatsValue cats;
    OrderHeader orderHeader;
    @Override
    public String getKey() {
        return id;
    }
}



