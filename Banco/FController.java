package com.mycompany.app;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.graalvm.compiler.phases.common.NodeCounterPhase;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class FController {

    public Button btnRetirar;
    public Button btnConsulta;
    public Button btnTransferencia;
    public Button btnCambiarNIP;
    public Button btnPago;
    public TextField txt_NumeroCuenta;
    public PasswordField txt_NIP;
    public Button btn_Entrar;
    static int Position;
    @FXML
    public void initialize() {

    }

    Cuenta Y = new Cuenta();

    @FXML
    public void Entrar() {
         Position = (Y.validarCuenta(txt_NumeroCuenta.getText(), txt_NIP.getText()));
        if (Position != -1) {
            Stage stage = (Stage) btn_Entrar.getScene().getWindow();
            stage.close();

        }
    }

    public void Retirar(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Retirar.fxml"));
        stage.show();
        stage = (Stage) btnRetirar.getScene().getWindow();
        stage.close();
    }

    public void Consulta(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Consulta.fxml"));
        stage.show();
        stage = (Stage) btnConsulta.getScene().getWindow();
        stage.close();
    }

    public void Transferencia(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Transferencia.fxml"));
        stage.show();
        stage = (Stage) btnTransferencia.getScene().getWindow();
        stage.close();
    }

    public void CambiarNIP(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/CambioNIP.fxml"));
        stage.show();
        stage = (Stage) btnCambiarNIP.getScene().getWindow();
        stage.close();
    }

    public void Pago(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/PagoServicios.fxml"));
        stage.show();
        stage = (Stage) btnPago.getScene().getWindow();
        stage.close();
    }

}
