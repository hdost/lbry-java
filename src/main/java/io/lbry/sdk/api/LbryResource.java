package io.lbry.sdk.api;

import io.lbry.sdk.Lbry;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class LbryResource {

    public static final String CHARSET = "UTF-8";

    protected void setupHeaders( HttpURLConnection conn ) {

        conn.setRequestProperty( "Accept-Charset", LbryResource.CHARSET );
        conn.setRequestProperty( "Accept", "plain" );
        conn.setRequestProperty( "User-Agent", String.format( "lbry-java/%s", Lbry.VERSION ) );
        conn.setRequestProperty( "Content-Type",
                                 String.format( "application/x-www-form-urlencoded;charset=%s",
                                                LbryResource.CHARSET ) );
    }

    protected HttpURLConnection createLbryConnection() throws
                                                     IOException {

        URL lbryUrl = new URL( Lbry.getApiBase() );
        HttpURLConnection conn = (HttpURLConnection) lbryUrl.openConnection();
        conn.setConnectTimeout( 30 * 1000 );
        conn.setReadTimeout( 80 * 1000 );
        conn.setUseCaches( false );

        setupHeaders( conn );

        conn.setRequestMethod( "POST" );
        conn.setDoOutput( true );
        return conn;
    }
}
