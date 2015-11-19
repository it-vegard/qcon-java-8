package com.example.java8.annotations._01.repeating;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Schedules.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Schedule {
	public String frequency();
}
