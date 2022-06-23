package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyType implements WithKey{
    String partyTypeId;
    String parentTypeId;
    String hasTable;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return partyTypeId;
    }
}



