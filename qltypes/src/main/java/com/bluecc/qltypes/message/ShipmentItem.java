package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentItem implements WithKey{
    String shipmentId;
    String shipmentItemSeqId;
    String productId;
    FixedPointValue quantity;
    String shipmentContentDescription;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product product;
    Shipment shipment;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



