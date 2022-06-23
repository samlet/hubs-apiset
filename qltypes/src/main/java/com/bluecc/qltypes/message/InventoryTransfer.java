package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryTransfer implements WithKey{
    String inventoryTransferId;
    String statusId;
    String inventoryItemId;
    String facilityId;
    String locationSeqId;
    String containerId;
    String facilityIdTo;
    String locationSeqIdTo;
    String containerIdTo;
    String itemIssuanceId;
    TimestampValue sendDate;
    TimestampValue receiveDate;
    String comments;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    ModelEntity model;
    InventoryItem inventoryItem;
    FieldCatsValue cats;
    Facility toFacility;
    Facility facility;
    String format;
    @Override
    public String getKey() {
        return inventoryTransferId;
    }
}



