class marks{

    String name;
    int marks;


    marks(String n , int m){

        name = n;
        marks = m;






    }


}

class grade{

    public static void main(String[] args) {
        marks s1= new marks("Aditya", 34);
        marks s2= new marks("Aman", 42);
        marks s3= new marks("Aone", 99);
        marks s4= new marks("Arun", 56);
        marks s5= new marks("Aryan", 58);

        if(s1.marks>=40){
            System.out.println(s1.name+ "  " +s1.marks);
        }

         if(s2.marks>=40){
            System.out.println(s2.name+ "  " +s2.marks);
        }

         if(s3.marks>=40){
            System.out.println(s3.name+ "  " +s3.marks);
        }

         if(s4.marks>=40){
            System.out.println(s4.name+ "  " +s4.marks);
        }
         if(s5.marks>=40){
            System.out.println(s5.name+ "  " +s5.marks);
        }





    }
}