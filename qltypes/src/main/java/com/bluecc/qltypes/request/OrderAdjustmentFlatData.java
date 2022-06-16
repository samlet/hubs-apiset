package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderAdjustmentFlatData {
    String orderAdjustmentId;
    String orderAdjustmentTypeId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String comments;
    String description;
    Currency amount;
    Currency recurringAmount;
    Currency amountAlreadyIncluded;
    String productPromoId;
    String productPromoRuleId;
    String productPromoActionSeqId;
    String productFeatureId;
    String correspondingProductId;
    String taxAuthorityRateSeqId;
    String sourceReferenceId;
    FixedPoint sourcePercentage;
    String customerReferenceId;
    String primaryGeoId;
    String secondaryGeoId;
    Currency exemptAmount;
    String taxAuthGeoId;
    String taxAuthPartyId;
    String overrideGlAccountId;
    String includeInTax;
    String includeInShipping;
    String isManual;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    String originalAdjustmentId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



