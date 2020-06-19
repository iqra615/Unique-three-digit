package come.codewithiqra;

public class Main {

    public static void main(String[] args) {
	int amount = 0;
	   for(int i =0; i <4; i++){
	       for(int j =0; j<4; j++){
	           for(int k = 0; k<4; k++){
	               if(k!=i && i!=j && k!=j){
	                   amount++;
                       System.out.println(i+ "" +j + "" +k);

                   }
               }
           }
       }
        System.out.println("Total amount of three digit is :" +amount);
    }
}
