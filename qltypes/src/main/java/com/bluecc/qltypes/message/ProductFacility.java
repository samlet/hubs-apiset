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
    Long daysToShip;
    String replenishMethodEnumId;
    FixedPointValue lastInventoryCount;
    String requirementMethodEnumId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    Product product;
    ModelEntity model;
    String proto;
    Facility facility;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



