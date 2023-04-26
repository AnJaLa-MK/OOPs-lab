import java.util.*;
class Complex {
int real, imaginary;
Complex(){}
Complex(int tempReal, int tempImaginary){
real = tempReal;
imaginary = tempImaginary;
}
Complex addComp(Complex C1, Complex C2){
Complex temp = new Complex();
temp.real = C1.real + C2.real;
temp.imaginary = C1.imaginary + C2.imaginary;
return temp;
}
Complex subtractComp(Complex C1, Complex C2){
Complex temp = new Complex();
temp.real = C1.real - C2.real;
temp.imaginary = C1.imaginary - C2.imaginary;
return temp;
}
void printComplexNumber(){
System.out.println("Complex number: "
+ real + " + "
+ imaginary + "i");
}
}
public class ComplexNumber {
public static void main(String[] args){
System.out.println("Anjala Michael\n22mca007\nOOPS LAB\n20MCA132\nDate:26-03-2023");


Complex C1 = new Complex(5, 2);
C1.printComplexNumber();
Complex C2 = new Complex(8, 7);
C2.printComplexNumber();
Complex C3 = new Complex();
C3 = C3.addComp(C1, C2);
System.out.print("Sum of ");
C3.printComplexNumber();
}
}
