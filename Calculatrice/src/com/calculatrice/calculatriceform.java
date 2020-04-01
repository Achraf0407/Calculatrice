package com.calculatrice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

        public class calculatriceform {
            private JPanel mainpanel;
            private JTextField Result;
            private JTextField Number2;
            private JButton BINARYButton;
            private JButton OCTALButton;
            private JButton HEXADECIMALButton;
            private JButton PlusButton;
            private JButton multipleButton;
            private JButton devideButton;
            private JButton MinusButton;
            private JTextField Number1;
            private JButton DECIMALButton;
            private JButton decimalButton;

            public calculatriceform() {
                BINARYButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                       try {
                           String s = Number2.getText();
                           int i = Integer.parseInt(s);
                           String s1 = Integer.toBinaryString(i);
                           Result.setText(s1);
                       }
                       catch (Exception e1) {
                           JOptionPane.showMessageDialog(null, "enter a valid number in Number 2 field");
                       }
                    }

                });

                OCTALButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed (ActionEvent e) {
                        try {
                            String s = Number2.getText();
                            int i = Integer.parseInt(s);
                            String s1 = Integer.toOctalString(i);
                            Result.setText(s1);
                             }
                        catch (Exception e1) {
                            JOptionPane.showMessageDialog(null, "enter a valid number in Number 2 field");
                        }
                    }
                        });
                        HEXADECIMALButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    String s = Number2.getText();
                                    int i = Integer.parseInt(s);
                                    String s1 = Integer.toHexString(i);
                                    Result.setText(s1);
                                }
                                catch (Exception e1) {
                                    JOptionPane.showMessageDialog(null, "enter a valid number in Number 2 field");
                                }
                            }

                        });

                        PlusButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1,num2,result;
                                    num1 = Integer.parseInt(Number1.getText());
                                    num2 = Integer.parseInt(Number2.getText());
                                    result=num1+num2;
                                    Result.setText(Integer.toString(result));
                                }

                                catch(Exception e1) {
                                    JOptionPane.showMessageDialog(null,"enter a valid number");
                                }
                            }
                        });
                        multipleButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1,num2,result;
                                    num1 = Integer.parseInt(Number1.getText());
                                    num2 = Integer.parseInt(Number2.getText());
                                    result=num1*num2;
                                    Result.setText(Integer.toString(result));
                                }

                                catch(Exception e1) {
                                    JOptionPane.showMessageDialog(null,"enter a valid number");
                                }
                            }
                        });
                        devideButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1,num2;
                                    double result;
                                    num1 = Integer.parseInt(Number1.getText());
                                    num2 = Integer.parseInt(Number2.getText());
                                    result= ((double) num1/num2);;
                                    Result.setText(String.valueOf(result));
                                }

                                catch(Exception e1) {
                                    JOptionPane.showMessageDialog(null,"enter a valid number");
                                }
                            }
                        });
                        MinusButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    int num1,num2,result;
                                    num1 = Integer.parseInt(Number1.getText());
                                    num2 = Integer.parseInt(Number2.getText());
                                    result=num1-num2;
                                    Result.setText(Integer.toString(result));
                                }

                                catch(Exception e1) {
                                    JOptionPane.showMessageDialog(null,"enter a valid number");
                                }
                            }
                        });
                DECIMALButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            String s = Number2.getText();
                            int i = Integer.parseInt(s,2);
                            String s1 = Integer.toString(i);
                            Result.setText(s1);
                        }
                        catch (Exception e1) {
                            JOptionPane.showMessageDialog(null, "enter a valid number in Number 2 field");
                        }

                    }
                });
            }

                    public static void main(String[] args) {
                        JFrame frame =new JFrame("calculatriceform");
                        frame.setContentPane(new calculatriceform().mainpanel);
                        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        frame.pack();
                        frame.setVisible(true);
                    }

            private void createUIComponents() {
                // TODO: place custom component creation code here
            }
        }