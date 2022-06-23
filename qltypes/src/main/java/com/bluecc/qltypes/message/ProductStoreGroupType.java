package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroupType implements WithKey{
    String productStoreGroupTypeId;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return productStoreGroupTypeId;
    }
}



