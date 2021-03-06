package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class DataResourceCollection {
    List<DataResource> values;
    String nextPageToken;
    String regionId;
    List<DataResourceWithVideo> matchVideo;
    DataResourceCollection filter;
    List<DataResourceWithText> matchText;
    List<DataResourceWithImage> matchImage;
    List<DataResourceWithAudio> matchAudio;
}



