package interfaces

import javax.swing.*

class MainTeste {
    static void main(String[] args) {
            // Criação da janela
            JFrame frame = new JFrame("LinkeTinder")
            frame.setSize(600, 400)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

            // Criação do painel e componentes
            JPanel panel = new JPanel()
            frame.add(panel)
            panel.setLayout(null)

            JLabel label = new JLabel("Digite seu nome:")
            label.setBounds(10, 20, 150, 25)
            panel.add(label)

            JTextField textField = new JTextField(20)
            textField.setBounds(150, 20, 120, 25)
            panel.add(textField)

            JButton button = new JButton("Clique Aqui")
            button.setBounds(10, 80, 120, 25)
            panel.add(button)

            JLabel responseLabel = new JLabel("")
            responseLabel.setBounds(10, 110, 250, 25)
            panel.add(responseLabel)

            // Ação do botão
            button.addActionListener {
                String name = textField.getText()
                responseLabel.setText("Olá, $name!")
            }

            // Tornar a janela visível
            frame.setVisible(true)
        }
}
