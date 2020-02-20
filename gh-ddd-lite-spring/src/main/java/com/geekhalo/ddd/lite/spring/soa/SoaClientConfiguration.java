package com.geekhalo.ddd.lite.spring.soa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoaClientConfiguration {

    @Bean
    public FeignErrorDecoderBasedExceptionConverter exceptionCheckFeignDecoder() {
        return new FeignErrorDecoderBasedExceptionConverter();
    }
}
