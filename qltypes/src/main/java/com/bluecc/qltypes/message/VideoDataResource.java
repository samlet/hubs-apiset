package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class VideoDataResource implements WithKey{
    String dataResourceId;
    String videoData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    String format;
    ModelEntity model;
    DataResource dataResource;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



