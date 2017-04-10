package io.lbry.sdk.model;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

public class Stream extends LbryObject{

    @Getter
    @Setter
    private boolean completed;  /* (bool) true if download is completed, */

    @Getter
    @Setter
    @SerializedName( "file_name" )
    private String fileName;  /* (str) name of file, */

    @Getter
    @Setter
    @SerializedName( "download_directory" )
    private String downloadDirectory;  /* (str) download directory, */

    @Getter
    @Setter
    @SerializedName( "points_paid" )
    private float pointsPaid;  /* (float) credit paid to download file, */

    @Getter
    @Setter
    private boolean stopped;  /* (bool) true if download is stopped, */

    @SerializedName( "stream_hash" )
    @Getter
    @Setter
    private String streamHash;  /* (str) stream hash of file, */

    @SerializedName( "stream_name" )
    @Getter
    @Setter
    private String streamName;  /* (str) stream name , */

    @SerializedName( "suggested_file_name" )
    @Getter
    @Setter
    private String suggestedFileName;  /* (str) suggested file name, */

    @SerializedName( "sd_hash" )
    @Getter
    @Setter
    private String sdHash;  /* (str) sd hash of file, */

    @Getter
    @Setter
    private String name;  /* (str) name claim attached to file */

    @Getter
    @Setter
    private String outpoint;  /* (str) claim outpoint attached to file */

    @SerializedName( "claim_id" )
    @Getter
    @Setter
    private String claimId;  /* (str) claim ID attached to file, */

    @SerializedName( "download_path" )
    @Getter
    @Setter
    private String downloadPath;  /* (str) download path of file, */

    @SerializedName( "mime_type" )
    @Getter
    @Setter
    private String mimeType;  /* (str) mime type of file, */

    @Getter
    @Setter
    private String key;  /* (str) key attached to file, */

    @SerializedName( "total_bytes" )
    @Getter
    @Setter
    private int totalBytes;  /* (int) file size in bytes, None if full_status is false */

    @SerializedName( "written_bytes" )
    @Getter
    @Setter
    private int writtenBytes;  /* (int) written size in bytes */

    @Getter
    @Setter
    private String message;  /* (str), None if full_status is false */

    @Getter
    @Setter
    private Map<String, Object> metadata = new HashMap<>();  /* (dict) Metadata dictionary */

    public void putMetadataProperty( String key, Object value ) {

        metadata.put( key, value );
    }
}
