package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnStatusData {
    String returnStatusId;
    String statusId;
    String returnId;
    String returnItemSeqId;
    String changeByUserLoginId;
    Timestamp statusDatetime;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



