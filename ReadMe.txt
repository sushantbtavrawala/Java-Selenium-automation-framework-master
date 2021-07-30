** Run through command prompt
mvn clean test

** Run specific feature file
mvn test -Dcucumber.options="src\test\resources\features\LoginToApplicatoin.feature"