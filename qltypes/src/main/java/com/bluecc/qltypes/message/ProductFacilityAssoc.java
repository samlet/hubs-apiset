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
    long sequenceNum;
    long transitTime;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    String format;
    ModelEntity model;
    Facility toFacility;
    FieldCatsValue cats;
    Facility fromFacility;
    Product product;
    @Override
    public String getKey() {
        return id;
    }
}



