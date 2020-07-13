package org.neoa.cems.repos;

import org.neoa.cems.dao.AbstractEntity;
import org.neoa.cems.pojos.repos.AbstractRepo;

import javax.sql.DataSource;

public class JdbcAbstractRepo<T extends AbstractEntity> implements AbstractRepo<T> {

    protected DataSource dataSource;

    public JdbcAbstractRepo() {}

    public JdbcAbstractRepo(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    @Override
    public void save(T entity) {

    }

    @Override
    public void delete(T entity) {

    }

    @Override
    public int deleteById(Long entityId) {
        return 0;
    }

    @Override
    public T findById(Long entityId) {
        if (dataSource == null) {
            throw new NullPointerException("No datasource present!");
        }
        return null;
    }
}
