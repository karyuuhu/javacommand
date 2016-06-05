package com.hjl.serialize;

import java.io.Serializable;

public class Singleton implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private volatile static Singleton singleton;

	private Singleton() {
	}

	public static Singleton getSingleton() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	// 反序列化时指定返回的对象的生成策略，若不指定，反序列化时会返回不同的对象，破坏单例模式
	private Object readResolve() {
		return singleton;
	}
}
