const web3 = new Web3(new Web3.providers.HttpProvider("https://aion.api.nodesmith.io/v1/mastery/jsonrpc?apiKey=f0345c7bd03f49938d07cabeaf6986f5"));
const account = web3.eth.accounts.privateKeyToAccount("bb7032d0b3ae5cce16f7f8fbd6c16bb43fffc2a30805a6c683bacace96963f0b424a97b6e17dc2acd604bb503847c99209dc8333ebc8b8daea9ddebaa047f10");
const contractAddress = "0xa0ce15297c16356fd4fcddc0cb38c8a0bd4e161759275a9fa9c43221dd3c8c97";
const methodName = "greet";

async function methodCall() {

    // Create the data object.
    let data = web3.avm.contract
        .method(methodName)
        .inputs(["string"], ["Praveen"])
        .encode();

    // Create the transaction object.
    const transactionObject = {
        from: account.address,
        to: contractAddress,
        data: data,
        gasPrice: 10000000000,
        gas: 2000000,
        type: "0x1"
    };

    // Send the transaction object to the network and wait for a response.
    let initialResponse = await web3.eth.call(transactionObject);

    // Decode the reponse.
    let avmResponse = await web3.avm.contract.decode("string", initialResponse);

    // Print the response to the console.
    console.log(avmResponse);
}
