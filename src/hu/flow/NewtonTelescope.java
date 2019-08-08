package hu.flow;

public class NewtonTelescope extends Telescope {

    double secondMirrorSize;

    public NewtonTelescope(double diameter, int fLength, int secondMirrorSize) {
        super(diameter, fLength);
        this.secondMirrorSize = secondMirrorSize;
    }

    public NewtonTelescope(double diameter, int fLength) {
        super(diameter, fLength);
    }

    public double getSecondMirrorSize() {
        return secondMirrorSize;
    }

    public void setSecondMirrorSize(double secondMirrorSize) {
        this.secondMirrorSize = secondMirrorSize;
    }
}


