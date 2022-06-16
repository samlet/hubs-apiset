package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementFlatData {
    String agreementId;
    String productId;
    String partyIdFrom;
    String partyIdTo;
    String roleTypeIdFrom;
    String roleTypeIdTo;
    String agreementTypeId;
    Timestamp agreementDate;
    Timestamp fromDate;
    Timestamp thruDate;
    String description;
    String textData;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



