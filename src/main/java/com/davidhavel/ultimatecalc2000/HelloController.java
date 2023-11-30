package com.davidhavel.ultimatecalc2000;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.math.BigDecimal;

public final class HelloController {
    public Button deleno;

    public Button krat;

    public Button minus;

    public Button plus;

    public Button rovnase;

    public Button AC;

    public Button C;

    public Button devet;

    public Button osm;

    public Button sedm;

    public Button sest;

    public Button pet;

    public Button ctyri;

    public Button tri;

    public Button dva;

    public Button jedna;

    public Button nula;

    public Button tecka;
    private BigDecimal left;
    private String selectedOperator;
    private boolean numberInputting;

    @FXML
    public TextField display;

    public HelloController() {
        this.left = BigDecimal.ZERO;
        this.selectedOperator = "";
        this.numberInputting = false;
    }

    @FXML
    protected void handleOnAnyButtonClicked(ActionEvent evt) {
        Button button = (Button)evt.getSource();
        final String buttonText = button.getText();
        if (buttonText.equals("C") || buttonText.equals("AC")) {
            if (buttonText.equals("AC")) {
                left = BigDecimal.ZERO;
            }
            selectedOperator = "";
            numberInputting = false;
            display.setText("0");;
            return;
        }
        if (buttonText.matches("[0-9\\.]")) {
            if (!numberInputting) {
                numberInputting = true;
                display.clear();
            }
            display.appendText(buttonText);
            return;
        }

        if (buttonText.matches("[＋－×÷]")) {
            left = new BigDecimal(display.getText());
            selectedOperator = buttonText;
            numberInputting = false;
            return;
        }
        if (buttonText.equals("=")) {
            final BigDecimal right = numberInputting ? new BigDecimal(display.getText()) : left;
            left = calculate(selectedOperator, left, right);
            display.setText(left.toString());
            numberInputting = false;
        }
    }

    BigDecimal calculate(String operator, BigDecimal left, BigDecimal right) {
        switch (operator) {
            case "＋":
                return left.add(right);
            case "－":
                return left.subtract(right);
            case "×":
                return left.multiply(right);
            case "÷":
                if (!right.equals(BigDecimal.ZERO)) {
                    return left.divide(right, 10, BigDecimal.ROUND_HALF_UP);
                } else {
                    System.err.println("CHYBA: NEDĚL NULOU TY NULO!");
                    display.setText("CHYBA: NEDĚL NULOU TY NULO!");
                    return BigDecimal.ZERO;
                }
            default:
        }
        return right;
    }}