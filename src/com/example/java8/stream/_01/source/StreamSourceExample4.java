package com.example.java8.stream._01.source;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StreamSourceExample4 {
	public static void main(String[] args) throws IOException {

		String workingDir = System.getProperty("user.dir");
		Path workingDirPath = FileSystems.getDefault().getPath(workingDir);

		System.err.println("Directory Listing Stream\n");
		Files.list(workingDirPath).forEach(System.out::println); // <1>

		System.err.println("\nDepth First Directory Walking Stream\n");
		Files.walk(workingDirPath).forEach(System.out::println); // <2>

		System.err.println("\nFile finding stream\n");
		String classFileName = StreamSourceExample4.class.getName().replace('.', '/') + ".java";

		List<Path> matchedPaths = new ArrayList<>(); // <3> 
		// A stream that finds a file
		Files.find(workingDirPath, 10,
				(filename, attributes) -> filename.endsWith(classFileName))
				.forEach( path -> {   // <4> 
					System.out.println(path);
					matchedPaths.add(path);  // <5>
				});

		System.err.println("\nText lines stream\n");
		Files.lines(matchedPaths.get(0)).forEach(System.out::println);		
	}
}
