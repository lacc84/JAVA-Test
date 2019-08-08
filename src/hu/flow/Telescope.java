package hu.flow;

public  class Telescope {
    private double diameter;
    private int fLength;

    public Telescope(double diameter, int fLength) {
        this.diameter = diameter;
        this.fLength = fLength;


    }


    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if (this.diameter >= 0) {
            this.diameter = diameter;
        }
    }

    public int getfLength() {
        return fLength;
    }

    public void setfLength(int fLength) {
        if (this.fLength >= 0) {
            this.fLength = fLength;
        }


    }
}