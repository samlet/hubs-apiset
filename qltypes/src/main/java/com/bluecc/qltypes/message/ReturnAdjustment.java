package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnAdjustment implements WithKey{
    String returnAdjustmentId;
    String returnAdjustmentTypeId;
    String returnId;
    String returnItemSeqId;
    String shipGroupSeqId;
    String comments;
    String description;
    String returnTypeId;
    String orderAdjustmentId;
    CurrencyValue amount;
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productFeatureId;
    String correspondingProductId;
    String taxAuthorityRateSeqId;
    String sourceReferenceId;
    FixedPointValue sourcePercentage;
    String customerReferenceId;
    String primaryGeoId;
    String secondaryGeoId;
    CurrencyValue exemptAmount;
    String taxAuthGeoId;
    String taxAuthPartyId;
    String overrideGlAccountId;
    String includeInTax;
    String includeInShipping;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    UserLogin userLogin;
    String format;
    String proto;
    ProductPromo productPromo;
    FieldCatsValue cats;
    ModelEntity model;
    ReturnHeader returnHeader;
    @Override
    public String getKey() {
        return returnAdjustmentId;
    }
}



