package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyWithPartyGroup {
    String id;
    Party party;
    PartyGroup partyGroup;
    ListItemProtoValue subview;
    String proto;
}



