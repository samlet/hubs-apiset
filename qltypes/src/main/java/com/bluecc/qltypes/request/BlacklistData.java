package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistData {
    String blacklistId;
    String blacklistTypeId;
    String statusId;
    String tenantId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



