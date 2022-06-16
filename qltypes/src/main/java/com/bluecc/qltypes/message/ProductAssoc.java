package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductAssoc implements WithKey{
    String productId;
    String productIdTo;
    String productAssocTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    String reason;
    FixedPointValue quantity;
    FixedPointValue scrapFactor;
    String instruction;
    String routingWorkEffortId;
    String estimateCalcMethod;
    String recurrenceInfoId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    String proto;
    WorkEffort routingWorkEffort;
    ModelEntity model;
    Product mainProduct;
    Product assocProduct;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



