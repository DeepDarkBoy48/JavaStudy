package com.hspedu.interface_.interface03;

import com.hspedu.interface_.interface03.DBInterface;
import com.hspedu.interface_.interface03.MysqlDB;
import com.hspedu.interface_.interface03.OracleDB;

public class Interface03 {
    public static void main(String[] args) {

        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface db) {
        db.connect();
        db.close();
    }
}
