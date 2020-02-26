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
import java.util.List;

public class Controller {

    public Button btn100;
    public Button btn200;
    public Button btn500;
    public Button btn1000;
    public TextField txt_MontoRetirar;
    public Button btnContinuar;
    public Button btnBorrar;
    public Button btnVolver;
    public TextField txt_Saldo;
    public Button btnRetirar;
    public PasswordField txt_NIPActual;
    public PasswordField txt_NuevoNIP;
    public PasswordField txt_ConfirmacionNIP;
    public Button btnGuardar;
    public TextField txt_MontoTransferir;
    public TextField txt_NumCuentaT;
    public Button btnContinuarT;
    public MenuItem itemAgua;
    public MenuItem itemLuz;
    public MenuItem itemSaldo;
    static int Position;
    static float saldo;
    static int i=0;
    @FXML
    public void initialize() {
        if (i == 0) {
            NIPS = Cuenta.CargarCuenta();
            Position=FController.Position;
            i++;
        }
    }

    public void Volver(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage.show();
        stage = (Stage) btnVolver.getScene().getWindow();
        stage.close();
    }
    //Retirar
    public void Retirar100(ActionEvent actionEvent) {
        Position=FController.Position;
        NIPS.get(Position).saldo -= 100;
    }

    public void Retirar200(ActionEvent actionEvent) {
    }

    public void Retirar500(ActionEvent actionEvent) {
    }

    public void Retirar1000(ActionEvent actionEvent) {
    }

    public void MontoRetirar(ActionEvent actionEvent) {
    }

    public void Continuar(ActionEvent actionEvent) {
    }

    public void Borrartxt(ActionEvent actionEvent) {
    }

    //Consulta
    public void SaldoDisponible(ActionEvent actionEvent) {
    }

    public void Retirar(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Retirar.fxml"));
        stage.show();
        stage = (Stage) btnRetirar.getScene().getWindow();
        stage.close();
    }

    //CambiarNIP
    List<Tarjeta> NIPS=new ArrayList<>();
    public void Guardar(ActionEvent actionEvent) throws IOException {
        Position=FController.Position;
        if(txt_NIPActual.getText().equals(NIPS.get(Position).NIP)){
            System.out.println("Entre");
            if(txt_ConfirmacionNIP.getText().equals(txt_NuevoNIP.getText())){
                System.out.println("entre 2do");
                JOptionPane.showMessageDialog(null,"CAMBIO HECHO");
                NIPS.get(Position).NIP=txt_ConfirmacionNIP.getText();
                Cuenta.GuardarNipes(NIPS);
            }
        }


    }

    public void ConsultarSaldo(ActionEvent actionEvent) throws IOException {
        float sDisponible=saldo;
        System.out.println("yuju"+saldo);
        this.txt_Saldo.setText(String.valueOf(NIPS.get(Position).saldo));

    }
    
    //Transferencias
    public void MontoTransferir(ActionEvent actionEvent) {
    }
    
    public void NumCuentaTransferir(ActionEvent actionEvent) {
    }

    public void ContinuarT(ActionEvent actionEvent) {
    }

    //PagoServicios
    public void pagarAgua(ActionEvent actionEvent) {
    }

    public void pagarLuz(ActionEvent actionEvent) {
    }

    public void pagoSaldo(ActionEvent actionEvent) {
    }

    public void Pagar_Luz(ActionEvent actionEvent) {
    }

    public void Monto_CFE(ActionEvent actionEvent) {
    }

    public void Pago_Inter(ActionEvent actionEvent) throws IOException {
        Stage stage = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
        stage.show();
        stage = (Stage) btnVolver.getScene().getWindow();
        stage.close();

    }

    public void Pantalla_saldo(ActionEvent actionEvent) {
    }

    public void VerSaldo(ActionEvent actionEvent) {
        txt_Saldo.setText(String.valueOf(NIPS.get(Position).saldo));
    }
}
