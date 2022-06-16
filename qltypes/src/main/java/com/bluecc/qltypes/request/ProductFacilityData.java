package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFacilityData {
    String productId;
    String facilityId;
    FixedPoint minimumStock;
    FixedPoint reorderQuantity;
    long daysToShip;
    String replenishMethodEnumId;
    FixedPoint lastInventoryCount;
    String requirementMethodEnumId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



