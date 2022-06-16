package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementTerm implements WithKey{
    String agreementTermId;
    String termTypeId;
    String agreementId;
    String agreementItemSeqId;
    String invoiceItemTypeId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    CurrencyValue termValue;
    long termDays;
    String textValue;
    double minQuantity;
    double maxQuantity;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    Agreement agreement;
    ModelEntity model;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return agreementTermId;
    }
}



