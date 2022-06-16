package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementTermFlatData {
    String agreementTermId;
    String termTypeId;
    String agreementId;
    String agreementItemSeqId;
    String invoiceItemTypeId;
    Timestamp fromDate;
    Timestamp thruDate;
    Currency termValue;
    long termDays;
    String textValue;
    double minQuantity;
    double maxQuantity;
    String description;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



