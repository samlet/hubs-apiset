package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FactBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    FactProto entity;
    List<ResponseValue> response;
    FactBlueprint addFactProtoStatusList;
    FactBlueprint addFactProtoStatus;
    FactBlueprint updateFactProtoStatus;
    FactBlueprint removeFactProtoStatus;
    FactBlueprint modifyFactProtoType;
}



