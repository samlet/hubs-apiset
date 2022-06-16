package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoProduct implements WithKey{
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productPromoCondSeqId;
    String productId;
    String productPromoApplEnumId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    ModelEntity model;
    String proto;
    Product product;
    ProductPromo productPromo;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



