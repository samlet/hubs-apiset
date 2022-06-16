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
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product productProduct;
    FieldCatsValue cats;
    ModelEntity model;
    ProductConfigItem configItemProductConfigItem;
    String format;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



