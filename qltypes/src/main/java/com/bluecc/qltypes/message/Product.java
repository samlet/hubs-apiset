package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class Product implements WithKey{
    String productId;
    String productTypeId;
    String primaryProductCategoryId;
    String facilityId;
    TimestampValue introductionDate;
    TimestampValue releaseDate;
    TimestampValue supportDiscontinuationDate;
    TimestampValue salesDiscontinuationDate;
    String salesDiscWhenNotAvail;
    String internalName;
    String brandName;
    String comments;
    String productName;
    String description;
    String longDescription;
    String priceDetailText;
    String smallImageUrl;
    String mediumImageUrl;
    String largeImageUrl;
    String detailImageUrl;
    String originalImageUrl;
    String detailScreen;
    String inventoryMessage;
    String inventoryItemTypeId;
    String requireInventory;
    String quantityUomId;
    FixedPointValue quantityIncluded;
    Long piecesIncluded;
    String requireAmount;
    CurrencyValue fixedAmount;
    String amountUomTypeId;
    String weightUomId;
    FixedPointValue shippingWeight;
    FixedPointValue productWeight;
    String heightUomId;
    FixedPointValue productHeight;
    FixedPointValue shippingHeight;
    String widthUomId;
    FixedPointValue productWidth;
    FixedPointValue shippingWidth;
    String depthUomId;
    FixedPointValue productDepth;
    FixedPointValue shippingDepth;
    String diameterUomId;
    FixedPointValue productDiameter;
    FixedPointValue productRating;
    String ratingTypeEnum;
    String returnable;
    String taxable;
    String chargeShipping;
    String autoCreateKeywords;
    String includeInPromotions;
    String isVirtual;
    String isVariant;
    String virtualVariantMethodEnum;
    String originGeoId;
    String requirementMethodEnumId;
    Long billOfMaterialLevel;
    FixedPointValue reservMaxPersons;
    FixedPointValue reserv2ndPPPerc;
    FixedPointValue reservNthPPPerc;
    String configId;
    TimestampValue createdDate;
    String createdByUserLogin;
    TimestampValue lastModifiedDate;
    String lastModifiedByUserLogin;
    String inShippingBox;
    String defaultShipmentBoxTypeId;
    String lotIdFilledIn;
    String orderDecimalQuantity;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    ProductPromoProductCollection productPromoProducts;
    TypesEntity type;
    String format;
    String listPrice;
    String proto;
    ProductPriceCollection productPrices;
    ProductKeywordCollection productKeywords;
    ProductConfigCollection productProductConfigs;
    ProductPrice priceFilter;
    ProductFacilityCollection productFacilities;
    String defaultPrice;
    ProductAssocCollection mainProductAssocs;
    List<ProductPrice> matchProductPrice;
    Facility facility;
    UserLogin lastmodifiedbyuserlogin;
    UserLogin createdbyuserlogin;
    ProductFacilityLocationCollection productFacilityLocations;
    ProductFacilityAssocCollection productFacilityAssocs;
    ProductCategory primaryProductCategory;
    ProductView asView;
    ProductContentCollection productContents;
    ModelEntity model;
    FieldCatsValue cats;
    WorkEffortGoodStandardCollection workEffortGoodStandards;
    ProductFeatureApplCollection productFeatureAppls;
    List<ProductPrice> priceSelect;
    ProductAssocCollection assocProductAssocs;
    ListItemProtoValue subview;
    @Override
    public String getKey() {
        return productId;
    }
}



