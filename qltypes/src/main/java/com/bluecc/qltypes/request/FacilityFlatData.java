package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FacilityFlatData {
    String facilityId;
    String facilityTypeId;
    String parentFacilityId;
    String ownerPartyId;
    String defaultInventoryItemTypeId;
    String facilityName;
    String primaryFacilityGroupId;
    FixedPoint facilitySize;
    String facilitySizeUomId;
    String productStoreId;
    Long defaultDaysToShip;
    Timestamp openedDate;
    Timestamp closedDate;
    String description;
    String defaultDimensionUomId;
    String defaultWeightUomId;
    String geoPointId;
    Long facilityLevel;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



