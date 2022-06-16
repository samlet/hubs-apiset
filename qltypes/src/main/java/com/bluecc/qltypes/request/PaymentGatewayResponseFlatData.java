package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentGatewayResponseFlatData {
    String paymentGatewayResponseId;
    String paymentServiceTypeEnumId;
    String orderPaymentPreferenceId;
    String paymentMethodTypeId;
    String paymentMethodId;
    String transCodeEnumId;
    Currency amount;
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
    Timestamp transactionDate;
    String resultDeclined;
    String resultNsf;
    String resultBadExpire;
    String resultBadCardNumber;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



