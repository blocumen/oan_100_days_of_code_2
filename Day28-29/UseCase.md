# BlockChain Use Case
 ```sh
 Group 4 :  Anshul , Vineet , Ashlesh , Harikrishna
 ```
  
### Medical Record Management System 
 **A tamper proof record keeping and management system for medical priscription and  medical history of person.** 

### How it works 

  - This project uses Ceramic Network as the underlying layer for document store, signs and stores records. The IDX protocol built on top of Ceramic Network along with 3id connect is implemented to access and store the basic profiles. 
  - Assigned doctors can upload/update priscription in a patient's accoount, these records are available publicly and is accessible from anywhere over internet.
  - Further patient or any other 3rd party can't change the priscriptions or records only authorised doctor can (happens with help of IDX). Patient have somewhat freedom to manipulate data such as his personal information over his account.
  - The profiles are being stored on ceramic network with IPFS , where various versions can also be fetched. That means if the patient had any previous disease that can also be checked by fetching older version of record.
  - Any one else ( some other Doctor ) can fetch these records with correct Document ID provided by the system. 
  - This Project will use **Public Blockchain**
  
 ### Features
 
 - Transparency
 - Tamper proof
 - Document Management
 - Data Sharing
 ### Will eradicate 
 
- Inaccessibility
-  Data insecurity 
-  Fraudulent identities
-  The trouble of identifying patients

### Conclusions
A Blockchain allows data across multiple independent systems to be accessed simultaneously and immediately by those with sufficient permissions. This interfacing of different systems saves medical and financial sacrifices and reduces administrative delays. The use of smart contracts allows patients’ consent preferences to be executed immediately, further reducing administrative costs.

### References

| Packages | Docs |
| ------ | ------ |
| Ceramic | https://www.ceramic.network/|
| IDX | https://github.com/ceramicnetwork/ceramic |
| 3ID | https://www.npmjs.com/package/@ceramicnetwork/3id-did-resolver |
