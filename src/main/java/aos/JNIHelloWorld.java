package aos;

import com.sun.jna.Memory;
import com.sun.jna.Native;

import javax.security.sasl.SaslServer;

public class JNIHelloWorld {
    static{
//        String t = System.getProperty("user.dir").concat("/bin/helloworld.so");
//        String t2 = System.getProperty("user.dir").concat("/bin/awesome/awesome.so");
//        System.load(t);
//        System.load(t2);
    }
//    native void printHelloWorld();
//    native int multiply(int a,int b);
    native int Add(int a,int b);

    public static void main(String[] args){
//        JNIHelloWorld j = new JNIHelloWorld();
//        j.printHelloWorld();
//
//        int c = j.multiply(3,4);
//        int r = j.Add(3,4);
//        System.out.println(c);
//        System.out.println(r);

        Awesome awesome = (Awesome) Native.load(System.getProperty("user.dir").concat("/bin/awesome/awesome.so"),Awesome.class);
        System.out.println(awesome.Add(12,99));
        System.out.println(awesome.Cosine(12.99));

        long[] nums = new long[]{5,1,4,7};

        Memory arr = new Memory(nums.length * Native.getNativeSize(Long.TYPE));
        arr.write(0, nums,0,nums.length);
        Awesome.GoSlice.ByValue slice = new Awesome.GoSlice.ByValue();
        slice.data = arr;
        slice.len = nums.length;
        slice.cap = nums.length;
        awesome.Sort(slice);
        long[] sorted = slice.data.getLongArray(0,nums.length);
        for (int i = 0;i<sorted.length;i++){
            System.out.println(sorted[i] + " ");
        }

        Awesome.GoString.ByValue str = new Awesome.GoString.ByValue();
        str.p = "Hello Java!";
        str.n = str.p.length();

        System.out.printf("msgid %d\n", awesome.Log(str));
    }
}
