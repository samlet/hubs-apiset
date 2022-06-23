package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FactProtoType implements WithKey{
    String factProtoTypeId;
    String parentTypeId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return factProtoTypeId;
    }
}



