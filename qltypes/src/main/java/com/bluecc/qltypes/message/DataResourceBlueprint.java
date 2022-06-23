package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataResourceBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    DataResource entity;
    List<ResponseValue> response;
    DataResourceBlueprint modifyVideoDataResource;
    DataResourceBlueprint modifyImageDataResource;
    DataResourceBlueprint modifyAudioDataResource;
    DataResourceBlueprint modifyDataResourceType;
    DataResourceBlueprint modifyElectronicText;
}



