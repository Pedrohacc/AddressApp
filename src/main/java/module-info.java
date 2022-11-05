module AddressApp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.xml.bind;
    requires java.prefs;

    opens br.com.pedro.addressapp to javafx.fxml;
    exports br.com.pedro.addressapp;
    exports br.com.pedro.addressapp.model;
    opens br.com.pedro.addressapp.model to javafx.fxml;
    exports br.com.pedro.addressapp.view;
    opens br.com.pedro.addressapp.view to javafx.fxml;
}