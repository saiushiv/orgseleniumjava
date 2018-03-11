This is the Java and Selenium based Automation Project.

Note: This project is best viewed in IntelliJ IDE.

Fixes for some common issues:
1) If you are seeing warnings and errors for Java 1.5 version
then you need to update the Java bytecode version setting in the IntelliJ IDE as
File -> Settings -> Build -> Java Compiler -> Change ByteCode version to 1.8

2) If the issue is still isn't resolved then please update the java version to 1.8 in 
orgseleniumjava.iml file at line 3 :
 <component name="NewModuleRootManager" LANGUAGE_LEVEL="JDK_1_8">