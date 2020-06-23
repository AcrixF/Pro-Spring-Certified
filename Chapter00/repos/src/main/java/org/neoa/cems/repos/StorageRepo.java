package org.neoa.cems.repos;

import org.neoa.cems.dao.Storage;

import java.util.Optional;

public interface StorageRepo extends AbstractRepo<Storage> {
    Optional<Storage> findByName(String name);

    Optional<Storage> findByLocation(String location);
}
