module MedicalStore.MS {
    requires javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires javafx.swing;
    requires javafx.swt;

    opens main;
    opens main_view;
    opens module1;
    opens module2;
}