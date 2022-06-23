package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFacilityAssoc implements WithKey{
    String productId;
    String facilityId;
    String facilityIdTo;
    String facilityAssocTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    Long sequenceNum;
    Long transitTime;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Facility fromFacility;
    String proto;
    Product product;
    Facility toFacility;
    FieldCatsValue cats;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



