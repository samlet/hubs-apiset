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
    long termDays;
    String uomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    String format;
    BillingAccount billingAccount;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return billingAccountTermId;
    }
}



