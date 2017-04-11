package io.lbry.sdk.api;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WalletResourceTest {

    WalletResource resource;

    @BeforeEach
    void setup() {

        resource = new WalletResource();
    }

    @Test
    void getBalance() {

        resource.getBalance();
    }

    @Test
    void walletAddressIsMine() throws
                               IOException {

        WalletResource resource = new WalletResource();
        assertTrue( resource.walletAddressIsMine( "bGPRUe7kbWJ4ZC8NCMJ87q718a8SKKxs4J" ) );
    }

    @Test
    void walletNewAddress() {

        resource = new WalletResource();

        resource.newWalletAddress();
    }

    @Test
    void walletPublicKey() {

    }
}
