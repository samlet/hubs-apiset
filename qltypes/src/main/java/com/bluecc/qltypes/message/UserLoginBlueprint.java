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
    UserLoginBlueprint addUserPreference;
    UserLoginBlueprint addUserLoginSecurityGroupList;
    UserLoginBlueprint updateUserLoginPasswordHistory;
    UserLoginBlueprint updateUserPreference;
    UserLoginBlueprint addUserPreferenceList;
    UserLoginBlueprint removeUserLoginPasswordHistory;
    UserLoginBlueprint removeUserLoginSecurityGroup;
    UserLoginBlueprint addUserLoginSecurityGroup;
    UserLoginBlueprint addUserLoginPasswordHistoryList;
    UserLoginBlueprint addUserLoginPasswordHistory;
    UserLoginBlueprint updateUserLoginSecurityGroup;
    UserLoginBlueprint modifyUserLoginSession;
    UserLoginBlueprint removeUserPreference;
}



