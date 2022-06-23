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
    BlacklistBlueprint addBlacklistItem;
    BlacklistBlueprint modifyBlacklistType;
    BlacklistBlueprint addBlacklistStatus;
    BlacklistBlueprint addBlacklistItemList;
    BlacklistBlueprint updateBlacklistItem;
    BlacklistBlueprint removeBlacklistItem;
    BlacklistBlueprint updateBlacklistStatus;
    BlacklistBlueprint addBlacklistStatusList;
    BlacklistBlueprint removeBlacklistStatus;
}



