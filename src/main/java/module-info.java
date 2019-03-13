module mp3player {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires jid3lib;
    requires javafx.media;

    exports pl.brenna.mp3player.main to javafx.graphics;
    opens pl.brenna.mp3player.controller to javafx.fxml;
    opens pl.brenna.mp3player.mp3 to javafx.base;
}