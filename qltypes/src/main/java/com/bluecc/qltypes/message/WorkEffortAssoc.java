package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortAssoc implements WithKey{
    String workEffortIdFrom;
    String workEffortIdTo;
    String workEffortAssocTypeId;
    long sequenceNum;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    String proto;
    WorkEffort toWorkEffort;
    WorkEffort fromWorkEffort;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



