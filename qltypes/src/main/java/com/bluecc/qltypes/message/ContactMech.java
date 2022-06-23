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
    ContactMechWithTelecomNumber asTelecomNumber;
    TypesEntity type;
    ModelEntity model;
    String format;
    FieldCatsValue cats;
    String proto;
    ContactMechWithPostalAddress asPostalAddress;
    ContactMechWithEmailAddress asEmailAddress;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return contactMechId;
    }
}



