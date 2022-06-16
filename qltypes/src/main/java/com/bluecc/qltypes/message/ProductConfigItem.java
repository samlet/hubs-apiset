package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductConfigItem implements WithKey{
    String configItemId;
    String configItemTypeId;
    String configItemName;
    String description;
    String longDescription;
    String imageUrl;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ModelEntity model;
    FieldCatsValue cats;
    String format;
    String proto;
    ListItemProtoValue subview;
    ProductConfigProductCollection configItemProductConfigProducts;
    ProductConfigOptionCollection configItemProductConfigOptions;
    @Override
    public String getKey() {
        return configItemId;
    }
}



