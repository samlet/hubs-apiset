package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnAdjustmentData {
    String returnAdjustmentId;
    String returnAdjustmentTypeId;
    String returnId;
    String returnItemSeqId;
    String shipGroupSeqId;
    String comments;
    String description;
    String returnTypeId;
    String orderAdjustmentId;
    Currency amount;
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



