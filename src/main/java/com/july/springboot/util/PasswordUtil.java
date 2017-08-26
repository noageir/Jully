package com.july.springboot.util;

import org.apache.tomcat.util.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordUtil {
    private static final Logger logger = LoggerFactory.getLogger(PasswordUtil.class);

    /**
     * 利用MD5进行加密
     *
     * @param str 待加密的字符串
     * @return 加密后的字符串
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static String EncoderByMd5(String str) {
        //确定计算方法
        MessageDigest md5 = null;
        String encodePasswd = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
            encodePasswd = Base64.encodeBase64URLSafeString(md5.digest(str.getBytes("utf-8")));
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            logger.error("Encode Passwd Error:", e);
        }
        //加密后的字符串
        return encodePasswd;
    }

    /**
     * 判断用户密码是否正确
     *
     * @param newPasswd 输入密码
     * @param oldPasswd 记录密码
     * @return true or false
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public static boolean checkPassword(String newPasswd, String oldPasswd) {
        return EncoderByMd5(newPasswd).equals(oldPasswd);
    }


}
