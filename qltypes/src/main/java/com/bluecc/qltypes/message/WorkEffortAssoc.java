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
    Long sequenceNum;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    WorkEffort fromWorkEffort;
    WorkEffort toWorkEffort;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



