package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortType implements WithKey{
    String workEffortTypeId;
    String parentTypeId;
    String hasTable;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return workEffortTypeId;
    }
}



