package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AcctgBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    AcctgTrans entity;
    List<ResponseValue> response;
    AcctgBlueprint updateAcctgTransEntry;
    AcctgBlueprint addAcctgTransEntryList;
    AcctgBlueprint addAcctgTransEntry;
    AcctgBlueprint removeAcctgTransEntry;
}



