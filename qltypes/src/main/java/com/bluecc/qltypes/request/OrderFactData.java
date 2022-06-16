package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderFactData {
    String orderId;
    String invoiceId;
    String paymentId;
    String paymentGatewayResponseId;
    String orderPaymentPreferenceId;
    String billingAccountId;
    String shipmentId;
    String orderFactTypeId;
    String statusId;
    String tenantId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



