package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoActionData {
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productPromoActionEnumId;
    String customMethodId;
    String orderAdjustmentTypeId;
    String serviceName;
    FixedPoint quantity;
    FixedPoint amount;
    String productId;
    String partyId;
    String useCartQuantity;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



