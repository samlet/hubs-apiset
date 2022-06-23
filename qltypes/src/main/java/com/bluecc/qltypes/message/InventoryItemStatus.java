package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItemStatus implements WithKey{
    String inventoryItemId;
    String statusId;
    TimestampValue statusDatetime;
    TimestampValue statusEndDatetime;
    String changeByUserLoginId;
    String ownerPartyId;
    String productId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    String proto;
    InventoryItem inventoryItem;
    UserLogin userLogin;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



