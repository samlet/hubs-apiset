package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortAssocData {
    String workEffortIdFrom;
    String workEffortIdTo;
    String workEffortAssocTypeId;
    Long sequenceNum;
    Timestamp fromDate;
    Timestamp thruDate;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



