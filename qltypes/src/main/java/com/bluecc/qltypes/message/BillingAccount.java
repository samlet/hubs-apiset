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
    ContactMech contactMech;
    String format;
    BillingAccountTermCollection billingAccountTerms;
    ListItemProtoValue subview;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return billingAccountId;
    }
}



