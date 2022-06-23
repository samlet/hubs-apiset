package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BillingAccountRole implements WithKey{
    String billingAccountId;
    String partyId;
    String roleTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    String format;
    BillingAccount billingAccount;
    Party party;
    @Override
    public String getKey() {
        return id;
    }
}



