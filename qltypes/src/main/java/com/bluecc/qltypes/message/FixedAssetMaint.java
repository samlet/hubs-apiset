package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetMaint implements WithKey{
    String fixedAssetId;
    String maintHistSeqId;
    String statusId;
    String productMaintTypeId;
    String productMaintSeqId;
    String scheduleWorkEffortId;
    FixedPointValue intervalQuantity;
    String intervalUomId;
    String intervalMeterTypeId;
    String purchaseOrderId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FixedAsset fixedAsset;
    String proto;
    OrderHeader purchaseOrderHeader;
    WorkEffort scheduleWorkEffort;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



