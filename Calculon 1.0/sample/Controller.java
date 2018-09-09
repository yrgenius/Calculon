package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class Controller  {

    Operation opapa;

    @FXML
    Button button1;
    @FXML
    private Label label;

    @FXML
    public void getButton1(ActionEvent event) {                    //listener
//        labelAddText(((Button) event.getSource()).getText());
//        opapa.nextChar(((Button) event.getSource()).getText().charAt(0));
    }

    @FXML
    public void mouseClick(MouseEvent e){                  //listener ничего не должен возвращать
        if((((Button) e.getSource()).getText().length())==2) {
            clr(); return;
        }

        labelAddText(((Button) e.getSource()).getText());
        opapa.nextChar(((Button) e.getSource()).getText().charAt(0));

    }

    public void oper(Operation op) {
        opapa = op;
        opapa.setCntr(this);
//        мы так сделали,
//        чтобы из Controller вызывать методы Operation,
//        а из Operation методы Controller
    }

    public void labelAddText(String s) {
        label.setText(label.getText() + s);
    }

    public void clr(){
        label.setText("");
    }


}
