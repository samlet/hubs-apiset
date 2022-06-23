package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfigProduct implements WithKey{
    String configItemId;
    String configOptionId;
    String productId;
    FixedPointValue quantity;
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product productProduct;
    String proto;
    ProductConfigItem configItemProductConfigItem;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



