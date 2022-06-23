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
    FieldCatsValue cats;
    Facility facility;
    String proto;
    ModelEntity model;
    ContactMech contactMech;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



