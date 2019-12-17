package com;



import javax.swing.*;
import java.awt.*;

 public class login  extends JFrame {

    JLabel jbl1=null;
    JTabbedPane jtp=null;
    JPanel jp2,jp3,jp4=null;
    JLabel jp2_jbl1,jp2_jbl2,jp2_jbl3,jp2_jbl4;
    JButton jp2_jb1;
    JTextField jp2_jtf;
    JTextField jp2_jpf;
    JCheckBox jp2_jcb1;
    JCheckBox jp2_jcb2;

    JPanel jp1=null;
    JButton jp1_jb1,jp1_jb2,jp1_jb3=null;

public login(){
    //north
    jbl1 =new JLabel(new ImageIcon("static/12.png"));

    //center
    jp2=new JPanel(new GridLayout(3,3));
    jp2_jbl1=new JLabel("account");
    jp2_jbl2=new JLabel("password");
    jp2_jbl3=new JLabel("忘记密码");
    //jp2_jbl4=new JLabel("");
    jp2_jb1=new JButton(new ImageIcon("static/cacount"));
    jp2_jtf=new JTextField("");
    jp2_jpf=new JTextField("");
    jp2_jcb1=new JCheckBox("隐身");
    jp2_jcb2=new JCheckBox("记住密码");

    //加入到jta
    jp2.add(jp2_jbl1);
    jp2.add(jp2_jtf);
    jp2.add(jp2_jb1);
    jp2.add(jp2_jbl2);
    jp2.add(jp2_jpf);
    jp2.add(jp2_jbl3);
    jp2.add(jp2_jcb1);
    jp2.add(jp2_jcb2);
//    jp2.add(jp2_jbl1);
//    jp2.add(jp2_jbl1);
//    jp2.add(jp2_jbl1);

    //创建选项卡窗口
    jtp=new JTabbedPane();
    jtp.add("账号登录界面",jp2);
    jp3=new JPanel();
    jp4=new JPanel();
    jtp.add("xxxxx",jp3);
    jtp.add("dianzi",jp4);



    //south
    jp1=new JPanel(new FlowLayout());
    jp1_jb1=new JButton(new ImageIcon("static/submintbutton.png"));
    jp1_jb2=new JButton(new ImageIcon("static/quxiao.png"));
    jp1_jb3=new JButton(new ImageIcon("static/xiugai.png"));
    jp1_jb1.setMargin(new Insets(-2,-1,-1,-1));
    jp1_jb2.setMargin(new Insets(-2,-1,-1,-1));
    jp1_jb3.setMargin(new Insets(-2,-1,-1,-1));
     jp1.add(jp1_jb1);
     jp1.add(jp1_jb2);
     jp1.add(jp1_jb3);


    this.add(jbl1,"North");
    this.add(jtp,"Center");
    this.add(jp1,"South");


    this.setSize(700,500);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
}
}
