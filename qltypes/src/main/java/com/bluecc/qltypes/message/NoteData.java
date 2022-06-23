package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class NoteData implements WithKey{
    String noteId;
    String noteName;
    String noteInfo;
    TimestampValue noteDateTime;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String noteParty;
    String moreInfoUrl;
    String moreInfoItemId;
    String moreInfoItemName;
    String tenantId;
    ModelEntity model;
    Party noteparty;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    String proto;
    String format;
    @Override
    public String getKey() {
        return noteId;
    }
}



