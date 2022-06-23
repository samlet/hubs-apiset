package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetAttribute implements WithKey{
    String fixedAssetId;
    String attrName;
    String attrValue;
    String attrDescription;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    String proto;
    ModelEntity model;
    String format;
    FixedAsset fixedAsset;
    FieldCatsValue cats;
    @Override
    public String getKey() {
        return id;
    }
}



