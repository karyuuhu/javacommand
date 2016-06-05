package com.hjl.study.outofmemory;

public class StackOutofMemory {

	public static void main(String[] args) throws Exception {
		new StackOutofMemory().call();
	}

	public void call() {
		long time = System.currentTimeMillis();
		call();
	}
}
