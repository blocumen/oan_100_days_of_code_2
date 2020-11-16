package org.example;

import avm.Address;
import org.aion.avm.embed.AvmRule;
import org.aion.avm.tooling.ABIUtil;
import org.aion.types.TransactionStatus;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Test;

import java.math.BigInteger;

public class InitializingVariableRuleTest {
    @ClassRule
    public static AvmRule avmRule = new AvmRule(true);

    //default address with balance
    private static Address from = avmRule.getPreminedAccount();

    private static Address dappAddr;

    @BeforeClass
    public static void deployDapp() {
        //deploy Dapp:
        // 1- get the Dapp byes to be used for the deploy transaction
        // 2- deploy the Dapp and get the address.
        byte[] dapp = avmRule.getDappBytes(InitializingVariable.class, null);
        dappAddr = avmRule.deploy(from, BigInteger.ZERO, dapp).getDappAddress();
    }

    @Test
    public void testSayHello() {
        //calling Dapps:
        // 1- encode method name and arguments
        // 2- make the call;
        byte[] txData = ABIUtil.encodeMethodArguments("sayHello");
        AvmRule.ResultWrapper result = avmRule.call(from, dappAddr, BigInteger.ZERO, txData);

        // getReceiptStatus() checks the status of the transaction execution
        TransactionStatus status = result.getReceiptStatus();
        Assert.assertTrue(status.isSuccess());
    }

    @Test
    public void testSetString() {
        //calling Dapps:
        // 1- encode method name and arguments
        // 2- make the call;
        byte[] txData = ABIUtil.encodeMethodArguments("setString","Hello Alice");
        AvmRule.ResultWrapper result = avmRule.call(from, dappAddr, BigInteger.ZERO, txData);

        // getReceiptStatus() checks the status of the transaction execution
        TransactionStatus status = result.getReceiptStatus();
        Assert.assertTrue(status.isSuccess());
    }

    @Test
    public void testGetString() {
        //calling Dapps:
        // 1- encode method name and arguments
        // 2- make the call;
        byte[] txData = ABIUtil.encodeMethodArguments("getString");
        AvmRule.ResultWrapper result = avmRule.call(from, dappAddr, BigInteger.ZERO, txData);

        // getReceiptStatus() checks the status of the transaction execution
        TransactionStatus status = result.getReceiptStatus();
        Assert.assertTrue(status.isSuccess());
    }
}

