package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ReturnHeaderFlatData {
    String returnId;
    String returnHeaderTypeId;
    String statusId;
    String createdBy;
    String fromPartyId;
    String toPartyId;
    String paymentMethodId;
    String finAccountId;
    String billingAccountId;
    Timestamp entryDate;
    String originContactMechId;
    String destinationFacilityId;
    String needsInventoryReceive;
    String currencyUomId;
    String supplierRmaId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



