package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortGoodStandardData {
    String workEffortId;
    String productId;
    String workEffortGoodStdTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    String statusId;
    double estimatedQuantity;
    Currency estimatedCost;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



