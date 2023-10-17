/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CUBESOLVER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Suyash
 */
public class HOME extends javax.swing.JFrame {

    javax.swing.JPanel jp;
//        String name;
    int rc = 0, yc = 0, gc = 0, bc = 0, oc = 0, wc = 0;
    char[] ch = new char[70];

    int selected = 0;

    /**
     * Creates new form HOME
     */
    public HOME() {
        initComponents();
        ch[25] = 'W';
        ch[15] = 'B';
        ch[35] = 'Y';
        ch[45] = 'G';
        ch[55] = 'R';
        ch[65] = 'O';
    }

    private void R() {

        char temp1, temp2, temp3;
        temp1 = ch[13];
        temp2 = ch[16];
        temp3 = ch[19];

        ch[13] = ch[23];
        ch[16] = ch[26];
        ch[19] = ch[29];
        ch[23] = ch[43];
        ch[26] = ch[46];
        ch[29] = ch[49];

        ch[43] = ch[33];
        ch[46] = ch[36];
        ch[49] = ch[39];
        ch[33] = temp1;
        ch[36] = temp2;
        ch[39] = temp3;
//            System.err.println("in red");
        temp1 = ch[51];
        temp2 = ch[52];
        temp3 = ch[53];

        ch[51] = ch[57];
        ch[52] = ch[54];
        ch[54] = ch[58];
        ch[58] = ch[56];
        ch[57] = ch[59];

        ch[53] = temp1;
        ch[56] = temp2;
        ch[59] = temp3;

    }

    private void R_Prime() {

        char temp1, temp2, temp3;
        temp1 = ch[33];
        temp2 = ch[36];
        temp3 = ch[39];
        ch[33] = ch[43];
        ch[36] = ch[46];
        ch[39] = ch[49];
        ch[43] = ch[23];
        ch[46] = ch[26];
        ch[49] = ch[29];

        ch[23] = ch[13];
        ch[26] = ch[16];
        ch[29] = ch[19];
        ch[13] = temp1;
        ch[16] = temp2;
        ch[19] = temp3;
        ///red
        temp1 = ch[51];
        temp2 = ch[52];
        temp3 = ch[53];
        char temp4 = ch[56];
        ch[56] = ch[58];
        ch[58] = ch[54];
        ch[54] = ch[52];
//      ch[53]=temp1;
        ch[51] = temp3;
        ch[52] = temp4;
        ch[53] = ch[59];
//    ch[59]=ch[57];
        ch[59] = ch[57];
        ch[57] = temp1;

//    ch[56]=temp2;
    }

    private void L() {
        char temp1, temp2, temp3;
        temp1 = ch[11];
        temp2 = ch[14];
        temp3 = ch[17];

        ch[11] = ch[31];
        ch[14] = ch[34];
        ch[17] = ch[37];
        ch[31] = ch[41];
        ch[34] = ch[44];
        ch[37] = ch[47];

        ch[41] = ch[21];
        ch[44] = ch[24];
        ch[47] = ch[27];
        ch[21] = temp1;
        ch[24] = temp2;
        ch[27] = temp3;

        temp1 = ch[61];
        temp2 = ch[62];
        temp3 = ch[63];

        ch[61] = ch[67];
        ch[62] = ch[64];
        ch[64] = ch[68];
        ch[68] = ch[66];
        ch[67] = ch[69];

        ch[63] = temp1;
        ch[66] = temp2;
        ch[69] = temp3;
    }

    private void L_Prime() {
        char temp1, temp2, temp3;

        temp1 = ch[21];
        temp2 = ch[24];
        temp3 = ch[27];

        ch[21] = ch[41];
        ch[24] = ch[44];
        ch[27] = ch[47];

        ch[41] = ch[31];
        ch[44] = ch[34];
        ch[47] = ch[37];

        ch[31] = ch[11];
        ch[34] = ch[14];
        ch[37] = ch[17];

        ch[11] = temp1;
        ch[14] = temp2;
        ch[17] = temp3;

        //orange
        temp1 = ch[61];
//    temp2= ch[67];
        temp3 = ch[63];
        char temp4 = ch[66];
        ch[66] = ch[68];
        ch[68] = ch[64];
        ch[64] = ch[62];
        ch[62] = temp4;
//      ch[53]=temp1;

        ch[61] = ch[63];
        ch[63] = ch[69];
//    ch[59]=ch[57];
        ch[69] = ch[67];
        ch[67] = temp1;
    }

    private void U() {

        char temp1, temp2, temp3;
        temp1 = ch[11];
        temp2 = ch[12];
        temp3 = ch[13];

        ch[11] = ch[51];
        ch[12] = ch[52];
        ch[13] = ch[53];
        ch[51] = ch[41];
        ch[52] = ch[42];
        ch[53] = ch[43];

        ch[41] = ch[61];
        ch[42] = ch[62];
        ch[43] = ch[63];
        ch[61] = temp1;
        ch[62] = temp2;
        ch[63] = temp3;
//            System.err.println("in yellow");
        temp1 = ch[31];
        temp2 = ch[32];
        temp3 = ch[33];

        ch[31] = ch[37];
        ch[32] = ch[34];
        ch[34] = ch[38];
        ch[38] = ch[36];
        ch[37] = ch[39];

        ch[33] = temp1;
        ch[36] = temp2;
        ch[39] = temp3;

    }

    private void U_Prime() {

        char temp1, temp2, temp3;
        temp1 = ch[61];
        temp2 = ch[62];
        temp3 = ch[63];

        ch[61] = ch[41];
        ch[62] = ch[42];
        ch[63] = ch[43];

        ch[41] = ch[51];
        ch[42] = ch[52];
        ch[43] = ch[53];

        ch[51] = ch[11];
        ch[52] = ch[12];
        ch[53] = ch[13];

        ch[11] = temp1;
        ch[12] = temp2;
        ch[13] = temp3;
        ///red
        temp1 = ch[31];
        temp2 = ch[32];
        temp3 = ch[33];
        char temp4 = ch[36];
        ch[36] = ch[38];
        ch[38] = ch[34];
        ch[34] = ch[32];
//      ch[53]=temp1;
        ch[31] = temp3;
        ch[32] = temp4;
        ch[33] = ch[39];
//    ch[59]=ch[57];
        ch[39] = ch[37];
        ch[37] = temp1;
    }

    private void Bottom() {
        char temp1, temp2, temp3;
        temp1 = ch[67];
        temp2 = ch[68];
        temp3 = ch[69];

        ch[67] = ch[47];
        ch[68] = ch[48];
        ch[69] = ch[49];

        ch[47] = ch[57];
        ch[48] = ch[58];
        ch[49] = ch[59];

        ch[57] = ch[17];
        ch[58] = ch[18];
        ch[59] = ch[19];

        ch[17] = temp1;
        ch[18] = temp2;
        ch[19] = temp3;
//                System.err.println("in white");
        temp1 = ch[21];
        temp2 = ch[22];
        temp3 = ch[23];

        ch[21] = ch[27];
        ch[22] = ch[24];
        ch[24] = ch[28];
        ch[28] = ch[26];
        ch[27] = ch[29];

        ch[23] = temp1;
        ch[26] = temp2;
        ch[29] = temp3;

    }

    private void Bottom_Prime() {
        char temp1, temp2, temp3;
        temp1 = ch[17];
        temp2 = ch[18];
        temp3 = ch[19];

        ch[17] = ch[57];
        ch[18] = ch[58];
        ch[19] = ch[59];
        ch[57] = ch[47];
        ch[58] = ch[48];
        ch[59] = ch[49];

        ch[47] = ch[67];
        ch[48] = ch[68];
        ch[49] = ch[69];
        ch[67] = temp1;
        ch[68] = temp2;
        ch[69] = temp3;

        ///white
        temp1 = ch[21];
        temp2 = ch[22];
        temp3 = ch[23];
        char temp4 = ch[26];
        ch[26] = ch[28];
        ch[28] = ch[24];
        ch[24] = ch[22];
//      ch[53]=temp1;
        ch[21] = temp3;
        ch[22] = temp4;
        ch[23] = ch[29];
//    ch[59]=ch[57];
        ch[29] = ch[27];
        ch[27] = temp1;
    }

    private void F() {

        char temp1, temp2, temp3;
        temp1 = ch[63];
        temp2 = ch[66];
        temp3 = ch[69];

        ch[63] = ch[21];
        ch[66] = ch[22];
        ch[69] = ch[23];

        ch[21] = ch[57];
        ch[22] = ch[54];
        ch[23] = ch[51];

        ch[57] = ch[39];
        ch[54] = ch[38];
        ch[51] = ch[37];

        ch[39] = temp1;
        ch[38] = temp2;
        ch[37] = temp3;

        temp1 = ch[11];
        temp2 = ch[12];
        temp3 = ch[13];

        ch[11] = ch[17];
        ch[12] = ch[14];
        ch[14] = ch[18];
        ch[18] = ch[16];
        ch[17] = ch[19];

        ch[13] = temp1;
        ch[16] = temp2;
        ch[19] = temp3;
    }

    private void F_Prime() {
        char temp1, temp2, temp3;

        temp1 = ch[63];
        temp2 = ch[66];
        temp3 = ch[69];

        ch[63] = ch[39];
        ch[66] = ch[38];
        ch[69] = ch[37];

        ch[39] = ch[57];
        ch[38] = ch[54];
        ch[37] = ch[51];

        ch[57] = ch[21];
        ch[54] = ch[22];
        ch[51] = ch[23];

        ch[21] = temp1;
        ch[22] = temp2;
        ch[23] = temp3;

        temp1 = ch[11];
        temp2 = ch[12];
        temp3 = ch[13];
        char temp4 = ch[16];
        ch[16] = ch[18];
        ch[18] = ch[14];
        ch[14] = ch[12];
//      ch[53]=temp1;
        ch[11] = temp3;
        ch[12] = temp4;
        ch[13] = ch[19];
//    ch[59]=ch[57];
        ch[19] = ch[17];
        ch[17] = temp1;
    }

    private void Back() {
        char temp1, temp2, temp3;

        temp1 = ch[53];
        temp2 = ch[56];
        temp3 = ch[59];

        ch[53] = ch[29];
        ch[56] = ch[28];
        ch[59] = ch[27];

        ch[29] = ch[67];
        ch[28] = ch[64];
        ch[27] = ch[61];

        ch[67] = ch[31];
        ch[64] = ch[32];
        ch[61] = ch[33];

        ch[31] = temp1;
        ch[32] = temp2;
        ch[33] = temp3;

        temp1 = ch[41];
        temp2 = ch[42];
        temp3 = ch[43];

        ch[41] = ch[47];
        ch[42] = ch[44];
        ch[44] = ch[48];
        ch[48] = ch[46];
        ch[47] = ch[49];

        ch[43] = temp1;
        ch[46] = temp2;
        ch[49] = temp3;

    }

    private void Back_Prime() {
        char temp1, temp2, temp3;

        temp1 = ch[53];
        temp2 = ch[56];
        temp3 = ch[59];

        ch[53] = ch[31];
        ch[56] = ch[32];
        ch[59] = ch[33];

        ch[31] = ch[67];
        ch[32] = ch[64];
        ch[33] = ch[61];

        ch[67] = ch[29];
        ch[64] = ch[28];
        ch[61] = ch[27];

        ch[29] = temp1;
        ch[28] = temp2;
        ch[27] = temp3;
        temp1 = ch[41];
//    temp2= ch[67];
        temp3 = ch[43];
        char temp4 = ch[46];
        ch[46] = ch[48];
        ch[48] = ch[44];
        ch[44] = ch[42];
        ch[42] = temp4;
//      ch[53]=temp1;

        ch[41] = ch[43];
        ch[43] = ch[49];
//    ch[59]=ch[57];
        ch[49] = ch[47];
        ch[47] = temp1;
    }

    private void M() {
        char temp1, temp2, temp3;
        temp1 = ch[12];
        temp2 = ch[15];
        temp3 = ch[18];

        ch[12] = ch[22];
        ch[15] = ch[25];
        ch[18] = ch[28];

        ch[22] = ch[48];
        ch[25] = ch[45];
        ch[28] = ch[42];

        ch[48] = ch[32];
        ch[45] = ch[35];
        ch[42] = ch[38];

        ch[32] = temp1;
        ch[35] = temp2;
        ch[38] = temp3;
    }

    private void M_Prime() {
        char temp1, temp2, temp3;
        temp1 = ch[32];
        temp2 = ch[35];
        temp3 = ch[38];

        ch[32] = ch[48];
        ch[35] = ch[45];
        ch[38] = ch[42];

        ch[48] = ch[22];
        ch[45] = ch[25];
        ch[42] = ch[28];

        ch[22] = ch[12];
        ch[25] = ch[15];
        ch[28] = ch[18];

        ch[12] = temp1;
        ch[15] = temp2;
        ch[18] = temp3;
    }

    private void CM() {
        char temp1, temp2, temp3;
        temp1 = ch[52];
        temp2 = ch[55];
        temp3 = ch[58];

        ch[52] = ch[34];
        ch[55] = ch[35];
        ch[58] = ch[36];

        ch[34] = ch[68];
        ch[35] = ch[65];
        ch[36] = ch[62];

        ch[68] = ch[26];
        ch[65] = ch[25];
        ch[62] = ch[24];

        ch[26] = temp1;
        ch[25] = temp2;
        ch[24] = temp3;

    }

    private void White_Align() {
        int place = 11;
        for (int i = 5; i < 66; i = i + 10) {
            if (ch[i] == 'W') {
                place = i;
            }
        }
        if (place == 15) {
            M_Prime();
        }
        if (place == 35) {
            M_Prime();
            M_Prime();
        }
        if (place == 45) {
            M();
        }
        if (place == 55) {
            CM();
        }
        if (place == 65) {
            CM();
            CM();
            CM();
        }

    }
    
    
     private void Blue_Align() {
        int place = 1;
        for (int i = 5; i < 66; i = i + 10) {
            if (ch[i] == 'B') {
                place = i;
            }
        }
        if (place == 25) {
            M();
        }
        if (place == 35) {
//            M();
            M_Prime();
        }
        if (place == 45) {
            M(); M();
        }
        if (place == 55) {
            CM();
            CM();
            CM();
            M_Prime();
        }
        if (place == 65) {
            CM();
//            CM();
//            CM();
  M_Prime();
        }

    }

   private void YELLOW_White_Plus() {

        if (ch[25] != 'W') {
            White_Align();
        }

        int[] loc = new int[8];
        int k = 0;
        for (int i = 0; i < 70; i = i + 2) {
            if (ch[i] == 'W') {
                System.err.println(ch[i] + " " + i);
                loc[k] = i;
                k++;
            }
        }

        System.err.println("+++++++++++++++++++++++++");
        for (int i = 0; i < k; i++) {

            int j = loc[i];

            if (j > 20 && j < 30) {
                if (j % 10 == 2) {

                    while (ch[38] == 'W') {
                        U();
                    }

                    F();
                    F();
                } else if (j % 10 == 4) {
                    while (ch[34] == 'W') {
                        U();
                    }
                    L();
                    L();
                } else if (j % 10 == 6) {
                    while (ch[36] == 'W') {
                        U();
                    }
                    R();
                    R();
                } else if (j % 10 == 8) {
                    while (ch[28] == 'W') {
                        U();
                    }
                    Back();
                    Back();
                }
            }
            if (j > 10 && j < 20) {
                if (j % 10 == 2) {
                    while (ch[34] == 'W') {
                        U();
                    }
                    F_Prime();
                    L_Prime();
                    F();
                } else if (j % 10 == 4) {
                    while (ch[34] == 'W') {
                        U();
                    }
                    L_Prime();
//             L();
                } else if (j % 10 == 6) {
//             R();
                    while (ch[36] == 'W') {
                        U();
                    }
                    R();
                } else if (j % 10 == 8) {
//                 Bottom();
                    while (ch[36] == 'W') {
                        U();
                    }

                    F_Prime();
                    R();
                    F();
                }

            }
            if (j > 50 && j < 60) {
                if (j % 10 == 2) {
                    while (ch[38] == 'W') {
                        U();
                    }

                    R_Prime();
                    F_Prime();
                    R();
                } else if (j % 10 == 4) {
                    while (ch[38] == 'W') {
                        U();
                    }
//             L_Prime();
//             L();
                    F_Prime();
                } else if (j % 10 == 6) {
//             R();
                    while (ch[32] == 'W') {
                        U();
                    }
                    Back_Prime();
                } else if (j % 10 == 8) {
//                 Bottom();
                    while (ch[38] == 'W') {
                        U();
                    }
                    R();
                    F_Prime();
                    R_Prime();
                }

            }

            if (j > 60 && j < 70) {
                if (j % 10 == 2) {
                    while (ch[38] == 'W') {
                        U();
                    }

//                 R_Prime();
                    L();
                    F();
                    L_Prime();
                } else if (j % 10 == 4) {
                    while (ch[32] == 'W') {
                        U();
                    }
//             L_Prime();
//             L();
                    Back_Prime();
                } else if (j % 10 == 6) {
                    while (ch[38] == 'W') {
                        U();
                    }
//             R();
                    F();
                } else if (j % 10 == 8) {
//                 Bottom();
                    while (ch[38] == 'W') {
                        U();
                    }
                    L_Prime();
                    F();
                    L();
                }

            }

            if (j > 40 && j < 50) {
                if (j % 10 == 2) {
                    while (ch[36] == 'W') {
                        U();
                    }
                    Back();
                    L_Prime();
                    Back_Prime();
//                 Back_Prime();
//                 R();
                } else if (j % 10 == 4) {
//             L_Prime();
                    while (ch[36] == 'W') {
                        U();
                    }
//             L();
                    R_Prime();
                } else if (j % 10 == 6) {
//             R();
                    while (ch[34] == 'W') {
                        U();
                    }
                    L();

                } else if (j % 10 == 8) {
//                 Bottom();
                    while (ch[36] == 'W') {
                        U();
                    }
                    Back();
                    R_Prime();
                    Back_Prime();
                }
//            }
//            }

            }

        }
    }

   private void White_Plus(){
   
       while(ch[12]!='B'){
           U();    
   }
       F();
       F();
   
   }
    public void Solve() {
        if (ch[25] != 'W') {
            White_Align();
        }
         if (ch[15] != 'B') {
            Blue_Align();
        }
//        for (int a = 0; a < 10; a++) {
            YELLOW_White_Plus();
//        }

            if(ch[32]=='W'&&ch[34]=='W'&&ch[36]=='W'&&ch[38]=='W'){
                White_Plus();
    }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        blue = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        red = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        jPanel57 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel59 = new javax.swing.JPanel();
        orange = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        jPanel65 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel66 = new javax.swing.JPanel();
        jPanel62 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        yellow = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        white = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        green = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel47 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        blue.setBackground(new java.awt.Color(0, 0, 153));

        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel11.setToolTipText("");
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel14.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(51, 51, 255));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel17.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout blueLayout = new javax.swing.GroupLayout(blue);
        blue.setLayout(blueLayout);
        blueLayout.setHorizontalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blueLayout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blueLayout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blueLayout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        blueLayout.setVerticalGroup(
            blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(blueLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(blueLayout.createSequentialGroup()
                        .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(blueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        jButton1.setText("RED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        red.setBackground(new java.awt.Color(204, 0, 0));

        jPanel51.setToolTipText("");
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel55.setBackground(new java.awt.Color(255, 0, 0));
        jPanel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel55MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel53MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel56MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel52MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel57.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel57MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel54.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel54MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel58MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel59MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout redLayout = new javax.swing.GroupLayout(red);
        red.setLayout(redLayout);
        redLayout.setHorizontalGroup(
            redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redLayout.createSequentialGroup()
                        .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(redLayout.createSequentialGroup()
                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(redLayout.createSequentialGroup()
                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        redLayout.setVerticalGroup(
            redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(redLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(redLayout.createSequentialGroup()
                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(redLayout.createSequentialGroup()
                        .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(redLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        orange.setBackground(new java.awt.Color(255, 204, 153));

        jPanel61.setToolTipText("");
        jPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel65.setBackground(new java.awt.Color(255, 153, 0));
        jPanel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel65MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel63MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel63Layout = new javax.swing.GroupLayout(jPanel63);
        jPanel63.setLayout(jPanel63Layout);
        jPanel63Layout.setHorizontalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel63Layout.setVerticalGroup(
            jPanel63Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel66MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel66Layout = new javax.swing.GroupLayout(jPanel66);
        jPanel66.setLayout(jPanel66Layout);
        jPanel66Layout.setHorizontalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel66Layout.setVerticalGroup(
            jPanel66Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel62MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel67.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel67MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel67Layout = new javax.swing.GroupLayout(jPanel67);
        jPanel67.setLayout(jPanel67Layout);
        jPanel67Layout.setHorizontalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel67Layout.setVerticalGroup(
            jPanel67Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel64.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel64MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel68MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel69MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel69Layout = new javax.swing.GroupLayout(jPanel69);
        jPanel69.setLayout(jPanel69Layout);
        jPanel69Layout.setHorizontalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel69Layout.setVerticalGroup(
            jPanel69Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout orangeLayout = new javax.swing.GroupLayout(orange);
        orange.setLayout(orangeLayout);
        orangeLayout.setHorizontalGroup(
            orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orangeLayout.createSequentialGroup()
                        .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orangeLayout.createSequentialGroup()
                        .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orangeLayout.createSequentialGroup()
                        .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        orangeLayout.setVerticalGroup(
            orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orangeLayout.createSequentialGroup()
                        .addComponent(jPanel66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(orangeLayout.createSequentialGroup()
                        .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(orangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        yellow.setBackground(new java.awt.Color(204, 204, 0));

        jPanel31.setToolTipText("");
        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 0));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel33MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel32MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel37.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel34.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout yellowLayout = new javax.swing.GroupLayout(yellow);
        yellow.setLayout(yellowLayout);
        yellowLayout.setHorizontalGroup(
            yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yellowLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yellowLayout.createSequentialGroup()
                        .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yellowLayout.createSequentialGroup()
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yellowLayout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        yellowLayout.setVerticalGroup(
            yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(yellowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(yellowLayout.createSequentialGroup()
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(yellowLayout.createSequentialGroup()
                        .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(yellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        white.setBackground(new java.awt.Color(204, 255, 255));

        jPanel21.setToolTipText("");
        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel21MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel25MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel23MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel22MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel27.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel27MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel24.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout whiteLayout = new javax.swing.GroupLayout(white);
        white.setLayout(whiteLayout);
        whiteLayout.setHorizontalGroup(
            whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteLayout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whiteLayout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whiteLayout.createSequentialGroup()
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        whiteLayout.setVerticalGroup(
            whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(whiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(whiteLayout.createSequentialGroup()
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(whiteLayout.createSequentialGroup()
                        .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(whiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6))
        );

        green.setBackground(new java.awt.Color(51, 204, 0));

        jPanel41.setToolTipText("");
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel45.setBackground(new java.awt.Color(51, 255, 51));
        jPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel46MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel47.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel47MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel44.setPreferredSize(new java.awt.Dimension(60, 60));
        jPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel44MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel48MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel49MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout greenLayout = new javax.swing.GroupLayout(green);
        green.setLayout(greenLayout);
        greenLayout.setHorizontalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greenLayout.createSequentialGroup()
                        .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(greenLayout.createSequentialGroup()
                        .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(greenLayout.createSequentialGroup()
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        greenLayout.setVerticalGroup(
            greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(greenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(greenLayout.createSequentialGroup()
                        .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(greenLayout.createSequentialGroup()
                        .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(greenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("BLUE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("GREEN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("WHITE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("ORANGE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("YELLOW");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("START");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setText("4");

        jLabel2.setText("2");

        jLabel3.setText("3");

        jLabel5.setText("5");

        jLabel6.setText("6");

        jLabel1.setText("1");

        jButton8.setText("defalut");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("R");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("R'");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("L");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("L'");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("U");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("U'");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("Bottom");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("Bottom'");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("F");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText("F'");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Back'");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setText("M");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setText("M'");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton24.setText("CM");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton16)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton14)
                    .addComponent(jButton15)
                    .addComponent(jButton16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17)
                    .addComponent(jButton18)
                    .addComponent(jButton19)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton21)
                    .addComponent(jButton22)
                    .addComponent(jButton24))
                .addContainerGap())
        );

        jButton23.setText("random");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton23)
                                            .addComponent(jButton8)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(white, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(23, 23, 23)
                                .addComponent(jButton23))
                            .addComponent(yellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(white, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(red, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(green, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (rc < 10) {
            rc++;
//           String panelName = jp.toString();
//            System.err.println(panelName+"-----------------------------");
//           String numbers = panelName.replaceAll("[^\\d]", "");
//           int num = Integer.parseInt(numbers);
            ch[selected] = 'R';

            jp.setBackground(new java.awt.Color(255, 0, 0));
            jp.setBorder(null);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel11;
        selected = 11;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel12;
        selected = 12;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel13;
        selected = 13;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel14;
        selected = 14;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel15;
        selected = 15;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel16;
        selected = 16;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel17;
        selected = 17;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel18;
        selected = 18;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel19;
        selected = 19;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel21;
        selected = 21;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel22;
        selected = 22;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel23;
        selected = 23;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel24;
        selected = 24;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel25;
        selected = 25;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel26;
        selected = 26;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel27;
        selected = 27;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel28;
        selected = 28;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel29;
        selected = 29;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel31;
        selected = 31;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel32;
        selected = 32;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel33;
        selected = 33;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel34;
        selected = 34;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel35;
        selected = 35;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel36;
        selected = 36;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel37;
        selected = 37;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel38;
        selected = 38;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel39;
        selected = 39;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel41;
        selected = 41;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel42;
        selected = 42;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel43;
        selected = 43;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel44;
        selected = 44;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel45MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel45;
        selected = 45;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel46;
        selected = 46;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel47;
        selected = 47;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel48;
        selected = 48;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel49;
        selected = 49;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel51;
        selected = 51;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel52;
        selected = 52;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel53;
        selected = 53;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel54;
        selected = 54;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel55MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel55;
        selected = 55;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel56;
        selected = 56;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel57MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel57;
        selected = 57;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel58;
        selected = 58;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel59;
        selected = 59;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel61;
        selected = 61;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel62;
        selected = 62;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel63MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel63;
        selected = 63;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel64MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel64;
        selected = 64;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel65MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel65;
        selected = 65;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel66;
        selected = 66;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel67MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel67;
        selected = 67;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel68MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel68;
        selected = 68;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        jp = jPanel69;
        selected = 69;
        jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }

    /*
    
    
    
    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked

    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
     
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
       
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked

    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked

    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
   
    }//GEN-LAST:event_jPanel18MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked

    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
    
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel55MouseClicked
        // TODO add your handling code
jPanel55.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_jPanel55MouseClicked

    private void jPanel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel53MouseClicked
         here:
        
    }//GEN-LAST:event_jPanel53MouseClicked

    private void jPanel56MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel56MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel56MouseClicked

    private void jPanel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel52MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel52MouseClicked

    private void jPanel57MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel57MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel57MouseClicked

    private void jPanel54MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel54MouseClicked
       
    }//GEN-LAST:event_jPanel54MouseClicked

    private void jPanel58MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel58MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel58MouseClicked

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel59MouseClicked

    private void jPanel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel69MouseClicked
        // TODO add your handling code here:
         jp = jPanel69;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_jPanel69MouseClicked

    private void jPanel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel61MouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jPanel61MouseClicked

    private void jPanel65MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel65MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel65MouseClicked

    private void jPanel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel63MouseClicked
        // TODO add your handling code here:  
      
    }//GEN-LAST:event_jPanel63MouseClicked

    private void jPanel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel66MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel66MouseClicked

    private void jPanel62MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel62MouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_jPanel62MouseClicked

    private void jPanel67MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel67MouseClicked
        // TODO add your handling code here:
           jp = jPanel67;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
    }//GEN-LAST:event_jPanel67MouseClicked

    private void jPanel64MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel64MouseClicked
    
    }//GEN-LAST:event_jPanel64MouseClicked

    private void jPanel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel68MouseClicked

    }//GEN-LAST:event_jPanel68MouseClicked

    */
 /*    
    
    
    
    private void jPanel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel31MouseClicked

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel33MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel32MouseClicked

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel34MouseClicked

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel45MouseClicked

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel46MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel46MouseClicked

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel47MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel47MouseClicked

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel44MouseClicked

    private void jPanel48MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel48MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel48MouseClicked

    private void jPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel49MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel49MouseClicked

    private void jPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel21MouseClicked

    private void jPanel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel25MouseClicked

    private void jPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel23MouseClicked

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel26MouseClicked

    private void jPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel22MouseClicked

    private void jPanel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel27MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        // TODO add your handling code here:/*
    }//GEN-LAST:event_jPanel29MouseClicked
*/
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (bc < 10) {
            bc++;

            ch[selected] = 'B';
            jp.setBackground(new java.awt.Color(0, 0, 255));
            jp.setBorder(null);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        if (gc < 10) {
            gc++;

            ch[selected] = 'G';
            jp.setBackground(new java.awt.Color(0, 255, 0));
            jp.setBorder(null);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (wc < 10) {
            wc++;
//         String panelName = jp.getName();
//         String numbers = panelName.replaceAll("[^\\d]", "");
//         int num = Integer.parseInt(numbers);
            ch[selected] = 'W';
            jp.setBackground(new java.awt.Color(255, 255, 255));
            jp.setBorder(null);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (oc < 10) {
            oc++;
//         String panelName = jp.getName();
//         String numbers = panelName.replaceAll("[^\\d]", "");
//         int num = Integer.parseInt(numbers);
            ch[selected] = 'O';
            jp.setBackground(new java.awt.Color(255, 140, 0));
            jp.setBorder(null);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (yc < 10) {
            yc++;

            ch[selected] = 'Y';
            jp.setBackground(new java.awt.Color(255, 255, 0));
            jp.setBorder(null);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
        Solve();}
        catch(Exception e){e.printStackTrace();}
        for (int i = 0; i < 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
//         for(int i=0;i<69;i++){
//                            System.err.println(i+" "+ch[i]);
//                              
//                        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        javax.swing.JPanel parent = blue;

        for (int i = 0; i < 9; i++) {
            ch[i + 10 + 1] = 'B';
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(0, 0, 255));

        }
        for (int i = 0; i < 9; i++) {
            ch[i + 50 + 1] = 'R';
            parent = red;
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(255, 0, 0));

        }
        for (int i = 0; i < 9; i++) {
            parent = green;
            ch[i + 40 + 1] = 'G';
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(0, 255, 0));

        }
        for (int i = 0; i < 9; i++) {
            parent = white;
            ch[i + 20 + 1] = 'W';
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(255, 255, 255));

        }
        for (int i = 0; i < 9; i++) {
            parent = orange;
            ch[i + 60 + 1] = 'O';
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(255, 140, 0));

        }
        for (int i = 0; i < 9; i++) {
            parent = yellow;
            ch[i + 30 + 1] = 'Y';
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(i);
            f.setBackground(new java.awt.Color(255, 255, 0));

        }
//                    for(int i=0;i<69;i++){
//                            System.err.println(i+" "+ch[i]);
//                              
//                        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        R();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        R_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        L();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        L_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }

    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        // TODO add your handling code here:
        U();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        U_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        Bottom();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        Bottom_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        F();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        F_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        Back_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        Back();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        M();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        M_Prime();
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:

        List<Runnable> methods = new ArrayList<Runnable>();
        for (int i = 0; i < 100; i++) {
            methods.add(() -> {
                this.R();
            });
            methods.add(() -> {
                this.R_Prime();
            });
            methods.add(() -> {
                this.L();
            });
            methods.add(() -> {
                this.L_Prime();
            });
            methods.add(() -> {
                this.U();
            });
            methods.add(() -> {
                this.U_Prime();
            });
            methods.add(() -> {
                this.Back();
            });
            methods.add(() -> {
                this.Back_Prime();
            });
            methods.add(() -> {
                this.Bottom();
            });
            methods.add(() -> {
                this.Bottom_Prime();
            });
            methods.add(() -> {
                this.F();
            });

            methods.add(() -> {
                this.F_Prime();
            });

            methods.add(() -> {
                this.M();
            });
            methods.add(() -> {
                this.M_Prime();
            });
            methods.add(() -> {
                this.CM();
            });

        }

        Collections.shuffle(methods);

        for (Runnable method : methods) {
            method.run();
        }

//        char[] ar = new char[54];
//        for (int i = 0; i <54; i++) {
//            char x= ar[i];
//           
//            
//        }
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        CM();
        for (int i = 0; i < 69; i++) {
//            if()
//              randomArray[i];
        }
//        char[] ar = new char[54];
//        for (int i = 0; i <54; i++) {
//            char x= ar[i];
//           
//            
//        }
        for (int i = 0; i <= 69; i++) {

            int num = 1;
//        String ss = "jPanel"+i;
            javax.swing.JPanel parent = blue;
            if (i >= 11 && i <= 19) {
                parent = blue;
                num = i - 10;
            } else if (i >= 21 && i <= 29) {
                parent = white;
                num = i - 20;
            } else if (i >= 31 && i <= 39) {
                parent = yellow;
                num = i - 30;
            } else if (i >= 41 && i <= 49) {

                parent = green;
                num = i - 40;
            } else if (i >= 51 && i <= 59) {
                parent = red;
                num = i - 50;
            } else if (i >= 61 && i <= 69) {
                parent = orange;
                num = i - 60;
            }
//        javax.swing.JPanel f = null;
//         if(num>=0&&num <9)
            javax.swing.JPanel f = (javax.swing.JPanel) parent.getComponent(num - 1);
//            System.err.println(ch[num]);
//          f.setName(ss);

            switch (ch[i]) {
                case 'R':
                    f.setBackground(new java.awt.Color(255, 0, 0));
                    break;

                case 'G':
                    f.setBackground(new java.awt.Color(0, 255, 0));
                    break;

                case 'B':
                    f.setBackground(new java.awt.Color(0, 0, 255));
                    break;

                case 'Y':
                    f.setBackground(new java.awt.Color(255, 255, 0));

                    break;

                case 'O':
                    f.setBackground(new java.awt.Color(255, 140, 0));
                    break;

                case 'W':
                    f.setBackground(new java.awt.Color(255, 255, 255));
                    break;
            }
        }
    }//GEN-LAST:event_jButton24ActionPerformed
//****************************************

    /*
    
    private void jPanel97MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel97;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel98MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel98;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel99MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel99;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel100MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel100;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel101MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel101;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel102MouseClicked(java.awt.event.MouseEvent evt) { 
  // TODO add your handling code here:
  jp = jPanel102;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel103MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel103;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel104MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel104;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel105MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel105;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel106MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel106;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel107MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel107;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel108MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel108;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel109MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel109;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel110MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel110;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel111MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel111;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}

private void jPanel112MouseClicked(java.awt.event.MouseEvent evt) {
  // TODO add your handling code here:
  jp = jPanel112;
jp.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));}
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel blue;
    private javax.swing.JPanel green;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel orange;
    private javax.swing.JPanel red;
    private javax.swing.JPanel white;
    private javax.swing.JPanel yellow;
    // End of variables declaration//GEN-END:variables
}
