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
    Long useLimitPerOrder;
    Long useLimitPerCustomer;
    Long useLimitPerPromotion;
    FixedPointValue billbackFactor;
    String overrideOrgPartyId;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    ModelEntity model;
    ProductPromoActionCollection productPromoActions;
    String proto;
    UserLogin createdbyuserlogin;
    UserLogin lastmodifiedbyuserlogin;
    FieldCatsValue cats;
    String format;
    ProductPromoRuleCollection productPromoRules;
    Party party;
    @Override
    public String getKey() {
        return productPromoId;
    }
}



