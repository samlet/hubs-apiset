package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnItemBilling implements WithKey{
    String returnId;
    String returnItemSeqId;
    String invoiceId;
    String invoiceItemSeqId;
    String shipmentReceiptId;
    FixedPointValue quantity;
    CurrencyValue amount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String format;
    String proto;
    ModelEntity model;
    ReturnHeader returnHeader;
    Invoice invoice;
    @Override
    public String getKey() {
        return id;
    }
}



