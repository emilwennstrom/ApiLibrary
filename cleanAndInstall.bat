@echo off
cd ApiLibrary
mvn clean package
mvn install:install-file -Dfile=target/ApiLibrary-1.0.jar -DgroupId=algot.emil -DartifactId=ApiLibrary -Dversion=1.0 -Dpackaging=jar
cd..
cd PatientApi
mvn clean install
cd..
cd MessagesApi
mvn clean install
cd..
cd UserApiJournal
mvn clean install

@echo on
