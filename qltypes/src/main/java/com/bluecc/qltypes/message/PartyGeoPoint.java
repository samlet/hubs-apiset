package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyGeoPoint implements WithKey{
    String partyId;
    String geoPointId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    Party party;
    ModelEntity model;
    String proto;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



