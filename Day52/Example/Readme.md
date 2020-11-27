## Steps to run
- Change the AVM storage path to somewhere locally
- Create a few accounts and fund them with Aions
- Deploy the Returner contract with one of the funded addresses
- Copy the Returner contract address
- Deploy the Caller contract with another account, and pass a deployment argument: -A &lt;Returner contract address&gt;
- Call getStringInAnotherContract method and pass 0 or 1
