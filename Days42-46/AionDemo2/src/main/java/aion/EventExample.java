package aion;

import avm.Address;
import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

import avm.Blockchain;
import avm.Result;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.abi.ABIDecoder;
import org.aion.avm.userlib.abi.ABIEncoder;
import org.aion.avm.userlib.abi.ABIStreamingEncoder;

//Blockchain log
public class EventExample {

    private static Address deployer;
    static{
        deployer = Blockchain.getCaller();

    }

    @Callable
    public static void emitEvent() {
        String eventTopic = "Emit Event"; // topic
        Address eventCaller = Blockchain.getCaller(); // data
        Blockchain.log(eventTopic.getBytes(), eventCaller.toByteArray());
    }

    @Callable
    public static long getBlockNumber(String newStr) {
        Blockchain.println("Block number to be mined: " + Blockchain.getBlockNumber());
        return Blockchain.getBlockNumber();
    }// result-Data: 2; Energy used: 38292

    @Callable
    public static Address getCallerAddress() {
        return Blockchain.getCaller();
    }
    /* Result
    [INFO] Data       : a0240f9a7697b2662b0ee0cb57cb61f71a665692c34f6c258d2f09b2fb343c89
    [INFO] Energy used: 27232
     */

    private static void onlyOwner(){
        Blockchain.require(deployer.equals(Blockchain.getCaller()));
    }

    @Callable
    public static void ownerVerfiy(){
        onlyOwner();
        Blockchain.println("Owner has called the function successfully");
    }
    /*
[INFO] Calling contract method ...
Output from transaction 0000000000000000000000000000000000000000000000000000000000000000
Owner has called the function successfully
 */




}

//deployed successfully
/*
************************ Execution Logs ****************************
Hex Data: a0240f9a7697b2662b0ee0cb57cb61f71a665692c34f6c258d2f09b2fb343c89
Topic: 456d6974204576656e7400000000000000000000000000000000000000000000

************************ Execution Logs ****************************

[INFO] ****************  Method call result  ****************
[INFO] Data       : null
[INFO] Energy used: 26792
[INFO] *********************************************************
[INFO] Method call successful
[INFO] ---------------------------------------------------------
 */



