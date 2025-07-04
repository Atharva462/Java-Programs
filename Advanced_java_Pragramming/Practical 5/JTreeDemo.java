import java.awt.*;
import javax.swing.tree.*;
import javax.swing.*;

public class JTreeDemo{
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        fr.setVisible(true);
        fr.setSize(400, 400);
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("India");
        DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Maharashtra");
        DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Gujrat");
        root.add(node1);
        root.add(node2);

        DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("Pune");
        DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("Mumbai");
        DefaultMutableTreeNode n3 = new DefaultMutableTreeNode("Kolhapur");
        DefaultMutableTreeNode n4 = new DefaultMutableTreeNode("Satara");

        node1.add(n1);
        node1.add(n2);
        node1.add(n3);
        node1.add(n4);

        DefaultMutableTreeNode p1 = new DefaultMutableTreeNode("Mulshi");
        DefaultMutableTreeNode p2 = new DefaultMutableTreeNode("Kothrud");
        DefaultMutableTreeNode p3 = new DefaultMutableTreeNode("Purandar");
        DefaultMutableTreeNode p4 = new DefaultMutableTreeNode("Baramati");
    
        n1.add(p1);
        n1.add(p2);
        n1.add(p3);
        n1.add(p4);

        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Kachchh");
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Vadodara");
        DefaultMutableTreeNode a3 = new DefaultMutableTreeNode("Jamnagar");
        DefaultMutableTreeNode a4 = new DefaultMutableTreeNode("Ahmedabad");

        node2.add(a1);
        node2.add(a2);
        node2.add(a3);
        node2.add(a4);

        JTree jt = new JTree(root);
        fr.add(jt);
    }
}