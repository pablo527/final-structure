package co.edu.unaula.DataStructure.recursive;

public class RecursiveFact {
    private double Factorial;
    private final int NUMEROMENOSUNO = -1;
    private final int NUMEROUNO = 1;
    private final int NUMEROCERO = 0;


    public RecursiveFact(){
        Factorial = 0;
    }

    public double calcFactRecur(int number){

        if(validate(number)){
            System.out.println("El número: "+ number + " es incorrecto" );
            return NUMEROMENOSUNO;
        }
        if (number == NUMEROCERO){
            return NUMEROUNO;
        }
        Factorial = number * (calcFactRecur(number -1));
        return Factorial;
    }

    private boolean validate(int Number){
        return (Number <0);
    }
}
