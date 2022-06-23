package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PaymentBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Payment entity;
    List<ResponseValue> response;
    PaymentBlueprint addAcctgTransList;
    PaymentBlueprint modifyPaymentGatewayResponse;
    PaymentBlueprint addPaymentApplicationList;
    PaymentBlueprint addPaymentApplication;
    PaymentBlueprint removePaymentApplication;
    PaymentBlueprint updatePaymentApplication;
    PaymentBlueprint addAcctgTrans;
    PaymentBlueprint updateAcctgTrans;
    PaymentBlueprint removeAcctgTrans;
    PaymentBlueprint modifyPaymentType;
}



