package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Agreement implements WithKey{
    String agreementId;
    String productId;
    String partyIdFrom;
    String partyIdTo;
    String roleTypeIdFrom;
    String roleTypeIdTo;
    String agreementTypeId;
    TimestampValue agreementDate;
    TimestampValue fromDate;
    TimestampValue thruDate;
    String description;
    String textData;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    Party toParty;
    AgreementTermCollection agreementTerms;
    String proto;
    ModelEntity model;
    AgreementProductApplCollection agreementProductAppls;
    Product product;
    String format;
    Party fromParty;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    AgreementItemCollection agreementItems;
    @Override
    public String getKey() {
        return agreementId;
    }
}



