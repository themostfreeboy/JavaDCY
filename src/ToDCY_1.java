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
	
	//��½�������start
	JFrame jf1;//��½����
	JPanel jpl1;//jf1�е����岼��
	JPanel jpl2;//jf1�е��Ϸ�����
	JPanel jpl3;//jf1�е��з�����
	JPanel jpl3_temp;//jpl3�е���ʱ���֣����ڽ��jtf1��jpf1�е�text�������޷Ŵ������
	JPanel jpl4;//jf1�е��·�����
	JButton jbt1;//jf1�е�ȷ��
	JButton jbt2;//jf1�е�����
	JButton jbt3;//jf1�е��˳�
	JLabel jlb1;//�û���
	JLabel jlb2;//����
	JLabel jlb3;//��ʾ�����û���������
	JTextField jtf1;//�û���
	JPasswordField jpf1;//����
	String[] UserName=new String[100];
	String[] UserPassword=new String[100];
	int TotalOfUser=4;
	//��½�������end
	
	//ѡ��������start
    JFrame jf2;//��һ����Ƭ�͵ڶ�����Ƭ��ѡ�����
    JPanel jpl5;//jf2�е����岼��
    JPanel jpl6;//jf2�е��Ϸ�����
    JPanel jpl7;//jf2�е��м䲼��
    JPanel jpl8;//jf2�е��·�����
    JComboBox jcb1;//��һ����Ƭ��ڶ�����Ƭ��ѡ��
    String[] com=new String[2];//ѡ���б���Ŀ����
    JButton jbt4;//jf2�е�ȷ��
    JButton jbt5;//jf2�е��˳�
    //ѡ��������end
    
    //��һ��ͼƬ�������start
    JFrame jf3;//��һ����Ƭ����
    JPanel jpl9;//jf3�е����岼��
    JPanel jpl11;//jpl9�е��Ϸ�����
    JPanel jpl12;//jpl9�е��м䲼��
    JPanel jpl13;//jpl9�е��·�����
    ImageIcon Icon1;//��һ��ͼƬ��Ƭ
    JLabel jlb4;//�ܳ��һ����Ƭ
    JLabel jlb5;//��һ����Ƭ
    JButton jbt6;//������
    //��һ��ͼƬ�������end
    
    //�ڶ���ͼƬ�������start
    JFrame jf4;//�ڶ�����Ƭ����
    JPanel jpl10;//jf4�е����岼��
    JPanel jpl14;//jpl10�е��Ϸ�����
    JPanel jpl15;//jpl10�е��м䲼��
    JPanel jpl16;//jpl10�е��·�����
    ImageIcon Icon2;//�ڶ���ͼƬ��Ƭ
    JLabel jlb6;//�ǳ����һ����Ƭ
    JLabel jlb7;//�ڶ�����Ƭ
    JButton jbt7;//������
    //�ڶ���ͼƬ�������end
    
    //�����˽���start
    JFrame jf5;//�����˽���
    JPanel jpl17;//jf5�е����岼��
    JPanel jpl18;//jpl17�е��Ϸ�����
    JPanel jpl19;//jpl17�е��м䲼��
    JPanel jpl20;//jpl17�е��·�����
    ImageIcon Icon3;//������ͼƬ��Ƭ
    JLabel jlb8;//To:LBB
    JLabel jlb9;//������ͼƬ
    JLabel jlb10;//Made by JXL
    //�����˽���end
	
	public ToDCY_1()
	{
		
		//��½�������start
    	UserName[0]=new String("JXL");
		UserPassword[0]=new String("JXL");
		UserName[1]=new String("jxl");
		UserPassword[1]=new String("jxl");
		UserName[2]=new String("dcydog");
		UserPassword[2]=new String("dcydog");
		UserName[3]=new String("dcypig");
		UserPassword[3]=new String("dcypig");
		jf1=new JFrame();//��½����
		jf1.setLayout(new BorderLayout());
		jf2=new JFrame();//��½�ɹ�����
		jf2.setLayout(new BorderLayout());
		jpl1=new JPanel();//jf1�е����岼��
		jpl1.setLayout(new BorderLayout());
		jpl2=new JPanel();//jf1�е��Ϸ�����
		jpl2.setLayout(new FlowLayout());
		jpl3=new JPanel();//jf1�е��з�����
		jpl3.setLayout(new GridLayout(2,2,1,1));
		jpl3_temp=new JPanel();
		jpl3_temp.setLayout(new FlowLayout());
		jpl4=new JPanel();//jf1�е��·�����
		jpl4.setLayout(new FlowLayout());
		jpl5=new JPanel();//jf1�е��·�����
		jpl5.setLayout(new BorderLayout());
		//jf1������
		jbt1=new JButton("ȷ��");
		jbt2=new JButton("����");
		jbt3=new JButton("�˳�");
		jlb1=new JLabel("�û�����");
		jlb2=new JLabel("���룺");
		jlb3=new JLabel("�������û��������룺");
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
		jbt1.addActionListener(this);//��ȷ�ϰ����ļ���
		jbt2.addActionListener(this);//�����ð����ļ���
		jbt3.addActionListener(this);//���˳������ļ���
		jtf1.addActionListener(this);//���û�������س������ļ���
		jpf1.addActionListener(this);//����������س������ļ���
		//jf1.setTitle("To LBB (Made by JXL)");
		jf1.setTitle("dcydog");
		jf1.setSize(350,170);
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf1.setVisible(true);
		//��½�������end
		
		//ѡ��������start
		com[0]=new String("�ܳ��һ����Ƭ(��)");
		com[1]=new String("�ǳ����һ����Ƭ(�ߺ�)");
		jcb1=new JComboBox(com);
		jpl5=new JPanel();
		jpl6=new JPanel();
		jpl7=new JPanel();
		jpl8=new JPanel();
		jpl6.add(new JLabel("��ѡ��Ҫ�鿴����Ƭ"));
		jpl7.add(jcb1);
		jbt4=new JButton("ȷ��");
		jbt5=new JButton("�˳�");
		jpl8.add(jbt4);
		jpl8.add(jbt5);
		jpl5.setLayout(new BorderLayout());
		jpl5.add(jpl6,BorderLayout.NORTH);
		jpl5.add(jpl7,BorderLayout.CENTER);
		jpl5.add(jpl8,BorderLayout.SOUTH);
		jf2.add(jpl5);
		jbt4.addActionListener(this);//��ȷ�ϼ��ļ���
		jbt5.addActionListener(this);//���˳����ļ���
		jf2.setTitle("dcydog");
		jf2.setSize(350,170);
		jf2.setLocationRelativeTo(null);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf2.setVisible(false);
		//ѡ��������end
		
		//��һ��ͼƬ�������start
		jf3=new JFrame();
		Icon1=new ImageIcon("./Image/1.jpg");
		jlb4=new JLabel("�ܳ��һ����Ƭ");
		jlb5=new JLabel(Icon1);
		jbt6=new JButton("������");
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
		//��һ��ͼƬ�������end
				
		//�ڶ����������start
		jf4=new JFrame();
		Icon2=new ImageIcon("./Image/2.jpg");
		jlb6=new JLabel("�ǳ����һ����Ƭ");
		jlb7=new JLabel(Icon2);
		jbt7=new JButton("������");
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
		//�ڶ���ͼƬ�������end
		
		//�����˽������start
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
		//�����˽������end
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
    	
    	//��½�������start
		if(e.getSource()==jbt1||e.getSource()==jtf1||e.getSource()==jpf1)//���ȷ�ϼ������û��������û��س����������������û��س���
		{
			String TempPassword=new String(jpf1.getPassword());
			for(int i=0;i<TotalOfUser;i++)
			{
				if(jtf1.getText().length()==0&&TempPassword.length()==0)//�û����������Ϊ��
				{
					jlb3.setText("�û��������벻��Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(jtf1.getText().length()==0)//���û���Ϊ��
				{
					jlb3.setText("�û�������Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(TempPassword.length()==0)//������Ϊ��
				{
					jlb3.setText("���벻��Ϊ�գ������������û��������룺");
					jtf1.setText("");
					jpf1.setText("");
					jf1.repaint();
					return;
				}
				else if(UserName[i].equals(jtf1.getText())&&TempPassword.equals(UserPassword[i]))//�û���������������ȷ
				{
					jf1.setVisible(false);
					jf2.setVisible(true);
					jf1.repaint();
					jf2.repaint();
					return;
				}
			}
			//�û����������������
			jlb3.setText("��������û������������������������û��������룺");
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
			return;
		}
		else if(e.getSource()==jbt2)//������ü�
		{
			jtf1.setText("");
			jpf1.setText("");
			jf1.repaint();
		}
		else if(e.getSource()==jbt3)//����˳���
		{
			System.exit(0);
		}
		//��½�������end
		
		//ѡ��������start
		if(e.getSource()==jbt4)//���ȷ�ϼ�
		{
			String comchoose=(String)jcb1.getSelectedItem();
					
			//��һ��ͼƬ�������start
			if(comchoose.equals(com[0]))//Server
			{
				jf2.setVisible(false);
				jf3.setVisible(true);
			}
			//��һ��ͼƬ�������end
					
			//�ڶ���ͼƬ�������start
			else if(comchoose.equals(com[1]))//Client
			{
				jf2.setVisible(false);
				jf4.setVisible(true);
			}
			//�ڶ���ͼƬ�������end
					
		}
		else if(e.getSource()==jbt5)//����˳���
		{
			System.exit(0);
		}
		//ѡ��������end
		
		//�����˽������start
		if(e.getSource()==jbt6)//��������˼�
		{
			jf3.setVisible(false);
			jf5.setVisible(true);
		}
		else if(e.getSource()==jbt7)//��������˼�
		{
			jf4.setVisible(false);
			jf5.setVisible(true);
		}
		//�����˽������end
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new ToDCY_1();
	}
}
