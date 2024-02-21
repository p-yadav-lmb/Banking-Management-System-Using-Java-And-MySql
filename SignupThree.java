package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JRadioButton r1 , r2 , r3, r4;
    JCheckBox c1 , c2 , c3 , c4 ,c5 , c6 ,c7;
    JButton submit , cancel;
    String formno;
   public SignupThree(String formno){
       this.formno = formno;
       setTitle("Third Sign Up Page"); 
       setLayout(null);
        JLabel l1  =  new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway" , Font.BOLD , 22));
        l1.setBounds(280 , 40 , 400 , 40);    
        add(l1);
        
         JLabel type  =  new JLabel("Account Type");
        type.setFont(new Font("Raleway" , Font.BOLD , 22));
        type.setBounds(100 , 140 , 200 , 30);    
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway" , Font.BOLD , 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180 , 150 ,20);
        add(r1);
        
         r2 = new JRadioButton("Fixeed Deposit Account");
        r2.setFont(new Font("Raleway" , Font.BOLD , 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180 , 250 ,20);
        add(r2);
        
         r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway" , Font.BOLD , 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220 , 150 ,20);
        add(r3);
        
         r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway" , Font.BOLD , 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220 , 250 ,20);
        add(r4);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        
         JLabel card  =  new JLabel("Card Number");
        card.setFont(new Font("Raleway" , Font.BOLD , 22));
        card.setBounds(100 , 300 , 200 , 30);    
        add(card);
        
        JLabel number  =  new JLabel("XXXX-XXXX-XXXX-7689");
        number.setFont(new Font("Raleway" , Font.BOLD , 22));
        number.setBounds(330 , 300 , 300 , 30);    
        add(number);
        
        JLabel carddetail  =  new JLabel("Your 16 Digits Card Number");
        carddetail.setFont(new Font("Raleway" , Font.BOLD , 12));
        carddetail.setBounds(100 , 330 , 300 , 20);    
        add(carddetail);
        
         JLabel pin  =  new JLabel("PIN");
        pin.setFont(new Font("Raleway" , Font.BOLD , 22));
        pin.setBounds(100 , 370 , 200 , 30);    
        add(pin);
        
         JLabel pindetail  =  new JLabel("Your 4 Digits Password");
        pindetail.setFont(new Font("Raleway" , Font.BOLD , 12));
        pindetail.setBounds(100 , 400 , 300 , 20);    
        add(pindetail);
        
         JLabel pinnumber  =  new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway" , Font.BOLD , 22));
        pinnumber.setBounds(330 , 370 , 300 , 30);    
        add(pinnumber);
        
         JLabel services  =  new JLabel("Services Provided:");
        services.setFont(new Font("Raleway" , Font.BOLD , 18));
        services.setBounds(100 , 450 , 250 , 30);    
        add(services);
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway" , Font.BOLD , 16));
        c1.setBounds(100 , 500 , 200 , 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway" , Font.BOLD , 16));
        c2.setBounds(350 , 500 , 200 , 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway" , Font.BOLD , 16));
        c3.setBounds(100 , 550 , 200 , 30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL AND SMS ALERTS");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway" , Font.BOLD , 16));
        c4.setBounds(350 , 550 , 200 , 30);
        add(c4);
        
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway" , Font.BOLD , 16));
        c5.setBounds(100 , 600 , 200 , 30);
        add(c5);
        
        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway" , Font.BOLD , 16));
        c6.setBounds(350 , 600 , 200 , 30);
        add(c6);
        
        
        c7 = new JCheckBox("I hereby declare that the above mentioned details are correct to th best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway" , Font.BOLD , 14));
        c7.setBounds(100 , 650 , 700 , 30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway" , Font.BOLD , 14));
        submit.setBounds(250 , 700 ,100 , 30 );
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway" , Font.BOLD , 14));
        cancel.setBounds(400 , 700 , 100 ,30);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(850 , 820);
        setLocation(350 , 0);
        setVisible(true);
        
        
    }
   @Override
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == submit){
         
           String accountType ="";
           
           if(r1.isSelected()){
               accountType = "Savings Account";
           }
           else if(r2.isSelected()){
               accountType = "Fixeed Deposit Account";
           }
           else if(r3.isSelected()){
               accountType = "Current Account";
           }
           if(r4.isSelected()){
               accountType = "Recurring Deposit Account";
           }
           
           Random random = new Random();
           String cardNumber = "" + Math.abs((random.nextLong()%90000000L) + 5040936000000000L);
           String pinNumber = ""+Math.abs((random.nextLong()%9000L) + 1000L);
           
           
           String facility = "";
           if(c1.isSelected()){
               facility = facility+" ATM CARD";
           }
           if(c2.isSelected()){
               facility = facility+" Internet Banking";
           }
           if(c3.isSelected()){
               facility = facility+" Mobile Banking";
           }
           if(c4.isSelected()){
               facility = facility+" Email & SMS Alerts";
           }
           if(c5.isSelected()){
               facility = facility+" Cheque Book";
           }
           if(c6.isSelected()){
               facility = facility+" E-Statement";
           }
           facility = facility.trim();
           
           try{
               if(accountType.equals("")){
                   JOptionPane.showMessageDialog(null,"Account Type is Required");
               }
               else{
                   Conn c = new Conn();
                   String query1 = "insert into signupthree values('"+formno+"' , '"+accountType+"' ,'"+cardNumber+"' ,'"+pinNumber+"' ,'"+facility+"')";
                   String query2 = "insert into login values('"+formno+"','"+cardNumber+"' ,'"+pinNumber+"')";
                   c.s.executeUpdate(query1);
                   c.s.executeUpdate(query2);
               }
               
                 JOptionPane.showMessageDialog(null, "Card Number: "+ cardNumber+"\nPin Number: "+pinNumber);
                 
                 setVisible(false);
                 new Deposit(pinNumber).setVisible(true);
                 
                 
           }
           catch(Exception e){
               System.out.println(e);
           }
       }
       else if (ae.getSource() == cancel){
           setVisible(false);
           
           new Login().setVisible(true);
       }
   }
   
    public static void main(String[] args) {
        new SignupThree("");
    }
}
