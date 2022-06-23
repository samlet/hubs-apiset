package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromoFlatData {
    String productPromoId;
    String promoName;
    String promoText;
    String userEntered;
    String showToCustomer;
    String requireCode;
    Long useLimitPerOrder;
    Long useLimitPerCustomer;
    Long useLimitPerPromotion;
    FixedPoint billbackFactor;
    String overrideOrgPartyId;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



