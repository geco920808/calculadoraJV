import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraUI extends JFrame {
    private JTextField pantalla;
    private double num1, num2, resultado;
    private char operacion;

    public CalculadoraUI() {
        pantalla = new JTextField(10);
        pantalla.setEditable(false);

        // Crear los botones numéricos y de operaciones
        JButton boton1 = new JButton("1");
        JButton boton2 = new JButton("2");
        JButton boton3 = new JButton("3");
        JButton boton4 = new JButton("4");
        JButton boton5 = new JButton("5");
        JButton boton6 = new JButton("6");
        JButton boton7 = new JButton("7");
        JButton boton8 = new JButton("8");
        JButton boton9 = new JButton("9");
        JButton boton0 = new JButton("0");

        JButton botonSuma = new JButton("+");
        JButton botonResta = new JButton("-");
        JButton botonMultiplicacion = new JButton("*");
        JButton botonDivision = new JButton("/");
        JButton botonIgual = new JButton("=");
        JButton botonClear = new JButton("C");

        // Añadir funcionalidad a los botones numéricos
        boton1.addActionListener(e -> pantalla.setText(pantalla.getText() + "1"));
        boton2.addActionListener(e -> pantalla.setText(pantalla.getText() + "2"));
        boton3.addActionListener(e -> pantalla.setText(pantalla.getText() + "3"));
        boton4.addActionListener(e -> pantalla.setText(pantalla.getText() + "4"));
        boton5.addActionListener(e -> pantalla.setText(pantalla.getText() + "5"));
        boton6.addActionListener(e -> pantalla.setText(pantalla.getText() + "6"));
        boton7.addActionListener(e -> pantalla.setText(pantalla.getText() + "7"));
        boton8.addActionListener(e -> pantalla.setText(pantalla.getText() + "8"));
        boton9.addActionListener(e -> pantalla.setText(pantalla.getText() + "9"));
        boton0.addActionListener(e -> pantalla.setText(pantalla.getText() + "0"));

        // Funcionalidad para las operaciones
        botonSuma.addActionListener(e -> prepararOperacion('+'));
        botonResta.addActionListener(e -> prepararOperacion('-'));
        botonMultiplicacion.addActionListener(e -> prepararOperacion('*'));
        botonDivision.addActionListener(e -> prepararOperacion('/'));

        // Funcionalidad para el botón igual
        botonIgual.addActionListener(e -> realizarOperacion());

        // Funcionalidad para el botón Clear
        botonClear.addActionListener(e -> pantalla.setText(""));

        // Crear el panel y añadir los botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        panel.add(botonSuma);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(botonResta);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(botonMultiplicacion);
        panel.add(boton0);
        panel.add(botonClear);
        panel.add(botonIgual);
        panel.add(botonDivision);

        // Añadir componentes a la ventana
        add(pantalla, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // Configuración básica de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void prepararOperacion(char operacion) {
        num1 = Double.parseDouble(pantalla.getText());
        this.operacion = operacion;
        pantalla.setText("");
    }

    private void realizarOperacion() {
        num2 = Double.parseDouble(pantalla.getText());
        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    pantalla.setText("Error");
                    return;
                }
                break;
        }
        pantalla.setText(String.valueOf(resultado));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculadoraUI());
    }
}
