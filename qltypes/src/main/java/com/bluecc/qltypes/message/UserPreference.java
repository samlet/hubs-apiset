package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserPreference implements WithKey{
    String userLoginId;
    String userPrefTypeId;
    String userPrefGroupTypeId;
    String userPrefValue;
    String userPrefDataType;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    String format;
    ModelEntity model;
    FieldCatsValue cats;
    UserLogin userLogin;
    @Override
    public String getKey() {
        return id;
    }
}



