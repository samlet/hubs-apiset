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
    UserLogin userLogin;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    SecurityGroup securityGroup;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



