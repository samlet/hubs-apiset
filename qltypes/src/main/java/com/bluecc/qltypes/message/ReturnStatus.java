package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnStatus implements WithKey{
    String returnStatusId;
    String statusId;
    String returnId;
    String returnItemSeqId;
    String changeByUserLoginId;
    TimestampValue statusDatetime;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ModelEntity model;
    String proto;
    UserLogin changeByUserLogin;
    String format;
    ReturnHeader returnHeader;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return returnStatusId;
    }
}



