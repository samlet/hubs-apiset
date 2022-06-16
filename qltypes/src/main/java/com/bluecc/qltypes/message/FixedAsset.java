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
    FixedAssetMaintCollection fixedAssetMaints;
    TypesEntity type;
    FixedAssetProductCollection fixedAssetProducts;
    FixedAsset parentFixedAsset;
    FieldCatsValue cats;
    String proto;
    ModelEntity model;
    Facility locatedAtFacility;
    FixedAssetGeoPointCollection fixedAssetGeoPoints;
    Product instanceOfProduct;
    OrderHeader acquireOrderHeader;
    ListItemProtoValue subview;
    Party party;
    String format;
    FixedAssetAttributeCollection fixedAssetAttributes;
    @Override
    public String getKey() {
        return fixedAssetId;
    }
}



