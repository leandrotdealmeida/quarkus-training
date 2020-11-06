package org.acme.quickstart.chapter5ProgramModel;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;

import javax.inject.Singleton;
@Singleton
public class RegisterCustomModuleCustomizer
        implements ObjectMapperCustomizer {
    public void customize(ObjectMapper mapper) {
        mapper.configure(
                DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
    }
}