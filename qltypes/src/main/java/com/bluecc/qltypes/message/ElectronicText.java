package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ElectronicText implements WithKey{
    String dataResourceId;
    String textData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    DataResource dataResource;
    String format;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



