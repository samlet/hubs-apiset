package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLoginSecurityGroup implements WithKey{
    String userLoginId;
    String groupId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    SecurityGroup securityGroup;
    String proto;
    String format;
    FieldCatsValue cats;
    UserLogin userLogin;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



