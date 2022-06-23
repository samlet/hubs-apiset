package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SecurityGroupPermission implements WithKey{
    String groupId;
    String permissionId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    FieldCatsValue cats;
    String proto;
    SecurityPermission securityPermission;
    ModelEntity model;
    SecurityGroup securityGroup;
    @Override
    public String getKey() {
        return id;
    }
}



