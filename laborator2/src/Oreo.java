public class Oreo extends ChocolateBox {
    private float radius;
    private float height;

    public Oreo() {

    }

    public Oreo(float radius, float height, String origin, String flavour) {
        super(origin, flavour);
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getVolume() {
        if (height != 0 && radius != 0) {
            return height * radius * radius * (float) Math.PI;
        } else {
            System.out.println("Error - height or radius not initialized");
            return 0f;
        }
    }
}
