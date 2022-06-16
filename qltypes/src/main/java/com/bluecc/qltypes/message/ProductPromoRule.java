package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoRule implements WithKey{
    String productPromoId;
    String productPromoRuleId;
    String ruleName;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    String format;
    String proto;
    ProductPromo productPromo;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



