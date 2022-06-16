package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnItemShipment implements WithKey{
    String returnId;
    String returnItemSeqId;
    String shipmentId;
    String shipmentItemSeqId;
    FixedPointValue quantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String format;
    String proto;
    Shipment shipment;
    ReturnHeader returnHeader;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



