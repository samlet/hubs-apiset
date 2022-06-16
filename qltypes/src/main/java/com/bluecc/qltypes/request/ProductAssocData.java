package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductAssocData {
    String productId;
    String productIdTo;
    String productAssocTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    long sequenceNum;
    String reason;
    FixedPoint quantity;
    FixedPoint scrapFactor;
    String instruction;
    String routingWorkEffortId;
    String estimateCalcMethod;
    String recurrenceInfoId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



