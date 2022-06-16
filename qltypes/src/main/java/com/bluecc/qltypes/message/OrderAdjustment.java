package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderAdjustment implements WithKey{
    String orderAdjustmentId;
    String orderAdjustmentTypeId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String comments;
    String description;
    CurrencyValue amount;
    CurrencyValue recurringAmount;
    CurrencyValue amountAlreadyIncluded;
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
    String isManual;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    String originalAdjustmentId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    FieldCatsValue cats;
    String format;
    UserLogin userLogin;
    ProductPromo productPromo;
    OrderHeader orderHeader;
    ModelEntity model;
    @Override
    public String getKey() {
        return orderAdjustmentId;
    }
}



