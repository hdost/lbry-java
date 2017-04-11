package io.lbry.sdk.api;

import io.lbry.sdk.model.LbryObject;
import io.lbry.sdk.model.LbryRequest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;

public class WalletResource extends LbryResource {

    public float getBalance() {

        return 0.0f;
    }

    public boolean walletAddressIsMine( String walletAddress ) throws
                                                               IOException {

        HttpURLConnection conn = createLbryConnection();

        OutputStream output = null;
        try {
            output = conn.getOutputStream();
            output.write( ( "{\"method\":\"wallet_is_address_mine\",\"params\":{\"address\":\""
                            + walletAddress
                            + "\"}}" ).getBytes( LbryResource.CHARSET ) );
        }
        finally {
            if ( output != null ) {
                output.close();
            }
        }

        int rCode = conn.getResponseCode();

        InputStream is = conn.getInputStream();

        InputStreamReader reader = new InputStreamReader( is );

        return LbryObject.PRETTY_PRINT_GSON.fromJson( reader, Boolean[].class )[0];
    }

    public String newWalletAddress() {

        String output = new LbryRequest().toJson();
        return "";
    }

    public List<String> walletPublicKey( String walletAddress ) {

        return Collections.emptyList();
    }
}
