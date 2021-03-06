package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementProductAppl implements WithKey{
    String agreementId;
    String agreementItemSeqId;
    String productId;
    CurrencyValue price;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    Product product;
    Agreement agreement;
    String proto;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



