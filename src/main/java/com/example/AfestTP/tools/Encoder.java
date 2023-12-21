package com.example.AfestTP.tools;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encoder {

    public String hashPass(String password) throws NoSuchAlgorithmException {

        MessageDigest md = MessageDigest.getInstance("SHA-512"); // instance de hashage

        byte[] hash = md.digest(password.getBytes()); // hasher le code

        BigInteger bigInt = new BigInteger(1, hash); // convertir

        return bigInt.toString(16);
    }
}
