package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SecurityGroupBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    SecurityGroup entity;
    List<ResponseValue> response;
    SecurityGroupBlueprint addSecurityGroupPermissionList;
    SecurityGroupBlueprint removeSecurityGroupPermission;
    SecurityGroupBlueprint updateSecurityGroupPermission;
    SecurityGroupBlueprint addSecurityGroupPermission;
}



