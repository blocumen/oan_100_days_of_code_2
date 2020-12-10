package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;
import org.aion.avm.userlib.abi.ABIDecoder;

public class InitializingVariable
{
    @Initializable
    private static boolean status;

    @Initializable
    private static String name;
//
//    @Initializable
//    private static String name;
    // pass -Z true in deployment arguments
    /*
      -I int
      -J long
      -S short
      -C char
      -F float
      -D double
      -B byte
      -Z boolean
      -A Address
      -T String
      */
    //To deploy using terminal  mvn aion4j:deploy -Dargs="-Z true"

    @Callable
    public static boolean getStatus(){
        Blockchain.println("current status is "+status);

        return status;
    }

//    @Callable
//    public static String getName(){
//        Blockchain.println("name is "+name);
//        return name;
//    }
       // pass values to all arguments when initialized variables , otherwise it will give you error

}
