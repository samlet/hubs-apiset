package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductPromo implements WithKey{
    String productPromoId;
    String promoName;
    String promoText;
    String userEntered;
    String showToCustomer;
    String requireCode;
    long useLimitPerOrder;
    long useLimitPerCustomer;
    long useLimitPerPromotion;
    FixedPointValue billbackFactor;
    String overrideOrgPartyId;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    UserLogin createdbyuserlogin;
    Party party;
    String format;
    String proto;
    FieldCatsValue cats;
    UserLogin lastmodifiedbyuserlogin;
    ModelEntity model;
    ListItemProtoValue subview;
    ProductPromoActionCollection productPromoActions;
    ProductPromoRuleCollection productPromoRules;
    @Override
    public String getKey() {
        return productPromoId;
    }
}



