package com.SpringCrud.SpringApplication.DTO;

public class CustomerSaveDTO {




    private String customername;

    private int mobile;

    private  String customeraddress;

    public CustomerSaveDTO(int customerid, String customername, int mobile, String customeraddress) {

        this.customername = customername;
        this.mobile = mobile;
        this.customeraddress = customeraddress;
    }

    public CustomerSaveDTO() {
    }



    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +

                ", customername='" + customername + '\'' +
                ", mobile=" + mobile +
                ", customeraddress='" + customeraddress + '\'' +
                '}';
    }
}
