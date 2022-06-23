package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TelecomNumber implements WithKey{
    String contactMechId;
    String countryCode;
    String areaCode;
    String contactNumber;
    String askForName;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ContactMech contactMech;
    String proto;
    String format;
    FieldCatsValue cats;
    ModelEntity model;
    @Override
    public String getKey() {
        return contactMechId;
    }
}



