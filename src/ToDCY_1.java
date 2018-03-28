import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class ToDCY_1 extends JFrame implements ActionListener
{
	
	//登陆界面代码start
	JFrame jf1;//登陆界面
	JPanel jpl1;//jf1中的整体布局
	JPanel jpl2;//jf1中的上方布局
	JPanel jpl3;//jf1中的中方布局
	JPanel jpl3_temp;//jpl3中的临时布局，用于解决jtf1和jpf1中的text区域被无限放大的问题
	JPanel jpl4;//jf1中的下方布局
	JButton jbt1;//jf1中的确认
	JButton jbt2;//jf1中的重置
	JButton jbt3;//jf1中的退出
	JLabel jlb1;//用户名
	JLabel jlb2;//密码
	JLabel jlb3;//提示输入用户名和密码
	JTextField jtf1;//用户名
	JPasswordField jpf1;//密码
	String[] UserName=new String[100];
	String[] UserPassword=new String[100];
	int TotalOfUser=4;
	//登陆界面代码end
	
	//选择界面代码start
    JFrame jf2;//第一张照片和第二张照片的选择界面
    JPanel jpl5;//jf2中的整体布局
    JPanel jpl6;//jf2中的上方布局
    JPanel jpl7;//jf2中的中间布局
    JPanel jpl8;//jf2中的下方布局
    JComboBox jcb1;//第一张照片与第二张照片的选择
    String[] com=new String[2];//选择列表项目数组
    JButton jbt4;//jf2中的确认
    JButton jbt5;//jf2中的退出
    //选择界面代码end
    
    //第一个图片界面代码start
    JFrame jf3;//第一张照片界面
    JPanel jpl9;//jf3中的整体布局
    JPanel jpl11;//jpl9中的上方布局
    JPanel jpl12;//jpl9中的中间布局
    JPanel jpl13;//jpl9中的下方布局
    ImageIcon Icon1;//第一个图片照片
    JLabel jlb4;//很丑的一张照片
    JLabel jlb5;//第一个照片
    JButton jbt6;//制作人
    //第一个图片界面代码end
    
    //第二个图片界面代码start
    JFrame jf4;//第二张照片界面
    JPanel jpl10;//jf4中的整体布局
    JPanel jpl14;//jpl10中的上方布局
    JPanel jpl15;//jpl10中的中间布局
    JPanel jpl16;//jpl10中的下方布局
    ImageIcon Icon2;//第二个图片照片
    JLabel jlb6;//非常丑的一张照片
    JLabel jlb7;//第二个照片
    JButton jbt7;//制作人
    //第二个图片界面代码end
    
    //制作人界面start
    JFrame jf5;//制作人界面
    JPanel jpl17;//jf5中的整体布局
    JPanel jpl18;//jpl17中的上方布局
    JPanel jpl19;//jpl17中的中间布局
    JPanel jpl20;//jpl17中的下方布局
    ImageIcon Icon3;//制作人图片照片
    JLabel jlb8;//To:LBB
    JLabel jlb9;//制作人图片
    JLabel jlb10;//Made by JXL
    //制作人界面end
	
	public ToDCY_1()
	{
		
		//登陆界面代码start
    	UserName[0]=new String("JXL");
		UserPassword[0]=new String("JXL");
		UserName[1]=new String("jxl");
		UserPassword[1]=new String("jxl");
		UserName[2]=new String("dcydog");
		UserPassword[2]=new String("dcydog");
		UserName[3]=new String("dcypig");
		UserPassword[3]=new String("dcypig");
		jf1=new JFrame();//登陆界面
		jf1.setLayout(new BorderLayout());
		jf2=new JFrame();//登陆成功界面
		jf2.setLayout(new BorderLayout());
		jpl1=new JPanel();//jf1中的整体布局
		jpl1.setLayout(new BorderLayout());
		jpl2=new JPanel();//jf1中的上方布局
		jpl2.setLayout(new FlowLayout());
		jpl3=new JPanel();//jf1中的中方布局
		jpl3.setLayout(new GridLayout(2,2,1,1));
		jpl3_temp=new JPanel();
		jpl3_temp.setLayout(new FlowLayout());
		jpl4=new JPanel();//jf1中的下方布局
		jpl4.setLayout(new FlowLayout());
		jpl5=new JPanel();//jf1中的下方布局
		jpl5.setLayout(new BorderLayout());
		//jf1的设置
		jbt1=new JButton("确认");
		jbt2=new JButton("重置");
		jbt3=new JButton("退出");
		jlb1=new JLabel("用户名：");
		jlb2=new JLabel("密码：");
		jlb3=new JLabel("请输入用户名和密码：");
		jtf1=new JTextField(10);
		jpf1=new JPasswordField(10);
		jpl2.add(jlb3);
		jpl3.add(jlb1);
		jpl3.add(jtf1);
		jpl3.add(jlb2);
		jpl3.add(jpf1);
		jpl3_temp.add(jpl3);
		jpl4.add(jbt1);
		jpl4.add(jbt2);
		jpl4.add(jbt3);
		jpl1.add(jpl2,BorderLayout.NORTH);
		jpl1.add(jpl3_temp,BorderLayout.CENTER);
		jpl1.add(jpl4,BorderLayout.SOUTH);
		jf1.add(jpl1,BorderLayout.CENTER);
		jbt1.addActionListener(this);//对确认按键的监听
		jbt2.addActionListener(this);//对重置按键的监听
		jbt3.addActionListener(this);//对退出按键的监听
		jtf1.addActionListener(this);//对用户名区域回车按键的监听
		jpf1.addActionListener(this);//对密码区域回车按键的监听
		//jf1.setTitle("To LBB (Made by JXL)");
		jf1.setTitle("dcydog");
		jf1.setSize(350,170);
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		//登陆界面代码end
		
		//选择界面代码start
		com[0]=new String("很丑的一张照片(哼)");
		com[1]=new String("非常丑的一张照片(哼哼)");
		jcb1=new JComboBox(com);
		jpl5=new JPanel();
		jpl6=new JPanel();
		jpl7=new JPanel();
		jpl8=new JPanel();
		jpl6.add(new JLabel("请选择要查看的照片"));
		jpl7.add(jcb1);
		jbt4=new JButton("确认");
		jbt5=new JButton("退出");
		jpl8.add(jbt4);
		jpl8.add(jbt5);
		jpl5.setLayout(new BorderLayout());
		jpl5.add(jpl6,BorderLayout.NORTH);
		jpl5.add(jpl7,BorderLayout.CENTER);
		jpl5.add(jpl8,BorderLayout.SOUTH);
		jf2.add(jpl5);
		jbt4.addActionListener(this);//对确认键的监听
		jbt5.addActionListener(this);//对退出键的监听
		jf2.setTitle("dcydog");
		jf2.setSize(350,170);
		jf2.setLocationRelativeTo(null);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(false);
		//选择界面代码end
		
		//第一个图片界面代码start
		jf3=new JFrame();
		Icon1=new ImageIcon("./Image/1.jpg");
		jlb4=new JLabel("很丑的一张照片");
		jlb5=new JLabel(Icon1);
		jbt6=new JButton("制作人");
		jpl9=new JPanel();
		jpl11=new JPanel();
		jpl12=new JPanel();
		jpl13=new JPanel();
		jpl9.setLayout(new BorderLayout());
		jpl11.add(jlb4);
		jpl12.add(jlb5);
		jpl13.add(jbt6);
		jpl9.add(jpl11,BorderLayout.NORTH);
		jpl9.add(jpl12,BorderLayout.CENTER);
		jpl9.add(jpl13,BorderLayout.SOUTH);
		jf3.add(jpl9);
		jbt6.addActionListener(this);
		jf3.setTitle("dcydog");
		jf3.setSize(450,300);
		jf3.setLocationRelativeTo(null);
		jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf3.setVisible(false);
		//第一个图片界面代码end
				
		//第二个界面代码start
		jf4=new JFrame();
		Icon2=new ImageIcon("./Image/2.jpg");
		jlb6=new JLabel("非常丑的一张照片");
		jlb7=new JLabel(Icon2);
		jbt7=new JButton("制作人");
		jpl10=new JPanel();
		jpl14=new JPanel();
		jpl15=new JPanel();
		jpl16=new JPanel();
		jpl10.setLayout(new BorderLayout());
		jpl14.add(jlb6);
		jpl15.add(jlb7);
		jpl16.add(jbt7);
		jpl10.add(jpl14,BorderLayout.NORTH);
		jpl10.add(jpl15,BorderLayout.CENTER);
		jpl10.add(jpl16,BorderLayout.SOUTH);
		jf4.add(jpl10);
		jbt7.addActionListener(this);
		jf4.setTitle("dcydog");
		jf4.setSize(900,600);
		jf4.setLocationRelativeTo(null);
		jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf4.setVisible(false);
		//第二个图片界面代码end
		
		//制作人界面代码start
		jf5=new JFrame();
		Icon3=new ImageIcon("./Image/JXL.gif");
		jlb8=new JLabel("To:dcydog");
		jlb9=new JLabel(Icon3);
		jlb10=new JLabel("Made by JXL");
		jpl17=new JPanel();
		jpl18=new JPanel();
		jpl19=new JPanel();
		jpl20=new JPanel();
		jpl17.setLayout(new BorderLayout());
		jpl18.add(jlb8);
		jpl19.add(jlb9);
		jpl20.add(jlb10);
		jpl17.add(jpl18,BorderLayout.NORTH);
		jpl17.add(jpl19,BorderLayout.CENTER);
		jpl17.add(jpl20,BorderLayout.SOUTH);
		jf5.add(jpl17);
		jf5.setTitle("dcydog");
		jf5.setSize(300,200);
		jf5.setLocationRelativeTo(null);
		jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf5.setVisible(false);
		//制作人界面代码end
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
    	
    	//登陆界面代码start
		if(e.getSource()==jbt1||e.getSource()==jtf1||e.getSource()==jpf1)//点击确认键或在用户名区域敲击回车键或在密码区域敲击回车键
		{
			String TempPassword=new String(jpf1.getPassword());
			for(int i=0;i<TotalOfUser;i++)
			{
				if(jtf1.getText().length()==0&&TempPassword.length()==0)//用户名和密码均为空
				{
					jlb3.setText("用户名和密码不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(jtf1.getText().length()==0)//仅用户名为空
				{
					jlb3.setText("用户名不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(TempPassword.length()==0)//仅密吗为空
				{
					jlb3.setText("密码不能为空，请重新输入用户名和密码：");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(UserName[i].equals(jtf1.getText())&&TempPassword.equals(UserPassword[i]))//用户名和密码输入正确
				{
					jf1.setVisible(false);
					jf2.setVisible(true);
					jf1.repaint();
					jf2.repaint();
					return;
				}
			}
			//用户名和密码输入错误
			jlb3.setText("你输入的用户名或密码有误，请重新输入用户名和密码：");
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
			return;
		}
		else if(e.getSource()==jbt2)//点击重置键
		{
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
		}
		else if(e.getSource()==jbt3)//点击退出键
		{
			System.exit(0);
		}
		//登陆界面代码end
		
		//选择界面代码start
		if(e.getSource()==jbt4)//点击确认键
		{
			String comchoose=(String)jcb1.getSelectedItem();
					
			//第一个图片界面代码start
			if(comchoose.equals(com[0]))//Server
			{
				jf2.setVisible(false);
				jf3.setVisible(true);
			}
			//第一个图片界面代码end
					
			//第二个图片界面代码start
			else if(comchoose.equals(com[1]))//Client
			{
				jf2.setVisible(false);
				jf4.setVisible(true);
			}
			//第二个图片界面代码end
					
		}
		else if(e.getSource()==jbt5)//点击退出键
		{
			System.exit(0);
		}
		//选择界面代码end
		
		//制作人界面代码start
		if(e.getSource()==jbt6)//点击制作人键
		{
			jf3.setVisible(false);
			jf5.setVisible(true);
		}
		else if(e.getSource()==jbt7)//点击制作人键
		{
			jf4.setVisible(false);
			jf5.setVisible(true);
		}
		//制作人界面代码end
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new ToDCY_1();
	}
}
