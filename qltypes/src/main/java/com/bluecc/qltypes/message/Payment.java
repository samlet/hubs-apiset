package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Payment implements WithKey{
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
    TimestampValue effectiveDate;
    String paymentRefNum;
    CurrencyValue amount;
    String currencyUomId;
    String comments;
    String finAccountTransId;
    String overrideGlAccountId;
    CurrencyValue actualCurrencyAmount;
    String actualCurrencyUomId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    TypesEntity type;
    String format;
    ListItemProtoValue subview;
    Party toParty;
    ModelEntity model;
    FieldCatsValue cats;
    PaymentApplicationCollection paymentApplications;
    Party fromParty;
    String proto;
    @Override
    public String getKey() {
        return paymentId;
    }
}



