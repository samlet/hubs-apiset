package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class PartyGroup implements WithKey{
    String partyId;
    String groupName;
    String groupNameLocal;
    String officeSiteName;
    CurrencyValue annualRevenue;
    Long numEmployees;
    String tickerSymbol;
    String comments;
    String logoImageUrl;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    String proto;
    FieldCatsValue cats;
    Party party;
    ModelEntity model;
    @Override
    public String getKey() {
        return partyId;
    }
}



