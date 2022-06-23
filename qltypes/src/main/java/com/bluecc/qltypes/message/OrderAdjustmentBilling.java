package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderAdjustmentBilling implements WithKey{
    String orderAdjustmentId;
    String invoiceId;
    String invoiceItemSeqId;
    CurrencyValue amount;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    Invoice invoice;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



