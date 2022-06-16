package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderItemPriceInfoFlatData {
    String orderItemPriceInfoId;
    String orderId;
    String orderItemSeqId;
    String productPriceRuleId;
    String productPriceActionSeqId;
    Currency modifyAmount;
    String description;
    String rateCode;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



