package org.neoa.cems.beans.scalars;

import org.neoa.cems.beans.ci.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class EmptyCollectionHolder {

    private List<SimpleBean> simpleBeanList;
    private Set<SimpleBean> simpleBeanSet;
    private Map<String, SimpleBean> simpleBeanMap;

    @Autowired
    @Qualifier("simpleBeanList")
    public void setSimpleBeanList(List<SimpleBean> simpleBeanList) {
        this.simpleBeanList = simpleBeanList;
    }
    @Autowired
    @Qualifier("simpleBeanSet")
    public void setSimpleBeanSet(Set<SimpleBean> simpleBeanSet) {
        this.simpleBeanSet = simpleBeanSet;
    }
    @Autowired
    @Qualifier("simpleBeanMap")
    public void setSimpleBeanMap(Map<String, SimpleBean> simpleBeanMap) {
        this.simpleBeanMap = simpleBeanMap;
    }

    @Override
    public String toString() {
        return "CollectionHolder{" +
                "simpleBeanList=" + simpleBeanList.size() +
                ", simpleBeanSet=" + simpleBeanSet.size() +
                ", simpleBeanMap=" + simpleBeanMap.size() +
                '}';
    }
}
