import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame {
   static List profitList = new List();
   static List infoList = new List();
   static JPanel panel = new JPanel();
   static Container content;

   static boolean month = false;
   static boolean info = false;

   public MainFrame() {
      setTitle("Ewha Gym");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
   // 메뉴 버튼 생성
      JButton branchBtn = new JButton("Branch Information");
      JButton registerBtn = new JButton ("Sign Up");
      JButton memberBtn = new JButton("My Page");
      JButton trainerBtn = new JButton("PT Application / Change Trainer");
      JButton employeeBtn = new JButton("Staff Page");
      JButton enrollBtn = new JButton("Buy Membership");
      
	// 각 메뉴 버튼을 클릭하면 해당 프레임을 생성한다.
      branchBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
        	 new BranchFrame();
         }
      });
      registerBtn.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new RegisterFrame();
		}
    	  
      });
      memberBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new MyPageFrame();
         }

      });
      trainerBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
           new TrainerFrame();
         }
      });
      enrollBtn.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  new EnrollFrame();
    	  }
      });
      employeeBtn.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			new EmployeeFrame();
		}
      });

   // Container에 패널 추가하기
      content = getContentPane();
      content.setLayout(new FlowLayout());
      content.add(new JLabel("<html><body style='text-align:center;'>"
      		+ "----------------------------------------------------------------------------------<br/>"
      		+ "Hello!<br/>"
      		+ "Welcome to Ewha Gym.<br/>"
      		+ "Please choose the service.<br/>"
      		+ "</body></html>"));
      content.add(new JLabel("<html><body style='text-align:center;'>"
        		+ "----------------------------------------------------------------------------------<br/>"
        		+ "* Branch Information Inquiry *<br/>"
        		+ "</body></html>"));
      content.add(branchBtn);
      content.add(new JLabel("<html><body style='text-align:center;'>"
      		+ "----------------------------------------------------------------------------------<br/>"
      		+ "* Member Service *<br/>"
      		+ "</body></html>"));
      content.add(registerBtn);
      content.add(memberBtn);
      content.add(enrollBtn);
      content.add(trainerBtn);
      content.add(new JLabel("<html><body style='text-align:center;'>"
      		+ "----------------------------------------------------------------------------------<br/>"
      		+ "* Staff Service *<br/>"
      		+ "</body></html>"));
      content.add(employeeBtn);
      
      setSize(350, 700);
      setVisible(true);
   }
}
