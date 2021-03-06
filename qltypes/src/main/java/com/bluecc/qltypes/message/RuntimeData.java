package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class RuntimeData implements WithKey{
    String runtimeDataId;
    String runtimeInfo;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    String proto;
    @Override
    public String getKey() {
        return runtimeDataId;
    }
}



