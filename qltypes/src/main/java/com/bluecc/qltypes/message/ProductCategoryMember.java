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
    Long sequenceNum;
    FixedPointValue quantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String tenantId;
    Product product;
    String proto;
    FieldCatsValue cats;
    ProductCategory productCategory;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



