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
    InventoryBlueprint addInventoryItemDetail;
    InventoryBlueprint modifyInventoryItemType;
    InventoryBlueprint updateInventoryTransfer;
    InventoryBlueprint updateInventoryItemDetail;
    InventoryBlueprint removeInventoryItemDetail;
    InventoryBlueprint removeInventoryItemStatus;
    InventoryBlueprint addInventoryItemDetailList;
    InventoryBlueprint addInventoryItemStatus;
    InventoryBlueprint removeInventoryTransfer;
    InventoryBlueprint updateInventoryItemStatus;
    InventoryBlueprint addInventoryTransfer;
    InventoryBlueprint addInventoryItemStatusList;
}



