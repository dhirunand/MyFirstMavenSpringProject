package com.dhirunand.referenceinjection;

public class AddressOfStudent {
    private int houseNo;

    public AddressOfStudent() {
    }

    public AddressOfStudent(int houseNo) {
        this.houseNo = houseNo;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    @Override
    public String toString() {
        return "AddressOfStudent{" +
                "houseNo=" + houseNo +
                '}';
    }
}
