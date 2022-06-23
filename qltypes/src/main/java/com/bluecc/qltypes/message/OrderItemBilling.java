package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemBilling implements WithKey{
    String orderId;
    String orderItemSeqId;
    String invoiceId;
    String invoiceItemSeqId;
    String itemIssuanceId;
    String shipmentReceiptId;
    FixedPointValue quantity;
    CurrencyValue amount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    OrderHeader orderHeader;
    Invoice invoice;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



