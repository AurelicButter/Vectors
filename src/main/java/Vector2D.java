public class Vector2D {
    private double x, y;

    public Vector2D() {}

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getMagnitude() {
        return Math.sqrt(Math.pow(this.x, this.x) + Math.pow(this.y, this.y));
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D add(Vector2D vector) {
        Vector2D result = new Vector2D();

        result.setX(x + vector.getX());
        result.setY(y + vector.getY());

        return result;
    }

    public Vector2D add(double x, double y) {
        Vector2D result = new Vector2D();

        result.setX(this.x + x);
        result.setY(this.y + y);

        return result;
    }

    /**
     * Subtracts two vectors. Provided vector is subtracted from the vector values
     * Formula: A - B = Result
     */
    public Vector2D subtract(Vector2D vector) {
        Vector2D result = new Vector2D();

        result.setX(this.x - vector.getX());
        result.setY(this.y - vector.getY());

        return result;
    }

    /**
     * Subtracts a vector and a 2D coordinate. 2D coordinates are subtracted from the vector values.
     * (ie: Vector - 2D Coordinates = Result)
     */
    public Vector2D subtract(double x, double y) {
        Vector2D result = new Vector2D();

        result.setX(this.x - x);
        result.setY(this.y - y);

        return result;
    }

    public double dotProduct(Vector2D vector) {
        return vector.getX() * this.x + vector.getY() * this.y;
    }

    public double dotProduct(double x, double y) {
        return x * this.x + y * this.y;
    }

    public double crossProduct(Vector2D vector) {
        return vector.getX() * this.y - vector.getY() * this.x;
    }

    public double crossProduct(double x, double y) {
        return x * this.y - y * this.x;
    }

    public void scalarMultiply(double scalar) {
        this.x = this.x * scalar;
        this.y = this.y * scalar;
    }

    public Vector2D copy() {
        return new Vector2D(this.x, this.y);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

