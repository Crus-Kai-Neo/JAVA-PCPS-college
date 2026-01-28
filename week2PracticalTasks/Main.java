package week2PracticalTasks;

public class Main {
    public static void main(String[] args){
        System.out.println(minimumAge(22));
        System.out.println(findMax(100,100));
        System.out.println(isValidPasswordLength("This fucking life", 2,5));
        System.out.println(isPass(49));
        System.out.println(isEven(22));
        System.out.println(isWeekend("sunday"));
        System.out.println(calculateDiscount("gold"));
        System.out.println(olderAge(22,29));
        System.out.println(calculateShippingCost(20));
    }

    // task 1

    public static boolean minimumAge(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }

    }

    // task 2

    public static int findMax(int number1, int number2){
        if (number1 > number2){
            return number1;
        }
        else if (number2 > number1){
            return number2;
        }
        else{
            System.out.println("Both numbers are equal.");
            return number1;
        }
    }


    // task 3

    public static boolean isValidPasswordLength(String password, int minimum, int maximum){
        if (password.length() >= minimum  && password.length() <= maximum){
            return true;
        }
        else{
            return false;
        }
    }

    // task 4

    public static boolean isPass(int score){
        if (score >=50){
            return true;
        }
        else{
            return false;
        }
    }

    // task 5

    public static boolean isEven(int number){
        if (number % 2 == 0){
            return true;
        }
        else{
            return false;
        }

    }


    // task 6


    public static boolean isWeekend(String day){
        if (day =="sunday" || day == "saturday"){
            return true;
        }
        else{
            return false;
        }
    }

    // task 7

    public static int calculateDiscount(String membership){
        if (membership == "gold"){
            return 20;
        }
        else if (membership == "silver"){
            return 10;
        }
        else if (membership == "bronze"){
            return 5;
        }
        else {
            return 0;
        }

    }

    // task 8
    public static int olderAge(int age1, int age2){
        if (age1 > age2){
            return age1;
        }
        else if (age2 > age1){
            return age2;
        }
        else{
            System.out.println("Both ages are equal.");
            return age1;
        }
    }

    // task 9

    public static int calculateShippingCost(double weight ){
        if (weight >=0  && weight < 5){
            return 10;
        }
        else if (weight >=5 && weight <10){
            return 20;
        }
        else if (weight >=10 && weight <20){
            return 30;
        }
        else if (weight >= 20){
            return 40;
        }
        else{
            System.out.println("use a valid weight.");
            return 0;
        }
    }

}
