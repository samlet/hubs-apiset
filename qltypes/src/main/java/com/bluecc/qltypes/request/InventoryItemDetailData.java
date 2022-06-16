package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItemDetailData {
    String inventoryItemId;
    String inventoryItemDetailSeqId;
    Timestamp effectiveDate;
    FixedPoint quantityOnHandDiff;
    FixedPoint availableToPromiseDiff;
    FixedPoint accountingQuantityDiff;
    FixedPoint unitCost;
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
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



