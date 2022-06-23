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
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    String format;
    OrderHeader orderHeader;
    WorkEffort workEffort;
    @Override
    public String getKey() {
        return id;
    }
}



