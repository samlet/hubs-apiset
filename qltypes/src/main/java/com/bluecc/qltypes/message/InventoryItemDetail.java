package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItemDetail implements WithKey{
    String inventoryItemId;
    String inventoryItemDetailSeqId;
    TimestampValue effectiveDate;
    FixedPointValue quantityOnHandDiff;
    FixedPointValue availableToPromiseDiff;
    FixedPointValue accountingQuantityDiff;
    FixedPointValue unitCost;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String shipmentId;
    String shipmentItemSeqId;
    String returnId;
    String returnItemSeqId;
    String workEffortId;
    String fixedAssetId;
    String maintHistSeqId;
    String itemIssuanceId;
    String receiptId;
    String physicalInventoryId;
    String reasonEnumId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    WorkEffort workEffort;
    String proto;
    InventoryItem inventoryItem;
    @Override
    public String getKey() {
        return id;
    }
}



