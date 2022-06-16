package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class RequirementFlatData {
    String requirementId;
    String requirementTypeId;
    String facilityId;
    String deliverableId;
    String fixedAssetId;
    String productId;
    String statusId;
    String description;
    Timestamp requirementStartDate;
    Timestamp requiredByDate;
    Currency estimatedBudget;
    FixedPoint quantity;
    String useCase;
    String reason;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    String facilityIdTo;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



