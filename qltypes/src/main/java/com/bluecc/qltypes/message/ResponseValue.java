package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ResponseValue {
    String result;
    String message;
    List<String> errorList;
    String resultType;
    TypedValue resultData;
    AnyValue resultObject;
    TimestampValue ts;
    WebSiteCollection asWebSiteList;
    ProductReviewCollection asProductReviewList;
    SecurityGroupCollection asSecurityGroupList;
    ProdCatalogCollection asProdCatalogList;
    WorkEffortCollection asWorkEffortList;
    UserLoginCollection asUserLoginList;
    OrderHeaderCollection asOrderHeaderList;
    ProductStoreCollection asProductStoreList;
    FactProtoCollection asFactProtoList;
    ShoppingListCollection asShoppingListList;
    DataResourceCollection asDataResourceList;
    InvoiceCollection asInvoiceList;
    BillingAccountCollection asBillingAccountList;
    FixedAssetCollection asFixedAssetList;
    ProductConfigItemCollection asProductConfigItemList;
    ProductPromoCollection asProductPromoList;
    OrderFactCollection asOrderFactList;
    InventoryItemCollection asInventoryItemList;
    ExampleCollection asExampleList;
    PaymentCollection asPaymentList;
    TypesEntityCollection asTypesEntityList;
    ShipmentCollection asShipmentList;
    AgreementCollection asAgreementList;
    PartyCollection asPartyList;
    ContactMechCollection asContactMechList;
    TemporalExpressionCollection asTemporalExpressionList;
    BlacklistCollection asBlacklistList;
    ContentCollection asContentList;
    ProductStoreGroupCollection asProductStoreGroupList;
    SecurityPermissionCollection asSecurityPermissionList;
    ReturnHeaderCollection asReturnHeaderList;
    ProductCategoryCollection asProductCategoryList;
    ProductFeatureCategoryCollection asProductFeatureCategoryList;
    ProductFeatureCollection asProductFeatureList;
    AcctgTransCollection asAcctgTransList;
    NoteDataCollection asNoteDataList;
    StringsValue extractStrings;
    RequirementCollection asRequirementList;
    FacilityCollection asFacilityList;
    ProductCollection asProductList;
}



