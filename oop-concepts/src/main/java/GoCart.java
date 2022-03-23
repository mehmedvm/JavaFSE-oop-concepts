public class GoCart {
    //Fields
    private String name;
    private boolean needGas;
    private int laps;

    //Default Constructor

    public GoCart() {
    }

    //Parametirized Constructor
    public GoCart(String name, boolean needGas, int laps) {
        this.name = name;
        this.needGas = needGas;
        this.laps = laps;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedGas() {
        return needGas;
    }

    public void setNeedGas(boolean needGas) {
        this.needGas = needGas;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }

    //To String
    @Override
    public String toString() {
        return "GoCart{" +
                "name='" + name + '\'' +
                ", needGas=" + needGas +
                ", laps=" + laps +
                '}';
    }

}
