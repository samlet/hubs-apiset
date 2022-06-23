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
    Long sequenceNum;
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
    ModelEntity model;
    Product assocProduct;
    String proto;
    String format;
    WorkEffort routingWorkEffort;
    FieldCatsValue cats;
    Product mainProduct;
    @Override
    public String getKey() {
        return id;
    }
}



