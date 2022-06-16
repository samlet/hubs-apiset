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
    String format;
    FieldCatsValue cats;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return productStoreGroupTypeId;
    }
}



