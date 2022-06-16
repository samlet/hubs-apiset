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
    ListItemProtoValue subview;
    Party noteparty;
    ModelEntity model;
    String format;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return noteId;
    }
}



