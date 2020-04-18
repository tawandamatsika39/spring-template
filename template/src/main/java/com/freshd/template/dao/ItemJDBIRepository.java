package com.freshd.template.dao;

import com.freshd.template.model.Item;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlQuery;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;

import java.math.BigDecimal;
import java.util.UUID;

@RegisterBeanMapper(Item.class)
public interface ItemJDBIRepository {

    @GetGeneratedKeys
    @SqlUpdate("insert into item (description, price, quantity) values (:description, :price, :quantity)")
    Item insertItem(@Bind("description") String description, @Bind("price") BigDecimal price, @Bind("quantity")Integer quantity);

    @SqlQuery("select * from item where itemId = :itemId")
    Item findById(@Bind("itemId") UUID itemId);
}
