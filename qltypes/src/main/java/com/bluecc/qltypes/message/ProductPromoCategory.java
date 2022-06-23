package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoCategory implements WithKey{
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productPromoCondSeqId;
    String productCategoryId;
    String andGroupId;
    String productPromoApplEnumId;
    String includeSubCategories;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    ProductPromo productPromo;
    FieldCatsValue cats;
    String format;
    ProductCategory productCategory;
    @Override
    public String getKey() {
        return id;
    }
}



