public enum Singleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("I am: " + INSTANCE.name());
        System.out.println(this.hashCode());
    }
}
