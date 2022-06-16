package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Blacklist implements WithKey{
    String blacklistId;
    String blacklistTypeId;
    String statusId;
    String tenantId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    BlacklistItemCollection blacklistItems;
    TypesEntity type;
    String proto;
    String format;
    BlacklistStatusCollection blacklistStatuses;
    FieldCatsValue cats;
    ModelEntity model;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return blacklistId;
    }
}



