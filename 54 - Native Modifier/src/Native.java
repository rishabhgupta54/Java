public class Native {
    static {
        System.loadLibrary("Native Library Path");
    }

    public native void printMessage();
}
