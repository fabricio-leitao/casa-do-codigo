package br.com.zup.casa.codigo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {UniqueValueValidator.class})
@Target({ FIELD})
@Retention(RUNTIME)
public @interface UniqueValue {

	String message() default "{br.com.zup.casa.codigo.annotation.uniquevalue}";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default { };
	String fieldName();
	Class<?> domainClass();
}
