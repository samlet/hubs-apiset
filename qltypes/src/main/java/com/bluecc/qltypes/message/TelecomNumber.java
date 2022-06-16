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
    FieldCatsValue cats;
    ModelEntity model;
    String format;
    String proto;
    ContactMech contactMech;
    @Override
    public String getKey() {
        return contactMechId;
    }
}



