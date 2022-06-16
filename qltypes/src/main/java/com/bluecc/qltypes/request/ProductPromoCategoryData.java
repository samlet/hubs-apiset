package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoCategoryData {
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productPromoCondSeqId;
    String productCategoryId;
    String andGroupId;
    String productPromoApplEnumId;
    String includeSubCategories;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String id;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



