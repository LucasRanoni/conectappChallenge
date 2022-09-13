package com.api.conectapps.models.entity;

import java.io.Serializable;
import java.util.Objects;

public class RelationShipPK implements Serializable {

    private String id;
    private String userId;

    public RelationShipPK(){
    }

    public RelationShipPK(String id, String userId){
        this.id = id;
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        RelationShipPK pk = (RelationShipPK) o;
        return Objects.equals(id, pk.id) &&
                Objects.equals(userId, pk.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId);
    }
}
