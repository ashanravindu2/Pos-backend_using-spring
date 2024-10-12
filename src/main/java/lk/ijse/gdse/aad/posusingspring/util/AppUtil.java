package lk.ijse.gdse.aad.posusingspring.util;

import java.util.Base64;
import java.util.Random;

public class AppUtil {
    public static String createCusId(){
        return "C"+new Random().nextInt(10000);

    }

    public static String createItemCode(){
        return "I"+new Random().nextInt(10000);
    }

//    public static String toBase64P
//    rofilePic(byte [] profilePic){
//        return Base64.getEncoder().encodeToString(profilePic);
//    }

}

