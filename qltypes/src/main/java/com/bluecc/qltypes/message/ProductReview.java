package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductReview implements WithKey{
    String productReviewId;
    String productStoreId;
    String productId;
    String userLoginId;
    String statusId;
    String postedAnonymous;
    TimestampValue postedDateTime;
    FixedPointValue productRating;
    String productReview;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    Product product;
    String proto;
    ProductStore productStore;
    FieldCatsValue cats;
    String format;
    ModelEntity model;
    UserLogin userLogin;
    @Override
    public String getKey() {
        return productReviewId;
    }
}



