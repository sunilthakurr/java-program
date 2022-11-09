package WrapperClass;

public class Wrapper_Demo {
    public static void main(String[] args) {
        Integer a = 10;
        int a1 = 10;
        System.out.println(a);
        System.out.println();

        Integer c1 = 10;
        Integer c2 = 10;
        Integer c3 = 178;
        Integer c4 = 178;
        System.out.println(c1 == c2);   // True
        System.out.println(c3 == c4);   // False
//        from -128 to 127 no copy will be generated
//        out of this range new adress will be formed due to which second case is false
// NOTE :-  The size of cache(an array in java wrapper class where we store data) is from -128 to 127 . If value
//            is between this then there is no copy will be generated and hence output is true. And if the value
//                is out of this range then the copy will be generated and copy will be generated and due to this
//                different address is formed(because it is formed in another memory) and hence the output will be
//                false
    }
}
