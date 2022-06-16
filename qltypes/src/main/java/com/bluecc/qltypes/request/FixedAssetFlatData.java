package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetFlatData {
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
    Timestamp dateAcquired;
    Timestamp dateLastServiced;
    Timestamp dateNextService;
    Date expectedEndOfLife;
    Date actualEndOfLife;
    FixedPoint productionCapacity;
    String uomId;
    String calendarId;
    String serialNumber;
    String locatedAtFacilityId;
    String locatedAtLocationSeqId;
    Currency salvageValue;
    Currency depreciation;
    Currency purchaseCost;
    String purchaseCostUomId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



