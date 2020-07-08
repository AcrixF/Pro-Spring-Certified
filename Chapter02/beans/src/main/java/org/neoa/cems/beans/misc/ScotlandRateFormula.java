package org.neoa.cems.beans.misc;

public class ScotlandRateFormula implements TaxFormula {

    @Override
    public String getFormula() {
        return "*0.25";
    }
}
