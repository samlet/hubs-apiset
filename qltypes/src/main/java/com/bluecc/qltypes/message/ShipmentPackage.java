package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackage implements WithKey{
    String shipmentId;
    String shipmentPackageSeqId;
    String shipmentBoxTypeId;
    TimestampValue dateCreated;
    FixedPointValue boxLength;
    FixedPointValue boxHeight;
    FixedPointValue boxWidth;
    String dimensionUomId;
    FixedPointValue weight;
    String weightUomId;
    CurrencyValue insuredValue;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Shipment shipment;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



