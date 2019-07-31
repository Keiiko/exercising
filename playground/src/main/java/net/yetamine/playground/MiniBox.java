package net.yetamine.playground;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class MiniBox<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MiniBox() {
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MiniBox) {
            final MiniBox<?> miniBox = (MiniBox<?>) o;
            return Objects.equals(data, miniBox.data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return "MiniBox{" +
                "data=" + data +
                '}';
    }

    public void addTo(Collection<? super T> collection) {
        if (data != null) {
            collection.add(data)
        }
    }
}
