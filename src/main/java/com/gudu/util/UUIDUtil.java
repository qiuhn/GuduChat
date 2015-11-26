package com.gudu.util;

import java.util.UUID;

/**
 * Created by qiuhn on 2015/9/23.
 */
public class UUIDUtil {

    public synchronized static String createUUID(){
       String uuid =   UUID.randomUUID().toString();
        return uuid.replace("-","");
    }
}
