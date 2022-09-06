# Calculon

My first simple programm on Java

In this program, I tried to follow the approach MVC

```
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
    public void getButton1(ActionEvent event) {            //listener
    }

    @FXML
    public void mouseClick(MouseEvent e){
        if((((Button) e.getSource()).getText().length())==2) {
            clr(); return;
        }

        labelAddText(((Button) e.getSource()).getText());
        opapa.nextChar(((Button) e.getSource()).getText().charAt(0));

    }

    public void oper(Operation op) {...
```
