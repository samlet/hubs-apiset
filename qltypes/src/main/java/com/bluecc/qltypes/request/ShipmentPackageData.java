package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackageData {
    String shipmentId;
    String shipmentPackageSeqId;
    String shipmentBoxTypeId;
    Timestamp dateCreated;
    FixedPoint boxLength;
    FixedPoint boxHeight;
    FixedPoint boxWidth;
    String dimensionUomId;
    FixedPoint weight;
    String weightUomId;
    Currency insuredValue;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



