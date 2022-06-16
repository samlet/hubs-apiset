package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfig implements WithKey{
    String productId;
    String configItemId;
    long sequenceNum;
    TimestampValue fromDate;
    String description;
    String longDescription;
    String configTypeId;
    String defaultConfigOptionId;
    TimestampValue thruDate;
    String isMandatory;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    ProductConfigItem configItemProductConfigItem;
    Product productProduct;
    @Override
    public String getKey() {
        return id;
    }
}



