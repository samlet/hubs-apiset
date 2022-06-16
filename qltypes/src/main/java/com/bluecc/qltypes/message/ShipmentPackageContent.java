package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackageContent implements WithKey{
    String shipmentId;
    String shipmentPackageSeqId;
    String shipmentItemSeqId;
    FixedPointValue quantity;
    String subProductId;
    FixedPointValue subProductQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    Product subProduct;
    String format;
    Shipment shipment;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



