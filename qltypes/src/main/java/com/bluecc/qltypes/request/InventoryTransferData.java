package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class InventoryTransferData {
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
    Timestamp sendDate;
    Timestamp receiveDate;
    String comments;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



