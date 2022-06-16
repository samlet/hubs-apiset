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
    long defaultDaysToShip;
    TimestampValue openedDate;
    TimestampValue closedDate;
    String description;
    String defaultDimensionUomId;
    String defaultWeightUomId;
    String geoPointId;
    long facilityLevel;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    ResponseValue pickInventory;
    Facility parentFacility;
    Party ownerParty;
    ModelEntity model;
    FacilityContactMechPurposeCollection facilityContactMechPurposes;
    ListItemProtoValue subview;
    String proto;
    FacilityContactMechCollection facilityContactMeches;
    TypesEntity type;
    FieldCatsValue cats;
    ProductStore productStore;
    @Override
    public String getKey() {
        return facilityId;
    }
}



