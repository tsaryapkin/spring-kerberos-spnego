package com.bss.kerberosspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.kerberos.authentication.sun.GlobalSunJaasKerberosConfig;

@Configuration
@Profile("kerberos")
@PropertySource(value={"classpath:kerberos.properties"})
public class GlobalKerberosSecurityConfig {

    @Value("${kerberos.krbConfLocation}")
    private String krbConfLocation;

    @Bean
    public GlobalSunJaasKerberosConfig globalSunJaasKerberosConfig() {
        GlobalSunJaasKerberosConfig globalConfig = new GlobalSunJaasKerberosConfig();
        globalConfig.setDebug(true);
        globalConfig.setKrbConfLocation(krbConfLocation);
        return globalConfig;
    }
}