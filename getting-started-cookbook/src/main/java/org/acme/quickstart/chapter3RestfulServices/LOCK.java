package org.acme.quickstart.chapter3RestfulServices;

import javax.ws.rs.HttpMethod;
import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@HttpMethod("LOCK")
@Documented
public @interface LOCK {
}
