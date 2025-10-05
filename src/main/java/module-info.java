module arkanoid.arkanoid {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;


    // Allow JavaFX to construct Application and access controllers if needed
    exports arkanoid.arkanoid.gamemanager;
    opens arkanoid.arkanoid.gamemanager to javafx.graphics, javafx.fxml;

    // Export and open UI for FXML/JavaFX access
    exports arkanoid.arkanoid.userinterface;
    opens arkanoid.arkanoid.userinterface to javafx.graphics, javafx.fxml;

    // Export game objects if needed by other modules
    exports arkanoid.arkanoid.gameobject;
    opens arkanoid.arkanoid.gameobject to javafx.graphics;
}