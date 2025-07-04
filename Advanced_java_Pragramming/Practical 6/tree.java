import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

public class tree {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();
        f1.setSize(400, 400);
        f1.setVisible(true);
        // f1.setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode sub1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode sub2 = new DefaultMutableTreeNode("Gujrat");
        root.add(sub1);
        root.add(sub2);

        DefaultMutableTreeNode m1 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode m2 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode m3 = new DefaultMutableTreeNode("Nashik");
        DefaultMutableTreeNode m4 = new DefaultMutableTreeNode("Nagpur");
        sub1.add(m1);
        sub1.add(m2);
        sub1.add(m3);
        sub1.add(m4);

        JTree t1 = new JTree(root);
        f1.add(t1);

    }
}
