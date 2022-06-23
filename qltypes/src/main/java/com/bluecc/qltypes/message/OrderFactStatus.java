package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class OrderFactStatus implements WithKey{
    String orderFactId;
    TimestampValue statusDate;
    TimestampValue statusEndDate;
    String changeByUserLoginId;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    OrderFact orderFact;
    UserLogin userLogin;
    String format;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



