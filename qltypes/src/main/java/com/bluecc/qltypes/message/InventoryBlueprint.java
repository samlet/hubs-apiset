package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    InventoryItem entity;
    List<ResponseValue> response;
    InventoryBlueprint addInventoryTransferList;
    InventoryBlueprint removeInventoryItemDetail;
    InventoryBlueprint addInventoryItemStatusList;
    InventoryBlueprint addInventoryItemDetail;
    InventoryBlueprint removeInventoryItemStatus;
    InventoryBlueprint updateInventoryItemDetail;
    InventoryBlueprint addInventoryItemStatus;
    InventoryBlueprint removeInventoryTransfer;
    InventoryBlueprint updateInventoryItemStatus;
    InventoryBlueprint updateInventoryTransfer;
    InventoryBlueprint addInventoryTransfer;
    InventoryBlueprint addInventoryItemDetailList;
    InventoryBlueprint modifyInventoryItemType;
}



