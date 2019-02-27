package com.demo.cinema;

public interface CommandHandleInterface<T> {

    public void handle(T command);
}
