package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategoryMember implements WithKey{
    String productCategoryId;
    String productId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String comments;
    long sequenceNum;
    FixedPointValue quantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    String proto;
    Product product;
    ProductCategory productCategory;
    FieldCatsValue cats;
    String format;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



