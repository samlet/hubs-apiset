package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContactMech implements WithKey{
    String contactMechId;
    String contactMechTypeId;
    String infoString;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    TypesEntity type;
    String format;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    String proto;
    ContactMechWithEmailAddress asEmailAddress;
    ContactMechWithTelecomNumber asTelecomNumber;
    ContactMechWithPostalAddress asPostalAddress;
    ModelEntity model;
    @Override
    public String getKey() {
        return contactMechId;
    }
}



