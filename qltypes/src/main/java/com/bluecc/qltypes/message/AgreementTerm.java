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
    Long termDays;
    String textValue;
    Double minQuantity;
    Double maxQuantity;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    String proto;
    Agreement agreement;
    ModelEntity model;
    String format;
    @Override
    public String getKey() {
        return agreementTermId;
    }
}



