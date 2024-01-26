package task32;

public class GenericSuper<T> {
    private T ob;

    public GenericSuper(T ob) {
        this.ob = ob;
    }

    private T getOb() {
        return ob;
    }
}

class GenericSub<T> extends GenericSuper<T> {
    public GenericSub(T ob) {
        super(ob);
    }
}