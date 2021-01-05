# Community Knowledge Tokens

Earn crypto by contributing knowledge to the developer community

## Architecture
![Architecture](https://github.com/blocumen/oan_100_days_of_code_2/blob/praveen_vidyavastu/Group6_OpenApp_ideas/CKT_architecture.jpg)

### ChainLink External Adapter(EA)
Provides a mechanism for external API calls, parsing the result data and return it to the caller

### Smart Contract
Contains logic for:  
1. Calling EA  
2. Processing claps/stars count, and decide amount of tokens to be assigned to the user  
3. Mapping of wallet address to user IDs in the different platforms  
4. Wallet creation

Wallet will be created automatically when the user installs the extension.  
User needs to store the private key/seed phrase, and provide password.

## Wireframes
Login page  
![Login page](https://github.com/blocumen/oan_100_days_of_code_2/blob/praveen_vidyavastu/Group6_OpenApp_ideas/Wireframes/CKT_login.png)

Registration  
![Registration](https://github.com/blocumen/oan_100_days_of_code_2/blob/praveen_vidyavastu/Group6_OpenApp_ideas/Wireframes/CKT_first.png)

Token counts  
![Token counts](https://github.com/blocumen/oan_100_days_of_code_2/blob/praveen_vidyavastu/Group6_OpenApp_ideas/Wireframes/CKT_second.png)
