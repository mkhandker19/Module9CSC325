// GarmentSimulatorFX.java
package garmentsimulator;

import garmentsimulator.factories.GarmentFactory;
import garmentsimulator.factories.ProfessionalFactory;
import garmentsimulator.factories.CasualFactory;
import garmentsimulator.factories.PartyFactory;
import garmentsimulator.products.Top;
import garmentsimulator.products.Pant;
import garmentsimulator.products.Shoe;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Garment Simulator");

        ComboBox<String> styleComboBox = new ComboBox<>();
        styleComboBox.getItems().addAll("Professional", "Casual", "Party");

        Label topLabel = new Label("Top: ");
        Label pantLabel = new Label("Pant: ");
        Label shoeLabel = new Label("Shoe: ");

        VBox root = new VBox(10, styleComboBox, topLabel, pantLabel, shoeLabel);
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();

        styleComboBox.setOnAction(event -> {
            String selectedStyle = styleComboBox.getValue();
            GarmentFactory factory;

            switch (selectedStyle) {
                case "Professional":
                    factory = new ProfessionalFactory();
                    break;
                case "Casual":
                    factory = new CasualFactory();
                    break;
                case "Party":
                    factory = new PartyFactory();
                    break;
                default:
                    factory = null;
            }

            if (factory != null) {
                Top top = factory.createTop();
                Pant pant = factory.createPant();
                Shoe shoe = factory.createShoe();
                topLabel.setText("Top: " + top.getDescription());
                pantLabel.setText("Pant: " + pant.getDescription());
                shoeLabel.setText("Shoe: " + shoe.getDescription());
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}