package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLoginBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    UserLogin entity;
    List<ResponseValue> response;
    UserLoginBlueprint updateUserLoginPasswordHistory;
    UserLoginBlueprint updateUserLoginSecurityGroup;
    UserLoginBlueprint addUserLoginPasswordHistory;
    UserLoginBlueprint updateUserPreference;
    UserLoginBlueprint addUserPreference;
    UserLoginBlueprint modifyUserLoginSession;
    UserLoginBlueprint removeUserLoginPasswordHistory;
    UserLoginBlueprint addUserLoginSecurityGroup;
    UserLoginBlueprint addUserLoginPasswordHistoryList;
    UserLoginBlueprint addUserLoginSecurityGroupList;
    UserLoginBlueprint removeUserLoginSecurityGroup;
    UserLoginBlueprint addUserPreferenceList;
    UserLoginBlueprint removeUserPreference;
}



