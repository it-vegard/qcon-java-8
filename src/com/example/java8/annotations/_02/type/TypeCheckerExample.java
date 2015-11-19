package com.example.java8.annotations._02.type;

import java.util.ArrayList;
import java.util.List;

/**
 * From
 * http://types.cs.washington.edu/jsr308/specification/java-annotation-design
 * .html#intro
 * 
 * JSR 308 extends Java’s annotation system [Blo04] so that annotations may
 * appear on any use of a type. (By contrast, Java SE 7 permits annotations only
 * on declarations; JSR 308 is backward-compatible and continues to permit those
 * annotations.) Such a generalization removes limitations of Java’s annotation
 * system, and it enables new uses of annotations.
 * 
 * This document specifies the syntax of extended Java annotations in Java
 * source code and how those annotations are represented in classfiles. However,
 * this document makes no commitment as to the semantics of any particular
 * annotation type. As with Java’s existing annotations [Blo04], the semantics
 * is dependent on annotation processors (compiler plug-ins), and not every
 * annotation is necessarily sensible in every location where it is
 * syntactically permitted to appear. This proposal is compatible with existing
 * annotations, such as those specified in JSR 250, “Common Annotations for the
 * Java Platform” [Mor06], and proposed annotations, such as those to be
 * specified in (the now-defunct) JSR 305, “Annotations for Software Defect
 * Detection” [Pug06].
 * 
 * This proposal does not change the compile-time, load-time, or run-time
 * semantics of Java. It does not directly change the abilities of Java
 * annotation processors as defined in JSR 269 [Dar06]. The proposal merely
 * makes annotations more general — and thus more useful for their current
 * purposes, and also usable for new purposes that are compatible with the
 * original vision for annotations [Blo04].
 * 
 * see http://java.dzone.com/articles/java-8-type-annotations
 *
 */

public class TypeCheckerExample {
	public static void main(String[] args) {
		
		/** 
		 * notice annotations can now be placed on local variables 
		 */
		@NotNull
		@Email
		String s = args[0];
		System.out.println(s);

		/**
		 * In the example below a type checking framework would would 
		 * detect that badValue is null and produce an error.  One such 
		 * type checking framework is located at 
		 * http://types.cs.washington.edu/checker-framework/
		 */
		List<@NotNull String> aList = new ArrayList<>();
		String badValue = null;
		aList.add(badValue);
		
	}
}
