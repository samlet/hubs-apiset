package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentReceiptFlatData {
    String receiptId;
    String inventoryItemId;
    String productId;
    String shipmentId;
    String shipmentItemSeqId;
    String shipmentPackageSeqId;
    String orderId;
    String orderItemSeqId;
    String returnId;
    String returnItemSeqId;
    String rejectionId;
    String receivedByUserLoginId;
    Timestamp datetimeReceived;
    String itemDescription;
    FixedPoint quantityAccepted;
    FixedPoint quantityRejected;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



