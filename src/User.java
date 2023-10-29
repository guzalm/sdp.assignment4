// Concrete Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String parameterName, double value) {
        System.out.println(name + " : " + parameterName + " is now " + value);
    }
}
