package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContentAttribute implements WithKey{
    String contentId;
    String attrName;
    String attrValue;
    String attrDescription;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    Content content;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



