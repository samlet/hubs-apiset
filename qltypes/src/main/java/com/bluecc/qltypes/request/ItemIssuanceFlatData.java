package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ItemIssuanceFlatData {
    String itemIssuanceId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String inventoryItemId;
    String shipmentId;
    String shipmentItemSeqId;
    String fixedAssetId;
    String maintHistSeqId;
    Timestamp issuedDateTime;
    String issuedByUserLoginId;
    FixedPoint quantity;
    FixedPoint cancelQuantity;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



