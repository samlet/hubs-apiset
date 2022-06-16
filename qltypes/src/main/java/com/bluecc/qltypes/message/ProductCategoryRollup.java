package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategoryRollup implements WithKey{
    String productCategoryId;
    String parentProductCategoryId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    ProductCategory currentProductCategory;
    ProductCategory parentProductCategory;
    @Override
    public String getKey() {
        return id;
    }
}



