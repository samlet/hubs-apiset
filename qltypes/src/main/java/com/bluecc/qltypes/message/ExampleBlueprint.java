package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ExampleBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Example entity;
    List<ResponseValue> response;
    ExampleBlueprint addExampleStatus;
    ExampleBlueprint modifyExampleType;
    ExampleBlueprint addExampleItemList;
    ExampleBlueprint updateExampleItem;
    ExampleBlueprint removeExampleItem;
    ExampleBlueprint updateExampleStatus;
    ExampleBlueprint removeExampleStatus;
    ExampleBlueprint addExampleItem;
    ExampleBlueprint addExampleStatusList;
}



