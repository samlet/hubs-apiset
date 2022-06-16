package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ItemIssuance implements WithKey{
    String itemIssuanceId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String inventoryItemId;
    String shipmentId;
    String shipmentItemSeqId;
    String fixedAssetId;
    String maintHistSeqId;
    TimestampValue issuedDateTime;
    String issuedByUserLoginId;
    FixedPointValue quantity;
    FixedPointValue cancelQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    UserLogin issuedByUserLogin;
    String format;
    InventoryItem inventoryItem;
    Shipment shipment;
    String proto;
    FieldCatsValue cats;
    OrderHeader orderHeader;
    ModelEntity model;
    @Override
    public String getKey() {
        return itemIssuanceId;
    }
}



