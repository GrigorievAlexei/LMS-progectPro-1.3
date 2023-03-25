package view;

import view.student.AddStudentFrame;
import view.student.AddStudentPanel;
import view.student.StudentListPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public static AddStudentFrame addStudentFrame = new AddStudentFrame();
    public MainFrame(){
        setTitle("LMS");

        setSize(500, 600);
        setLocation(500, 100);
        setLayout(new FlowLayout());
        setJMenuBar(new MainMenuBar());
        add(new StudentListPanel());

        setVisible(true);
    }
}