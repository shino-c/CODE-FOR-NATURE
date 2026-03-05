module com.unknownvariables.prototype {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires com.azure.communication.email;


    opens com.unknownvariables.prototype to javafx.fxml;
    exports com.unknownvariables.prototype;
}