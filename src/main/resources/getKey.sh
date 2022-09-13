#!/bin/bash

keytool -genkeypair -keyalg RSA -keysize 2048 -alias provisioning.service -dname "CN=provisioning.service,OU=London,O=London,C=UK" -ext "SAN:c=DNS:provisioning.service,IP:10.110.1.167" -validity 3650 -keystore identity.jks -storepass provisioningServer -keypass provisioningServer -deststoretype pkcs12
/usr/java/jdk-15.0.2/bin/keytool -export -alias provisioning.service -file mydomain.der -keystore identity.jks
openssl x509 -inform der -in mydomain.der -out certificate.pem
/usr/java/jdk-15.0.2/bin/keytool -importkeystore -srckeystore identity.jks -destkeystore provisioningServer.pfx -deststoretype PKCS12

