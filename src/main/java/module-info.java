module com.martyniuk.cmirdesktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.martyniuk.cmirdesktop to javafx.fxml;
    exports com.martyniuk.cmirdesktop;
}