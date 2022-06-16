package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class NoteBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    NoteData entity;
    List<ResponseValue> response;
}



