package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLoginSession implements WithKey{
    String userLoginId;
    TimestampValue savedDate;
    String sessionData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    UserLogin userLogin;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return userLoginId;
    }
}



