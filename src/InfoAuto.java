public class InfoAuto {
    private int release;
    private int price;
    private String model;
    private String color;

    public InfoAuto() {
    }

    public InfoAuto(int release, int price, String model, String color) {
        this.release = release;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "InfoAuto{" +
                "release=" + release +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

