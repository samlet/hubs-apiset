package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class SecurityPermission implements WithKey{
    String permissionId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return permissionId;
    }
}



