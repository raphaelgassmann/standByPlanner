package standByPlanner.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    @FXML private TextField txtName;
    @FXML private TextField txtPhone;
    @FXML private TextField txtTeam;

    @FXML
    public void initialize(){
        System.out.println("does this run first"); //YES
        Manager manager = new Manager();

    }
    
    //Button Event add Employee
    public void addEE(ActionEvent event){
        System.out.println(txtName.getText());
        System.out.println(txtPhone.getText());
        System.out.println(txtTeam.getText());

    }

}
