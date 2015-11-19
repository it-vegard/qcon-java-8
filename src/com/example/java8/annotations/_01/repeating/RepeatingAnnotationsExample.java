package com.example.java8.annotations._01.repeating;

import java.lang.reflect.Method;

/**
 * This example demonstrates how repeating annotations works
 *
 */
public class RepeatingAnnotationsExample {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Method method = SomeService.class.getMethod("doSomething");
		
		System.out.println("\nGetting the annotatino by type");
		Schedule[] annotationsByType = method.getAnnotationsByType(Schedule.class);
		for (Schedule schedule : annotationsByType) {
			System.out.println(schedule.frequency());
		}
		
		// the container types are used to preserve backward comptability 
		// with older libraries that using the annotation array container 
		// pattern
		System.out.println("\nGetting the annotation by container type");
		Schedules schedules = method.getAnnotation(Schedules.class);
		for (Schedule schedule : schedules.value()) {
			System.out.println(schedule.frequency());
		}
	}
}
