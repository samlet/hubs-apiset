package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistStatus implements WithKey{
    String blacklistId;
    TimestampValue statusDate;
    TimestampValue statusEndDate;
    String changeByUserLoginId;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    UserLogin userLogin;
    ModelEntity model;
    String proto;
    Blacklist blacklist;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



