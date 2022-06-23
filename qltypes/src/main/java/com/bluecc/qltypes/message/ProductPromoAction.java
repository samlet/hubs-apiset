package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoAction implements WithKey{
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productPromoActionEnumId;
    String customMethodId;
    String orderAdjustmentTypeId;
    String serviceName;
    FixedPointValue quantity;
    FixedPointValue amount;
    String productId;
    String partyId;
    String useCartQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    String format;
    ProductPromo productPromo;
    FieldCatsValue cats;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



