package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyWithCorporation {
    String id;
    Party party;
    PartyGroup partyGroup;
    String proto;
    ListItemProtoValue subview;
}



