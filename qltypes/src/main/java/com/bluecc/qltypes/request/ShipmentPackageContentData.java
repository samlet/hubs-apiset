package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ShipmentPackageContentData {
    String shipmentId;
    String shipmentPackageSeqId;
    String shipmentItemSeqId;
    FixedPoint quantity;
    String subProductId;
    FixedPoint subProductQuantity;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



