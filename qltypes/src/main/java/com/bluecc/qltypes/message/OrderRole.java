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
    ModelEntity model;
    FieldCatsValue cats;
    Party party;
    String proto;
    OrderHeader orderHeader;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



