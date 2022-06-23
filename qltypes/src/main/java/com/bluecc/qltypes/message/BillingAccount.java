package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BillingAccount implements WithKey{
    String billingAccountId;
    CurrencyValue accountLimit;
    String accountCurrencyUomId;
    String contactMechId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String description;
    String externalAccountId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    BillingAccountRoleCollection billingAccountRoles;
    String proto;
    FieldCatsValue cats;
    ModelEntity model;
    ListItemProtoValue subview;
    ContactMech contactMech;
    BillingAccountTermCollection billingAccountTerms;
    String format;
    @Override
    public String getKey() {
        return billingAccountId;
    }
}



