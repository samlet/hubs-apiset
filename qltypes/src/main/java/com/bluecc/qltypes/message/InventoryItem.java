package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItem implements WithKey{
    String inventoryItemId;
    String inventoryItemTypeId;
    String productId;
    String partyId;
    String ownerPartyId;
    String statusId;
    TimestampValue datetimeReceived;
    TimestampValue datetimeManufactured;
    TimestampValue expireDate;
    String facilityId;
    String containerId;
    String lotId;
    String uomId;
    String binNumber;
    String locationSeqId;
    String comments;
    FixedPointValue quantityOnHandTotal;
    FixedPointValue availableToPromiseTotal;
    FixedPointValue accountingQuantityTotal;
    String serialNumber;
    String softIdentifier;
    String activationNumber;
    TimestampValue activationValidThru;
    FixedPointValue unitCost;
    String currencyUomId;
    String fixedAssetId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    InventoryItemDetailCollection inventoryItemDetails;
    InventoryItemStatusCollection inventoryItemStatuses;
    ListItemProtoValue subview;
    FixedAsset fixedAssetFixedAsset;
    Party party;
    FieldCatsValue cats;
    TypesEntity type;
    String format;
    Party ownerParty;
    InventoryTransferCollection inventoryTransfers;
    String proto;
    Product product;
    ModelEntity model;
    Facility facility;
    @Override
    public String getKey() {
        return inventoryItemId;
    }
}



