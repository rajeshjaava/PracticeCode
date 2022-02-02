package com.learnings.core.stream;

import java.util.Optional;

public class OptionalTest {
public static void main(String args[]) {
	String name="Rajesh";
	Optional<String> opt=Optional.of(name);
	System.out.println(opt.isPresent());
	Optional<String> op1
    = Optional.ofNullable(name);
	System.out.println(op1.isPresent());
	Optional<String> op2
    = Optional.ofNullable(null);
	System.out.println(op2.isPresent());
	
}
}
