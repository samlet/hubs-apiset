package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyCollection {
    List<Party> values;
    String nextPageToken;
    String regionId;
    List<PartyWithPerson> matchPerson;
    PartyCollection filter;
    List<PartyWithPartyGroup> matchPartyGroup;
    List<PartyWithCorporation> matchCorporation;
    List<PartyWithSupplier> matchSupplier;
}



