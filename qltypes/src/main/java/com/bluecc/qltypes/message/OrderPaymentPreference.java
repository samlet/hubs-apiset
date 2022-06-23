package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderPaymentPreference implements WithKey{
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
    CurrencyValue maxAmount;
    Long processAttempt;
    String billingPostalCode;
    String manualAuthCode;
    String manualRefNum;
    String statusId;
    String needsNsfRetry;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    OrderHeader orderHeader;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    UserLogin userLogin;
    @Override
    public String getKey() {
        return orderPaymentPreferenceId;
    }
}



