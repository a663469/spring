package com.zaurtregulov.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) //Для полей
@Retention(RetentionPolicy.RUNTIME) //До выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default  "xyz.com";
    public String message() default "email  must ends with xyz.com";

    public Class<?>[] groups() default {}; //Позволяет разбивать анотации по группам
    public Class<?  extends Payload> [] payload() default {}; //Используется при переносе методданных клентов
}
