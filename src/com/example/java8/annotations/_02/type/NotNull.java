package com.example.java8.annotations._02.type;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value={ElementType.LOCAL_VARIABLE,ElementType.TYPE_USE})
public @interface NotNull {

}
