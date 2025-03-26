public class Milka extends ChocolateBox {
    private float length;
    private float width;
    private float height;

    public Milka() {

    }

    public Milka(String flavour, String origin, float length, float width, float height) {
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public float getVolume() {
        return length * height * width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {

        return  "Milka{" +
                "flavour= " + getFlavour() +
                ", origin= " + getOrigin() +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
