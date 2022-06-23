package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfigOption implements WithKey{
    String configItemId;
    String configOptionId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String configOptionName;
    String description;
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ProductConfigItem configItemProductConfigItem;
    String format;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



