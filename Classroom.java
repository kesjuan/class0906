package dayone.shapes;

public class Classroom {
    public static void main(String[] args) {
       // int grade = 60;
        int grade = (int) Math.floor(Math.random()* 100);
      //  System.out.println(grade);
        if(grade >= 90){
            System.out.println("you got an A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("you got an B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("you got a C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("you got a D");
        } else {
            System.out.println("you got a F");
        }





    }
}
