public class jniSampleMain {
    public static void main(String[] args){
        int result=JNIWrapper.sayHello();
        System.out.println("One");
        System.out.println("Two");
        System.out.println(result);
    }
    static
    {
        System.loadLibrary("jniSample/jni_src/JNIWrapper");
    }
}
