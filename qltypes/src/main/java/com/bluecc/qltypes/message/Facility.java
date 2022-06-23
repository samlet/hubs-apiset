package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Facility implements WithKey{
    String facilityId;
    String facilityTypeId;
    String parentFacilityId;
    String ownerPartyId;
    String defaultInventoryItemTypeId;
    String facilityName;
    String primaryFacilityGroupId;
    FixedPointValue facilitySize;
    String facilitySizeUomId;
    String productStoreId;
    Long defaultDaysToShip;
    TimestampValue openedDate;
    TimestampValue closedDate;
    String description;
    String defaultDimensionUomId;
    String defaultWeightUomId;
    String geoPointId;
    Long facilityLevel;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ResponseValue pickInventory;
    ProductStore productStore;
    ListItemProtoValue subview;
    TypesEntity type;
    FacilityContactMechPurposeCollection facilityContactMechPurposes;
    FieldCatsValue cats;
    Facility parentFacility;
    String format;
    FacilityContactMechCollection facilityContactMeches;
    ModelEntity model;
    String proto;
    Party ownerParty;
    @Override
    public String getKey() {
        return facilityId;
    }
}



