package io.lbry.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

public class Version extends LbryObject {

    @Getter
    @Setter
    private String platform; /* (str) platform string*/
    @Getter
    @Setter
    @SerializedName( "os_release" )
    private String osRelease; /* (str) os release string */
    @Getter
    @Setter
    @SerializedName( "os_system" )
    private String osSystem; /* (str) os name */
    @Getter
    @Setter
    @SerializedName( "lbrynet_version" )
    private String lbrynetVersion; /* (str) lbrynet_version */
    @Getter
    @Setter
    @SerializedName( "lbryum_version" )
    private String lbryumVersion; /* (str) lbryum_version */
    @Getter
    @Setter
    @SerializedName( "ui_version" )
    private String uiVersion; /* (str) commit hash of ui version being used */
    @Getter
    @Setter
    @SerializedName( "remote_lbrynet" )
    private String remoteLbrynet; /* (str) most recent lbrynet version available from github */
    @Getter
    @Setter
    @SerializedName( "remote_lbryum" )
    private String remoteLbryum; /* (str) most recent lbryum version available from github */
}
