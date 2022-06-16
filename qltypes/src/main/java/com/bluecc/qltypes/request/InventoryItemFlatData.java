package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItemFlatData {
    String inventoryItemId;
    String inventoryItemTypeId;
    String productId;
    String partyId;
    String ownerPartyId;
    String statusId;
    Timestamp datetimeReceived;
    Timestamp datetimeManufactured;
    Timestamp expireDate;
    String facilityId;
    String containerId;
    String lotId;
    String uomId;
    String binNumber;
    String locationSeqId;
    String comments;
    FixedPoint quantityOnHandTotal;
    FixedPoint availableToPromiseTotal;
    FixedPoint accountingQuantityTotal;
    String serialNumber;
    String softIdentifier;
    String activationNumber;
    Timestamp activationValidThru;
    FixedPoint unitCost;
    String currencyUomId;
    String fixedAssetId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



