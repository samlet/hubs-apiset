package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class ProductStore implements WithKey{
    String productStoreId;
    String primaryStoreGroupId;
    String storeName;
    String companyName;
    String title;
    String subtitle;
    String payToPartyId;
    long daysToCancelNonPay;
    String manualAuthIsCapture;
    String prorateShipping;
    String prorateTaxes;
    String viewCartOnAdd;
    String autoSaveCart;
    String autoApproveReviews;
    String isDemoStore;
    String isImmediatelyFulfilled;
    String inventoryFacilityId;
    String oneInventoryFacility;
    String checkInventory;
    String reserveInventory;
    String reserveOrderEnumId;
    String requireInventory;
    String balanceResOnOrderCreation;
    String requirementMethodEnumId;
    String orderNumberPrefix;
    String defaultLocaleString;
    String defaultCurrencyUomId;
    String defaultTimeZoneString;
    String defaultSalesChannelEnumId;
    String allowPassword;
    String defaultPassword;
    String explodeOrderItems;
    String checkGcBalance;
    String retryFailedAuths;
    String headerApprovedStatus;
    String itemApprovedStatus;
    String digitalItemApprovedStatus;
    String headerDeclinedStatus;
    String itemDeclinedStatus;
    String headerCancelStatus;
    String itemCancelStatus;
    String authDeclinedMessage;
    String authFraudMessage;
    String authErrorMessage;
    String visualThemeId;
    String storeCreditAccountEnumId;
    String usePrimaryEmailUsername;
    String requireCustomerRole;
    String autoInvoiceDigitalItems;
    String reqShipAddrForDigItems;
    String showCheckoutGiftOptions;
    String selectPaymentTypePerItem;
    String showPricesWithVatTax;
    String showTaxIsExempt;
    String vatTaxAuthGeoId;
    String vatTaxAuthPartyId;
    String enableAutoSuggestionList;
    String enableDigProdUpload;
    String prodSearchExcludeVariants;
    String digProdUploadCategoryId;
    String autoOrderCcTryExp;
    String autoOrderCcTryOtherCards;
    String autoOrderCcTryLaterNsf;
    long autoOrderCcTryLaterMax;
    long storeCreditValidDays;
    String autoApproveInvoice;
    String autoApproveOrder;
    String shipIfCaptureFails;
    String setOwnerUponIssuance;
    String reqReturnInventoryReceive;
    String addToCartRemoveIncompat;
    String addToCartReplaceUpsell;
    String splitPayPrefPerShpGrp;
    String managedByLot;
    String showOutOfStockProducts;
    String orderDecimalQuantity;
    String allowComment;
    String allocateInventory;
    TimestampValue lastUpdatedTxStamp;
    TimestampValue createdTxStamp;
    String tenantId;
    Party party;
    ListItemProtoValue subview;
    FieldCatsValue cats;
    ProductStoreCatalogCollection productStoreCatalogs;
    PostalAddress primaryAddress;
    ProductStorePaymentSettingCollection productStorePaymentSettings;
    Facility facility;
    WebSiteCollection webSites;
    ProductStoreFacilityCollection productStoreFacilities;
    TelecomNumber primaryPhone;
    ProductStoreEmailSettingCollection productStoreEmailSettings;
    String format;
    ProductStoreKeywordOvrdCollection productStoreKeywordOvrds;
    ProductStorePromoApplCollection productStorePromoAppls;
    ModelEntity model;
    ContactMech contactMech;
    ProductStoreGroup primaryProductStoreGroup;
    ProductStoreRoleCollection productStoreRoles;
    String proto;
    @Override
    public String getKey() {
        return productStoreId;
    }
}



