package com.start.blog.repository;

import com.start.blog.domain.Catalog;
import com.start.blog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Catalog 仓库.
 *
 */
public interface CatalogRepository extends JpaRepository<Catalog, Long> {
    /**
     * 根据用户查询
     * @param user
     * @return
     */
    List<Catalog> findByUser(User user);

    /**
     * 根据用户查询
     * @param user
     * @param name
     * @return
     */
    List<Catalog> findByUserAndName(User user,String name);


}
