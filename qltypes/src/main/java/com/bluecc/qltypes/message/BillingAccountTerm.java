package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BillingAccountTerm implements WithKey{
    String billingAccountTermId;
    String billingAccountId;
    String termTypeId;
    CurrencyValue termValue;
    Long termDays;
    String uomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    ModelEntity model;
    BillingAccount billingAccount;
    String format;
    String proto;
    @Override
    public String getKey() {
        return billingAccountTermId;
    }
}



