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
    FixedAssetBlueprint addFixedAssetGeoPointList;
    FixedAssetBlueprint addFixedAssetAttribute;
    FixedAssetBlueprint updateFixedAssetGeoPoint;
    FixedAssetBlueprint addFixedAssetProduct;
    FixedAssetBlueprint addFixedAssetMaint;
    FixedAssetBlueprint removeFixedAssetGeoPoint;
    FixedAssetBlueprint modifyFixedAssetType;
    FixedAssetBlueprint updateFixedAssetProduct;
    FixedAssetBlueprint addFixedAssetMaintList;
    FixedAssetBlueprint removeFixedAssetMaint;
    FixedAssetBlueprint addFixedAssetAttributeList;
    FixedAssetBlueprint removeFixedAssetAttribute;
    FixedAssetBlueprint updateFixedAssetAttribute;
    FixedAssetBlueprint addFixedAssetGeoPoint;
    FixedAssetBlueprint removeFixedAssetProduct;
    FixedAssetBlueprint updateFixedAssetMaint;
    FixedAssetBlueprint addFixedAssetProductList;
}



