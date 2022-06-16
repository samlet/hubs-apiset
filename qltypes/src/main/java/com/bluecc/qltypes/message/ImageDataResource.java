package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ImageDataResource implements WithKey{
    String dataResourceId;
    String imageData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    String format;
    ModelEntity model;
    DataResource dataResource;
    String proto;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



