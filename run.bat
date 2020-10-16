set projectLocation=G:\Testing\AutomationFrame
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
exit /b 0





