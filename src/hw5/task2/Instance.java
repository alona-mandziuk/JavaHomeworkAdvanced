package hw5.task2;

class Instance {
    private static final int number = 20;
    public String line;
    Instance instance;

    public Instance(String line, Instance instance) {
        this.line = line;
        this.instance = instance;
    }

    Instance() {
    }

    public Instance(String line) {
        this.line = line;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Instance getInstance() {
        return instance;
    }

    void setInstance(Instance instance) {
        this.instance = instance;
    }
}
