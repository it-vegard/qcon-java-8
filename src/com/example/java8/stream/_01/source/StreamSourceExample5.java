package com.example.java8.stream._01.source;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class StreamSourceExample5 {
	public static void main(String[] args) throws IOException {

		String workingDir = System.getProperty("user.dir");
		Path workingDirPath = FileSystems.getDefault().getPath(workingDir);

		System.err.println("Directory Listing Stream\n");
		Files.list(workingDirPath).forEach(System.out::println); // <1>

		System.err.println("\nDepth First Directory Walking Stream\n");
		Files.walk(workingDirPath).forEach(System.out::println); // <2>

		System.err.println("\nFile finding stream\n");
		String classFileName = StreamSourceExample5.class.getName().replace('.', '/') + ".java";

		/* Similar to StreamSourceExample4, but more readable. */
		BiPredicate<Path, BasicFileAttributes> fileMatcher = (filename, attributes) -> filename.endsWith(classFileName); //<3>

		// A stream that finds a file
		List<Path> matchedPaths = new ArrayList<>(); // <4> 
		Files.find(workingDirPath, 10, fileMatcher).forEach( // <6>
				path -> printAndAdd(matchedPaths, path) // <7>
		);

		System.err.println("\nText lines stream\n");
		Files.lines(matchedPaths.get(0)).forEach(System.out::println);		
	}

	private static void printAndAdd(List<Path> matchedPaths, Path path) { // <5>
		System.out.println(path);
		matchedPaths.add(path);
	}
}
