package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistType implements WithKey{
    String blacklistTypeId;
    String parentTypeId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return blacklistTypeId;
    }
}



