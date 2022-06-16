package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFeatureApplData {
    String productId;
    String productFeatureId;
    String productFeatureApplTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    long sequenceNum;
    Currency amount;
    Currency recurringAmount;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



