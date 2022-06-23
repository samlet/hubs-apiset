package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentPurpose implements WithKey{
    String contentId;
    String contentPurposeTypeId;
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String proto;
    ModelEntity model;
    String format;
    Content content;
    @Override
    public String getKey() {
        return id;
    }
}



