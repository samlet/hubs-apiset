package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class NoteDataData {
    String noteId;
    String noteName;
    String noteInfo;
    Timestamp noteDateTime;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String noteParty;
    String moreInfoUrl;
    String moreInfoItemId;
    String moreInfoItemName;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



