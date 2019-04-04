# spring-kerberos-spnego
This is a simple example of SPNEGO authentication (without using a login form)


## Settings
You may need to enable kerberos authentication in your browser <br>
https://docs.oracle.com/cd/E41633_01/pt853pbh1/eng/pt/tsec/task_EnablingKerberosAuthenticationinFirefox-836673.html

You need specify path to you keytab and service principal name in kerberos.properties


## Building it

This is a maven project, and to build it use the following command

```
$ mvn clean install
```

## Running it

```
$ mvn spring-boot:run
```
