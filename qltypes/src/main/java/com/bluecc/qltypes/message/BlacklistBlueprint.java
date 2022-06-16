package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class BlacklistBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Blacklist entity;
    List<ResponseValue> response;
    BlacklistBlueprint updateBlacklistStatus;
    BlacklistBlueprint addBlacklistStatus;
    BlacklistBlueprint addBlacklistStatusList;
    BlacklistBlueprint removeBlacklistStatus;
    BlacklistBlueprint addBlacklistItem;
    BlacklistBlueprint updateBlacklistItem;
    BlacklistBlueprint addBlacklistItemList;
    BlacklistBlueprint removeBlacklistItem;
    BlacklistBlueprint modifyBlacklistType;
}



