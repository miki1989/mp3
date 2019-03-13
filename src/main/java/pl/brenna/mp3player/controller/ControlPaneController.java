package pl.brenna.mp3player.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class ControlPaneController {
    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    @FXML
    private TextField messageTextField;

    public TextField getMessageTextField() {
        return messageTextField;
    }

    public Button getPreviousButton() {
        return previousButton;
    }

    public ToggleButton getPlayButton() {
        return playButton;
    }

    public Button getNextButton() {
        return nextButton;
    }

    public Slider getVolumeSlider() {
        return volumeSlider;
    }

    public Slider getProgressSlider() {
        return progressSlider;
    }

    public void initialize(){
        System.out.println("Control controller created");
        configureButtons();
        configureSliders();
    }

    private void configureSliders(){
        volumeSlider.valueProperty().addListener(((observableValue, oldValue, newValue) -> System.out.println("Zmiana głośności "+ newValue.doubleValue())));

        progressSlider.valueProperty().addListener(x -> System.out.println("Przesunięcie piosenki"));
    }
/*
    private void configureVolume(){
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("Wciśnięto przycisk na suwaku głośności"));
    }
*/
    private void configureButtons(){
        previousButton.setOnAction(actionEvent -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(x -> System.out.println("Następna piosenka"));
        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected()){
                System.out.println("Play");
            }
            else{
                System.out.println("Stop");
            }
        });
    }
}
