package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentItemBilling implements WithKey{
    String shipmentId;
    String shipmentItemSeqId;
    String invoiceId;
    String invoiceItemSeqId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    Shipment shipment;
    String format;
    FieldCatsValue cats;
    Invoice invoice;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



