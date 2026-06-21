class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {
    static void checkAge(int age) throws InvalidAgeException{
        if (age<18) {
            throw new InvalidAgeException("Age must be greater than 18");
        } else{
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(14);
        } catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
    
}
