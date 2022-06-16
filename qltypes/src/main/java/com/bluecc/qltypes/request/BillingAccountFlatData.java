package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BillingAccountFlatData {
    String billingAccountId;
    Currency accountLimit;
    String accountCurrencyUomId;
    String contactMechId;
    Timestamp fromDate;
    Timestamp thruDate;
    String description;
    String externalAccountId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



