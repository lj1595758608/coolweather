package com.example.coolweather.db;
import org.litepal.crud.DataSupport;
/**
 * Created by Administrator on 2017/10/24 0024.
 */

public class Province extends DataSupport{
    private int id ;
    private String provincename ;
    private int provinceCode ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provincename;
    }

    public void setProvinceName(String provincename) {
        this.provincename = provincename;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
