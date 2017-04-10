package io.lbry.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Claim extends LbryObject {

    @Getter
    @Setter
    private String txid; /* (str) txid of claim */
    @Getter
    @Setter
    private int nout; /* (int) nout of claim */
    @Getter
    @Setter
    private float amount; /* (float) amount of claim */
    @Getter
    @Setter
    private String value; /* (str) value of claim */
    @Getter
    @Setter
    private int height; /* (int) height of claim takeover */
    @Getter
    @Setter
    @SerializedName( "claim_id" )
    private String claimId; /* (str) claim ID of claim */
    @Getter
    @Setter
    private List<String> supports = new ArrayList<>(); /* (list) list of supports associated with claim */

    public void addSupportClaim( String claimId ) {

        supports.add( claimId );
    }
}
