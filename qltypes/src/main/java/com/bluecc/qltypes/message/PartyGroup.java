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
    long numEmployees;
    String tickerSymbol;
    String comments;
    String logoImageUrl;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    String format;
    ModelEntity model;
    String proto;
    Party party;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return partyId;
    }
}



