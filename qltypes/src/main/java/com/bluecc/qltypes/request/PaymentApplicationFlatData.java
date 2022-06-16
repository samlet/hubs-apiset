package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentApplicationFlatData {
    String paymentApplicationId;
    String paymentId;
    String invoiceId;
    String invoiceItemSeqId;
    String billingAccountId;
    String overrideGlAccountId;
    String toPaymentId;
    String taxAuthGeoId;
    Currency amountApplied;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



