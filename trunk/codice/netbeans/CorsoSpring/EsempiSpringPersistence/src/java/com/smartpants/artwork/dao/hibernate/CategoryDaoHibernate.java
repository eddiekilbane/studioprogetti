package com.smartpants.artwork.dao.hibernate;

import org.springframework.stereotype.Repository;

import com.smartpants.artwork.dao.CategoryDao;
import com.smartpants.artwork.domain.Category;

/**
 * Created by IntelliJ IDEA.
 * Author: Paul T. Fisher
 * User: paul
 * Date: Feb 2, 2006
 * Time: 1:04:05 PM
 * ęCopyright 2005, SmartPants Media, Inc. All Rights Reserved.
 */
@Repository("categoryDao")
public class CategoryDaoHibernate extends GenericDaoHibernate<Category> implements CategoryDao {

    public CategoryDaoHibernate() {
        super(Category.class);
    }
}
