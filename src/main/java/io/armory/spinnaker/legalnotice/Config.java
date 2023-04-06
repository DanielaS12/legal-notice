package io.armory.spinnaker.legalnotice;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class Config {
    private static final Logger LOGGER =  LoggerFactory.getLogger(Config.class);
    private static final String legalNotice = "\n\n*************************************\n\nThis software is copyright of Armory, Inc. Any use of this software is subject to and governed by the Armory Terms and Conditions available at https://www.armory.io/terms-and-conditions/ and this software is considered part of Armory Services under those Terms and Conditions.\n\nYour continued use of this software acknowledges and accepts the Armory Terms and Conditions.\n\nUse of this software requires a valid license which can be obtained from Armory by contacting info@armory.io.\n\n*************************************\n\n";

    @Bean
    public void logLegalNotice() {
        LOGGER.warn(legalNotice);
    }
}
