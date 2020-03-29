### Mac setup for Java/Chromedriver
    
    open ~/.bash_profile using nano or vim command
    Add the following lines
    
    
    export M2_HOME=/Users/yourname/apache-maven-3.5.4
    export PATH=$PATH:$M2_HOME/bin
    export JAVA_HOME=$(/usr/libexec/java_home)
    export PATH=$JAVA_HOME/bin:$PATH
    export CHROMEDRIVER_HOME=/usr/local/Caskroom/chromedriver/2.42
    
    Use brew to download chromedriver
    
 ### Project Libraries 
 This can be found in pom.xml
 
 - Maven
 - Testng
 - Selenium
 - Java
 - OpenCsv -To read and Write into CSV
 - Allure - Reporting not implemented
 
 ### Project Description for Automation
 
 - Login into Disney website
 - Get to Shopping site and signup
 - When you signup save that information into csv file
 - signout and log back in
 - For login read the username from the csv file
 - Go to the page and verify the info on the screen and info on the file matches
 
 ### Project Implementation
 
 This project is implemented using Page Object Model
 
 ### Watch The Recording Of The Automation Test
 
- This automation framework was tested and verified
- Please download the file DisneyTest.mov file on to your machine
- This file shows the execution of the automation for the website
- TestNgWithSelenium/DisneyTest.mov is the file that needs to be downloaded
 
 ### Run the project
 
 Download the project into local from this repo
 
 ```sh
 $ mvn clean test
 ```
 
 
 
  
   
