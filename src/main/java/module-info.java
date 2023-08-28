module com.employeemanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.employeemanagement to javafx.fxml;
    exports com.employeemanagement;
}