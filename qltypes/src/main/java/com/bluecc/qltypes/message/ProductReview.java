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
    UserLogin userLogin;
    FieldCatsValue cats;
    String proto;
    ListItemProtoValue subview;
    ModelEntity model;
    Product product;
    String format;
    ProductStore productStore;
    @Override
    public String getKey() {
        return productReviewId;
    }
}



