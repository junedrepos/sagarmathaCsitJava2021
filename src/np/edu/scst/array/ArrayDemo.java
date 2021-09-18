package np.edu.scst.array;

public class ArrayDemo{
    //psvm tab
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4}; //allowed but not recommended
                              //0  1  2  3 
        int[] num2 = {1,2,3,4}; // allowed and recommended
        String[] names = {"Ram","Shyam","Hari","Laxman","Bharat"};
                                        //  0         1             2           3                   4
                                        // size is 5 i.e 5 elements, index ranges from 0 - 4
        //access array element
        System.out.println(names[1]);//Shyam
        //modifying|replacing array elements
        names[1]= "Satrughan";
        System.out.println(names[1]);//Satrughan
        
        String[] names2 = new String[5];
        names2[1]="Ram";
        //   initialization; condition checking; increment/decrement
        for(int index =0;  index<names2.length;index++ ){
            System.out.println(names2[index]);
        }
        //for each loop
        //   datatype/Classtype   loopVariable  :   arrayname
        for  (  int                             var                :     num1            ){
            System.out.println(var);
            
        }
        for(String var : names){
            System.out.println(var);
        }
        

    }
}
