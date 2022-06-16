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
    UserLogin changeByUserLogin;
    FieldCatsValue cats;
    ReturnHeader returnHeader;
    String format;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return returnStatusId;
    }
}



