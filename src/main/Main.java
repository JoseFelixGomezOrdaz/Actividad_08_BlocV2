package main;
import views.ViewBlocV1;
import models.ModelBlocV1;
import controllers.ControllerBlocV1;
/**
 *
 * @author Jose Felix
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelBlocV1 modelBlocV1 = new ModelBlocV1();
        ViewBlocV1 viewBlocV1 = new ViewBlocV1();
        ControllerBlocV1 controllerBlocV1 = new ControllerBlocV1(modelBlocV1 , viewBlocV1 );
    }
    
}
