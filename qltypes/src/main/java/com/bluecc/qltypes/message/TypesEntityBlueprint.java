package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class TypesEntityBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    TypesEntity entity;
    List<ResponseValue> response;
    TypesEntityBlueprint addTypesEntityStatus;
    TypesEntityBlueprint modifyTypesEntityType;
    TypesEntityBlueprint addTypesEntityStatusList;
    TypesEntityBlueprint updateTypesEntityStatus;
    TypesEntityBlueprint removeTypesEntityStatus;
}



