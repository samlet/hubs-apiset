package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStoreGroup implements WithKey{
    String productStoreGroupId;
    String productStoreGroupTypeId;
    String primaryParentGroupId;
    String productStoreGroupName;
    String description;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    FieldCatsValue cats;
    ModelEntity model;
    ProductStoreGroup primaryParentProductStoreGroup;
    ProductStoreGroupRoleCollection productStoreGroupRoles;
    String format;
    TypesEntity type;
    ListItemProtoValue subview;
    ProductStoreGroupMemberCollection productStoreGroupMembers;
    ProductStoreCollection primaryProductStores;
    String proto;
    VendorProductCollection vendorProducts;
    @Override
    public String getKey() {
        return productStoreGroupId;
    }
}



