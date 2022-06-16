package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataResourceWithAudio {
    String id;
    DataResource dataResource;
    AudioDataResource audioDataResource;
    String proto;
    ListItemProtoValue subview;
}



