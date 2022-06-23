package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLogin implements WithKey{
    String userLoginId;
    String currentPassword;
    String passwordHint;
    String isSystem;
    String enabled;
    String hasLoggedOut;
    String requirePasswordChange;
    String lastCurrencyUom;
    String lastLocale;
    String lastTimeZone;
    TimestampValue disabledDateTime;
    Long successiveFailedLogins;
    String externalAuthId;
    String userLdapDn;
    String disabledBy;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String partyId;
    String tenantId;
    String format;
    String proto;
    ListItemProtoValue subview;
    UserLoginPasswordHistoryCollection userLoginPasswordHistories;
    Party party;
    UserPreferenceCollection userPreferences;
    FieldCatsValue cats;
    ModelEntity model;
    UserLoginSecurityGroupCollection userLoginSecurityGroups;
    @Override
    public String getKey() {
        return userLoginId;
    }
}



