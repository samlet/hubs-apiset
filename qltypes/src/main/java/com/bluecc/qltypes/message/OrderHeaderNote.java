package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderHeaderNote implements WithKey{
    String orderId;
    String noteId;
    String internalNote;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    OrderHeader orderHeader;
    String proto;
    NoteData noteData;
    @Override
    public String getKey() {
        return id;
    }
}



