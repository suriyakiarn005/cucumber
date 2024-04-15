@vmmaps
Feature: Sign up a vrs route optimizer application
@register
Scenario: Sign up with a valid credential
Given Launch the URL
When Click on the sign up button
And Enter the full name
And Enter the email address
And Enter the mobile number
And Enter the password for vmmaps
And Enter the confirm password
And Click the privacy policy
Then  Click register button

@signin
Scenario: sign in a application with credential
Given launch the URL of the application
When Click on the sigin button in the page
And  Enter the registered email address
And Enter the correct password
Then  Click on the signin button

@forgetpassword
Scenario: Forget password 
Given launch the url
When Click the sigin button in the page
And  Click the forget password
And Enter the existing mail address 
And Enter the new passsword
And click login
