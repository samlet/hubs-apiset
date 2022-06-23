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
    ModelEntity model;
    Party party;
    String proto;
    Agreement agreement;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



