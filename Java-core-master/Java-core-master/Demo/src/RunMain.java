import sun.dc.pr.PRError;

import java.sql.*;

public class RunMain {
    final static String userName ="sa";
    final static String passWord ="123";
    final static String url ="jdbc:sqlserver://localhost:1433;databaseName=QLSV";
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection(url, userName, passWord);
            String masv="09348";
            String ten="xinh gai";
            int tuoi=17;
            String aqlInsert="INSERT INTO SINHVIEN VALUES(?,?, ?)";
            PreparedStatement preparedStatement=connection.prepareStatement(aqlInsert);
            preparedStatement.setString(1, masv);
            preparedStatement.setString(2, ten);
            preparedStatement.setInt(3, tuoi);
            preparedStatement.execute();
            connection.close();   ///33333
//            String sqlInsert="INSERT INTO SINHVIEN VALUES(N'haha', N'bbbbbbb', 18)";//2


//            Statement statement=connection.createStatement();
//            statement.execute(sqlInsert);
//            connection.close();


//            if (connection!=null) {
//                System.out.println("connect succes");
//            }
//            else {
//                System.out.println("connect failed");
//                return;
//            }
//            String queryGetAll ="select * from SINHVIEN";
//            //String queryInsert
//            Statement statement=connection.createStatement();
//            ResultSet resultSet=statement.executeQuery((queryGetAll));
//            while(resultSet.next()){
//                String masv=resultSet.getString("masv");
//                String ten=resultSet.getString("ten");
//                int tuoi=resultSet.getInt("tuoi");
//                System.out.println(masv+ " " + ten + " " + tuoi);
//            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
