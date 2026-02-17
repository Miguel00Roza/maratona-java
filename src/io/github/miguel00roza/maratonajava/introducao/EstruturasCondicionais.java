package io.github.miguel00roza.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // if
        int ageOne = 19;
        boolean isOfLegalAge = ageOne >= 18;
        if (isOfLegalAge) {
            System.out.println("Is of legal age");
        }

        // else - else if
        int ageTwo = 20;
        // age < 15 - children's category
        // age >= 15 && < 18 - youth category
        // age >= 18 - adult category
        if (ageTwo >= 18) {
            System.out.println("He is adult category");
        } else if (ageTwo >= 15) {
            System.out.println("He is youth category");
        } else {
            System.out.println("He is children's category");
        }

        // Operador ternário

        double salary = 200;
        String donateMessage = "I'll give 500 dollars to you";
        String noDonateMessage = "I can't donate for now because I don't have any money";
        String result = (salary >= 500) ? donateMessage : noDonateMessage;
        System.out.println(result);

        // Switch
        // Imprima o dia da semana considerando 1 como domingo
        byte day = 1;
        switch (day){
            case 1:
                System.out.println("It's Sunday");
                break;
            case 2:
                System.out.println("It's Monday");
                break;
            case 3:
                System.out.println("It's Tuesday");
                break;
            case 4:
                System.out.println("It's Wednesday");
                break;
            case 5:
                System.out.println("It's Thursday");
                break;
            case 6:
                System.out.println("It's Friday");
                break;
            case 7:
                System.out.println("It's Saturday");
                break;
            default:
                System.out.println("That day doesn't exist");
        }

    }
}
