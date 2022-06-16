package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFacilityLocation implements WithKey{
    String productId;
    String facilityId;
    String locationSeqId;
    FixedPointValue minimumStock;
    FixedPointValue moveQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Facility facility;
    ModelEntity model;
    Product product;
    String format;
    String proto;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



