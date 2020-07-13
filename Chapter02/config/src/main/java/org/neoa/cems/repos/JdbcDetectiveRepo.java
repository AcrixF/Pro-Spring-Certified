package org.neoa.cems.repos;

import org.neoa.cems.dao.Detective;
import org.neoa.cems.pojos.repos.DetectiveRepo;

import javax.sql.DataSource;
import java.util.Optional;

public class JdbcDetectiveRepo extends JdbcAbstractRepo<Detective> implements DetectiveRepo {
    public JdbcDetectiveRepo() {}

    public JdbcDetectiveRepo(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public Optional<Detective> findByBadgeNumber(String badgeNumber) {
        return Optional.empty();
    }
}
