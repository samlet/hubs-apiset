package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetGeoPoint implements WithKey{
    String fixedAssetId;
    String geoPointId;
    TimestampValue fromDate;
    TimestampValue thruDate;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String id;
    FixedAsset fixedAsset;
    String proto;
    ModelEntity model;
    FieldCatsValue cats;
    String format;
    @Override
    public String getKey() {
        return id;
    }
}



