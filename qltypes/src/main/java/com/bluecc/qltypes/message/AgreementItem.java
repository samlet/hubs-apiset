package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementItem implements WithKey{
    String agreementId;
    String agreementItemSeqId;
    String agreementItemTypeId;
    String currencyUomId;
    String agreementText;
    String agreementImage;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    ModelEntity model;
    FieldCatsValue cats;
    String proto;
    String format;
    Agreement agreement;
    @Override
    public String getKey() {
        return id;
    }
}



