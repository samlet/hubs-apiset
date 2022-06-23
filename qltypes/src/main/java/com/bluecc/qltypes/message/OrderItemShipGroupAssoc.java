package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemShipGroupAssoc implements WithKey{
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    FixedPointValue quantity;
    FixedPointValue cancelQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    OrderHeader orderHeader;
    String format;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



