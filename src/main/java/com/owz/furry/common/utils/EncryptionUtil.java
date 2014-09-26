package com.owz.furry.common.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

/**
 * Author: kongtong.ouyang
 * Date: 2014/7/16, 23:50
 */
public final class EncryptionUtil {

    private EncryptionUtil() {
    }

    private static PasswordEncoder passwordEncoder1 = new BCryptPasswordEncoder();
    private static PasswordEncoder passwordEncoder2 = NoOpPasswordEncoder.getInstance();
    private static PasswordEncoder passwordEncoder3 = new StandardPasswordEncoder();


    public static void main(String[] args) {
        a();
    }

    public static String encrypt(String str) {
        return passwordEncoder3.encode(str);
    }

    public static boolean matches(String rawPass, String encodedPass) {
        boolean isMatches;
        try {
            isMatches = passwordEncoder3.matches(rawPass, encodedPass);
        } catch (Exception e) {
            isMatches = false;
        }
        return isMatches;
    }

    public static void a() {
        String pas = "kongtongoy";
        System.out.println(passwordEncoder1.encode(pas));
        System.out.println(passwordEncoder2.encode(pas));
        System.out.println(passwordEncoder3.encode(pas));
//        $2a$10$jHcz1Kjmh3RUluoCv9xHluVE0GZr7YWxMvwI.oEoDOSW1eJ/ZJKuW
//        kongtongoy
//                f7a0b4406770c651ff1ed6d9e164ca7b7feafed42b49b4b806c66c8752df9098351156215eb1004b
    }

}
