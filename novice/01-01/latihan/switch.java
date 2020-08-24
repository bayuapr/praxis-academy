public class switch{

    public static void main(String args[]) {

        char grade = 'A';
        
        switch (grade) {
            case 'A':
                System.out.println("Perfact!");
                break;
            case 'B':
                System.out.println("Excellent!");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'E':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is" + grade);

    }
}