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
    BlacklistStatusCollection blacklistStatuses;
    ListItemProtoValue subview;
    BlacklistItemCollection blacklistItems;
    String format;
    ModelEntity model;
    String proto;
    FieldCatsValue cats;
    TypesEntity type;
    @Override
    public String getKey() {
        return blacklistId;
    }
}



