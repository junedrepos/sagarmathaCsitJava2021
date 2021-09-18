package np.edu.scst.variable;

public class Variable {
    //psvm tab
    public static void main(String[] args) {
        //sout tab
        System.out.println("hello world testing variable");
        //shift +f6 runs the particular class
        //datatype variable = literal;
        byte b = 13;
        short s = 14;
        int i = 15;
        //please add 'l' L letter after long literal value
        long l = 16l;
        //please add 'f' letter after float literal value
        float f = 17.01f;
        double d = 18.00;
        char c = 'a';
        boolean isRainy = true;        
        String str = "hello world नमस्ते";
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(isRainy);
        System.out.println(c);
        System.out.println(str);
        System.out.println(""+(10+10.2f));
        int j = (int) (10 + 10.2f) ;
        System.out.println(j);
        
        float fl= (float) 10.2;
        //java sees all decimal points as double
        
    }
}
