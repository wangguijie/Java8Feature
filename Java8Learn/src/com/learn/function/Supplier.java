package com.learn.function;
@FunctionalInterface
public interface Supplier<T> {
    T get();
}