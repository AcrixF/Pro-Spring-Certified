package org.neoa.cems.beans.scalars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Component
public class MultipleTypesBean {

    private int noOne;
    private Integer noTwo;

    private long longOne;
    private Long longTwo;

    private float floatOne;
    private Float floatTwo;

    private double doubleOne;
    private Double doubleTwo;

    private boolean boolOne;
    private Boolean boolTwo;

    private char charOne;
    private Character charTwo;

    private Date date;

    @Autowired
    public void setNoOne(@Value("1") int noOne) {
        this.noOne = noOne;
    }

    @Autowired
    public void setNoTwo(@Value("2") Integer noTwo) {
        this.noTwo = noTwo;
    }

    @Autowired
    public void setLongOne(@Value("3") long longOne) {
        this.longOne = longOne;
    }

    @Autowired
    public void setLongTwo(@Value("4") Long longTwo) {
        this.longTwo = longTwo;
    }

    @Autowired
    public void setFloatOne(@Value("5.0") float floatOne) {
        this.floatOne = floatOne;
    }

    @Autowired
    public void setFloatTwo(@Value("6.0") Float floatTwo) {
        this.floatTwo = floatTwo;
    }

    @Autowired
    public void setDoubleOne(@Value("7.0") double doubleOne) {
        this.doubleOne = doubleOne;
    }

    @Autowired
    public void setDoubleTwo(@Value("8.0") Double doubleTwo) {
        this.doubleTwo = doubleTwo;
    }

    @Autowired
    public void setBoolOne(@Value("true") boolean boolOne) {
        this.boolOne = boolOne;
    }

    @Autowired
    public void setBoolTwo(@Value("false") Boolean boolTwo) {
        this.boolTwo = boolTwo;
    }

    @Autowired
    public void setCharOne(@Value("1") char charOne) {
        this.charOne = charOne;
    }

    @Autowired
    public void setCharTwo(@Value("A") Character charTwo) {
        this.charTwo = charTwo;
    }

    @Autowired
    public void setDate(@Value("1977-10-16") Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "MultipleTypesBean{" +
                "\n noOne=" + noOne +
                "\n, noTwo=" + noTwo +
                "\n, longOne=" + longOne +
                "\n, longTwo=" + longTwo +
                "\n, floatOne=" + floatOne +
                "\n, floatTwo=" + floatTwo +
                "\n, doubleOne=" + doubleOne +
                "\n, doubleTwo=" + doubleTwo +
                "\n, boolOne=" + boolOne +
                "\n, boolTwo=" + boolTwo +
                "\n, charOne=" + charOne +
                "\n, charTwo=" + charTwo +
                "\n, date=" + date +
                '}';
    }
}
