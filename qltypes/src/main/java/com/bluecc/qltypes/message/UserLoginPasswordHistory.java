package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLoginPasswordHistory implements WithKey{
    String userLoginId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String currentPassword;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    UserLogin userLogin;
    @Override
    public String getKey() {
        return id;
    }
}



