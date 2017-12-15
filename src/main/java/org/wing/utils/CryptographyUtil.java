package org.wing.utils;

/**
 * Created by HarvestWu on 2017/12/15.
 */

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * 密码进行MD5不可逆加密
 */
public class CryptographyUtil {
    public static String md5(String str){
        return new Md5Hash(str,"CampusInformationPlatform").toString();
    }
}


