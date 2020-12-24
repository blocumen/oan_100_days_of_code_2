

package java.org.example;

import avm.Blockchain;
import avm.Address;
import org.aion.avm.tooling.abi.Initializable;
import org.aion.avm.userlib.abi.*;

public class initialvar
{

    // All @Initializable fields must be static. The type of an @Initializable field must be a supported AVM ABI type.
    // The data supplied to the data field when deploying your contract must be supplied in the exact same order as the
    // @Initializable field are defined. If not, an ABIException will be thrown. The AVM uses the ABIDecoder or order to
    // parse all @Initializeable annotations.
    //If you have two variables myIntAll @Initializable fields must be static. The type of an @Initializable field
    // must be a supported AVM ABI type. The data supplied to the data field when deploying your contract must be supplied
    // in the exact same order as the @Initializable field are defined. If not, an ABIException will be thrown.
    // The AVM uses the ABIDecoder or order to parse all @Initializeable annotations.
    //If you have two variables myInt and myString that you want to declare and initialize them then you would use the @Initializable annotation.


    //    Within the static{} for this contract, you would decode the variables using the ABIDecoder class.
  //  Again, any variable you want to initialize need to be decoded in the order that you declared them



    // Define environment variables apiKey and Region.
    @Initializable
    private static String apiKey;

    @Initializable
    private static int region;

    // Set a placeholder for the owner of the contract and API response.
    @Initializable
    private static Address owner;

    @Initializable
    private static String initresponse;

    @Initializable
    private static int myInt;

    @Initializable
    private static String myString;

    // Decode the arguments supplied when deploying the contract.
    static
    {

        ABIDecoder decoder = new ABIDecoder(Blockchain.getData());
        myInt = decoder.decodeOneInteger();
        myString = decoder.decodeOneString();
        apiKey = decoder.decodeOneString();
        region = decoder.decodeOneInteger();
        owner = Blockchain.getCaller();
        initresponse = callApi(apiKey, region);
    }

    // Can an external API using the onetime API key and region.
    private static String callApi(String suppliedApiKey, int suppliedRegion)
    {
        // API call logic.

        return initresponse;
    }

    // Have the owner of this contract return the response of the API.
    public static String returnMessage()
    {
        onlyOwner();
        return initresponse;
    }

    // A modifer function that halts a function if it is not called by the owner of this contract.
    private static void onlyOwner()
    {
        Blockchain.require(Blockchain.getCaller().equals(owner));
    }



}
