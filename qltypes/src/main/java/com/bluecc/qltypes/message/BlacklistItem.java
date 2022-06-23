package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistItem implements WithKey{
    String blacklistItemId;
    String blacklistId;
    String loginId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String reason;
    String blockBy;
    String blacklistItemTypeId;
    String statusId;
    String tenantId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    UserLogin login;
    ModelEntity model;
    Blacklist blacklist;
    UserLogin blockByLogin;
    String proto;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return blacklistItemId;
    }
}



