module com.fx.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.fx.javafx to javafx.fxml;
    exports com.fx.javafx;
}