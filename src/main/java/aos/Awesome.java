package aos;


import com.sun.jna.Library;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

public interface Awesome extends Library {
    public  class GoSlice extends Structure{
        public static class ByValue extends GoSlice implements Structure.ByValue {}
        public Pointer data;
        public long len;
        public long cap;

        protected List getFieldOrder(){
            return Arrays.asList(new String[]{"data","len","cap"});
        }

    }
    public class GoString extends Structure{
        public static class ByValue extends GoString implements Structure.ByValue {}
        public String p;
        public long n;
        protected List getFieldOrder(){
            return Arrays.asList(new String[]{"p","n"});
        }
    }

    public long Add(long a, long b);
    public double Cosine(double val);
    public void Sort(GoSlice.ByValue vals);
    public long Log(GoString.ByValue str);
}
