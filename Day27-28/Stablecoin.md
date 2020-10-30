# BlockChain Use Case
 ```sh
 Group 6 :  Praveen, Aditya, Sarfaraz, Rahiemuddin
 ```

## Stablecoin using Oracles

### Use case 
- Stablecoins are called by some the holy grail of cryptocurrencies.
They are an experimental technology aimed at creating cryptocurrencies pegged to the value of an asset 
which is considered to be “stable.” Most commonly, stablecoins are pegged to the US Dollar.

### An Overview: Stablecoins
- The main purpose of a stablecoin is to protect its owner from the volatility inherent to many cryptoassets. 
Most designs do this by pegging their value to the value of the U.S. Dollar, which provides the target 
price considered stable in the short and mid-term.

- So, how does a stablecoin achieve its desired stability? There exist mainly 3 types of systems:
1. Fiat-collateralized stablecoins
2. Crypto-collateralized stablecoins
3. Algorithmic stablecoins

### Price Feeds: Stablecoin Oracles
- Currently, on-chain collateralized or algorithmic stablecoins built using blockchain smart contract 
technology have no access to price feed data regarding their exchange rate to the USD (or whatever peg).
Smart contracts can’t access real world data on their own, so they are unable to check even the simplest 
contextual information about their performance or overall system health.

- Oracles are a fundamental component to any stablecoin’s base functionality. 
An oracle, in relation to blockchain technology) is a system built to feed data to smart contracts. 
For example, oracles are used to gather data about exchange rates of assets.

### Assessment: Advantages and Vulnerabilities
- When talking about non fiat-collateralized types, a stablecoin is as stable as the price data it is fed.

- Data retrieval stands as the most vulnerable part of every design.

### Proposal
- Creating a stablecoin which determines its value from the price of an entity in the real world.
For eg. the price of Crude oil in the US

- One method to do this, is by creating an AIP#004 token that communicates with an oracle to continuously determine its value.

- Another method would be to connect the token to a different network of oracles, like Witnet or Chainlink.

- To achieve even more stablity, an algorithm can be formed which calculates the price based on multiple resources,
so that even if one of them fluctuates too much, the others help in maintaining the equilibrium

### Type of blockchain needed - 
Public blockchain

### References
- https://makerdao.com/en/

- https://www.imf.org/en/About/Factsheets/Sheets/2016/08/01/14/51/Special-Drawing-Right-SDR