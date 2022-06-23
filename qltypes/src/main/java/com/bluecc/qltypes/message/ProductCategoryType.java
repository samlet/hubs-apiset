package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategoryType implements WithKey{
    String productCategoryTypeId;
    String parentTypeId;
    String hasTable;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    String format;
    @Override
    public String getKey() {
        return productCategoryTypeId;
    }
}



