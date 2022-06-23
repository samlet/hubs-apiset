package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class FixedAssetBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    FixedAsset entity;
    List<ResponseValue> response;
    FixedAssetBlueprint addFixedAssetAttributeList;
    FixedAssetBlueprint addFixedAssetProductList;
    FixedAssetBlueprint updateFixedAssetAttribute;
    FixedAssetBlueprint addFixedAssetAttribute;
    FixedAssetBlueprint modifyFixedAssetType;
    FixedAssetBlueprint addFixedAssetMaintList;
    FixedAssetBlueprint removeFixedAssetMaint;
    FixedAssetBlueprint removeFixedAssetAttribute;
    FixedAssetBlueprint removeFixedAssetProduct;
    FixedAssetBlueprint addFixedAssetProduct;
    FixedAssetBlueprint removeFixedAssetGeoPoint;
    FixedAssetBlueprint addFixedAssetGeoPointList;
    FixedAssetBlueprint updateFixedAssetGeoPoint;
    FixedAssetBlueprint updateFixedAssetMaint;
    FixedAssetBlueprint addFixedAssetGeoPoint;
    FixedAssetBlueprint updateFixedAssetProduct;
    FixedAssetBlueprint addFixedAssetMaint;
}



