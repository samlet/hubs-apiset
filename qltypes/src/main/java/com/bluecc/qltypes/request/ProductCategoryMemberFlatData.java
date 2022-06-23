package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategoryMemberFlatData {
    String productCategoryId;
    String productId;
    Timestamp fromDate;
    Timestamp thruDate;
    String comments;
    Long sequenceNum;
    FixedPoint quantity;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



