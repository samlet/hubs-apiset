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
    BillingAccountBlueprint addBillingAccountRole;
    BillingAccountBlueprint removeBillingAccountTerm;
    BillingAccountBlueprint addBillingAccountRoleList;
    BillingAccountBlueprint addBillingAccountTerm;
    BillingAccountBlueprint updateBillingAccountRole;
    BillingAccountBlueprint updateBillingAccountTerm;
    BillingAccountBlueprint addBillingAccountTermList;
}



