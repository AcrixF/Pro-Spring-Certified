package org.neoa.cems.repos;

import org.neoa.cems.dao.CriminalCase;
import org.neoa.cems.dao.Detective;
import org.neoa.cems.util.CaseStatus;
import org.neoa.cems.util.CaseType;

import java.util.Optional;
import java.util.Set;

public interface CriminalCaseRepo extends AbstractRepo<CriminalCase> {

    Set<CriminalCase> findByLeadInvestigator(Detective detective);

    Optional<CriminalCase> findByNumber(String caseNumber);

    Set<CriminalCase> findByStatus(CaseStatus status);

    Set<CriminalCase> findByType(CaseType type);
}
