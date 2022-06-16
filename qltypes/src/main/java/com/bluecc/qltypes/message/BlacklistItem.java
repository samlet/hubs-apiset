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
    Blacklist blacklist;
    String proto;
    UserLogin blockByLogin;
    ModelEntity model;
    UserLogin login;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return blacklistItemId;
    }
}



