package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleItem implements WithKey{
    String exampleId;
    String exampleItemSeqId;
    String description;
    Double amount;
    String amountUomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    Example example;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



