package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BillingAccountBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    BillingAccount entity;
    List<ResponseValue> response;
    BillingAccountBlueprint removeBillingAccountRole;
    BillingAccountBlueprint addBillingAccountRoleList;
    BillingAccountBlueprint addBillingAccountRole;
    BillingAccountBlueprint addBillingAccountTerm;
    BillingAccountBlueprint addBillingAccountTermList;
    BillingAccountBlueprint updateBillingAccountTerm;
    BillingAccountBlueprint updateBillingAccountRole;
    BillingAccountBlueprint removeBillingAccountTerm;
}



