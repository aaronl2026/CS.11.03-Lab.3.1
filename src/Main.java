import java.util.Scanner;


public class Main {
    public static String modulo(){
        Scanner yesorno = new Scanner(System.in);
        System.out.println("You forget to take water with you on the hike. There is a pond nearby with seemingly fresh water as it is clear. The riddle says: I add 6 and 11 and get...? QUiCK! TIME IS RUNNING OUT. Type in the correct unit digit and you win your clean water!");
        int usermodulo = yesorno.nextInt();
        if (usermodulo%10 == 5) return "Great!" ;
        System.out.println("You died of dehydration.");
        System.exit(0);
        return "0";
    }
    public static int multiply(int a, int b){
        if ((a >= 10 || b >= 10) || (a < 0 || b < 0)){
            System.out.println("Oh no! It was fun, but you didn't follow the rules of the game. You died.");
            System.exit(0);
            return 0;
        }
        int answer = a*b;
        System.out.println("Woohoo! The answer of the two numbers multiplied together is "+answer+".");
        return 1;
    }
    public static int addition(int a){
        int b = 388+9109;
        if (a == b){
            System.out.println("Awesome! THE PIRATES LET YOU GO.");
            return 0;
        }
        System.out.println("The pirates stole all your necessities to survive. Sad ending. You died.");
        System.exit(0);
        return 1;
    }

    public static int subtraction(double a){
        double b = 18790.07-9779.99;
        if (a == b){
            System.out.println("The person says thank you and kindly walks away. You shiver at what would have happened if you did the wrong thing!");
            return 0;
        }
        System.out.println("The passerby shows immense disdain. You have failed.");
        System.exit(0);
        return 1;
    }
    public static double professor(int a, int b){
        if ((a >= 10 || b >= 10) || (a < 0 || b < 0)){
            System.out.println("Oh no! It was fun, but you didn't follow the rules of the game. You died.");
            System.exit(0);
            return 0;
        }
        return (double) a/b;
    }
    public static String riddleone(String a){
        if (a.equals("Bottle")) return "Bottle";
        System.out.println("Oh no! You either got a spelling or capitalization mistake, or you typed the wrong answer. You lost.");
        System.exit(0);
        return "";
    }
    public static String riddletwo(String a){
        if (a.equals("Footsteps")) return "Footsteps";
        System.out.println("Oh no! You either got a spelling or capitalization mistake, or you typed the wrong answer. You lost.");
        System.exit(0);
        return "";
    }
    public static String riddlethree(String a){
        if (a.equals("David")) return "David";
        System.out.println("Oh no! You either got a spelling or capitalization mistake, or you typed the wrong answer. You lost.");
        System.exit(0);
        return "";
    }
    public static boolean riddlefour(int a){
        if (a == 23 || a == 29) return true;
        System.out.println("You were so close to the finish line, but you failed, and you tripped, and you passed out. Rotten luck, but good try though!");
        System.exit(0);
        return false;
    }
    public static boolean riddlefive(String a){
        if (a.equals("Yes")) return true;
        System.out.println("What did you say?!?! Oops. Try again.");
        System.exit(0);
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the hiking game! You are an ambitious adventurer on a treacherous hike. However, on the way, you find out that the hike is much harder than you presumed it would be. You faced many challenges, and cannot go back anymore. You know theres 10 more obstacles to the finish line and you have to finish them to survive or else wait for impending doom... But I'm sure you can make it!");
        System.out.println("Rules of the game:\nYou cannot buy your way out of the game. You will encounter riddles and problems and should you not choose to pay money to skip, you need to get the riddles right in order to survive. Good luck and have fun.");
        modulo();
        System.out.println("You got water yey... Continue on the journey of limitless discovery!");
        System.out.println("Hey! This is just for fun. Plug in two single digit numbers.");
        Scanner num1mul = new Scanner(System.in);
        System.out.println("Plug in your first number:");
        int num1mulanswer = num1mul.nextInt();
        Scanner num2mul = new Scanner(System.in);
        System.out.println("Plug in your second number:");
        int num2mulanswer = num2mul.nextInt();
        multiply(num1mulanswer, num2mulanswer);
        System.out.println("A team of pirates obstruct your pathway to freedom! But you need to solve this teeny problem to move on.");
        Scanner additionscanner = new Scanner(System.in);
        System.out.println("What is 388+9109?");
        int additionanswer = additionscanner.nextInt();
        addition(additionanswer);
        System.out.println("A dangerous-looking passerby is asking for answers to his financial statement. You need to go ahead and answer this subtraction problem.");
        Scanner subtractionscanner = new Scanner(System.in);
        System.out.println("What is 18790.07-9779.99?");
        double subtractionanswer = subtractionscanner.nextDouble();
        subtraction(subtractionanswer);
        System.out.println("You are in deep exhaustion and is looking for a rest. Luckily, your next obstacle is a fairly simple one.");
        Scanner professorscanner1 = new Scanner(System.in);
        System.out.println("The professor wants two numbers to use for division. Type in the first number you would like to use.");
        int professoranswer1 = professorscanner1.nextInt();
        Scanner professorscanner2 = new Scanner(System.in);
        System.out.println("The professor wants two numbers to use for division. Type in the second number you would like to use. But no negative or anything larger than single-digit :).");
        int professoranswer2 = professorscanner2.nextInt();
        System.out.println("The final answer to your question is "+professor(professoranswer1, professoranswer2)+", you wave bye to the Professor and move on.");
        System.out.println("NEXT UP WE GOT SOME FUN FUN (scary) RIDDLEZ!! There are 5 questions left! Do you have what it takes to become the best hiker in the world?");
        System.out.println("WARNING- a floating dictionary is looking out for spelling errors. IF you don't capitalize, she will catch up and oust you from your wonderful hike! We don't want that to happen, so be careful.");
        Scanner riddle1scanner = new Scanner(System.in);
        System.out.println("The dictionary asks: What has a neck but no head?");
        String riddle1answer = riddle1scanner.nextLine();
        System.out.println("Ha! You got it right, it is "+riddleone(riddle1answer)+", but I won't let you get away with it so quickly on the next one!");
        Scanner riddle2scanner = new Scanner(System.in);
        System.out.println("The dictionary asks: The more you take, the more you leave behind, what am I?");
        String riddle2answer = riddle2scanner.nextLine();
        System.out.println("Ugh!! You got it right again, it is "+riddletwo(riddle2answer)+", but I won't let you get away with it so quickly on the next one!");
        Scanner riddle3scanner = new Scanner(System.in);
        System.out.println("The dictionary asks: David's father has three sons, Snap, Crackle and -----?");
        String riddle3answer = riddle3scanner.nextLine();
        System.out.println("You're a genius, it is "+riddlethree(riddle3answer)+", but I won't let you get away with it so quickly on the next one!");
        System.out.println("The dictionary is now gone. Short question. TWO QUESTIONS LEFT!!!!!!!");
        Scanner riddle4scanner = new Scanner(System.in);
        System.out.println("Give me a prime number between 20 and 30.");
        int riddle4answer = riddle4scanner.nextInt();
        System.out.println("Hip hip hooray! It is "+riddlefour(riddle4answer)+", LAST ONE.");
        Scanner riddle5scanner = new Scanner(System.in);
        System.out.println("You are so close to the finish line! Another experienced hiker is trying to test you with a final question to see if you are truly qualified for the medal and to win.");
        System.out.println("Are you brave? Yes or No");
        String riddle5answer = riddle5scanner.nextLine();
        riddlefive(riddle5answer);
        System.out.println("You've won. Give yourself a pat on the back for completing this hard journey!");
    }
}