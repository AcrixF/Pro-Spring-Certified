package org.neoa.cems.repos;

import org.neoa.cems.dao.CriminalCase;
import org.neoa.cems.dao.Evidence;
import org.neoa.cems.dao.Storage;

import java.util.Optional;
import java.util.Set;

public interface EvidenceRepo extends AbstractRepo<Evidence> {
    Set<Evidence> findByCriminalCase(CriminalCase criminalCase);

    Optional<Evidence> findByNumber(String evidenceNumber);

    boolean isInStorage(Storage storage);
}
