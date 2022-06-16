package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentApplication implements WithKey{
    String paymentApplicationId;
    String paymentId;
    String invoiceId;
    String invoiceItemSeqId;
    String billingAccountId;
    String overrideGlAccountId;
    String toPaymentId;
    String taxAuthGeoId;
    CurrencyValue amountApplied;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String proto;
    FieldCatsValue cats;
    Payment payment;
    String format;
    ModelEntity model;
    Payment toPayment;
    BillingAccount billingAccount;
    Invoice invoice;
    @Override
    public String getKey() {
        return paymentApplicationId;
    }
}



