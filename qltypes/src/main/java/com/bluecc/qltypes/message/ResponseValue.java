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
    InventoryItemCollection asInventoryItemList;
    AcctgTransCollection asAcctgTransList;
    InvoiceCollection asInvoiceList;
    ProductCategoryCollection asProductCategoryList;
    ProductConfigItemCollection asProductConfigItemList;
    OrderFactCollection asOrderFactList;
    WebSiteCollection asWebSiteList;
    BillingAccountCollection asBillingAccountList;
    ExampleCollection asExampleList;
    PartyCollection asPartyList;
    ProductFeatureCategoryCollection asProductFeatureCategoryList;
    TemporalExpressionCollection asTemporalExpressionList;
    AgreementCollection asAgreementList;
    ShoppingListCollection asShoppingListList;
    ProductPromoCollection asProductPromoList;
    ContactMechCollection asContactMechList;
    DataResourceCollection asDataResourceList;
    OrderHeaderCollection asOrderHeaderList;
    ReturnHeaderCollection asReturnHeaderList;
    ProductCollection asProductList;
    FacilityCollection asFacilityList;
    ProductStoreCollection asProductStoreList;
    SecurityGroupCollection asSecurityGroupList;
    SecurityPermissionCollection asSecurityPermissionList;
    RequirementCollection asRequirementList;
    ProdCatalogCollection asProdCatalogList;
    TypesEntityCollection asTypesEntityList;
    FixedAssetCollection asFixedAssetList;
    StringsValue extractStrings;
    ContentCollection asContentList;
    PaymentCollection asPaymentList;
    UserLoginCollection asUserLoginList;
    ProductFeatureCollection asProductFeatureList;
    FactProtoCollection asFactProtoList;
    NoteDataCollection asNoteDataList;
    ProductReviewCollection asProductReviewList;
    ShipmentCollection asShipmentList;
    WorkEffortCollection asWorkEffortList;
    ProductStoreGroupCollection asProductStoreGroupList;
    BlacklistCollection asBlacklistList;
}



