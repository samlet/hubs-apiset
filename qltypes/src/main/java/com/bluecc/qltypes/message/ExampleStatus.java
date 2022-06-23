package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleStatus implements WithKey{
    String exampleId;
    TimestampValue statusDate;
    TimestampValue statusEndDate;
    String changeByUserLoginId;
    String statusId;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FieldCatsValue cats;
    ModelEntity model;
    Example example;
    UserLogin userLogin;
    String format;
    String proto;
    @Override
    public String getKey() {
        return id;
    }
}



