package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentFlatData {
    String paymentId;
    String paymentTypeId;
    String paymentMethodTypeId;
    String paymentMethodId;
    String paymentGatewayResponseId;
    String paymentPreferenceId;
    String partyIdFrom;
    String partyIdTo;
    String roleTypeIdTo;
    String statusId;
    Timestamp effectiveDate;
    String paymentRefNum;
    Currency amount;
    String currencyUomId;
    String comments;
    String finAccountTransId;
    String overrideGlAccountId;
    Currency actualCurrencyAmount;
    String actualCurrencyUomId;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



