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
    PaymentBlueprint addPaymentApplication;
    PaymentBlueprint addPaymentApplicationList;
    PaymentBlueprint updateAcctgTrans;
    PaymentBlueprint updatePaymentApplication;
    PaymentBlueprint addAcctgTransList;
    PaymentBlueprint addAcctgTrans;
    PaymentBlueprint removePaymentApplication;
    PaymentBlueprint modifyPaymentGatewayResponse;
    PaymentBlueprint removeAcctgTrans;
    PaymentBlueprint modifyPaymentType;
}



