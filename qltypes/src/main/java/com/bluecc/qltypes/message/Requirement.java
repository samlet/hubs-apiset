package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Requirement implements WithKey{
    String requirementId;
    String requirementTypeId;
    String facilityId;
    String deliverableId;
    String fixedAssetId;
    String productId;
    String statusId;
    String description;
    TimestampValue requirementStartDate;
    TimestampValue requiredByDate;
    CurrencyValue estimatedBudget;
    FixedPointValue quantity;
    String useCase;
    String reason;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    String facilityIdTo;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ListItemProtoValue subview;
    Product product;
    TypesEntity type;
    String proto;
    String format;
    Facility facility;
    FieldCatsValue cats;
    ModelEntity model;
    FixedAsset fixedAsset;
    @Override
    public String getKey() {
        return requirementId;
    }
}



