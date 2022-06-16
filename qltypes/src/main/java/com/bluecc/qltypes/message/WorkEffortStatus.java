package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class WorkEffortStatus implements WithKey{
    String workEffortId;
    String statusId;
    TimestampValue statusDatetime;
    String setByUserLogin;
    String reason;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    UserLogin setbyuserlogin;
    ModelEntity model;
    String format;
    WorkEffort workEffort;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



