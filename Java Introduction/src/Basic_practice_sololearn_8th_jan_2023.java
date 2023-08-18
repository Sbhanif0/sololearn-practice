// Java Basic (Print, Data Type, Operator, Conditional, Switch, Loops).
public class Basic_practice_sololearn_8th_jan_2023{

    public static void main(String[] args) {

        System.out.println("Topic : Java Program");

        //Variables (String, int, double, long, float, char, boolean, byte, bit.)
        //Primitive Operators (Addition+, Subtraction-, Multiplication*, Division/, Modulo%.)

        System.out.println("Declaring 8 Primitive Data Types :");
        //int
        int fst = 60;
        int fst1 = 50;
        int fst3 = fst + fst1;
        System.out.println("int = "+fst3);

        //String
        String firstName= "md. abu";
        String lastName = "hanif";
        System.out.println("String = "+firstName+" "+lastName);

        //double
        double afc = 12.0;
        double bfc = 18.09;
        double cfc = afc+bfc;
        System.out.println("double ="+cfc);

        //long L
        long bln = 6475882323232392388L;
        long bln1 = 1289098765432109878L;
        long bln3 = 5000000000000000000L;
        long bln4 = 500000000000000L;
        long blnr=bln3*bln4;
        System.out.println("long ="+bln+"\n"+"long ="+bln1+"\n"+"long ="+blnr);

        //float f
        float bnp = 46f;
        float bnp1= 5f;
        System.out.println("float ="+bnp%bnp1);

        //char
        char abc= 'H';
        char number = '9';
        char symbol= '$';
        System.out.println("char ="+abc+" "+number+" "+symbol);

        //boolean
        boolean isHanif = true;
        System.out.println("boolean ="+isHanif);

        //byte
        byte bts = 127;
        System.out.println("byte ="+bts);
        //bit ()
        
        /*
        Scanner usrin = new Scanner(System.in);
        String user = usrin.nextLine();
        System.out.println(user);
        */

        //Logical Operators (OR || Operator, And And && Operator, Not ! Operator.)
        //Conditional Statement (if, else, else if)
        int prp = 10;
        int brb = 30;
        int trt = 50;
        int jrj = 60;

        //OR Operator
        if(prp < brb || trt > jrj){
            System.out.println("OR || Operator True");
        } else{
            System.out.println("OR || Operator False");
        }

        // && Operator
        if(prp < brb && trt < jrj){
            System.out.println("And And && Operator True");
        } else{
            System.out.println("And And && Operator False");
        }

        //NOT ! Operator
        if (!(prp > brb)){
            System.out.println("NOT ! Operator True");
        } else{
            System.out.println("NOT ! Operator False");
        }

        //Variable
        int hrh = 40;
        int grg = 30;
        int nrn = 20;

        //Multiple Condition check
        if (nrn < grg){
            System.out.println("First If Condition is True");
        }
        else if (hrh > grg){
            System.out.println("Else If condition is Fire");
        }
        else {
            System.out.println("Both Condition is False");
        }

        //Nested if Condition
        int usrInt = 18;
        if (usrInt > 0){
            if ( usrInt >=18){
                System.out.println("Welcome To This App!!!");
            } else {
            System.out.println("You Are Not 18+");
        }
        } else {
            System.out.println("Condition is False");
        }

        // increment
        // Postfix
        int x = 2;
        x++;
        int t = x;
        System.out.println(t+ " Increment Postfix");

        // Prefix
        int p = 2;
        int l = ++p;
        // l += l+1; 
        // l += ++l; 7
           l += l;
        System.out.println(l+ " Increment Prefix");

        // Decrement
        // Postfix
        int u = 2;
        int o = u--; // Use postfix on up statement;
        System.out.println(o+ " Decrement Postfix");

        // Prefix
        int r = 6;
        int m = --r;
        System.out.println(m+ " Decrement Prefix");

        // Switch Statement
        // Cannot Use continue Statement in switch Statement
        int h = 0;
        switch (h){
             case 0:
            System.out.println("Friday");
            case 1:
            System.out.println("Saturday");
            break;
            case 2:
            System.out.println("Sunday");
            // break;
            default:
            System.out.println("Monday");
        }

        // loops (while, for, do while)
        // for loop
        for (int it = 0; it < 9; it++){
            // Terminate the loop when (it) Variable is 3
            if (it == 3)
                break;
                System.out.println("break uses: "+it);
        }

        // while loop
        int otp = 7;
               //Condition 
        while (otp <= 8){
            System.out.println(otp+" Expresion otp increase until Condition Value");
            ++otp; //Expresion otp increase until Condition Value
        //  otp++;
        }
/*
        int otr = 10;
        while (otr > 8){
            System.out.println(otr+" abu hanif");
            otr++; //Variable otr increase Infinity with integer datatype
        }

        int ott = 6;
        while (ott <= 8){
            System.out.println(ott+" abu hanif");
            ott--; //Variable ott Decrease Infinity with integer datatype
        }
*/
        int otk = 20;
        while (otk >= 19){
            System.out.println(otk+" Variable ott Decrease until condition value");
            otk--; //Variable ott Decrease until condition value
        }

        // do while
        int mnp = 6;
        do {
            System.out.println(mnp+" Result 1 do while loop prints at least one guaranteed value");
            mnp++;
        } while (mnp < 8);
    
         do {
            System.out.println(mnp+" do while loop prints at least one guaranteed value");
            mnp++;
        } while (mnp < 1);

        // Loan Calculator (Quiz Passed)
        int amount = 20000;
        for (int months = 1; months <= 3; months++){
            amount -= amount / 10;
            if (months == 3){System.out.println(amount+ " Loan Claculator "+months);}
        }
        System.out.println();
        System.out.println(amount+ " Loan Claculator Result"); //(+months) is an error outside of for loop


// switch, loops,
	}
}
