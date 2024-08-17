package Aug12;
class AgeCheckException extends Exception{
    public AgeCheckException(String s) {
         super(s);
    }
}
class UserAge{
    public void ageCheck(int age) {
        try {
            if(age<18) {
                throw new AgeCheckException("Not Elgible to vote");
            }else {
                System.out.println("You can vote");
            }
        }catch(AgeCheckException e) {
            e.printStackTrace();
        }
    }
}

public class UserDefinedExceptionMain {
	public static void main(String[] args) {
        int age=15;
        UserAge obj = new UserAge();
        obj.ageCheck(age);
    }

}
