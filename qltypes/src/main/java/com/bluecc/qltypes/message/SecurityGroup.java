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
    SecurityGroupPermissionCollection securityGroupPermissions;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return groupId;
    }
}



