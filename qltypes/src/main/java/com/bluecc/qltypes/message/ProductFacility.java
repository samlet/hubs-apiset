package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFacility implements WithKey{
    String productId;
    String facilityId;
    FixedPointValue minimumStock;
    FixedPointValue reorderQuantity;
    long daysToShip;
    String replenishMethodEnumId;
    FixedPointValue lastInventoryCount;
    String requirementMethodEnumId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    Product product;
    String proto;
    FieldCatsValue cats;
    Facility facility;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



