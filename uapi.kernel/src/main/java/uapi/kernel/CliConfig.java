package uapi.kernel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(CliHandler.class)
public @interface CliConfig {

    String option();

    boolean required() default false;

    boolean hasValue() default false;

    CliOptionValueType valueType() default CliOptionValueType.STRING;

    String description() default "";
}