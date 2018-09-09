package sample;

public class Operation {

    float result;
    Controller cntr = new Controller();

//    public float sum(float x, float y) {
//        return x + y;
//    }

    Operationaible pl = (x,y )->(x+y);
    Operationaible min = (x,y)->x-y;
    Operationaible mult = (x,y)->x*y;
    Operationaible div = (x,y)->x/y;

    String num1 = new String();
    String num2 = new String();
    String op;

    public void nextChar(char ch) {
        if (ch >= '0' && ch <= '9') {

            if (op != null) {
                num2 += ch;
            } else {
                num1 += ch;
            }
        } else {
            if (ch == '=') {
                rez(num1, num2);
                num1 = "";
                num2 = "";
                op=null;
            } else op = Character.toString(ch);
        }
    }

    private void rez(String n1, String n2) {
        float num1 = Integer.parseInt(n1);
        float num2 = Integer.parseInt(n2);

        switch (op){
            case "+" : {result = pl.xxx(num1, num2);  break;}
            case "-" : {result = min.xxx(num1, num2); break;}
            case "*" : {result = mult.xxx(num1, num2); break;}
            case "/" : {result = div.xxx(num1, num2); break;}
        }
        cntr.labelAddText(String.valueOf(result));
    }

    public void setCntr(Controller cntr) {
        this.cntr = cntr;
//        мы так сделали,
//        чтобы из Controller вызывать методы Operation,
//        а из Operation методы Controller
    }


}
