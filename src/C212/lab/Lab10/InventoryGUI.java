//Joshua Isaacson, jsisaacs, 11/16/2017

package C212.lab.Lab10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InventoryGUI extends JFrame {
    private JLabel cartons;
    private JLabel items;
    private JLabel total;
    private JTextField cartonsField;
    private JTextField itemsField;
    private JTextField totalField;
    private JButton calculateTotal;

    public InventoryGUI() {
        prepareGUI();
    }

    private void setCalculateTotal(ActionEvent e) {
        this.totalField.setText(String.valueOf(Integer.parseInt(this.cartonsField.getText()) *
                                Integer.parseInt(this.itemsField.getText())));
    }

    private void prepareGUI() {
        Container container = getContentPane();
        container.setLayout(null);

        this.cartons = new JLabel();
        this.cartons.setText("Cartons per shipment:");
        this.cartons.setBounds(16, 16, 160, 21);
        container.add(this.cartons);

        this.items = new JLabel();
        this.items.setText("Items per carton");
        this.items.setBounds(16, 48, 104, 21);
        container.add(this.items);

        this.total = new JLabel();
        this.total.setText("Total:");
        this.total.setBounds(250, 16, 40, 21);
        container.add(this.total);

        this.cartonsField = new JTextField();
        this.cartonsField.setText("");
        this.cartonsField.setBounds(160, 16, 40, 21);
        this.cartonsField.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(this.cartonsField);

        this.itemsField = new JTextField();
        this.itemsField.setText("");
        this.itemsField.setBounds(160, 48, 40, 21);
        this.itemsField.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(this.itemsField);

        this.totalField = new JTextField();
        this.totalField.setBounds(295, 16, 86, 21);
        this.totalField.setHorizontalAlignment(SwingConstants.LEFT);
        this.totalField.setEditable(false);
        container.add(this.totalField);

        this.calculateTotal = new JButton();
        this.calculateTotal.setText("Calculate Total");
        this.calculateTotal.setBounds(250, 48, 126, 24);
        container.add(this.calculateTotal);
        this.calculateTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InventoryGUI.this.setCalculateTotal(e);
            }
        });
        setTitle("Inventory");
        setSize(400, 110);
        setVisible(true);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        InventoryGUI inventoryGUI = new InventoryGUI();
    }
}
