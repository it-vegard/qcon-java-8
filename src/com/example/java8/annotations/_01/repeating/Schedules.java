package com.example.java8.annotations._01.repeating;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Schedules {
	Schedule[] value();
}
