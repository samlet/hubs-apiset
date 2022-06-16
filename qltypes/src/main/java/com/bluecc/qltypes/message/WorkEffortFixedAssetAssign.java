package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortFixedAssetAssign implements WithKey{
    String workEffortId;
    String fixedAssetId;
    String statusId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String availabilityStatusId;
    CurrencyValue allocatedCost;
    String comments;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    String proto;
    FixedAsset fixedAsset;
    WorkEffort workEffort;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



