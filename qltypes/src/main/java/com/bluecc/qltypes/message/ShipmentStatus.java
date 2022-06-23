package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentStatus implements WithKey{
    String statusId;
    String shipmentId;
    TimestampValue statusDate;
    String changeByUserLoginId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Shipment shipment;
    String proto;
    FieldCatsValue cats;
    String format;
    UserLogin changeByUserLogin;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



