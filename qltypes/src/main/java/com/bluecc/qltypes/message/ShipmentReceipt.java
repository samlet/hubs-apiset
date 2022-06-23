package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentReceipt implements WithKey{
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
    TimestampValue datetimeReceived;
    String itemDescription;
    FixedPointValue quantityAccepted;
    FixedPointValue quantityRejected;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    UserLogin userLogin;
    String format;
    InventoryItem inventoryItem;
    OrderHeader orderHeader;
    Shipment shipment;
    ModelEntity model;
    Product product;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return receiptId;
    }
}



