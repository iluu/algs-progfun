package com.hackerrank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class EncryptionTest {

    @Test
    public void encrypt() throws Exception {
        assertThat(Encryption.encrypt("if man was meant to stay on the ground god would have given us roots"),
                is(equalTo("imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau")));
    }

    @Test
    public void encrypt2() {
        assertThat(Encryption.encrypt("haveaniceday"),
                is(equalTo("hae and via ecy")));
    }

    @Test
    public void encrypt3() {
        assertThat(Encryption.encrypt("chillout"),
                is(equalTo("clu hlt io")));
    }

}