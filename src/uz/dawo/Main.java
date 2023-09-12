package uz.dawo;

import uz.dawo.healthcare.Doctor;
import uz.dawo.healthcare.ORLdoctor;
import uz.dawo.healthcare.Surgeon;

public class Main {

    public static void main(String[] args) {

//        Surgeon
        Doctor surgeon = new Surgeon("Ali","Valiyev","Surgeon", 123456, 12);
        System.out.println(surgeon.getFirstName());
        System.out.println(surgeon.getLastName());
        System.out.println(surgeon.getSpecialization());
        System.out.println(surgeon);

//        ORL doctor
        Doctor orl = new ORLdoctor("Soli","Dalimov","OrthoRinhoLaringology",654321,2);
        System.out.println(orl.getFirstName());
        System.out.println(orl.getLastName());
        System.out.println(orl.getYearOfExperiance());
        System.out.println(orl);
    }
}
