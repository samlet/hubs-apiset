package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortGoodStandard implements WithKey{
    String workEffortId;
    String productId;
    String workEffortGoodStdTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String statusId;
    Double estimatedQuantity;
    CurrencyValue estimatedCost;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    Product product;
    WorkEffort workEffort;
    String format;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



