package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetMaintData {
    String fixedAssetId;
    String maintHistSeqId;
    String statusId;
    String productMaintTypeId;
    String productMaintSeqId;
    String scheduleWorkEffortId;
    FixedPoint intervalQuantity;
    String intervalUomId;
    String intervalMeterTypeId;
    String purchaseOrderId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



