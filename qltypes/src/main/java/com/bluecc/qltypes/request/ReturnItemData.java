package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnItemData {
    String returnId;
    String returnItemSeqId;
    String returnReasonId;
    String returnTypeId;
    String returnItemTypeId;
    String productId;
    String description;
    String orderId;
    String orderItemSeqId;
    String statusId;
    String expectedItemStatus;
    FixedPoint returnQuantity;
    FixedPoint receivedQuantity;
    Currency returnPrice;
    String returnItemResponseId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



