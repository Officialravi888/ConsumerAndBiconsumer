package org.DataBase;

public interface Consumer<T> {
    void accept(T t);
}
