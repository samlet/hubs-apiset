package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetProductData {
    String fixedAssetId;
    String productId;
    String fixedAssetProductTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    String comments;
    Long sequenceNum;
    FixedPoint quantity;
    String quantityUomId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



