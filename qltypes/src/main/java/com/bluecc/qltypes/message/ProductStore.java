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
    Long daysToCancelNonPay;
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
    Long autoOrderCcTryLaterMax;
    Long storeCreditValidDays;
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
    ProductStoreRoleCollection productStoreRoles;
    String format;
    Facility facility;
    PostalAddress primaryAddress;
    TelecomNumber primaryPhone;
    ProductStoreKeywordOvrdCollection productStoreKeywordOvrds;
    ProductStoreGroup primaryProductStoreGroup;
    ProductStoreFacilityCollection productStoreFacilities;
    FieldCatsValue cats;
    ListItemProtoValue subview;
    Party party;
    ProductStoreCatalogCollection productStoreCatalogs;
    ProductStoreEmailSettingCollection productStoreEmailSettings;
    WebSiteCollection webSites;
    String proto;
    ModelEntity model;
    ContactMech contactMech;
    ProductStorePromoApplCollection productStorePromoAppls;
    ProductStorePaymentSettingCollection productStorePaymentSettings;
    @Override
    public String getKey() {
        return productStoreId;
    }
}



