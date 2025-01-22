#@Signup
Feature:Create an account on Magento

Scenario:Sign-up on Magento
Given user is on Homepage
Then click on Create an account link
And enter First Name in textbox as "John"
And enter Last Name in textbox as "Doe"
And enter Email in textbox as "johndoe011@gmail.com"
Then enter Password in textbox as "!q2w3e4r"
Then enter Confirm Password in textbox as "!q2w3e4r"
Then click on Create an account button
And verify registration success message
Then click on signout button

Scenario:Login on Magento
Then click on Sign In link
Then enter Email in textbox as "johndoe0@gmail.com"
Then enter Password in textbox as "!q2w3e4r"
Then click on Sign In button
And Verify welcome text on Homepage


