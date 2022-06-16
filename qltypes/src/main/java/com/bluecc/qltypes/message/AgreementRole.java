package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementRole implements WithKey{
    String agreementId;
    String partyId;
    String roleTypeId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String format;
    String proto;
    Party party;
    Agreement agreement;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



