rem Edit this file to set custom options
rem Tomcat accepts two parameters JAVA_OPTS and CATALINA_OPTS
rem JAVA_OPTS are used during START/STOP/RUN
rem CATALINA_OPTS are used during START/RUN

set JAVA_HOME=C:\Program Files\Eclipse Adoptium\jdk-17.0.1.12-hotspot
set AGENT_PATHS=
set JAVA_AGENTS=
set JAVA_LIBRARY_PATH=
set JVM_OPTS=-Xmx512M -Xss256K
set JAVA_OPTS=%JVM_OPTS% %AGENT_PATHS% %JAVA_AGENTS% %JAVA_LIBRARY_PATH%
