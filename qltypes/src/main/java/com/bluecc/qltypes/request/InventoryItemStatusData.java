package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryItemStatusData {
    String inventoryItemId;
    String statusId;
    Timestamp statusDatetime;
    Timestamp statusEndDatetime;
    String changeByUserLoginId;
    String ownerPartyId;
    String productId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



