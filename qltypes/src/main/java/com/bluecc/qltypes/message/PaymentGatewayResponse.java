package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentGatewayResponse implements WithKey{
    String paymentGatewayResponseId;
    String paymentServiceTypeEnumId;
    String orderPaymentPreferenceId;
    String paymentMethodTypeId;
    String paymentMethodId;
    String transCodeEnumId;
    CurrencyValue amount;
    String currencyUomId;
    String referenceNum;
    String altReference;
    String subReference;
    String gatewayCode;
    String gatewayFlag;
    String gatewayAvsResult;
    String gatewayCvResult;
    String gatewayScoreResult;
    String gatewayMessage;
    TimestampValue transactionDate;
    String resultDeclined;
    String resultNsf;
    String resultBadExpire;
    String resultBadCardNumber;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    String proto;
    @Override
    public String getKey() {
        return paymentGatewayResponseId;
    }
}



