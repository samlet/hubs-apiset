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
    InventoryItemStatusCollection inventoryItemStatuses;
    TypesEntity type;
    Product product;
    Party ownerParty;
    InventoryItemDetailCollection inventoryItemDetails;
    ListItemProtoValue subview;
    String proto;
    Facility facility;
    ModelEntity model;
    Party party;
    FieldCatsValue cats;
    String format;
    FixedAsset fixedAssetFixedAsset;
    InventoryTransferCollection inventoryTransfers;
    @Override
    public String getKey() {
        return inventoryItemId;
    }
}



