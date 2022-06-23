package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FacilityContactMech implements WithKey{
    String facilityId;
    String contactMechId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String extension;
    String comments;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ContactMech contactMech;
    String format;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    Facility facility;
    @Override
    public String getKey() {
        return id;
    }
}



