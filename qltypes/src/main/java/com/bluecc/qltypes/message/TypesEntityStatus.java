package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TypesEntityStatus implements WithKey{
    String typesEntityId;
    TimestampValue statusDate;
    TimestampValue statusEndDate;
    String changeByUserLoginId;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    String format;
    TypesEntity typesEntity;
    ModelEntity model;
    FieldCatsValue cats;
    UserLogin userLogin;
    @Override
    public String getKey() {
        return id;
    }
}



