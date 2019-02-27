package com.demo.cinema;

public interface QueryHandleInterface<I, O> {

    public O handle(I query);

}
