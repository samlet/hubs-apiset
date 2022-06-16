package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkOrderItemFulfillment implements WithKey{
    String workEffortId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    String format;
    OrderHeader orderHeader;
    WorkEffort workEffort;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



