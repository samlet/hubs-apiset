package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class StoreGroupBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    ProductStoreGroup entity;
    List<ResponseValue> response;
    StoreGroupBlueprint removeVendorProduct;
    StoreGroupBlueprint addProductStoreGroupRole;
    StoreGroupBlueprint modifyProductStoreGroupType;
    StoreGroupBlueprint updateVendorProduct;
    StoreGroupBlueprint addProductStoreGroupRoleList;
    StoreGroupBlueprint addVendorProductList;
    StoreGroupBlueprint updateProductStoreGroupRole;
    StoreGroupBlueprint removeProductStoreGroupRole;
    StoreGroupBlueprint addProductStoreGroupMemberList;
    StoreGroupBlueprint addVendorProduct;
    StoreGroupBlueprint removeProductStoreGroupMember;
    StoreGroupBlueprint updateProductStoreGroupMember;
    StoreGroupBlueprint addProductStoreGroupMember;
}



