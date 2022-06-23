package com.bluecc.qltypes.request;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductFlatData {
    String productId;
    String productTypeId;
    String primaryProductCategoryId;
    String facilityId;
    Timestamp introductionDate;
    Timestamp releaseDate;
    Timestamp supportDiscontinuationDate;
    Timestamp salesDiscontinuationDate;
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
    FixedPoint quantityIncluded;
    Long piecesIncluded;
    String requireAmount;
    Currency fixedAmount;
    String amountUomTypeId;
    String weightUomId;
    FixedPoint shippingWeight;
    FixedPoint productWeight;
    String heightUomId;
    FixedPoint productHeight;
    FixedPoint shippingHeight;
    String widthUomId;
    FixedPoint productWidth;
    FixedPoint shippingWidth;
    String depthUomId;
    FixedPoint productDepth;
    FixedPoint shippingDepth;
    String diameterUomId;
    FixedPoint productDiameter;
    FixedPoint productRating;
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
    FixedPoint reservMaxPersons;
    FixedPoint reserv2ndPPPerc;
    FixedPoint reservNthPPPerc;
    String configId;
    Timestamp createdDate;
    String createdByUserLogin;
    Timestamp lastModifiedDate;
    String lastModifiedByUserLogin;
    String inShippingBox;
    String defaultShipmentBoxTypeId;
    String lotIdFilledIn;
    String orderDecimalQuantity;
    Timestamp lastUpdatedTxStamp;
    Timestamp createdTxStamp;
    String tenantId;
    Struct extra;
    List<AttachmentsEntry> attachments;
}



