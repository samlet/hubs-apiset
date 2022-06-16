package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnItemBillingData {
    String returnId;
    String returnItemSeqId;
    String invoiceId;
    String invoiceItemSeqId;
    String shipmentReceiptId;
    FixedPoint quantity;
    Currency amount;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



