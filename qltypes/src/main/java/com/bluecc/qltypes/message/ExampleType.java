package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleType implements WithKey{
    String exampleTypeId;
    String parentTypeId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return exampleTypeId;
    }
}



