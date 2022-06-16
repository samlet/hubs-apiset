package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ListItemProtoValue {
    String key;
    String title;
    String subtitle;
    String thumbnail;
    List<SectionProtoValue> sections;
    TimestampValue createTs;
    TimestampValue updateTs;
    String entity;
    String proto;
}



