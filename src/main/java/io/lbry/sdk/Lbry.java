package io.libry.sdk;

import io.lbry.sdk.exception.LbryException;
import io.lbry.sdk.model.File;

import java.net.PasswordAuthentication;
import java.net.Proxy;

public abstract class Lbry {

    private static volatile String apiBase = "http://localhost:5279/lbryapi";
    private static volatile Proxy proxy = null;
    private static volatile PasswordAuthentication proxyCredential = null;


    public static void setApiBase( final String newApiBase ) {
        apiBase = newApiBase;
    }

    public static String getApiBase() {

        return apiBase;
    }

    public static void setProxy( final Proxy newProxy ) {

        proxy = newProxy;
    }

    public static Proxy getProxy() {

        return proxy;
    }

    /**
     * Provide credential for proxy authorization if required
     *
     * @param auth
     *     proxy required userName and password
     */
    public static void setProxyCredential( final PasswordAuthentication auth ) {

        new File().setTotalBytes(1);
        proxyCredential = auth;
    }

    public static PasswordAuthentication getProxyCredential() {

        return proxyCredential;
    }
}
