package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderPaymentPreferenceFlatData {
    String orderPaymentPreferenceId;
    String orderId;
    String orderItemSeqId;
    String shipGroupSeqId;
    String productPricePurposeId;
    String paymentMethodTypeId;
    String paymentMethodId;
    String finAccountId;
    String securityCode;
    String track2;
    String presentFlag;
    String swipedFlag;
    String overflowFlag;
    Currency maxAmount;
    long processAttempt;
    String billingPostalCode;
    String manualAuthCode;
    String manualRefNum;
    String statusId;
    String needsNsfRetry;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



