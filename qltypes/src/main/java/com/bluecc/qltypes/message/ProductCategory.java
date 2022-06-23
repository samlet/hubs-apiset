package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductCategory implements WithKey{
    String productCategoryId;
    String productCategoryTypeId;
    String primaryParentCategoryId;
    String categoryName;
    String description;
    String longDescription;
    String categoryImageUrl;
    String linkOneImageUrl;
    String linkTwoImageUrl;
    String detailScreen;
    String showInSelect;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ProductCollection primaryProducts;
    String format;
    ProductCategory primaryParentProductCategory;
    ModelEntity model;
    FieldCatsValue cats;
    ProductCategoryMemberCollection productCategoryMembers;
    String proto;
    ProductPromoCategoryCollection productPromoCategories;
    ProductCategoryRollupCollection currentProductCategoryRollups;
    TypesEntity type;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return productCategoryId;
    }
}



