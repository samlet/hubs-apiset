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
    DataResource dataResource;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



