package lombok;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Arrays;

public class EqualsAndHashCodeExample {
    private transient int transientVar = 10;
    private String name;
    private double score;
    private Shape shape = new Square(5, 10);
    private String[] tags;
    private int id;

    public String getName() {
        return this.name;
    }

    @Override public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EqualsAndHashCodeExample)) return false;
        EqualsAndHashCodeExample other = (EqualsAndHashCodeExample) o;
        if (!other.canEqual((Object)this)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (Double.compare(this.score, other.score) != 0) return false;
        if (!Arrays.deepEquals(this.tags, other.tags)) return false;
        return true;
    }

    @Override public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long temp1 = Double.doubleToLongBits(this.score);
        result = (result*PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result*PRIME) + (int)(temp1 ^ (temp1 >>> 32));
        result = (result*PRIME) + Arrays.deepHashCode(this.tags);
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EqualsAndHashCodeExample;
    }

    public static class Square implements Shape {
        private final int width, height;

        public Square(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override public boolean equals(Object o) {
            if (o == this) return true;
            if (!(o instanceof Square)) return false;
            Square other = (Square) o;
            if (!other.canEqual((Object)this)) return false;
            if (!super.equals(o)) return false;
            if (this.width != other.width) return false;
            if (this.height != other.height) return false;
            return true;
        }

        @Override public int hashCode() {
            final int PRIME = 59;
            int result = 1;
            result = (result*PRIME) + super.hashCode();
            result = (result*PRIME) + this.width;
            result = (result*PRIME) + this.height;
            return result;
        }

        protected boolean canEqual(Object other) {
            return other instanceof Square;
        }

        @Override
        public Rectangle getBounds() {
            return null;
        }

        @Override
        public Rectangle2D getBounds2D() {
            return null;
        }

        @Override
        public boolean contains(double x, double y) {
            return false;
        }

        @Override
        public boolean contains(Point2D p) {
            return false;
        }

        @Override
        public boolean intersects(double x, double y, double w, double h) {
            return false;
        }

        @Override
        public boolean intersects(Rectangle2D r) {
            return false;
        }

        @Override
        public boolean contains(double x, double y, double w, double h) {
            return false;
        }

        @Override
        public boolean contains(Rectangle2D r) {
            return false;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at) {
            return null;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            return null;
        }
    }
}
