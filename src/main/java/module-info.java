module pl.galusgaming.bibliotekagraficzna {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens pl.galusgaming.bibliotekagraficzna to javafx.fxml;
    exports pl.galusgaming.bibliotekagraficzna;
}