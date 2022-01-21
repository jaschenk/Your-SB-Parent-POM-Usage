# Your-SB-Parent-POM-Usage

## Requirements
* Java, preferred OpenJDK 17
* Maven at least 3.6.3
* Install the specify parent POM from the github project: 
 
## Building
 From the project's home directory, run the following command:
 ```
  $ mvn clean package
 ```
 
## Consequences of not performing a local install of Parent POM
If the required Parent POM is not 'installed' locally within your Maven Repository, then you will
likely find the following errors:
```
Downloading from central: https://repo.maven.apache.org/maven2/io/yourdomain/springboot-parent/0.0.1/springboot-parent-0.0.1.pom
[ERROR] [ERROR] Some problems were encountered while processing the POMs:
[FATAL] Non-resolvable parent POM for io.yourdomain:demo:0.0.1-SNAPSHOT: Could not find artifact io.yourdomain:springboot-parent:pom:0.0.1 in central (https://repo.maven.apache.org/maven2) and 'parent.relativePath' points at no local POM @ line 5, column 13
 @ 
[ERROR] The build could not read 1 project -> [Help 1]
[ERROR]   
[ERROR]   The project io.yourdomain:demo:0.0.1-SNAPSHOT (/home/jaschenk/code/myCode/Your-SB-Parent-POM-Usage/pom.xml) has 1 error
[ERROR]     Non-resolvable parent POM for io.yourdomain:demo:0.0.1-SNAPSHOT: Could not find artifact io.yourdomain:springboot-parent:pom:0.0.1 in central (https://repo.maven.apache.org/maven2) and 'parent.relativePath' points at no local POM @ line 5, column 13 -> [Help 2]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/ProjectBuildingException
[ERROR] [Help 2] http://cwiki.apache.org/confluence/display/MAVEN/UnresolvableModelException

``` 

Simple perform a the following Maven command on the Parent Project:
```
$ cd ../Your-SB-Parent-POM
$ mvn install
$ # ... (see Parent POM Project for details of install console output) ...
$ cd ../Your-SB-Parent-POM-Usage

``` 
Now re-Build your project.
 
## Running
 From the project's home directory, run the following command:
```
 $ ./bin/runLocal.sh
```
 This script will bootstrap the any necessary runtime properties and start the local instance.
 
