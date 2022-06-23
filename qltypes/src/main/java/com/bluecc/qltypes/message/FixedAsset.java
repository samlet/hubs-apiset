package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAsset implements WithKey{
    String fixedAssetId;
    String fixedAssetTypeId;
    String parentFixedAssetId;
    String instanceOfProductId;
    String classEnumId;
    String partyId;
    String roleTypeId;
    String fixedAssetName;
    String acquireOrderId;
    String acquireOrderItemSeqId;
    TimestampValue dateAcquired;
    TimestampValue dateLastServiced;
    TimestampValue dateNextService;
    DateValue expectedEndOfLife;
    DateValue actualEndOfLife;
    FixedPointValue productionCapacity;
    String uomId;
    String calendarId;
    String serialNumber;
    String locatedAtFacilityId;
    String locatedAtLocationSeqId;
    CurrencyValue salvageValue;
    CurrencyValue depreciation;
    CurrencyValue purchaseCost;
    String purchaseCostUomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    FixedAssetAttributeCollection fixedAssetAttributes;
    Product instanceOfProduct;
    FixedAssetMaintCollection fixedAssetMaints;
    ModelEntity model;
    Party party;
    FieldCatsValue cats;
    FixedAsset parentFixedAsset;
    FixedAssetProductCollection fixedAssetProducts;
    String proto;
    FixedAssetGeoPointCollection fixedAssetGeoPoints;
    OrderHeader acquireOrderHeader;
    TypesEntity type;
    String format;
    Facility locatedAtFacility;
    @Override
    public String getKey() {
        return fixedAssetId;
    }
}



