package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AudioDataResource implements WithKey{
    String dataResourceId;
    String audioData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    String proto;
    DataResource dataResource;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return dataResourceId;
    }
}



