package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyContactMechPurpose implements WithKey{
    String partyId;
    String contactMechId;
    String contactMechPurposeTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Party party;
    String proto;
    ContactMech contactMech;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



