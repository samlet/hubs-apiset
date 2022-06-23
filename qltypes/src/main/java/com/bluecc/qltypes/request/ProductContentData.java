package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductContentData {
    String productId;
    String contentId;
    String productContentTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    Timestamp purchaseFromDate;
    Timestamp purchaseThruDate;
    Long useCountLimit;
    Long useTime;
    String useTimeUomId;
    String useRoleTypeId;
    Long sequenceNum;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



