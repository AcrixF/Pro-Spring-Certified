package org.neoa.cems.repos.util;

import org.neoa.cems.dao.Detective;
import org.neoa.cems.dao.Person;
import org.neoa.cems.util.EmploymentStatus;
import org.neoa.cems.util.Rank;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DetectiveRowMapper implements RowMapper<Detective> {

    @Override
    public Detective mapRow(ResultSet rs, int rowNum) throws SQLException {
        var id = rs.getLong("ID");
        var badgeNumber = rs.getString("BADGE_NUMBER");
        var rank = rs.getString("RANK");
        var armed = rs.getBoolean("ARMED");
        var status = rs.getString("STATUS");
        var personId = rs.getLong("PERSON_ID");

        Person person = new Person();
        person.setId(personId);
        person.setUsername(rs.getString("USERNAME"));
        person.setFirstName(rs.getString("FIRSTNAME"));
        person.setLastName(rs.getString("LASTNAME"));
        person.setHiringDate(rs.getTimestamp("HIRINGDATE").toLocalDateTime());

        Detective detective = new Detective();
        detective.setId(id);
        detective.setPerson(person);
        detective.setBadgeNumber(badgeNumber);
        detective.setRank(Rank.valueOf(rank));
        detective.setArmed(armed);
        detective.setStatus(EmploymentStatus.valueOf(status));

        return detective;
    }
}
