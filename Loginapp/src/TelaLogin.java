import javax.swing.*;
import java.awt.*;

public class TelaLogin {
    public static void main(String[] args) {

        JFrame janela = new JFrame("Login - SENAI");
        janela.setSize(350, 250);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel labelEmail = new JLabel("E-mail:");
        labelEmail.setBounds(30, 20, 100, 30);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(30, 50, 270, 30);


        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(30, 90, 100, 30);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(30, 120, 270, 30);


        JButton btnLogin = new JButton("Entrar");
        btnLogin.setBounds(30, 165, 120, 35);

        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.setBounds(180, 165, 120, 35);


        JLabel mensagem = new JLabel("");
        mensagem.setBounds(30, 205, 270, 25);


        btnLogin.addActionListener(e -> {
            String email = campoEmail.getText().trim();
            String senha = new String(campoSenha.getPassword());

            if (email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(janela, "Preencha todos os campos!");
            } else if (email.equals("admin@senai.com") && senha.equals("123456")) {
                JOptionPane.showMessageDialog(janela, "Login realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(janela, "E-mail ou senha inválidos.");
            }
        });


        btnLimpar.addActionListener(e -> {
            campoEmail.setText("");
            campoSenha.setText("");
        });


        janela.add(labelEmail);
        janela.add(campoEmail);
        janela.add(labelSenha);
        janela.add(campoSenha);
        janela.add(btnLogin);
        janela.add(btnLimpar);
        janela.add(mensagem);

        janela.setVisible(true);
    }
}