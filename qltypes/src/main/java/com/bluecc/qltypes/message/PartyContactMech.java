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
    Long yearsWithContactMech;
    Long monthsWithContactMech;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    ContactMech contactMech;
    String proto;
    Party party;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



