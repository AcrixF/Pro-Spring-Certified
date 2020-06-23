package org.neoa.cems.repos.util;

import org.neoa.cems.dao.CriminalCase;
import org.neoa.cems.dao.Detective;
import org.neoa.cems.util.CaseStatus;
import org.neoa.cems.util.CaseType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CriminalCaseRowMapper implements RowMapper<CriminalCase> {

    @Override
    public CriminalCase mapRow(ResultSet rs, int rowNum) throws SQLException {
        Long id = rs.getLong("ID");
        String number = rs.getString("CASE_NUMBER");
        String type = rs.getString("CASE_TYPE");
        String status = rs.getString("STATUS");
        String shortDescription = rs.getString("SHORT_DESCRIPTION");
        Long detectiveId =  rs.getLong("LEAD_INVESTIGATOR_ID");

        CriminalCase cc = new CriminalCase();
        cc.setId(id);
        cc.setNumber(number);
        cc.setType(CaseType.valueOf(type));
        cc.setStatus(CaseStatus.valueOf(status));
        cc.setShortDescription(shortDescription);

        Detective detective = new Detective();
        detective.setId(detectiveId);
        cc.setLeadInvestigator(detective);
        return cc;
    }
}
