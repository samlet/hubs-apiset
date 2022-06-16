package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyContactMech implements WithKey{
    String partyId;
    String contactMechId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String roleTypeId;
    String allowSolicitation;
    String extension;
    String verified;
    String comments;
    long yearsWithContactMech;
    long monthsWithContactMech;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ContactMech contactMech;
    String format;
    Party party;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



