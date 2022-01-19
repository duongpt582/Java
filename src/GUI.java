import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame{
    private JPanel main_panel;
    private JComboBox comboBox1;
    private JTextField ten_field;
    private JTextField tuoi_field;
    private JTextField diachi_field;
    private JTextField thunhap_field;
    private JTextField hangOto_field;
    private JTextField mauXe_field;
    private JTextField bienso_field;
    private JTextField nammuaBH_field;
    private JTextField giatriBH_field;
    private JTextField rate_field;
    private JTextField namuaNha_field;
    private JTextField giaTriNha_field;
    private JTextField giaTriVatDung_field;
    private JButton exitButton;
    private JButton resetButton;
    private JButton OKButton;
    private JLabel ten_label;
    private JLabel tuoi_label;
    private JLabel diachi_label;
    private JLabel thunhap_label;
    private JLabel hangoto_label;
    private JLabel mauxe_label;
    private JLabel bienso_label;
    private JLabel nammuaBH_label;
    private JLabel giatriBH_label;
    private JLabel rate_label;
    private JLabel namMuaNha_label;
    private JLabel giatriNgoiNha_label;
    private JLabel giaTriVatDung_label;
    private JTextField nammuontinh_field;

    public GUI() {
        this.setTitle("Bài Thực Hành Cuối Cùng");
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(main_panel);

        /**Hiện các thông tin trong Combobox */
        this.showComboBox();

        /**Ẩn những Label và Field ứng với các option trong Combobox, chỉ hiện những thứ thiết yếu.*/
        this.anLabel_Field();

        /**Xử lý các sự kiện.*/
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = comboBox1.getSelectedIndex();
                if (index == 1){
                    setSize(500,300);
                    hangoto_label.setVisible(false);
                    hangOto_field.setVisible(false);
                    mauxe_label.setVisible(false);
                    mauXe_field.setVisible(false);
                    bienso_label.setVisible(false);
                    bienso_field.setVisible(false);
                    nammuaBH_label.setVisible(false);
                    nammuaBH_field.setVisible(false);
                    giatriBH_label.setVisible(false);
                    giatriBH_field.setVisible(false);
                    rate_label.setVisible(false);
                    rate_field.setVisible(false);
                    namMuaNha_label.setVisible(false);
                    namuaNha_field.setVisible(false);
                    giatriNgoiNha_label.setVisible(false);
                    giaTriNha_field.setVisible(false);
                    giaTriVatDung_label.setVisible(false);
                    giaTriVatDung_field.setVisible(false);
                }
                if (index == 2){
                    setSize(500,700);
                    hangoto_label.setVisible(true);
                    hangOto_field.setVisible(true);
                    mauxe_label.setVisible(true);
                    mauXe_field.setVisible(true);
                    bienso_label.setVisible(true);
                    bienso_field.setVisible(true);
                    nammuaBH_label.setVisible(true);
                    nammuaBH_field.setVisible(true);
                    giatriBH_label.setVisible(true);
                    giatriBH_field.setVisible(true);
                    rate_label.setVisible(true);
                    rate_field.setVisible(true);
                    namMuaNha_label.setVisible(false);
                    namuaNha_field.setVisible(false);
                    giatriNgoiNha_label.setVisible(false);
                    giaTriNha_field.setVisible(false);
                    giaTriVatDung_label.setVisible(false);
                    giaTriVatDung_field.setVisible(false);
                }
                if(index == 3){
                    setSize(500,500);
                    hangoto_label.setVisible(false);
                    hangOto_field.setVisible(false);
                    mauxe_label.setVisible(false);
                    mauXe_field.setVisible(false);
                    bienso_label.setVisible(false);
                    bienso_field.setVisible(false);
                    nammuaBH_label.setVisible(false);
                    nammuaBH_field.setVisible(false);
                    giatriBH_label.setVisible(false);
                    giatriBH_field.setVisible(false);
                    rate_label.setVisible(false);
                    rate_field.setVisible(false);
                    namMuaNha_label.setVisible(true);
                    namuaNha_field.setVisible(true);
                    giatriNgoiNha_label.setVisible(true);
                    giaTriNha_field.setVisible(true);
                    giaTriVatDung_label.setVisible(true);
                    giaTriVatDung_field.setVisible(true);
                }
            }
        });//Combobox
        OKButton.setToolTipText("Nhấn để tính toán.");
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = ten_field.getText();
                int tuoi = 0;
                try{
                     tuoi = Integer.parseInt(tuoi_field.getText());
                }catch(NumberFormatException ex){
                    String tuoi1 = JOptionPane.showInputDialog(rootPane, "Mời bạn nhập lại tuổi bằng số lớn hơn 0:");
                    tuoi_field.setText(tuoi1);
                    tuoi = Integer.parseInt(tuoi1);
                }
                System.out.println(tuoi);
                String diachi = diachi_field.getText();
                double thunhap = Double.parseDouble(thunhap_field.getText());
                int namCanTinh = Integer.parseInt(nammuontinh_field.getText()); //Năm cần tính

                Insured[] user = new Insured[3];
                int index = comboBox1.getSelectedIndex();
                if(index == 1){
                    user[0] = new Insured_income(ten, tuoi, thunhap);
                    double res = user[0].getInsuranceValue(namCanTinh);
                    double cost = user[0].getInsurancePremium(namCanTinh);
                    //JOptionPane.showMessageDialog(rootPane, "Giá trị bảo hiểm là: "+res+"\nChi phí bảo hiểm là: "+cost,"Giá trị và chi phí", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(rootPane, "Giá trị bảo hiểm là: "+Math.round(res*100.0)/100.0+"\nChi phí bảo hiểm là: "+Math.round(cost*100.0)/100.0,"Giá trị và chi phí", JOptionPane.INFORMATION_MESSAGE);
                }
                if(index == 2){
                    String hang = hangOto_field.getText();
                    String mauxe = mauXe_field.getText();
                    String bienso = bienso_field.getText();
                    int namMuaBH = Integer.parseInt(nammuaBH_field.getText());
                    double giaBH = Double.parseDouble(giatriBH_field.getText());
                    int rate = Integer.parseInt(rate_field.getText());

                    user[1] = new InsuredCar(hang, mauxe, bienso, namMuaBH, giaBH, ten, tuoi, rate);
                    double res = user[1].getInsuranceValue(namCanTinh);
                    double cost = user[1].getInsurancePremium(namCanTinh);
                    JOptionPane.showMessageDialog(rootPane, "Giá trị bảo hiểm là: "+Math.round(res*100.0)/100.0+"\nChi phí bảo hiểm là: "+Math.round(cost*100.0)/100.0,"Giá trị và chi phí", JOptionPane.INFORMATION_MESSAGE);
                }
                if(index == 3){
                    double giatriNha = Double.parseDouble(giaTriNha_field.getText());
                    int nammuaNha = Integer.parseInt(namuaNha_field.getText());
                    double giatriVD = Double.parseDouble(giaTriVatDung_field.getText());
                    user[2] = new InsuredHouse(ten, tuoi, diachi, giatriNha, nammuaNha, giatriVD);
                    double res = user[2].getInsuranceValue(namCanTinh);
                    double cost = user[2].getInsurancePremium(namCanTinh);
                    JOptionPane.showMessageDialog(rootPane, "Giá trị bảo hiểm là: "+Math.round(res*100.0)/100.0+"\nChi phí bảo hiểm là: "+Math.round(cost*100.0)/100.0,"Giá trị và chi phí", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }); //Ok button
        resetButton.setToolTipText("Nhấn để xoá hết các trường dữ liệu.");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.setSelectedIndex(1);
                comboBox1.setSelectedIndex(0);
                ten_field.setText("");
                tuoi_field.setText("");
                diachi_field.setText("");
                thunhap_field.setText("");
                hangOto_field.setText("");
                mauXe_field.setText("");
                bienso_field.setText("");
                nammuaBH_field.setText("");
                giatriBH_field.setText("");
                rate_field.setText("");
                namuaNha_field.setText("");
                giaTriNha_field.setText("");
                giaTriVatDung_field.setText("");
            }
        });
        exitButton.setToolTipText("Nhấn để thoát.");
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    private void showComboBox() {
        List<String> data = new ArrayList<>();
        data.add("Mời chọn:");
        data.add("1. Bảo hiểm thu nhập");
        data.add("2. Bảo hiểm oto");
        data.add("3. Bảo hiểm nhà");

        for (String s : data){
            comboBox1.addItem(s);
        }
    }
    private void anLabel_Field(){
        hangoto_label.setVisible(false);
        hangOto_field.setVisible(false);
        mauxe_label.setVisible(false);
        mauXe_field.setVisible(false);
        bienso_label.setVisible(false);
        bienso_field.setVisible(false);
        nammuaBH_label.setVisible(false);
        nammuaBH_field.setVisible(false);
        giatriBH_label.setVisible(false);
        giatriBH_field.setVisible(false);
        rate_label.setVisible(false);
        rate_field.setVisible(false);
        namMuaNha_label.setVisible(false);
        namuaNha_field.setVisible(false);
        giatriNgoiNha_label.setVisible(false);
        giaTriNha_field.setVisible(false);
        giaTriVatDung_label.setVisible(false);
        giaTriVatDung_field.setVisible(false);
    }

    public static void main(String[] args) {
        GUI menu = new GUI();
        menu.setVisible(true);
    }
}
