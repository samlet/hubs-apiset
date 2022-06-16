package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductReviewFlatData {
    String productReviewId;
    String productStoreId;
    String productId;
    String userLoginId;
    String statusId;
    String postedAnonymous;
    Timestamp postedDateTime;
    FixedPoint productRating;
    String productReview;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



