package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FactProtoStatus implements WithKey{
    String factProtoId;
    TimestampValue statusDate;
    TimestampValue statusEndDate;
    String changeByUserLoginId;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String format;
    FactProto factProto;
    UserLogin userLogin;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



