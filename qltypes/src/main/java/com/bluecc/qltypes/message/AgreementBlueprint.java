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
    AgreementBlueprint updateAgreementProductAppl;
    AgreementBlueprint addAgreementItemList;
    AgreementBlueprint removeAgreementItem;
    AgreementBlueprint addAgreementProductApplList;
    AgreementBlueprint updateAgreementItem;
    AgreementBlueprint addAgreementTerm;
    AgreementBlueprint removeAgreementTerm;
    AgreementBlueprint addAgreementTermList;
    AgreementBlueprint addAgreementProductAppl;
    AgreementBlueprint updateAgreementTerm;
    AgreementBlueprint addAgreementItem;
    AgreementBlueprint removeAgreementProductAppl;
}



