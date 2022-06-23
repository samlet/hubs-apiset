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
    String format;
    AgreementTermCollection agreementTerms;
    Party toParty;
    FieldCatsValue cats;
    Product product;
    String proto;
    AgreementProductApplCollection agreementProductAppls;
    AgreementItemCollection agreementItems;
    Party fromParty;
    ListItemProtoValue subview;
    ModelEntity model;
    @Override
    public String getKey() {
        return agreementId;
    }
}



