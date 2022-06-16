package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SecurityGroup implements WithKey{
    String groupId;
    String groupName;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    ListItemProtoValue subview;
    ModelEntity model;
    String format;
    SecurityGroupPermissionCollection securityGroupPermissions;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return groupId;
    }
}



