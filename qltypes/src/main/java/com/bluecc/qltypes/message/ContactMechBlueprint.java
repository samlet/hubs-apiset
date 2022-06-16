package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ContactMechBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ContactMech entity;
    List<ResponseValue> response;
    ContactMechBlueprint modifyPostalAddress;
    ContactMechBlueprint modifyTelecomNumber;
    ContactMechBlueprint modifyContactMechType;
}



