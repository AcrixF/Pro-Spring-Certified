package org.neoa.cems.repos;

import org.neoa.cems.dao.Detective;
import org.neoa.cems.util.Rank;

import java.util.Optional;
import java.util.Set;

public interface DetectiveRepo extends AbstractRepo<Detective> {
    Set<Detective> findAll();

    Optional<Detective> findByBadgeNumber(String badgeNumber);

    Set<Detective> findbyRank(Rank rank);

    default Optional<Detective> findByIdWithPersonDetails(Long id) {
        return Optional.empty();
    }
}
