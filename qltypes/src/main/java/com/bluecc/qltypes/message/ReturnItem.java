package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnItem implements WithKey{
    String returnId;
    String returnItemSeqId;
    String returnReasonId;
    String returnTypeId;
    String returnItemTypeId;
    String productId;
    String description;
    String orderId;
    String orderItemSeqId;
    String statusId;
    String expectedItemStatus;
    FixedPointValue returnQuantity;
    FixedPointValue receivedQuantity;
    CurrencyValue returnPrice;
    String returnItemResponseId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    OrderHeader orderHeader;
    Product product;
    String proto;
    FieldCatsValue cats;
    String format;
    ReturnHeader returnHeader;
    @Override
    public String getKey() {
        return id;
    }
}



