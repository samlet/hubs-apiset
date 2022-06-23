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
    Long sequenceNum;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    ModelEntity model;
    String proto;
    String format;
    ProductCategory parentProductCategory;
    ProductCategory currentProductCategory;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



