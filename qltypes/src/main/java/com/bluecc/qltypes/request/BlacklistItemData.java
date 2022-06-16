package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistItemData {
    String blacklistItemId;
    String blacklistId;
    String loginId;
    Timestamp fromDate;
    Timestamp thruDate;
    String reason;
    String blockBy;
    String blacklistItemTypeId;
    String statusId;
    String tenantId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



