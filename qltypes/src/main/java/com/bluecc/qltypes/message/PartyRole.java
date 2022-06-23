package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyRole implements WithKey{
    String partyId;
    String roleTypeId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    Party party;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



