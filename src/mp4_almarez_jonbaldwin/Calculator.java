/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mp4_almarez_jonbaldwin;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Calculator extends JFrame implements ActionListener{
    private JPanel panel = new JPanel();
    
    private JLabel LabelCal = new JLabel("Calculator");
    private JTextField InputOne = new JTextField("0");
    private JTextField InputTwo = new JTextField("0");
    private JTextField Result = new JTextField("=");
    
    private JButton AdditionButton = new JButton("+");
    private JButton SubtractionButton = new JButton("-");
    private JButton MultiplicationButton = new JButton("*");
    private JButton DivisionButton = new JButton("/");
    private JButton ResetButton = new JButton("Reset");
    private JButton ExitButton = new JButton("Exit");
    
    JButton[] functionButtons = new JButton[6]; // Function for the buttons
    
    double input1 = 0, input2 = 0, result = 0;
    char operator;
    
    public Calculator(){
        super("Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 500);
        this.setLocation(150, 50);
        this.setVisible(true);
        
        panel.setBackground(Color.gray);
        
        
// Call this to add fuctionality
        functionButtons[0] = AdditionButton;
        functionButtons[1] = SubtractionButton;
        functionButtons[2] = MultiplicationButton;
        functionButtons[3] = DivisionButton;
        
        functionButtons[4] = ResetButton;
        functionButtons[5] = ExitButton;
        
        InputOne.setBounds(50, 25, 300, 50);
        InputTwo.setBounds(50, 25, 300, 50);
        Result.setBounds(50, 25, 300, 50);
        
// Uneditable        
        
        Result.setEditable(false);
        
// Set the size
        LabelCal.setFont((new java.awt.Font("Calibri", 0, 20)));
        LabelCal.setSize(100, 100);
        InputOne.setSize(100, 30);
        InputTwo.setSize(100, 30);
        Result.setSize(100, 30);

        AdditionButton.setSize(100, 30);
        SubtractionButton.setSize(100, 30);
        MultiplicationButton.setSize(100, 30);
        DivisionButton.setSize(100, 30);
        ResetButton.setSize(100, 30);
        ExitButton.setSize(100, 30);
//Set location
        LabelCal.setLocation(300, 50);
        InputOne.setLocation(150, 40);
        InputTwo.setLocation(30, 40);
        Result.setLocation(300, 40);

        AdditionButton.setLocation(30, 100);
        SubtractionButton.setLocation(30, 150);
        MultiplicationButton.setLocation(30, 200);
        DivisionButton.setLocation(30, 250);
        
        ResetButton.setLocation(30, 400);
        ExitButton.setLocation(30, 430);
        
// Define panel
        this.panel.setLayout(null);
        this.setContentPane(panel);
//Add component
        this.getContentPane().add(LabelCal);
        this.getContentPane().add(InputOne);
        this.getContentPane().add(InputTwo);
        this.getContentPane().add(Result);

        this.getContentPane().add(AdditionButton);
        this.getContentPane().add(SubtractionButton);
        this.getContentPane().add(MultiplicationButton);
        this.getContentPane().add(DivisionButton);
        this.getContentPane().add(ResetButton);
        this.getContentPane().add(ExitButton);
        
// Listen for action
        for(int i = 0; i < 6; i++){
            functionButtons[i].addActionListener(this);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        // Get the values

        if(e.getSource() == functionButtons[0]){
            input1 = Double.parseDouble(InputOne.getText());
            input2 = Double.parseDouble(InputTwo.getText());
            operator = '+';
        }
        if(e.getSource() == functionButtons[1]){
            input1 = Double.parseDouble(InputOne.getText());
            input2 = Double.parseDouble(InputTwo.getText());
            operator = '-';
        }
        if(e.getSource() == functionButtons[2]){
            input1 = Double.parseDouble(InputOne.getText());
            input2 = Double.parseDouble(InputTwo.getText());
            operator = '*';
        }
        if(e.getSource() == functionButtons[3]){
            input1 = Double.parseDouble(InputOne.getText());
            input2 = Double.parseDouble(InputTwo.getText());
            operator = '/';
        }
        switch(operator){
            case '+' :
                 result = input1 + input2;
                 break;
            case '-' :
                 result = input1 - input2;
                 break;
            case '*' :
                 result = input1 * input2;
                 break;
            case '/' :
                 result = input1 / input2;
                 break;
         }
            Result.setText(String.valueOf(result));
            
        if(e.getSource() == functionButtons[4]){
            Result.setText("0");
            InputOne.setText("0");
            InputTwo.setText("0");
        }
        if(e.getSource() == functionButtons[5]){
            System.exit(0);
        }
            
        }
    }
    
    

