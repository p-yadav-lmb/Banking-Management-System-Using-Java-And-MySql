
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    
    JComboBox religionField , categoryField , incomeField , educationField , occupationField;
    JTextField panTextField , aadharTextField ;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    String formno;
    public SignupTwo(String formno){
       setTitle("NEW ACCOUNT APPLICATION FORM PAGE-2");
       setLayout(null);
       
       this.formno = formno;
       
       
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
       additionalDetails.setFont(new Font("Raleway" , Font.BOLD ,22));
       additionalDetails.setBounds(290 , 80 ,400 , 30);
       add(additionalDetails);
       
       JLabel religion = new JLabel("Religion:");
       religion.setFont(new Font("Raleway" , Font.BOLD ,20));
       religion.setBounds(100 , 140 ,100 , 30);
       add(religion);
           
       
        String[] valReligion = {"Hindu" , "Muslim " ,"Sikh" , "Chrishtian","Jain"};
         religionField = new JComboBox(valReligion);
        religionField.setBounds(300 , 140 , 300 , 30);
        religionField.setBackground(Color.WHITE);
        add(religionField);
       
       
       JLabel category = new JLabel("Category:");
       category.setFont(new Font("Raleway" , Font.BOLD ,20));
       category.setBounds(100 , 190 ,200 , 30);
       add(category);
       
       String[] categoryVal = {"General" , "OBC " ,"SC" , "ST","Others"};
         categoryField = new JComboBox(categoryVal);
       categoryField.setBounds(300 , 190 , 300 , 30);
       add(categoryField);
       
       
       
       JLabel income = new JLabel("Income:");
       income.setFont(new Font("Raleway" , Font.BOLD ,20));
       income.setBounds(100 , 240 ,200 , 30);
       add(income);
       
       String[] incomeVal = {"<1,50,000" , "<2,50,000" ,",5,00,000" , "upto 10,00,000" , "> 10,00,000"};
         incomeField = new JComboBox(incomeVal);
       incomeField.setBounds(300 , 240 , 300 ,30);
       incomeField.setBackground(Color.WHITE);
       add(incomeField);
       
       JLabel eduactional = new JLabel("Educational");
       eduactional.setFont(new Font("Raleway" , Font.BOLD ,20));
       eduactional.setBounds(100 , 290 ,200 , 30);
       add(eduactional);
       
       JLabel qualification = new JLabel("Qualification:");
       qualification.setFont(new Font("Raleway" , Font.BOLD ,20));
       qualification.setBounds(100 , 320 ,200 , 30);
       add(qualification);
       
       String[] educationVal = { "High School","Graduate"  ,"Post-Graduate","PHD"  };
         educationField = new JComboBox(educationVal);
       educationField.setBounds(300 , 290 , 300 ,30);
       educationField.setBackground(Color.WHITE);
       add(educationField);
       
      
       
       
       JLabel occupation     = new JLabel("Occupation:");
       occupation.setFont(new Font("Raleway" , Font.BOLD ,20));
       occupation.setBounds(100 , 370 ,200 , 30);
       add(occupation);
       
       String[] occupationVal = { "Salaried","Student"  ,"Self- Employed","Retired"  };
         occupationField = new JComboBox(occupationVal);
       occupationField.setBounds(300 , 370 , 300 ,30);
       occupationField.setBackground(Color.WHITE);
       add(occupationField);
       
       
        
       
       JLabel pan = new JLabel("PAN Number:");
       pan.setFont(new Font("Raleway" , Font.BOLD ,20));
       pan.setBounds(100 , 420 ,200 , 30);
       add(pan);
       
         panTextField = new JTextField();
       panTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        panTextField.setBounds(300 , 420 , 300 , 30);
       add( panTextField);
       
       JLabel aadhar = new JLabel("Aadhaar Number:");
       aadhar.setFont(new Font("Raleway" , Font.BOLD ,20));
       aadhar.setBounds(100 , 470 ,200 , 30);
       add(aadhar);
       
        aadharTextField = new JTextField();
       aadharTextField.setFont(new Font("Raleway" , Font.BOLD , 14));
        aadharTextField.setBounds(300 , 470 , 300 , 30);
       add(aadharTextField);
       
       
       JLabel senior = new JLabel("Senior Citizen:");
       senior.setFont(new Font("Raleway" , Font.BOLD ,20));
       senior.setBounds(100 , 520 ,200 , 30);
       add(senior);
       
        syes = new JRadioButton("Yes");
       syes.setBounds(300, 520, 60, 30);
       add(syes);
       
        sno = new JRadioButton("No");
        sno.setBounds(380 , 520 , 60 , 30);
        add(sno);
        
       ButtonGroup seniorGroup = new ButtonGroup();
       seniorGroup.add(syes);
       seniorGroup.add(sno);
       
 
       
       JLabel existing = new JLabel("Existing Account:");
       existing.setFont(new Font("Raleway" , Font.BOLD ,20));
       existing.setBounds(100 , 570 ,200 , 30);
       add(existing);
       
       
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 570, 60, 30);
        add(eyes);
       
        eno = new JRadioButton("No");
        eno.setBounds(380 , 570 , 60 , 30);
        add(eno);
        
       ButtonGroup existingGroup = new ButtonGroup();
       existingGroup.add(eyes);
       existingGroup.add(eno);
             
       
       next = new JButton("NEXT");
       next.setForeground(Color.WHITE);
       next.setBackground(Color.BLACK);  
       next.setFont(new Font("Raleway" , Font.BOLD , 14) );
       next.setBounds(620 , 660 , 80 , 30);
       next.addActionListener(this);
       add(next);
      
       getContentPane().setBackground(Color.WHITE);
        setSize(850 ,800);
        setLocation(350 , 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//        String formno =  "" +random; // long to string 
        String sreligion = (String) religionField.getSelectedItem();
        String scategory = (String) categoryField.getSelectedItem();
        String sincome = (String) incomeField.getSelectedItem();
        String seducation  = (String) educationField.getSelectedItem();
        String soccupation  = (String) occupationField.getSelectedItem();
        String seniorCitizen = null; 
        if(syes.isSelected()){
           seniorCitizen = "Yes";
        }
        else if(sno.isSelected()){
            seniorCitizen = "No";    
        }
        
         String existingAccount = null; 
        if(eyes.isSelected()){
           existingAccount = "Yes";
        }
        else if(eno.isSelected()){
            existingAccount = "No";    
        }

        String span = panTextField.getText();
        String saadhar = aadharTextField.getText();

        
        try{
               
                Conn c = new Conn();
                String query = "insert into  signuptwo values('"+formno+"' , '"+sreligion+"' ,'"+scategory+"' ,'"+sincome+"' ,'"+seducation+"' ,'"+soccupation+"' ,'"+span+"' ,'"+saadhar+"' ,'"+seniorCitizen+"' ,'"+existingAccount+"')";    
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno);
                
        }            
        catch(Exception e){
            System.out.println(e);
        }
}     
    public static void main(String[] args) {
            new SignupTwo("");
    }
}
