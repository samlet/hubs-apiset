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
    String format;
    UserLogin userLogin;
    FieldCatsValue cats;
    OrderFact orderFact;
    String proto;
    ModelEntity model;
    @Override
    public String getKey() {
        return id;
    }
}



