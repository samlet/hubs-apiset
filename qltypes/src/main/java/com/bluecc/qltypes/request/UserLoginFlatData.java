package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class UserLoginFlatData {
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
    Timestamp disabledDateTime;
    long successiveFailedLogins;
    String externalAuthId;
    String userLdapDn;
    String disabledBy;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String partyId;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



