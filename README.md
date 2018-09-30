# Mac setup for Java/Chromedriver
    
    open ~/.bash_profile using nano or vim command
    Add the follwoing lines
    
    
    export M2_HOME=/Users/yourname/apache-maven-3.5.4
    export PATH=$PATH:$M2_HOME/bin
    export JAVA_HOME=$(/usr/libexec/java_home)
    export PATH=$JAVA_HOME/bin:$PATH
    export CHROMEDRIVER_HOME=/usr/local/Caskroom/chromedriver/2.42
    
    Use brew to download chromedriver
