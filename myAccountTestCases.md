Test Cases for MyAccount Functionality on Mobile App
===================
**Case 1:** Guest User.

 - Should navigate to Create Account Page, when user clicks on "**My Account**" 

**Case 2:** New User. 

 - Should be able to create account using Facebook. 
 - Should be able to create account using Google.
 - Should be able to create account using email and password.

**Case 3:** Existing user with no Purchase history. 

 - Should navigate to MyAccount page on successful login. 
 - On MyAccount page validate below. 
	 - Lifetime cash back amount is **0**.
	 - Cash back balance is **0**.
	 - **Add Card** link in present and working. 
	 - Should be able to tap and see **Purchase History**
	 - Should be able to tap on **My Wallet**
	 - Validate **Refer&Earn** link is present. 
	 - Should have links to **Frequently Asked Questions**

**Case 4:** Existing user with Purchase history. 

 - Should navigate to MyAccount page on successful login. 
 - On MyAccount page validate below.  
	 - Lifetime cash back amount is  not **0**.
	 - Cash back balance is not **0**.
	 - Should be able to tap and see **Purchase History**
	 - Should be able to tap on **My Wallet** and see existing card info, if card is already added. 
	 - Validate **Refer&Earn** link is present. 
	 - Should have links to **Frequently Asked Questions**