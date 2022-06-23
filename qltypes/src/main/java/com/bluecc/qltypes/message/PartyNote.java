package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyNote implements WithKey{
    String partyId;
    String noteId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    Party party;
    NoteData noteData;
    @Override
    public String getKey() {
        return id;
    }
}



