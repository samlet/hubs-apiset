package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FacilityContactMechPurpose implements WithKey{
    String facilityId;
    String contactMechId;
    String contactMechPurposeTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    ContactMech contactMech;
    String proto;
    Facility facility;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



