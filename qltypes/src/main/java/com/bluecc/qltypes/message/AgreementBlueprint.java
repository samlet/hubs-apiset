package com.bluecc.qltypes.message;

import com.bluecc.qltypes.pubs.*;
import lombok.Data;
import lombok.experimental.Accessors;
import java.util.List;

@Data
@Accessors(chain = true)
public class AgreementBlueprint {
    String id;
    TimestampValue startTs;
    ExtractedTokenValue token;
    Agreement entity;
    List<ResponseValue> response;
    AgreementBlueprint addAgreementItemList;
    AgreementBlueprint updateAgreementProductAppl;
    AgreementBlueprint removeAgreementTerm;
    AgreementBlueprint addAgreementItem;
    AgreementBlueprint addAgreementProductApplList;
    AgreementBlueprint removeAgreementProductAppl;
    AgreementBlueprint addAgreementProductAppl;
    AgreementBlueprint removeAgreementItem;
    AgreementBlueprint addAgreementTerm;
    AgreementBlueprint updateAgreementTerm;
    AgreementBlueprint updateAgreementItem;
    AgreementBlueprint addAgreementTermList;
}



