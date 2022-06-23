package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShippingDocument implements WithKey{
    String documentId;
    String shipmentId;
    String shipmentItemSeqId;
    String shipmentPackageSeqId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ModelEntity model;
    String format;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return documentId;
    }
}



