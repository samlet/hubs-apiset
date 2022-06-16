package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyStatus implements WithKey{
    String statusId;
    String partyId;
    TimestampValue statusDate;
    String changeByUserLoginId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    String proto;
    FieldCatsValue cats;
    UserLogin changeByUserLogin;
    Party party;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



