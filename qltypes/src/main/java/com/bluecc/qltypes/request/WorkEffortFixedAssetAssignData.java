package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortFixedAssetAssignData {
    String workEffortId;
    String fixedAssetId;
    String statusId;
    Timestamp fromDate;
    Timestamp thruDate;
    String availabilityStatusId;
    Currency allocatedCost;
    String comments;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



